package com.uce.avanzada.proyecto_u1_pa.bodega.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.avanzada.proyecto_u1_pa.bodega.modelo.Inventario;

@Repository
public class InventarioRepoImpl implements IInventarioRepo{

    
    private List<Inventario> listaInventario = new ArrayList<>();


    @Override
    public void insertar(Inventario i) {
        listaInventario.add(i);
        System.out.println("Se ha insertado el inventario con producto: " + i.getProducto().getNombre() + " en la base" );

        
        
    }


    @Override
    public List<Inventario> buscarTodos() {
        // TODO Auto-generated method stub
        return listaInventario;
    }
    
}
