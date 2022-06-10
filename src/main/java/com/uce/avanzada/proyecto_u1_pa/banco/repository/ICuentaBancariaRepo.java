package com.uce.avanzada.proyecto_u1_pa.banco.repository;

import com.uce.avanzada.proyecto_u1_pa.banco.modelo.CuentaBancaria;

public interface ICuentaBancariaRepo {
    public void insertar(CuentaBancaria e);

    public CuentaBancaria buscar(String numero);

    public void actualizar(CuentaBancaria e);

    public void eliminar(String numero);
}
