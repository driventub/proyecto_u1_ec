package com.uce.avanzada.proyecto_u1_pa.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.avanzada.proyecto_u1_pa.banco.modelo.CuentaBancaria;

@Service
@Qualifier("futuro")
public class CuentaAhorroFuturoImpl implements ICuentaBancariaService {

    @Override
    public void actualizar(CuentaBancaria c) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public CuentaBancaria buscar(String numero) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void ingresarCuentaBancaria(CuentaBancaria e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void borrarCuentaBancaria(String cedula) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public BigDecimal calcularInteres(String numCuenta, BigDecimal saldo) {
        System.out.println("Calculando interes Cuenta Ahorro Futuro .........");
        BigDecimal interes = saldo.multiply(new BigDecimal("0.22"));
        interes = interes.add(saldo.divide(new BigDecimal("50")));


        return interes;
    }
    
}
