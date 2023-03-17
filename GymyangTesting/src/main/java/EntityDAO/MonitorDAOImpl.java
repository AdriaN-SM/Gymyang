/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntityDAO;

import DAO.GenericDAoImpl;
import javax.persistence.EntityManager;
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
