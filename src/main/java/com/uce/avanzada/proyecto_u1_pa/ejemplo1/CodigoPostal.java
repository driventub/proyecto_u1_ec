package com.uce.avanzada.proyecto_u1_pa.ejemplo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CodigoPostal {
    @Autowired
    private Ciudad ciudad;

    private String codigoPostal;

    

    public String generarCodigo(String nombre, String pais, String provincia, String codigoPostal) {
        this.ciudad.setNombre(nombre);
        this.ciudad.setPais(pais);
        this.ciudad.setProvincia(provincia);
        this.codigoPostal = codigoPostal;

        return "Codigo Postal Atributos Generada";
        
    }

    // Set y Get
    public String getCodigoPostal() {
        return this.codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

}
