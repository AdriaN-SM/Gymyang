/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gymyang;

import EntityDAO.ClaseDAOImpl;
import interfaz.Login;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import modelo.Clase;
import modelo.Usuario;

/**
 *
 * Clase principal de la aplicación
 *
 * @since 21.02.2023
 * Fecha de modificación: 21.02.2023
 * @author Adrian Solanas
 */
public class Gymyang {
    public static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("GymyangPU");
    public static final EntityManager em = emf.createEntityManager();
    public static final EntityTransaction transaction = em.getTransaction();
    public static Usuario usuarioActual;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        try {
            transaction.begin();
            //DatosIniciales.insertarDatos();
            Login login = new Login();
            login.setVisible(true);
            transaction.commit();
//        } finally {
//            if (transaction.isActive()) {
//                transaction.rollback();
//            }
//            em.close();
//            emf.close();
//        }
    }
}
