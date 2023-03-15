/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymyang;

import EntityDAO.ClaseDAOImpl;
import EntityDAO.MaterialDAOImpl;
import EntityDAO.MonitorDAOImpl;
import EntityDAO.UsuarioDAOImpl;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import modelo.Clase;
import modelo.Material;
import modelo.Monitor;
import modelo.Usuario;

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
            Monitor m1 = new Monitor("Sergio", "Peinado", 30, "Ponte más fuerte que el vinagre!!", "Entrenador licenciado en deporte que te va a ayudar a conseguir el físico de tus sueños");
            Monitor m2 = new Monitor("Maestro", "Roshi", 45, "Me gustan las tortugas!!", "Entrenó a Goku (No hace falta más explicación)");
            Monitor m3 = new Monitor("Terminator", "Arnold", 38, "Sayonara Baby!!", "Está increiblemente demasiado pero muy mamado");
            mdaoi.save(m1);
            mdaoi.save(m2);
            mdaoi.save(m3);
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
            Clase c1 = new Clase("Yoga", "15:00", "16:00", 20, "En esta clase de yoga aprenderás todo lo relacionado con el yoga... \nY quien sabe, a lo mejor eres el próximo profesor de yoga.");
            Clase c2 = new Clase("Boxeo", "15:00", "16:00", 15, "En esta clase de boxeo aprenderás todo lo relacionado con el boxeo... \nY quien sabe, a lo mejor eres el próximo Muhammad Ali.");
            Clase c3 = new Clase("Crossfit", "17:00", "19:00", 15, "En esta clase de crossfit aprenderás todo lo relacionado con el crossfit... \nY quien sabe, a lo mejor eres el próximo Dwayne Johnson.");
            Clase c4 = new Clase("Spinning", "15:30", "16:30", 12, "En esta clase de spinning aprenderás todo lo relacionado con el spinning... \nY quien sabe, a lo mejor eres el próximo Eddy Merckx.");
            Clase c5 = new Clase("Pilates", "16:00", "17:00", 20, "En esta clase de pilates aprenderás todo lo relacionado con el pilates... \nY quien sabe, a lo mejor eres el próximo profesor de pilates.");
            cdaoi.save(c1);
            cdaoi.save(c2);
            cdaoi.save(c3);
            cdaoi.save(c4);
            cdaoi.save(c5);
            UsuarioDAOImpl udaoi = new UsuarioDAOImpl(em);
            Usuario u1 = new Usuario("admin", "admin", "admin@admin.com", new Date(120, 1, 1), true, "admin");
            Usuario u2 = new Usuario("prueba", "apellidoUno", "pruebaapellidouno@gmail.com", new Date(125, 7, 20), false, "prueba");
            udaoi.save(u1);
            udaoi.save(u2);
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
