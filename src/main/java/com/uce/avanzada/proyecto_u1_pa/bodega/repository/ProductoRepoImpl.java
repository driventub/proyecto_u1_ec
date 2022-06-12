package com.uce.avanzada.proyecto_u1_pa.bodega.repository;

import org.springframework.stereotype.Repository;

import com.uce.avanzada.proyecto_u1_pa.bodega.modelo.Producto;

@Repository
public  class ProductoRepoImpl implements IProductoRepo{

    // private List<Producto> listaProducto;

    @Override
    public void insertar(Producto p) {
        // this.listaProducto.add(p);

        System.out.println("Insertado Producto : " + p.getNombre() + " en la base ");
        
    }
    
}
