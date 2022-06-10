package com.uce.avanzada.proyecto_u1_pa.banco.service;

import com.uce.avanzada.proyecto_u1_pa.banco.modelo.CuentaBancaria;

public interface ICuentaBancariaService {
    public void actualizar(CuentaBancaria c);

    public CuentaBancaria buscar(String numero);

    public void ingresarCuentaBancaria(CuentaBancaria e);

    public void borrarCuentaBancaria(String cedula);
}
