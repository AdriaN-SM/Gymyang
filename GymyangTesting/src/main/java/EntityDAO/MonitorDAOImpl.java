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

/**
 *
 * @author adria
 */
public class MonitorDAOImpl extends GenericDAoImpl<Monitor, Integer> {

    public MonitorDAOImpl(EntityManager em) {
        super(em);
    }


}
