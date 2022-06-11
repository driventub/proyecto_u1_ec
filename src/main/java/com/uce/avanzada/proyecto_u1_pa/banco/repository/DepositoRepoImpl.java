package com.uce.avanzada.proyecto_u1_pa.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.avanzada.proyecto_u1_pa.banco.modelo.Deposito;

@Repository
public class DepositoRepoImpl implements IDepositoRepo{

    @Override
    public void insertarDeposito(Deposito d) {
        System.out.println("Se creo el deposito :" + d);
        
    }

    @Override
    public Deposito buscar(String numCuenta) {
        System.out.println("Se ha buscado en la base " + numCuenta);
        Deposito e = new Deposito();
        e.setNumCuenta(numCuenta);
        return e;
    }

    @Override
    public void actualizar(Deposito e) {
        System.out.println("Se ha actualizado en la base " + e);
        
    }

    @Override
    public void eliminar(String numCuenta) {
        System.out.println("Se ha eliminado de la base " + numCuenta);
        
    }

    @Override
    public List<Deposito> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
        List<Deposito> listaConsultada = new ArrayList<>();
        Deposito t1 = new Deposito();
        t1.setFechaDeposito(LocalDateTime.of(2021,2,10,8,50,2));
        t1.setMonto(new BigDecimal("100"));
        t1.setNumCuenta("123");
        
        
        Deposito t2 = new Deposito();
        t2.setFechaDeposito(LocalDateTime.of(2021,2,10,8,50,2));
        t2.setMonto(new BigDecimal("100"));
        t2.setNumCuenta("123");
        


        listaConsultada.add(t1);
        listaConsultada.add(t2);
        return listaConsultada;
    }

    
    
}
