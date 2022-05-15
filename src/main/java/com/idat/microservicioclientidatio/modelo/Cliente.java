package com.idat.microservicioclientidatio.modelo;

import java.util.List;

public class Cliente {
    private Integer idCliente;
    private String cliente;
    private List<Hospital> listadoHospital;

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }



    public List<Hospital> getListadoEstudiante() {
        return listadoHospital;
    }

    public void setListadoEstudiante(List<Hospital> listadoHospital) {
        this.listadoHospital = listadoHospital;
    }
}
