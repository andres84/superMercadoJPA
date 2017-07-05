package com.mercado.modelo;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class probarConexionBD {

    private static EntityManagerFactory emf = null;

    private probarConexionBD() {

    }

    public static EntityManagerFactory getInstancia() {

        if (emf == null) {

            emf = Persistence.createEntityManagerFactory("conectar");

        }

        return emf;

    }

}
