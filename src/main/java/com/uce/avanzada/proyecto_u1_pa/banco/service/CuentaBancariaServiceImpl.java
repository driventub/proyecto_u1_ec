package com.uce.avanzada.proyecto_u1_pa.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.avanzada.proyecto_u1_pa.banco.modelo.CuentaBancaria;
import com.uce.avanzada.proyecto_u1_pa.banco.repository.ICuentaBancariaRepo;

@Service
public class CuentaBancariaServiceImpl implements ICuentaBancariaService{

    @Autowired
    private ICuentaBancariaRepo bancariaRepo;

    @Override
    public void actualizar(CuentaBancaria c) {
        this.bancariaRepo.actualizar(c);
        
    }

    @Override
    public CuentaBancaria buscar(String numero) {
        
        return this.bancariaRepo.buscar(numero);
    }

    @Override
    public void ingresarCuentaBancaria(CuentaBancaria e) {
        this.bancariaRepo.insertar(e);
        
    }

    @Override
    public void borrarCuentaBancaria(String numero) {
        this.bancariaRepo.eliminar(numero);
        
    }
    
    @Override
    public BigDecimal calcularInteres(String numCuenta, BigDecimal saldo) {
        // TODO Auto-generated method stub
        return null;
    }
    
    
}
