/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.csf.apptienda.modelo.dao;

import co.edu.sena.csf.apptienda.modelo.entidades.Producto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author Ismael
 */
public abstract class GenericDAO<T> {
    
    @PersistenceContext(unitName = "appTiendaPU")
    private EntityManager em;
    
    protected Class<T> type;

    protected GenericDAO(Class<T> type) {
        this.type = type;
    }
    
    public T buscarPorId(Integer id) {
        return em.find(type, id);
    }
    
    public List<T> buscarTodos() {
        TypedQuery<T> query = em.createNamedQuery(type.getSimpleName() + ".findAll", type);
        return query.getResultList();
    }
    
    public void registrar(T obj){
        em.persist(obj);
    }
    
    public void actualizar(T obj){
        em.persist(em.merge(obj));
    }
    
    public void eliminar(T obj){
        em.remove(obj);
    }
    
}
