package com.uce.avanzada.proyecto_u1_pa.banco.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Retiro {
    private LocalDateTime fechaDeposito;
    private String numCuenta;
    private BigDecimal monto;

    // Set y Get
    public LocalDateTime getFechaDeposito() {
        return fechaDeposito;
    }
    public void setFechaDeposito(LocalDateTime fechaDeposito) {
        this.fechaDeposito = fechaDeposito;
    }
    public String getNumCuenta() {
        return numCuenta;
    }
    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }
    public BigDecimal getMonto() {
        return monto;
    }
    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }
    @Override
    public String toString() {
        return "Deposito [fechaDeposito=" + fechaDeposito + ", monto=" + monto + ", numCuenta=" + numCuenta + "]";
    }

    
}
