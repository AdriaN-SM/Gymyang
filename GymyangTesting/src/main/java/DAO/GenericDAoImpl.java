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

    @Override
    public Entity save(Entity entity) {
        this.sesion.persist(entity);
//        sesion.flush();
        return entity;
    }

    @Override
    public Entity update(Entity entity) {
//        this.sesion.persist(entity);
//        this.sesion.refresh(entity);
        this.sesion.merge(entity);
        //sesion.flush();
        return entity;
    }

    @Override
    public Entity find(PK id) {
        return (Entity) sesion.find(entityClass, id);
    }

    @Override
    public List<Entity> findAll() {
        return (List<Entity>) sesion.createQuery("FROM " + entityClass.getName(), entityClass).getResultList();
    }

    @Override
    public Boolean delete(Entity entity) {
        sesion.remove(entity);
        //sesion.flush();
        return true;
    }

    @Override
    public Boolean deleteById(PK id) {
        delete(find(id));
        //sesion.flush();
        return true;
    }

}
