package com.dupreincabolivia.dupree.mh_required_api;

import com.dupreincabolivia.dupree.mh_response_api.Raise;

import java.util.List;

/**
 * Created by cloudemotion on 1/9/17.
 */

public class RequiredInscription_NEW {
    private String cedula;//

    private String nacimiento;//
    private String zona_seccion;

    private String direccion;
    private String interseccion;
    private String numero;
    private String departamento;//
    private String id_ciudad;//
    private String name_ciudad;//
    private String barrio;//
    private String id_barrio;//

    private String direccion_envio;//
    private String interseccion_envio;//
    private String numero_envio;//
    private String departamento_envio;//
    private String id_ciudad_envio;//
    private String name_ciudad_envio;//
    private String barrio_envio;//
    private String id_barrio_envio;//

    private String telefono;//
    private String celular;//

    private String correo;//
    private String imei;

    private String referenciado_por;//
    private List<String> img_cedula;//
    private List<String> pagare;
    private List<String> factura;    ///factura bolivia
    private List<Referencia> referencia;//
    private String latitud;
    private String longitud;
    private String exactitud;

    //solo para edicion de inscrip rechazada
    private String referenciado_nombre;//


    public RequiredInscription_NEW(String cedula, String nacimiento, String zona_seccion, String direccion,
                                   String interseccion, String numero, String departamento, String id_ciudad,
                                   String name_ciudad, String barrio, String id_barrio, String direccion_envio,
                                   String interseccion_envio, String numero_envio, String departamento_envio,
                                   String id_ciudad_envio, String name_ciudad_envio, String barrio_envio,
                                   String id_barrio_envio, String telefono, String celular, String correo,
                                   String imei, String referenciado_por, String referenciado_nombre) {
        this.cedula = cedula;
        this.nacimiento = nacimiento;
        this.zona_seccion = zona_seccion;
        this.direccion = direccion;
        this.interseccion = interseccion;
        this.numero = numero;
        this.departamento = departamento;
        this.id_ciudad = id_ciudad;
        this.name_ciudad = name_ciudad;
        this.barrio = barrio;
        this.id_barrio = id_barrio;
        this.direccion_envio = direccion_envio;
        this.interseccion_envio = interseccion_envio;
        this.numero_envio = numero_envio;
        this.departamento_envio = departamento_envio;
        this.id_ciudad_envio = id_ciudad_envio;
        this.name_ciudad_envio = name_ciudad_envio;
        this.barrio_envio = barrio_envio;
        this.id_barrio_envio = id_barrio_envio;
        this.telefono = telefono;
        this.celular = celular;
        this.correo = correo;
        this.imei = imei;
        this.referenciado_por = referenciado_por;
        this.referenciado_nombre = referenciado_nombre;
    }

    public String getLatitud() {
        return latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public String getExactitud() {
        return exactitud;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public String getZona_seccion() {
        return zona_seccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getInterseccion() {
        return interseccion;
    }

    public String getNumero() {
        return numero;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getId_ciudad() {
        return id_ciudad;
    }

    public String getName_ciudad() {
        return name_ciudad;
    }

    public String getBarrio() {
        return barrio;
    }

    public String getId_barrio() {
        return id_barrio;
    }

    public String getDireccion_envio() {
        return direccion_envio;
    }

    public String getInterseccion_envio() {
        return interseccion_envio;
    }

    public String getNumero_envio() {
        return numero_envio;
    }

    public String getDepartamento_envio() {
        return departamento_envio;
    }

    public String getId_ciudad_envio() {
        return id_ciudad_envio;
    }

    public String getName_ciudad_envio() {
        return name_ciudad_envio;
    }

    public String getBarrio_envio() {
        return barrio_envio;
    }

    public String getId_barrio_envio() {
        return id_barrio_envio;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCelular() {
        return celular;
    }

    public String getCorreo() {
        return correo;
    }

    public String getImei() {
        return imei;
    }

    public String getReferenciado_por() {
        return referenciado_por;
    }

    public List<String> getImg_cedula() {
        return img_cedula;
    }

    public List<String> getPagare() {
        return pagare;
    }

    public List<String> getFactura() {
        return factura;
    }

    public List<Referencia> getReferencia() {
        return referencia;
    }

    public String getReferenciado_nombre() {
        return referenciado_nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setZona_seccion(String zona_seccion) {
        this.zona_seccion = zona_seccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setInterseccion(String interseccion) {
        this.interseccion = interseccion;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setId_ciudad(String id_ciudad) {
        this.id_ciudad = id_ciudad;
    }

    public void setName_ciudad(String name_ciudad) {
        this.name_ciudad = name_ciudad;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public void setId_barrio(String id_barrio) {
        this.id_barrio = id_barrio;
    }


    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public void setExactitud(String exactitud) {
        this.exactitud = exactitud;
    }

    public void setDireccion_envio(String direccion_envio) {
        this.direccion_envio = direccion_envio;
    }

    public void setInterseccion_envio(String interseccion_envio) {
        this.interseccion_envio = interseccion_envio;
    }

    public void setNumero_envio(String numero_envio) {
        this.numero_envio = numero_envio;
    }

    public void setDepartamento_envio(String departamento_envio) {
        this.departamento_envio = departamento_envio;
    }

    public void setId_ciudad_envio(String id_ciudad_envio) {
        this.id_ciudad_envio = id_ciudad_envio;
    }

    public void setName_ciudad_envio(String name_ciudad_envio) {
        this.name_ciudad_envio = name_ciudad_envio;
    }

    public void setBarrio_envio(String barrio_envio) {
        this.barrio_envio = barrio_envio;
    }

    public void setId_barrio_envio(String id_barrio_envio) {
        this.id_barrio_envio = id_barrio_envio;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public void setReferenciado_por(String referenciado_por) {
        this.referenciado_por = referenciado_por;
    }

    public void setImg_cedula(List<String> img_cedula) {
        this.img_cedula = img_cedula;
    }

    public void setPagare(List<String> pagare) {
        this.pagare = pagare;
    }

    public void setFactura(List<String> factura) {
        this.factura = factura;
    }

    public void setReferencia(List<Referencia> referencia) {
        this.referencia = referencia;
    }

    public void setReferenciado_nombre(String referenciado_nombre) {
        this.referenciado_nombre = referenciado_nombre;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setRaise(List<Raise> raise) {
        this.raise = raise;
    }

    int code;
    List<Raise> raise;

    public int getCode() {
        return code;
    }

    public List<Raise> getRaise() {
        return raise;
    }
}
