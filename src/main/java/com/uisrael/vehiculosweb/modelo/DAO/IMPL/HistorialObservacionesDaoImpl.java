/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.vehiculosweb.modelo.DAO.IMPL;

import com.uisrael.vehiculosweb.modelo.DAO.IHistorialObservacionesDao;
import com.uisrael.vehiculosweb.modelo.Entidades.HistorialObservaciones;
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
public class HistorialObservacionesDaoImpl implements IHistorialObservacionesDao {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoVehiculosPU");
    EntityManager em = emf.createEntityManager();

    EntityTransaction et = em.getTransaction();

    @Override
    public void insertarHistorialObservaciones(HistorialObservaciones h) {
        try {

            et.begin();
            em.persist(h);

            et.commit();

            System.out.println("DAO:  Se inserto el historial con los siguientes params " + h);
        } catch (Exception e) {
            System.out.println("DAO:  Se produjo un error :" + e.getStackTrace());
        }
    }

    @Override
    public List<HistorialObservaciones> listarHistorialObservacioneses() {
        String sentencia = "Select h from HistorialObservaciones";

        TypedQuery typed = em.createQuery(sentencia, HistorialObservaciones.class);
        
        List<HistorialObservaciones> resultado = typed.getResultList();
               
        return resultado;
    }

    @Override
    public HistorialObservaciones buscarHistorialObservaciones(int id) {
        String sentencia = "Select h from HistorialObservaciones h where h.idHistorial = " + id;

        TypedQuery typed = em.createQuery(sentencia, HistorialObservaciones.class);
        
        HistorialObservaciones resultado = (HistorialObservaciones) typed.getSingleResult();
               
        return resultado;
    }

    @Override
    public List<HistorialObservaciones> buscarHistorialPorObservacion(String observacion) {
        String sentencia = "Select h from HistorialObservaciones h where h.observaciones like '%" + observacion + "%'";

        TypedQuery typed = em.createQuery(sentencia, HistorialObservaciones.class);
        
        List<HistorialObservaciones> resultado = typed.getResultList();
               
        return resultado;
    }
    
    
}
