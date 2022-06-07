package com.uce.avanzada.proyecto_u1_pa.repository;

import com.uce.avanzada.proyecto_u1_pa.modelo.Materia;

public interface IMateriaRepository {
    // CRUD
    // insertar
    public void insertar(Materia e);

    // leer
    public Materia buscar(String semestre);

    // actualizar
    public void actualizar(Materia e);

    // eliminar
    public void eliminar(String cedula);


}
