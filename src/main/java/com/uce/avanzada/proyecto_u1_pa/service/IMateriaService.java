package com.uce.avanzada.proyecto_u1_pa.service;

import com.uce.avanzada.proyecto_u1_pa.modelo.Materia;

public interface IMateriaService {
    // CRUD
  // insertar
  public void ingresarMateria(Materia e);

  // leer
  public Materia buscarPorSemestre(String semestre);

  // actualizar
  public void actualizarMateria(Materia e);

  // eliminar
  public void borrarMateria(String cedula);

}
