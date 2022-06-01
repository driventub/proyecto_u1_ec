package com.uce.avanzada.proyecto_u1_pa.service;

import com.uce.avanzada.proyecto_u1_pa.modelo.Estudiante;

public interface IEstudianteService {
      // CRUD
    // insertar
    public void ingresarEstudiante(Estudiante e);

    // leer
    public Estudiante buscarPorApellido(String apellido);

    // actualizar
    public void actualizarEstudiante(Estudiante e);

    // eliminar
    public void borrarEstudiante(String cedula);

}
