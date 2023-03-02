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
import modelo.Material;
import modelo.Monitor;

/**
 *
 * @author adria
 */
public class MaterialDAOImpl extends GenericDAoImpl<Material, Integer> {

    public MaterialDAOImpl(EntityManager em) {
        super(em);
    }


}
