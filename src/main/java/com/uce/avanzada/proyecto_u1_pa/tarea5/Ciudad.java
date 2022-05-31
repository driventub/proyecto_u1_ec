package com.uce.avanzada.proyecto_u1_pa.tarea5;

import org.springframework.stereotype.Component;

@Component
public class Ciudad {
    private String nombre;
    private String pais;
    private String provincia;

    // Set y Get

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return this.pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getProvincia() {
        return this.provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }


}
