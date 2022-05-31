package com.uce.avanzada.proyecto_u1_pa.ejemplo2;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

@Component
public class Comida {
    private String nombre;
    private BigDecimal precio;
    private Boolean promocion;

    // Set y Get

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getPrecio() {
        return this.precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Boolean getPromocion() {
        return this.promocion;
    }

    public void setPromocion(Boolean promocion) {
        this.promocion = promocion;
    }

}
