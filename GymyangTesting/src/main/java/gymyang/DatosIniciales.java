/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymyang;

import EntityDAO.ClaseDAOImpl;
import EntityDAO.MonitorDAOImpl;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import modelo.Clase;

/**
 *
 * @author adria
 */
public class DatosIniciales {
    public static void insertarDatos() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("GymyangPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            MonitorDAOImpl mdaoi = new MonitorDAOImpl(em);
            System.out.println("Hola mundo!");
            ClaseDAOImpl cdaoi = new ClaseDAOImpl(em);
            Clase c1 = new Clase("Yoga", "15:00", "16:00", 20);
            Clase c2 = new Clase("Boxeo", "15:00", "16:00", 15);
            Clase c3 = new Clase("Crossfit", "17:00", "19:00", 15);
            Clase c4 = new Clase("Spinning", "15:30", "16:30", 12);
            Clase c5 = new Clase("Pilates", "16:00", "17:00", 20);
            cdaoi.save(c1);
            cdaoi.save(c2);
            cdaoi.save(c3);
            cdaoi.save(c4);
            cdaoi.save(c5);
            transaction.commit();
        } finally {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            em.close();
            emf.close();
        }
    }
}
