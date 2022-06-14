package com.uce.avanzada.proyecto_u1_pa.banco.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.avanzada.proyecto_u1_pa.banco.modelo.CuentaBancaria;

@Repository
public class CuentaBancariaRepoImpl implements ICuentaBancariaRepo {

    @Override
    public void actualizar(CuentaBancaria c) {
        // Aqui construir SQLs
        System.out.println("Cuenta Bancaria actualizada a: " + c);

    }

    @Override
    public CuentaBancaria buscar(String numero) {
        System.out.println("Se busca la cuenta bancaria :" + numero);
        CuentaBancaria c = new CuentaBancaria();
        c.setNumero(numero);
        c.setSaldo(new BigDecimal("100"));
        c.setTipo("C");
        return c;
    }

    @Override
    public void insertar(CuentaBancaria e) {
        System.out.println("Se ha insertado en la base " + e);

    }

    @Override
    public void eliminar(String numero) {
        System.out.println("Se ha eliminado de la base " + numero);

    }

}
