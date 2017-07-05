package com.mercado.vista;

import com.mercado.modelo.Cliente;
import com.mercado.modelo.Empleado;
import com.mercado.modelo.Factura;
import com.mercado.modelo.Producto;
import java.util.GregorianCalendar;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class app_insercion {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("conectar");
    
    public static void main(String[] args) {
        
        
        EntityManager em = emf.createEntityManager();


        em.getTransaction().begin();
        
        Cliente andres = new Cliente(1, "andres", "fragozo", "calle 1", 444, "andres.fragozo@hotmail.com");
        Empleado sara = new Empleado(1, "sara", "fragozo", "gerente", "calle 7", 222, "sara.fragozo@hotmail.com");
        Producto laptop = new Producto(222, "lenovo", 200, 1, "ninguna");
        Factura factura = new Factura(100, "compra", new GregorianCalendar(2017, 2, 23).getTime(), "ninguna", andres, sara);
        
        andres.agregarE(sara);
        andres.agregarP(laptop);
        sara.agregarC(andres);
        factura.agregarP(laptop);
        
        
        em.persist(andres);
        em.persist(sara);
        em.persist(factura);
        
        
        em.getTransaction().commit();
        em.close();
        
        System.out.println("Exito!!!");
        
        
    }

    
}
