package com.uce.avanzada.proyecto_u1_pa.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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
        BigDecimal nuevaSaldoDestino = saldoDestino.add(monto);
        cDestino.setSaldo(nuevaSaldoDestino);
        this.bancariaService.actualizar(cDestino);

        Transferencia t = new Transferencia();
        t.setNumCuentaOrigen(ctaOrigen);
        t.setNumCuentaDestin(ctaDestino);
        t.setMontoTransferir(monto);
        t.setFechaTransferencia(LocalDateTime.now());
        this.transferenciaRepo.insertar(t);
    }

    @Override
    public void ingresarTransferencia(Transferencia e) {
        this.transferenciaRepo.insertar(e);
        
    }
    
    @Override
    public Transferencia buscarPorNumCuenta(String numCuenta) {
        // TODO Auto-generated method stub
        return this.transferenciaRepo.buscar(numCuenta);
    }
    
    @Override
    public void actualizarTransferencia(Transferencia e) {
        this.transferenciaRepo.actualizar(e);
        
    }
    
    @Override
    public void borrarTransferencia(String numCuenta) {
        this.transferenciaRepo.eliminar(numCuenta);
    
    
}
    // Como solo necesito una cuenta, no es necesario mandar a buscar otra,
    // El numero de cuenta origen utilizaria el numero de Cuenta, y la cuenta destino ya que es el usuario que realiza
    // el retiro quedaria como nula
  
    @Override
    public List<Transferencia> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaRetiro) {
        List<Transferencia> listaConsultada = new ArrayList<>();
        Transferencia t1 = new Transferencia();
        t1.setFechaTransferencia(LocalDateTime.now());
        t1.setMontoTransferir(new BigDecimal("100"));
        t1.setNumCuentaOrigen("789");
        t1.setNumCuentaDestin("123");


        listaConsultada.add(t1);
        return listaConsultada;
    }
}