package com.uce.avanzada.proyecto_u1_pa.consultorio;

import org.springframework.stereotype.Component;

// Les voy a poner una metadata
@Component
public class Paciente {
    private String nombre;
    private Integer edad;

    // Set y Get

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return this.edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }


}
