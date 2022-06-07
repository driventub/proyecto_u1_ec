package com.uce.avanzada.proyecto_u1_pa.repository;

import com.uce.avanzada.proyecto_u1_pa.modelo.Matricula;

public interface IMatriculaRepository {
    // CRUD
    // insertar
    public void insertar(Matricula e);

    // leer
    public Matricula buscar(String numero);

    // actualizar
    public void actualizar(Matricula e);

    // eliminar
    public void eliminar(String cedula);


}
