package com.uce.avanzada.proyecto_u1_pa.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;

import com.uce.avanzada.proyecto_u1_pa.banco.modelo.CuentaBancaria;
import com.uce.avanzada.proyecto_u1_pa.banco.modelo.Retiro;
import com.uce.avanzada.proyecto_u1_pa.banco.repository.IRetiroRepo;

public class RetiroServiceImpl implements IRetiroService {


    @Autowired
    private IRetiroRepo depositoRepo;

    @Autowired
    private ICuentaBancariaService bancariaService;


    @Override
    public void ingresarRetiro(Retiro e) {
        this.depositoRepo.insertarRetiro(e);

    }

    @Override
    public Retiro buscarPorNumCuenta(String numCuenta) {
        // TODO Auto-generated method stub
        return this.depositoRepo.buscar(numCuenta);
    }

    @Override
    public void actualizarRetiro(Retiro e) {
        this.depositoRepo.actualizar(e);

    }

    @Override
    public void borrarRetiro(String cedula) {
        this.depositoRepo.eliminar(cedula);

    }

    @Override
    public void retiro(String ctaOrigen, BigDecimal monto) {
        CuentaBancaria cDestino = this.bancariaService.buscar(ctaOrigen);
        BigDecimal saldoDestino = cDestino.getSaldo();
        BigDecimal nuevaSaldoDestino = saldoDestino.subtract(monto);
        cDestino.setSaldo(nuevaSaldoDestino);
        this.bancariaService.actualizar(cDestino);

        Retiro t = new Retiro();
        t.setMonto(monto);
        t.setNumCuenta("1234");
        t.setFechaDeposito(LocalDateTime.now());
        
        this.depositoRepo.insertarRetiro(t);
        
    }

    
    
    
    
    
}
