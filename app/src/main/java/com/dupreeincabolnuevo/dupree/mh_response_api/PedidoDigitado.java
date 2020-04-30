package com.dupreeincabolnuevo.dupree.mh_response_api;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Agustin Acebo on 31/03/19.
 */

public class PedidoDigitado {
    @SerializedName("nume_iden")
    private String nume_iden;
    @SerializedName("nomb_terc")
    private String nomb_terc;
    @SerializedName("acti_usua")
    private String acti_usua;


    public PedidoDigitado(String nume_iden, String nomb_terc,  String acti_usua) {
        this.nume_iden = nume_iden;
        this.nomb_terc = nomb_terc;
        this.acti_usua = acti_usua;
    }

    public String getNume_iden() {
        return nume_iden;
    }

    public String getNomb_terc() {
        return nomb_terc;
    }

    public String getActi_usua() {
        return acti_usua;
    }
}
