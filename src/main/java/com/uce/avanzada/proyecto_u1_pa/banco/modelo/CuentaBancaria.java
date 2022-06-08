package com.uce.avanzada.proyecto_u1_pa.banco.modelo;

import java.math.BigDecimal;

public class CuentaBancaria {
    private String numero;
    private BigDecimal saldo;
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public BigDecimal getSaldo() {
        return saldo;
    }
    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
    @Override
    public String toString() {
        return "CuentaBancaria [numero=" + numero + ", saldo=" + saldo + "]";
    }

    
}
