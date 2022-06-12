package com.uce.avanzada.proyecto_u1_pa.bodega.modelo;


import java.time.LocalDateTime;

public class Inventario {
    private String nombreBodega;
    private Integer cantidad;
    private Producto producto;
    private LocalDateTime fechaIngreso;

    // Set y Get

    public Integer getCantidad() {
        return cantidad;
    }

    public String getNombreBodega() {
        return nombreBodega;
    }

    public void setNombreBodega(String nombreBodega) {
        this.nombreBodega = nombreBodega;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public LocalDateTime getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDateTime fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "Inventario [cantidad=" + cantidad + ", fechaIngreso=" + fechaIngreso + ", nombreBodega=" + nombreBodega
                + ", producto=" + producto + "]";
    }

}
