package com.uce.avanzada.proyecto_u1_pa.modelo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)
public class ProfesorMateria {
    private String nombre;
    private String apelldo;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApelldo() {
        return apelldo;
    }
    public void setApelldo(String apelldo) {
        this.apelldo = apelldo;
    }
    @Override
    public String toString() {
        return "ProfesorGeneral [apelldo=" + apelldo + ", nombre=" + nombre + "]";
    }

    
    
}
