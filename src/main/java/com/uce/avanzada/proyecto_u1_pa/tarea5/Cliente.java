package com.uce.avanzada.proyecto_u1_pa.tarea5;

import org.springframework.stereotype.Component;

@Component
public class Cliente {
    private String nombre;
    private String cedula;
    private String tarjetaCredito;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return this.cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTarjetaCredito() {
        return this.tarjetaCredito;
    }

    public void setTarjetaCredito(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

}
