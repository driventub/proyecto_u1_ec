package com.uce.avanzada.proyecto_u1_pa.bodega.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Reporte {
    private String nombreProducto;
    private Integer cantidadProducto;
    private BigDecimal precioVenta;
    private LocalDateTime fechaIngreso;

    // Set y Get
    public String getNombreProducto() {
        return nombreProducto;
    }
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public Integer getCantidadProducto() {
        return cantidadProducto;
    }
    public void setCantidadProducto(Integer cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }
    public BigDecimal getPrecioVenta() {
        return precioVenta;
    }
    public void setPrecioVenta(BigDecimal precioVenta) {
        this.precioVenta = precioVenta;
    }
    public LocalDateTime getFechaIngreso() {
        return fechaIngreso;
    }
    public void setFechaIngreso(LocalDateTime fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    @Override
    public String toString() {
        return "Reporte [cantidadProducto=" + cantidadProducto + ", fechaIngreso=" + fechaIngreso + ", nombreProducto="
                + nombreProducto + ", precioVenta=" + precioVenta + "]";
    }

    
    
}
