/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntityDAO;

import DAO.GenericDAoImpl;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import modelo.Clase;
import modelo.Monitor;
import modelo.Usuario;

/**
 *
 * @author adria
 */
public class UsuarioDAOImpl extends GenericDAoImpl<Usuario, Integer> {

    public UsuarioDAOImpl(EntityManager em) {
        super(em);
    }


}
