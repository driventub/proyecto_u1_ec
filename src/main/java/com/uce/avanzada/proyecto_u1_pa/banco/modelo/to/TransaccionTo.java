package com.uce.avanzada.proyecto_u1_pa.banco.modelo.to;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransaccionTo 
// implements Comparable<LocalDateTime> 
{

    // @Override
    // public int compareTo(LocalDateTime arg0) {
    //     // TODO Auto-generated method stub
    //     return 0;
    // }

    private LocalDateTime fecha;
    private BigDecimal monto;
    private String tipo;
    public LocalDateTime getFecha() {
        return fecha;
    }
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
    public BigDecimal getMonto() {
        return monto;
    }
    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    
}
