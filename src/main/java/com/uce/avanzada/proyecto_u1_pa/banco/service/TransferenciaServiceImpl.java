package com.uce.avanzada.proyecto_u1_pa.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.avanzada.proyecto_u1_pa.banco.modelo.CuentaBancaria;
import com.uce.avanzada.proyecto_u1_pa.banco.modelo.Transferencia;
import com.uce.avanzada.proyecto_u1_pa.banco.repository.ITransferenciaRepo;


@Service
public class TransferenciaServiceImpl implements ITransferenciaService{

    @Autowired
    private ICuentaBancariaService bancariaService;

    @Autowired
    private ITransferenciaRepo transferenciaRepo;

    @Override
    public void realizar(String ctaOrigen, String ctaDestino, BigDecimal monto) {
        CuentaBancaria cOrigen = this.bancariaService.buscar(ctaOrigen);
        BigDecimal saldoOrigen = cOrigen.getSaldo();
        BigDecimal nuevaSaldoOrigen = saldoOrigen.subtract(monto);
        cOrigen.setSaldo(nuevaSaldoOrigen);
        this.bancariaService.actualizar(cOrigen);
        
        CuentaBancaria cDestino = this.bancariaService.buscar(ctaDestino);
        BigDecimal saldoDestino = cDestino.getSaldo();
        BigDecimal nuevaSaldoDestino = saldoDestino.subtract(monto);
        cDestino.setSaldo(nuevaSaldoDestino);
        this.bancariaService.actualizar(cDestino);

        Transferencia t = new Transferencia();
        t.setNumCuentaOrigen(ctaOrigen);
        t.setNumCuentaDestin(ctaDestino);
        t.setMontoTransferir(monto);
        t.setFechaTransferencia(LocalDateTime.now());
        this.transferenciaRepo.insertar(t);
    }
    
}
