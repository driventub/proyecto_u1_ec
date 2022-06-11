package com.uce.avanzada.proyecto_u1_pa.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.uce.avanzada.proyecto_u1_pa.banco.modelo.Retiro;

public interface IRetiroRepo {
    public void insertarRetiro(Retiro d);

    // leer
    public Retiro buscar(String numCuenta);

    // actualizar
    public void actualizar(Retiro e);

    
    public void eliminar(String numCuenta);

    public void retiro(String numCuenta, LocalDateTime fechaRetiro, BigDecimal monto);

    public List<Retiro> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) ;
  
    
}
