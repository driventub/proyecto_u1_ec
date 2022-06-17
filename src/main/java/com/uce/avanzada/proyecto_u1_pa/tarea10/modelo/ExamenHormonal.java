package com.uce.avanzada.proyecto_u1_pa.tarea10.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ExamenHormonal {
    private String cedula;
    private String nombrePaciente;
    private String tipo;   
    private BigDecimal precio;
    private LocalDateTime fechaEntrega;

    public String getNombrePaciente() {
        return nombrePaciente;
    
    }

    // Set y Get
    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public BigDecimal getPrecio() {
        return precio;
    }
    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }
    public LocalDateTime getFechaEntrega() {
        return fechaEntrega;
    }
    public void setFechaEntrega(LocalDateTime fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Examen [cedula=" + cedula + ", fechaEntrega=" + fechaEntrega + ", nombrePaciente=" + nombrePaciente
                + ", precio=" + precio + ", tipo=" + tipo + "]";
    }
    
    
    
    

}
