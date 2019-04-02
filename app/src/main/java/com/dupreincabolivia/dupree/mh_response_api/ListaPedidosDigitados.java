package com.dupreincabolivia.dupree.mh_response_api;

import com.dupreincabolivia.dupree.mh_required_api.RequiredIndex;

import java.util.List;

/**
 * Created by Agustin acebo on 31/3/19.
 */

public class ListaPedidosDigitados {
    private String nume_iden;
    private String nomb_terc;
    private String acti_usua;
    private List<PedidoDigitado> table;
    private RequiredIndex paginator;
    private String asesora;

    public String getNume_iden() {
        return nume_iden;
    }

    public String getNomb_terc() {
        return nomb_terc;
    }

    public String getActi_usua() {
        return acti_usua;
    }

    public List<PedidoDigitado> getTable() {
        return table;
    }

    public RequiredIndex getPaginator() {
        return paginator;
    }

    public String getAsesora() {
        return asesora;
    }
}
