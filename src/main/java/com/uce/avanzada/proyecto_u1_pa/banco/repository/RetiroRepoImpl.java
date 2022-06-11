package com.uce.avanzada.proyecto_u1_pa.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.uce.avanzada.proyecto_u1_pa.banco.modelo.Retiro;

public class RetiroRepoImpl implements IRetiroRepo{
    @Override
    public void insertarRetiro(Retiro d) {
        System.out.println("Se creo el Retiro :" + d);
        
    }

    @Override
    public Retiro buscar(String numCuenta) {
        System.out.println("Se ha buscado en la base " + numCuenta);
        Retiro e = new Retiro();
        e.setNumCuenta(numCuenta);
        return e;
    }

    @Override
    public void actualizar(Retiro e) {
        System.out.println("Se ha actualizado en la base " + e);
        
    }

    @Override
    public void eliminar(String numCuenta) {
        System.out.println("Se ha eliminado de la base " + numCuenta);
        
    }

    @Override
    public void retiro(String numCuenta, LocalDateTime fechaRetiro, BigDecimal monto) {
       
    
       
    

        
    }

    @Override
    public List<Retiro> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
         List<Retiro> listaConsultada = new ArrayList<>();
        
        
        
        
        Retiro t2 = new Retiro();
        t2.setFechaDeposito(LocalDateTime.of(2021,2,10,8,50,2));
        t2.setMonto(new BigDecimal("100"));
        t2.setNumCuenta("123");
        


        listaConsultada.add(t2);
        
        return listaConsultada;
    }

    
}
