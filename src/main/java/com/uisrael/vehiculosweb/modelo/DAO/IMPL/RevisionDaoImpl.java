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
public class RevisionDaoImpl extends GenericaDaoImpl<Revision> implements IRevisionDao {

    @Override
    public void insertarRevision(Revision r) {
        this.create(r);
                
    }

    @Override
    public List<Revision> listarRevisiones() {
        /*
        String sentencia = "Select r from Revision r";
        
        TypedQuery typed = em.createQuery(sentencia, Revision.class);
        
        List<Revision> resultado = typed.getResultList();
                
        return resultado;*/
        return null;
    }

    @Override
    public Revision buscarRevision(int id) {
        
        String sentencia = "Select r from Revision r where r.idRevision = " + id;
        
        TypedQuery<Revision> typed = this.entityManager.createQuery(sentencia, Revision.class);
        
        Revision resultado = typed.getSingleResult();
                
        return resultado;
    }

    @Override
    public List<Revision> buscarRevisionPorMotivo(String motivo) {
       /*
        String sentencia = "Select r from Revision r where r.motivo like '%" + motivo + "%'" ;
        
        TypedQuery typed = em.createQuery(sentencia, Revision.class);
        
        List<Revision> resultado = typed.getResultList();
                
        return resultado;*/
       return null;
    }

}
