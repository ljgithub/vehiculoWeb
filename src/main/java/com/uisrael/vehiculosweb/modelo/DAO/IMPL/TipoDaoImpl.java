/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.vehiculosweb.modelo.DAO.IMPL;

import com.uisrael.vehiculosweb.modelo.DAO.ITipoDao;
import com.uisrael.vehiculosweb.modelo.Entidades.Tipo;
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
public class TipoDaoImpl extends GenericaDaoImpl<Tipo> implements ITipoDao {


    @Override
    public void insertarTipo(Tipo t) {
        this.create(t);
    }

    @Override
    public List<Tipo> listarTipoes() {

        String sentencia = "select t from Tipo t";

        TypedQuery<Tipo> typed = this.entityManager.createQuery(sentencia, Tipo.class);
                
        List<Tipo> resultado = typed.getResultList();
                        
        return resultado;        
    }

    @Override
    public Tipo buscarTipo(int id) {
        
        String sentencia = "select t from Tipo t where t.idTipoVehiculo = " +id;

        TypedQuery<Tipo> typed = this.entityManager.createQuery(sentencia, Tipo.class);
                
        Tipo resultado = typed.getSingleResult();
                        
        return resultado;
    }

    @Override
    public List<Tipo> buscarTipoPorFuncion(String funcion) {
        /*
        String sentencia = "select t from Tipo t where t.funcionTipoVehiculo like '%" + funcion + "%' ";

        TypedQuery<Tipo> typed = em.createQuery(sentencia, Tipo.class);
                
        List<Tipo> resultado = typed.getResultList();
                        
        return resultado;*/
        return null;
                
    }

}
