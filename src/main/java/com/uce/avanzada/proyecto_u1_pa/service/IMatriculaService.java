package com.uce.avanzada.proyecto_u1_pa.service;

import com.uce.avanzada.proyecto_u1_pa.modelo.Matricula;

public interface IMatriculaService {
    // CRUD
  // insertar
  public void ingresarMatricula(Matricula e);

  // leer
  public Matricula buscarPorNumero(String numero);

  // actualizar
  public void actualizarMatricula(Matricula e);

  // eliminar
  public void borrarMatricula(String cedula);

}
