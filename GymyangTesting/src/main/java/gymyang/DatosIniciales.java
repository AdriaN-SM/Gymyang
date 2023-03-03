/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymyang;

import EntityDAO.ClaseDAOImpl;
import EntityDAO.MaterialDAOImpl;
import EntityDAO.MonitorDAOImpl;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import modelo.Clase;
import modelo.Material;
import modelo.Monitor;

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
            Monitor m1 = new Monitor("Rocío", "No sabe");
            Monitor m2 = new Monitor("Jesús", "Fernández");
            Monitor m3 = new Monitor("Rocío", "Si sabe");
            Monitor m4 = new Monitor("Pablo", "NoEsSanMiguel");
            Monitor m5 = new Monitor("Adrián", "Solanas");
            mdaoi.save(m1);
            mdaoi.save(m2);
            mdaoi.save(m3);
            mdaoi.save(m4);
            mdaoi.save(m5);
            MaterialDAOImpl mtdaoi = new MaterialDAOImpl(em);
            Material mt1 = new Material("Esterilla", 60);
            Material mt2 = new Material("Bicicleta Spinning", 30);
            Material mt3 = new Material("Cuerda Crossfit", 100);
            Material mt4 = new Material("Mancuernas 1kg", 20);
            Material mt5 = new Material("Mancuernas 1,5kg", 20);
            Material mt6 = new Material("Mancuernas 2kg", 20);
            Material mt7 = new Material("Mancuernas 4kg", 20);
            mtdaoi.save(mt1);
            mtdaoi.save(mt2);
            mtdaoi.save(mt3);
            mtdaoi.save(mt4);
            mtdaoi.save(mt5);
            mtdaoi.save(mt6);
            mtdaoi.save(mt7);
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
