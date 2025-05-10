package com.upiiz.examenii.Models;

public class OrderLineModelDepartamento {
    private DepartamentoModel departamentoModel;

    private int departamentoId;
    private String nombre1;
    private String ubicacion1;

    public OrderLineModelDepartamento() {

    }
    public OrderLineModelDepartamento(DepartamentoModel departamentoModel, int departamentoId, String nombre1, String ubicacion1) {
        this.departamentoModel = departamentoModel;
        this.departamentoId = departamentoId;
        this.nombre1 = nombre1;
        this.ubicacion1 = ubicacion1;

    }

    public DepartamentoModel getDepartamentoModel() {
        return departamentoModel;
    }

    public void setDepartamentoModel(DepartamentoModel departamentoModel) {
        this.departamentoModel = departamentoModel;
    }

    public int getDepartamentoId() {
        return departamentoId;
    }

    public void setDepartamentoId(int departamentoId) {
        this.departamentoId = departamentoId;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getUbicacion1() {
        return ubicacion1;
    }

    public void setUbicacion1(String ubicacion1) {
        this.ubicacion1 = ubicacion1;
    }
}
