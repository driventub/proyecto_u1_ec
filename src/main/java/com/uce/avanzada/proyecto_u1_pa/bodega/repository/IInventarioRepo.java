package com.uce.avanzada.proyecto_u1_pa.bodega.repository;

import java.util.List;

import com.uce.avanzada.proyecto_u1_pa.bodega.modelo.Inventario;

public interface IInventarioRepo {
    public void insertar(Inventario i);
    public List<Inventario> buscarTodos();

}
