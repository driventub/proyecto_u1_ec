package com.uce.avanzada.proyecto_u1_pa.banco.service;

import java.math.BigDecimal;

import com.uce.avanzada.proyecto_u1_pa.banco.modelo.Retiro;

public interface IRetiroService {
    public void ingresarRetiro(Retiro e);

    public Retiro buscarPorNumCuenta(String numCuenta);

    // actualizar
    public void actualizarRetiro(Retiro e);

    // eliminar
    
    public void borrarRetiro(String numCuenta);

    public void retiro(String ctaOrigen, BigDecimal monto);

    



}
