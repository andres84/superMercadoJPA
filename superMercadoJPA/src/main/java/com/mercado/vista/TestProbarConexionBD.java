package com.mercado.vista;

import com.mercado.modelo.probarConexionBD;
import javax.persistence.EntityManagerFactory;

public class TestProbarConexionBD {

    public static void main(String[] args) {
        
        try {
            
            EntityManagerFactory conexion = probarConexionBD.getInstancia();
            //conexion.close();
            System.out.println("Conxion Exitosa: " + conexion.isOpen());
            
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
        }
        
        
    }

    
}
