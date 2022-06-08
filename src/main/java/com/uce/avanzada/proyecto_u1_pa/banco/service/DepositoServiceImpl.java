package com.uce.avanzada.proyecto_u1_pa.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.avanzada.proyecto_u1_pa.banco.modelo.CuentaBancaria;
import com.uce.avanzada.proyecto_u1_pa.banco.modelo.Deposito;
import com.uce.avanzada.proyecto_u1_pa.banco.repository.IDepositoRepo;

@Service
public class DepositoServiceImpl implements IDepositoService{

    @Autowired
    private ICuentaBancariaService bancariaService;

    @Autowired
    private IDepositoRepo depositoRepo;

    @Override
    public void realizar(String ctaDestin, BigDecimal monto) {
        CuentaBancaria cDestino = this.bancariaService.buscar(ctaDestin);
        BigDecimal saldoFinal = cDestino.getSaldo().add(monto);
        cDestino.setSaldo(saldoFinal);
        this.bancariaService.actualizar(cDestino);

        Deposito deposito = new Deposito();
        deposito.setFechaDeposito(LocalDateTime.now());
        deposito.setNumCuenta(ctaDestin);
        deposito.setMonto(monto);

        this.depositoRepo.insertarDeposito(deposito);
        
    }
    
}