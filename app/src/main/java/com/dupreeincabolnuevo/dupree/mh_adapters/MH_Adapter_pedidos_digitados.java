package com.dupreeincabolnuevo.dupree.mh_adapters;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.TextView;

import com.dupreeincabolnuevo.dupree.R;
import com.dupreeincabolnuevo.dupree.mh_response_api.PedidoDigitado;

import java.util.List;

/**
 * Created by Agustin on 31/3/2019.
 */

public class MH_Adapter_pedidos_digitados extends RecyclerView.Adapter<MH_Adapter_pedidos_digitados.ViewHolder> {

    private List<PedidoDigitado> listPedidoDigitado, listFilter;
    private Context mContext;

    private int posSelected=-1;
    public MH_Adapter_pedidos_digitados(List<PedidoDigitado> listPedidoDigitado, List<PedidoDigitado> listFilter, Context mContext){
        this.listPedidoDigitado = listPedidoDigitado;
        this.listFilter = listFilter;
        this.mContext=mContext;

        //para filtrar
        mFilter = new CustomFilter(MH_Adapter_pedidos_digitados.this);
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflate = LayoutInflater.from(parent.getContext());
        View view= inflate.inflate(R.layout.adapter_pedidos_digitados, parent, false);
        return new ViewHolder(view);
    }

    Boolean blockEventsAutomatic=false;
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.tvName.setText("".concat(String.valueOf(listFilter.get(position).getNomb_terc())));
        holder.tvCedula.setText("".concat(String.valueOf(listFilter.get(position).getNume_iden())));
        Log.i("@@@",holder.tvCedula.getText().toString());
        holder.tvObserv.setText("".concat(listFilter.get(position).getActi_usua()));

        holder.cardViewBackGround.setCardBackgroundColor(position%2!=0 ? mContext.getResources().getColor(R.color.new_coolGrey7) : mContext.getResources().getColor(R.color.new_amarillo_114C));

    }

    @Override
    public int getItemCount() {
        return (null != listFilter ? listFilter.size() : 0);
    }

    public class ViewHolder extends RecyclerView.ViewHolder  implements View.OnClickListener{
        private TextView tvName,  tvCedula,  tvObserv;
        private CardView cardViewBackGround;
        //private ImageView imgB_Call;


        protected TextView tvNearbyUserUsername;
        public ViewHolder(View v) {
            super(v);
            v.setOnClickListener(this);

            tvName = (TextView) v.findViewById(R.id.tvName);
            tvCedula = (TextView) v.findViewById(R.id.tvCedula);
            tvObserv = (TextView) v.findViewById(R.id.tvObserv);

            cardViewBackGround = (CardView) v.findViewById(R.id.cardViewBackGround);

            //imgB_Call = (ImageView) v.findViewById(R.id.imgB_Call);
            //imgB_Call.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {


        }

    }

    private boolean clickListenerON=false;
    private ItemsClickListener itemsClickListener;

    public void setRVOnItemClickListener(ItemsClickListener ItemsClickListener) {
        this.itemsClickListener = ItemsClickListener;
        clickListenerON=true;
    }
    public interface ItemsClickListener {
        void onClickItem(View v, int position);
    }

    private boolean longClickListenerON=false;
    private ItemsLongClickListener itemsLongClickListener;

    public void setRVOnItemLongClickListener(ItemsLongClickListener itemsLongClickListener) {
        this.itemsLongClickListener = itemsLongClickListener;
        longClickListenerON=true;
    }
    public interface ItemsLongClickListener {
        void onLongClick(View v, int position);
    }

    public void setPosSelected(int posSelected) {
        this.posSelected = posSelected;
    }

    /**
     * FILTER
     */
    private CustomFilter mFilter;

    public CustomFilter getmFilter() {
        return mFilter;
    }

    public class CustomFilter extends Filter {
        private MH_Adapter_pedidos_digitados mAdapter;
        private CustomFilter(MH_Adapter_pedidos_digitados mAdapter) {
            super();
            this.mAdapter = mAdapter;
        }
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            listFilter.clear();
            final FilterResults results = new FilterResults();
            if (constraint.length() == 0) {
                listFilter.addAll(listPedidoDigitado);
            } else {
                final String filterPattern = constraint.toString().toLowerCase().trim();
                for (final PedidoDigitado mWords : listPedidoDigitado) {
                    if (String.valueOf(mWords.getNume_iden()).toLowerCase().contains(filterPattern)) {
                        listFilter.add(mWords);
                    }
                }
            }
            System.out.println("Count Number " + listFilter.size());
            results.values = listFilter;
            results.count = listFilter.size();
            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            //System.out.println("Count Number 2 " + ((List<RespondeUsers.Users>) results.values).size());
            this.mAdapter.notifyDataSetChanged();
        }
    }
}
