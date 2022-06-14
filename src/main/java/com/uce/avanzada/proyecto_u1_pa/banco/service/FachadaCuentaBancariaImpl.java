package com.uce.avanzada.proyecto_u1_pa.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.avanzada.proyecto_u1_pa.banco.modelo.CuentaBancaria;
import com.uce.avanzada.proyecto_u1_pa.banco.repository.ICuentaBancariaRepo;

@Service
public class FachadaCuentaBancariaImpl implements IFachadaCuentaBancaria{

    @Autowired
    private ICuentaBancariaRepo cuentaBancariaRepo;

    @Autowired
    @Qualifier("corriente")
    private ICuentaBancariaService cuentaBancariaService;
    
    @Autowired
    @Qualifier("ahorros")
    private ICuentaBancariaService cuentaBancariaServiceAhorros;

    @Override
    public BigDecimal calcularInteres(String numCuenta) {

        BigDecimal interes = null;
        CuentaBancaria c = this.cuentaBancariaRepo.buscar(numCuenta);
        if(c.getTipo().equals("A")){
            // Ahorros
            interes = this.cuentaBancariaServiceAhorros.calcularInteres(numCuenta, c.getSaldo());
        }else{
            interes = this.cuentaBancariaService.calcularInteres(numCuenta, c.getSaldo());
        }

        return interes;
    }
    
}
