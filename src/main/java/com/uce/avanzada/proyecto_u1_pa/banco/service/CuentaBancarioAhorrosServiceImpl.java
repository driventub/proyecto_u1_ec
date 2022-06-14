package com.uce.avanzada.proyecto_u1_pa.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.avanzada.proyecto_u1_pa.banco.modelo.CuentaBancaria;

@Service
@Qualifier("ahorros")
public class CuentaBancarioAhorrosServiceImpl implements ICuentaBancariaService {


   
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
    public BigDecimal calcularInteres(String numCuenta , BigDecimal saldo) {
        // Codigo duplicado
        // CuentaBancaria cta = this.cuentaBancariaRepo.buscar(numCuenta);
        // BigDecimal saldo = ;
        BigDecimal interes = saldo.multiply(new BigDecimal("0.15"));
        interes = interes.add(saldo.divide(new BigDecimal("100")));


        return interes;
    }
    
}
