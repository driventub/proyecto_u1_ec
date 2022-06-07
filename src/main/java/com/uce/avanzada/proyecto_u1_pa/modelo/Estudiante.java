package com.uce.avanzada.proyecto_u1_pa.modelo;

public class Estudiante {

    private String cedula;
    private String nombre;
    private String apellido;
    
    // Set y Get
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    @Override
    public String toString() {
        return "Estudiante [apellido=" + apellido + ", cedula=" + cedula + ", nombre=" + nombre + "]";
    }
    
    
    
}
