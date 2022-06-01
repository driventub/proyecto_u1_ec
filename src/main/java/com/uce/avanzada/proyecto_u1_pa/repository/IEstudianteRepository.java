package com.uce.avanzada.proyecto_u1_pa.repository;

import com.uce.avanzada.proyecto_u1_pa.modelo.Estudiante;

public interface IEstudianteRepository {
    // CRUD
    // insertar
    public void insertar(Estudiante e);

    // leer
    public Estudiante buscar(String apellido);

    // actualizar
    public void actualizar(Estudiante e);

    // eliminar
    public void eliminar(String cedula);


}
