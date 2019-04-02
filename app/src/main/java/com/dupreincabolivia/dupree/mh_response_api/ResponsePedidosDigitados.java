package com.dupreincabolivia.dupree.mh_response_api;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Agustin Acebo on 31/3/19.
 */

public class ResponsePedidosDigitados {

    @SerializedName("datos")
    private List<PedidoDigitado> pedidos;
    private String lider;
    private int code;
    private List<Raise> raise;

    public List<PedidoDigitado> getPedidos() {
        return pedidos;
    }

    public int getCode() {
        return code;
    }

    public String getLider() { return lider; }

    public List<Raise> getRaise() {
        return raise;
    }
}
