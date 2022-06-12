package com.uce.avanzada.proyecto_u1_pa.bodega.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.avanzada.proyecto_u1_pa.bodega.modelo.Inventario;
import com.uce.avanzada.proyecto_u1_pa.bodega.repository.IInventarioRepo;

@Service
public class InventarioServiceImpl implements IInventarioService {

    @Autowired
    private IInventarioRepo inventarioRepo;

    @Override
    public void insertar(Inventario i) {
        
        this.inventarioRepo.insertar(i);
        
    }

    @Override
    public List<Inventario> buscarTodos() {
        // TODO Auto-generated method stub
        return this.inventarioRepo.buscarTodos();
    }
    
}
