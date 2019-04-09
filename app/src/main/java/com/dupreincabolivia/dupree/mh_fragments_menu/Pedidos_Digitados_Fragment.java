package com.dupreincabolivia.dupree.mh_fragments_menu;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dupreincabolivia.dupree.R;
import com.dupreincabolivia.dupree.mh_adapters.MH_Adapter_pedidos_digitados;
import com.dupreincabolivia.dupree.mh_http.Http;
import com.dupreincabolivia.dupree.mh_required_api.RequiredNumeLide;
import com.dupreincabolivia.dupree.mh_response_api.ListaPedidosDigitados;
import com.dupreincabolivia.dupree.mh_response_api.PedidoDigitado;
import com.dupreincabolivia.dupree.mh_response_api.Perfil;
import com.dupreincabolivia.dupree.mh_response_api.ResponsePedidosDigitados;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class Pedidos_Digitados_Fragment extends Fragment {


    private final String TAG = "Pedid_Digitados_Frag";
    private final String BROACAST_PEDIDOS_DIGITADOS = "broadcast_pedidos_digitados";

    private ResponsePedidosDigitados ordersRecoveredFromAPI;
    private List<PedidoDigitado> pedidosDigitados, listFilter;
    private MH_Adapter_pedidos_digitados adapter_pedido_digitado;
    public Pedidos_Digitados_Fragment() {
        // Required empty public constructor
    }

    private Perfil perfil;
    public void loadData(Perfil perfil){
        this.perfil=perfil;
    }

    CardView cardViewBackGround;
    TextView tvNombreAsesora;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_pedido_digitado, container, false);

        cardViewBackGround = v.findViewById(R.id.cardViewBackGround);
        cardViewBackGround.setVisibility(View.INVISIBLE);
        tvNombreAsesora = v.findViewById(R.id.tvNombreAsesora);
        tvNombreAsesora.setText("");
        RecyclerView rcvPedidoDigitado = v.findViewById(R.id.rcvIncentREF);
        rcvPedidoDigitado.setLayoutManager(new GridLayoutManager(getActivity(),1));
        rcvPedidoDigitado.setHasFixedSize(true);

        pedidosDigitados = new ArrayList<>();
        listFilter = new ArrayList<>();
        //PedidosDigitados = getResult();

        listFilter.addAll(pedidosDigitados);

        adapter_pedido_digitado = new MH_Adapter_pedidos_digitados(pedidosDigitados, listFilter, getActivity());
        rcvPedidoDigitado.setAdapter(adapter_pedido_digitado);

        localBroadcastReceiver = new LocalBroadcastReceiver();

        checkPedidosDigitados();

        return v;
    }

    private void checkPedidosDigitados(){
        if(perfil != null){
            if(!perfil.getPerfil().equals(Perfil.ADESORA)){
                new Http(getActivity()).getPedidosDigitados(new RequiredNumeLide(perfil.getValor()), TAG, BROACAST_PEDIDOS_DIGITADOS);
            }
        }
    }

    private void updateView(){
        pedidosDigitados.clear();
        listFilter.clear();
        pedidosDigitados.addAll(ordersRecoveredFromAPI.getPedidos());
        listFilter.addAll(ordersRecoveredFromAPI.getPedidos());

        cardViewBackGround.setVisibility(View.VISIBLE);

        tvNombreAsesora.setText(ordersRecoveredFromAPI.getLider());

        adapter_pedido_digitado.notifyDataSetChanged();
    }


    @Override
    public void onResume() {
        super.onResume();
        registerBroadcat();
        Log.i(TAG,"onResume()");
        //setSelectedItem(oldItem);
    }

    @Override
    public void onPause() {
        super.onPause();
        unregisterBroadcat();
        Log.i(TAG,"onPause()");
    }

    public void registerBroadcat(){
        LocalBroadcastManager.getInstance(getActivity()).registerReceiver(
                localBroadcastReceiver,
                new IntentFilter(TAG));
    }

    public void unregisterBroadcat(){
        LocalBroadcastManager.getInstance(getActivity()).unregisterReceiver(
                localBroadcastReceiver);
    }

    ListaPedidosDigitados listaPedidosDigitados;
    private BroadcastReceiver localBroadcastReceiver;
    private class LocalBroadcastReceiver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            // safety check
            Log.i(TAG, "BroadcastReceiver");
            if (intent == null || intent.getAction() == null) {
                return;
            }
            if (intent.getAction().equals(TAG)) {
                switch (intent.getStringExtra(TAG)) {
                    case BROACAST_PEDIDOS_DIGITADOS:
                        String jsonIncentivo = intent.getStringExtra(Http.BROACAST_DATA);
                        if(jsonIncentivo!=null){
                            ordersRecoveredFromAPI= new Gson().fromJson(jsonIncentivo, ResponsePedidosDigitados.class);
                            updateView();
                        }
                        break;
                }
            }
        }
    }

    public void searchIdenty(String cedula){
        new Http(getActivity()).getPedidosDigitados(new RequiredNumeLide(cedula), TAG, BROACAST_PEDIDOS_DIGITADOS);
    }
}
