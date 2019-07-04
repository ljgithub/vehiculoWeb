/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.vehiculosweb.modelo.DAO.IMPL;

import com.uisrael.vehiculosweb.modelo.DAO.IRevisionDao;
import com.uisrael.vehiculosweb.modelo.Entidades.Revision;
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
public class RevisionDaoImpl implements IRevisionDao {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoVehiculosPU");
    EntityManager em = emf.createEntityManager();

    EntityTransaction et = em.getTransaction();

    @Override
    public void insertarRevision(Revision r) {
        try {

            et.begin();
            em.persist(r);

            et.commit();

            System.out.println("DAO:  Se inserto Revision con los siguientes params " + r);
        } catch (Exception e) {
            System.out.println("DAO:  Se produjo un error :" + e.getStackTrace());
        }
    }

    @Override
    public List<Revision> listarRevisiones() {
        String sentencia = "Select r from Revision r";
        
        TypedQuery typed = em.createQuery(sentencia, Revision.class);
        
        List<Revision> resultado = typed.getResultList();
                
        return resultado;
    }

    @Override
    public Revision buscarRevision(int id) {
        String sentencia = "Select r from Revision r where r.idRevision = " + id;
        
        TypedQuery typed = em.createQuery(sentencia, Revision.class);
        
        Revision resultado = (Revision)typed.getSingleResult();
                
        return resultado;
    }

    @Override
    public List<Revision> buscarRevisionPorMotivo(String motivo) {
        String sentencia = "Select r from Revision r where r.motivo like '%" + motivo + "%'" ;
        
        TypedQuery typed = em.createQuery(sentencia, Revision.class);
        
        List<Revision> resultado = typed.getResultList();
                
        return resultado;
    }

}
