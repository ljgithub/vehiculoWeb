/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.vehiculosweb.modelo.DAO.IMPL;

import com.uisrael.vehiculosweb.modelo.DAO.IOrdenTrabajoDao;
import com.uisrael.vehiculosweb.modelo.Entidades.OrdenTrabajo;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author jjmm7
 */
public class OrdenTrabajoDaoImpl extends GenericaDaoImpl<OrdenTrabajo>implements IOrdenTrabajoDao {

    @Override
    public void insertarOrdenTrabajo(OrdenTrabajo ot) {
        this.create(ot);
    }

    @Override
    public List<OrdenTrabajo> listarOrdenTrabajoes() {
        /*
        String sentencia = "Select o from OrdenTrabajo o";
        
        TypedQuery typed = em.createQuery(sentencia, OrdenTrabajo.class);
        
        List<OrdenTrabajo> resultado = typed.getResultList();
        
        */
        return null;
    }

    @Override
    public OrdenTrabajo buscarOrdenTrabajo(int id) {
        
        String sentencia = "Select o from OrdenTrabajo o where o.idOrdTrabajo = " +id;
        
        TypedQuery<OrdenTrabajo> typed = this.entityManager.createQuery(sentencia, OrdenTrabajo.class);
        
        OrdenTrabajo resultado = typed.getSingleResult();
                
        return resultado;
  
    }

    @Override
    public List<OrdenTrabajo> buscarOrdenTrabajoPorCosto(int costo) {
        /*
        String sentencia = "Select o from OrdenTrabajo o where o.costoTotal >= " + costo;
        
        TypedQuery typed = em.createQuery(sentencia, OrdenTrabajo.class);
        
        List<OrdenTrabajo> resultado = typed.getResultList();
                
        return resultado;*/
        return null;
    }
    
    
}
