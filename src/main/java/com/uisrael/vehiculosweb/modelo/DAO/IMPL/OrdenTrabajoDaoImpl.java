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
public class OrdenTrabajoDaoImpl implements IOrdenTrabajoDao {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoVehiculosPU");
    EntityManager em = emf.createEntityManager();

    EntityTransaction et = em.getTransaction();

    @Override
    public void insertarOrdenTrabajo(OrdenTrabajo ot) {
        try {

            et.begin();
            em.persist(ot);

            et.commit();

            System.out.println("DAO:  Se inserto la Orden de Trabajo con los siguientes params " + ot);
        } catch (Exception e) {
            System.out.println("DAO:  Se produjo un error :" + e.getStackTrace());
        }
    }

    @Override
    public List<OrdenTrabajo> listarOrdenTrabajoes() {
        
        String sentencia = "Select o from OrdenTrabajo o";
        
        TypedQuery typed = em.createQuery(sentencia, OrdenTrabajo.class);
        
        List<OrdenTrabajo> resultado = typed.getResultList();
        
        
        return resultado;
    }

    @Override
    public OrdenTrabajo buscarOrdenTrabajo(int id) {
        String sentencia = "Select o from OrdenTrabajo o where o.idOrdTrabajo = " +id;
        
        TypedQuery typed = em.createQuery(sentencia, OrdenTrabajo.class);
        
        OrdenTrabajo resultado = (OrdenTrabajo)typed.getSingleResult();
                
        return resultado;
    }

    @Override
    public List<OrdenTrabajo> buscarOrdenTrabajoPorCosto(int costo) {
        String sentencia = "Select o from OrdenTrabajo o where o.costoTotal >= " + costo;
        
        TypedQuery typed = em.createQuery(sentencia, OrdenTrabajo.class);
        
        List<OrdenTrabajo> resultado = typed.getResultList();
                
        return resultado;
    }
    
    
}
