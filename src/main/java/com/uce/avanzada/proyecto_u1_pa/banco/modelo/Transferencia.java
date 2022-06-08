package com.uce.avanzada.proyecto_u1_pa.banco.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transferencia {
    private String numCuentaOrigen;
    private String numCuentaDestin;
    private BigDecimal montoTransferir;
    private LocalDateTime fechaTransferencia;

    // Set y Get
    public String getNumCuentaOrigen() {
        return numCuentaOrigen;
    }
    public void setNumCuentaOrigen(String numCuentaOrigen) {
        this.numCuentaOrigen = numCuentaOrigen;
    }
    public String getNumCuentaDestin() {
        return numCuentaDestin;
    }
    public void setNumCuentaDestin(String numCuentaDestin) {
        this.numCuentaDestin = numCuentaDestin;
    }
    public BigDecimal getMontoTransferir() {
        return montoTransferir;
    }
    public void setMontoTransferir(BigDecimal montoTransferir) {
        this.montoTransferir = montoTransferir;
    }
    public LocalDateTime getFechaTransferencia() {
        return fechaTransferencia;
    }
    public void setFechaTransferencia(LocalDateTime fechaTransferencia) {
        this.fechaTransferencia = fechaTransferencia;
    }
    @Override
    public String toString() {
        return "Transferencia [fechaTransferencia=" + fechaTransferencia + ", montoTransferir=" + montoTransferir
                + ", numCuentaDestin=" + numCuentaDestin + ", numCuentaOrigen=" + numCuentaOrigen + "]";
    }

    
    
    
    
}
