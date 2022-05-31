package com.uce.avanzada.proyecto_u1_pa.tarea5;


import org.springframework.stereotype.Service;

@Service
public class CodigoPostal2 {

    
    private Ciudad ciudad;

    private String numeroPostal;

    

    public CodigoPostal2(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public String generarCodigo(String nombre, String pais, String provincia, String numeroPostal) {
        this.ciudad.setNombre(nombre);
        this.ciudad.setPais(pais);
        this.ciudad.setProvincia(provincia);
        this.numeroPostal = numeroPostal;

        return "Codigo Postal Constructor Generada";
        
    }

    // Set y Get
    public String getNumeroPostal() {
        return this.numeroPostal;
    }

    public void setNumeroPostal(String numeroPostal) {
        this.numeroPostal = numeroPostal;
    }

}
