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
public class TipoDaoImpl implements ITipoDao {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoVehiculosPU");
    EntityManager em = emf.createEntityManager();

    EntityTransaction et = em.getTransaction();

    @Override
    public void insertarTipo(Tipo t) {
        try {

            et.begin();

            em.persist(t);
            et.commit();

            System.out.println("DAO:  Se inserto el tipo con los siguientes params " + t);
        } catch (Exception e) {
            System.out.println("DAO:  Se produjo un error :" + e.getStackTrace());
        }
    }

    @Override
    public List<Tipo> listarTipoes() {

        String sentencia = "select t from Tipo t";

        TypedQuery<Tipo> typed = em.createQuery(sentencia, Tipo.class);
                
        List<Tipo> resultado = typed.getResultList();
                        
        return resultado;
    }

    @Override
    public Tipo buscarTipo(int id) {
        String sentencia = "select t from Tipo t where t.idTipoVehiculo = " +id;

        TypedQuery<Tipo> typed = em.createQuery(sentencia, Tipo.class);
                
        Tipo resultado = typed.getSingleResult();
                        
        return resultado;
    }

    @Override
    public List<Tipo> buscarTipoPorFuncion(String funcion) {
        String sentencia = "select t from Tipo t where t.funcionTipoVehiculo like '%" + funcion + "%' ";

        TypedQuery<Tipo> typed = em.createQuery(sentencia, Tipo.class);
                
        List<Tipo> resultado = typed.getResultList();
                        
        return resultado;
    }

}
