package com.uce.avanzada.proyecto_u1_pa.bodega.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.avanzada.proyecto_u1_pa.bodega.modelo.Producto;
import com.uce.avanzada.proyecto_u1_pa.bodega.repository.IProductoRepo;

@Service
public class ProductoServiceImpl implements IProductoService{

    @Autowired
    private IProductoRepo productoRepo;

    @Override
    public void insertar(Producto p) {
        this.productoRepo.insertar(p);
        
    }
    
}
