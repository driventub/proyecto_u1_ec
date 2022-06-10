package com.uce.avanzada.proyecto_u1_pa.banco.service;

import java.math.BigDecimal;

import com.uce.avanzada.proyecto_u1_pa.banco.modelo.Deposito;

public interface IDepositoService {
    public void realizar(String ctaDestin, BigDecimal monto );

    public void ingresarDeposito(Deposito e);

    public Deposito buscarPorNumCuenta(String numCuenta);

    // actualizar
    public void actualizarDeposito(Deposito e);

    // eliminar
    public void borrarDeposito(String numCuenta);

}
