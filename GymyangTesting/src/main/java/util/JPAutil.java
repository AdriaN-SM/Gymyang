/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Clase utilizada para generar las sesiones a la base de datos
 * @author adria
 */
public class JPAutil {
    private static final EntityManagerFactory emf;
    /*
        Constructor estático, para que solo haya una instancio de la clase que se encarga de leer el fichero
        y generar sesiones
     */
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            emf = Persistence.createEntityManagerFactory("GymyangPU");
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static EntityManagerFactory getSessionFactory() {
        return emf;
    }
}
