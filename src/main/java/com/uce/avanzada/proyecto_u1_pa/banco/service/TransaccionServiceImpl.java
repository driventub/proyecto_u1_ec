package com.uce.avanzada.proyecto_u1_pa.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.avanzada.proyecto_u1_pa.banco.modelo.Deposito;
import com.uce.avanzada.proyecto_u1_pa.banco.modelo.Retiro;
import com.uce.avanzada.proyecto_u1_pa.banco.modelo.Transferencia;
import com.uce.avanzada.proyecto_u1_pa.banco.modelo.to.TransaccionTo;
import com.uce.avanzada.proyecto_u1_pa.banco.repository.IDepositoRepo;
import com.uce.avanzada.proyecto_u1_pa.banco.repository.IRetiroRepo;
import com.uce.avanzada.proyecto_u1_pa.banco.repository.ITransferenciaRepo;

@Service
public class TransaccionServiceImpl implements ITransaccionService{

    @Autowired
    private ITransferenciaService iTransferenciaService;

    @Autowired
    private IDepositoService iDepositoService;

    @Autowired
    private IRetiroService iRetiroService;

    @Autowired
    private IDepositoRepo iDepositoRepo;

    @Autowired
    private ITransferenciaRepo iTransferenciaRepo;

    @Autowired
    private IRetiroRepo iRetiroRepo;
    
    

    @Override
    public void transferencia(String origen, String destino, BigDecimal monto) {
        this.iTransferenciaService.realizar(origen, destino, monto);
        
    }

    @Override
    public void deposito(String destino, BigDecimal monto) {
        this.iDepositoService.realizar(destino, monto);;
        
    }

    @Override
    public void retiro(String origen, BigDecimal monto) {
        this.iRetiroService.retiro(origen, monto);
        
    }

    @Override
    public List<TransaccionTo> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
        
        List<Transferencia> listaTrans = this.iTransferenciaRepo.consultar(cuenta, fechaInicio, fechaFin) ;
        List<Deposito> listaDepo = this.iDepositoRepo.consultar(cuenta, fechaInicio, fechaFin);
        List<Retiro> listaReti = this.iRetiroRepo.consultar(cuenta, fechaInicio, fechaFin);

        // Vamos a unir todas las listas

        List<TransaccionTo> listaFinal = new ArrayList<>();
        for(Transferencia t : listaTrans){
            TransaccionTo tTo = this.transformar(t);
            listaFinal.add(tTo);
        }

        for(Deposito d: listaDepo){
            TransaccionTo tTo = this.transformar(d);
            listaFinal.add(tTo);
        }

        for(Retiro r: listaReti){
            TransaccionTo tTo = this.transformar(r);
            listaFinal.add(tTo);
        }

        return listaFinal;

        
    }

    private TransaccionTo transformar(Transferencia transferencia){
        TransaccionTo tTo = new TransaccionTo();
        tTo.setFecha(transferencia.getFechaTransferencia());
        tTo.setMonto(transferencia.getMontoTransferir());
        tTo.setTipo("T");


        return tTo;
    }

    private TransaccionTo transformar(Deposito depo) {
        TransaccionTo tTo = new TransaccionTo();
        tTo.setFecha(depo.getFechaDeposito());
        tTo.setMonto(depo.getMonto());
        tTo.setTipo("D");


        return tTo;
    }

    private TransaccionTo transformar(Retiro depo) {
        TransaccionTo tTo = new TransaccionTo();
        tTo.setFecha(depo.getFechaDeposito());
        tTo.setMonto(depo.getMonto());
        tTo.setTipo("R");


        return tTo;
    }

   

}
