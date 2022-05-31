package com.uce.avanzada.proyecto_u1_pa.consultorio;

import org.springframework.stereotype.Component;

// Les voy a poner una metadata

@Component

public class Doctor {
    private String nombre;
    private String apellido;
    private Integer edad;
    private String ciudad;

    // Set y Get

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return this.edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

   

 
}
