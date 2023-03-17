/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author adria
 */
public class GenericDAoImpl<Entity, PK extends Serializable> implements GenericDAO<Entity, PK> {

    protected final EntityManager sesion;
    protected Class<Entity> entityClass;

    public GenericDAoImpl(EntityManager sesion) {
        this.sesion = sesion;
//        this.sesion = HibernateUtil.getSessionFactory().getCurrentSession();
        ParameterizedType genericSuperclass = (ParameterizedType) getClass()
                .getGenericSuperclass();
        this.entityClass = (Class<Entity>) genericSuperclass
                .getActualTypeArguments()[0];
    }
/**
 * Método para guardar un registro
 * @param entity
 * @return 
 */
    @Override
    public Entity save(Entity entity) {
        this.sesion.persist(entity);
//        sesion.flush();
        return entity;
    }
/**
 * Método para actualizar un registro
 * @param entity
 * @return 
 */
    @Override
    public Entity update(Entity entity) {
        this.sesion.merge(entity);
//        this.sesion.refresh(entity);
        //sesion.flush();
        return entity;
    }
/**
 * Método para buscar un registro según su id
 * @param id
 * @return 
 */
    @Override
    public Entity find(PK id) {
        return (Entity) sesion.find(entityClass, id);
    }
/**
 * Método para obtener una lista de todos los registros de una tabla
 * @return 
 */
    @Override
    public List<Entity> findAll() {
        return (List<Entity>) sesion.createQuery("FROM " + entityClass.getName(), entityClass).getResultList();
    }
/**
 * Método para eliminar un registro
 * @param entity
 * @return 
 */
    @Override
    public Boolean delete(Entity entity) {
        sesion.remove(entity);
        //sesion.flush();
        return true;
    }
/**
 * Método para eliminar un registro según su id
 * @param id
 * @return 
 */
    @Override
    public Boolean deleteById(PK id) {
        delete(find(id));
        //sesion.flush();
        return true;
    }

}
