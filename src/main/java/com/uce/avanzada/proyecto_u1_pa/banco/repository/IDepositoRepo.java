package com.uce.avanzada.proyecto_u1_pa.banco.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.avanzada.proyecto_u1_pa.banco.modelo.Deposito;

public interface IDepositoRepo {
    public void insertarDeposito(Deposito d);

    // leer
    public Deposito buscar(String numCuenta);

    // actualizar
    public void actualizar(Deposito e);

    
    public void eliminar(String numCuenta);

    public List<Deposito> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) ;

}
