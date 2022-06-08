package com.uce.avanzada.proyecto_u1_pa.banco.repository;

import com.uce.avanzada.proyecto_u1_pa.banco.modelo.CuentaBancaria;

public interface ICuentaBancariaRepo {
    public void actualizar(CuentaBancaria c);
    public CuentaBancaria buscar(String numero);
}
