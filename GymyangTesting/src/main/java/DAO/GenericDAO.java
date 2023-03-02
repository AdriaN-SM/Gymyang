/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author adria
 */
public interface GenericDAO<Entity, PK extends Serializable> {

    Entity save(Entity entity);

    Entity update(Entity entity);

    Entity find(PK id);
    
    List<Entity> findAll();

    Boolean delete(Entity entity);

    Boolean deleteById(PK id);
    
    
}
