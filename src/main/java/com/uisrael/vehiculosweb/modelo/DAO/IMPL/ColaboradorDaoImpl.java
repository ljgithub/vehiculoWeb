/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.vehiculosweb.modelo.DAO.IMPL;

import com.uisrael.vehiculosweb.modelo.DAO.IColaboradorDao;
import com.uisrael.vehiculosweb.modelo.Entidades.Colaborador;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;

/**
 *
 * @author jjmm7
 */
public class ColaboradorDaoImpl implements IColaboradorDao {

    //1.- Creamos en ManagerFactory
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoVehiculosPU");                                                                               
            //2.- Creamos en EntityManager
            EntityManager em = emf.createEntityManager();
            //3.- Creamos la transacción es decir el objeto que conlleva la transaccion (EntityTransaction)
            EntityTransaction et = em.getTransaction();
    
    @Override
    public void insertarColaborador(Colaborador c) {
        try {
            
            /**
             * Iniciamos primero la transacción
             */
            et.begin();
            /**
             * Luego Guardamos pero con el MANAGER  
             */
            em.persist(c);
            /**
             * Y ultimo paso nos aseguramos que el cambio realizado se encuentre en base de datos
             * con la TRANSACCION
             */
            et.commit();
            
            System.out.println("DAO:  Se inserto Colaborador con los siguientes params " + c);
        } catch (Exception e) {
            System.out.println("DAO:  Se produjo un error :"+ e.getStackTrace());            
        }        
    }

    @Override
    public List<Colaborador> listarColaboradores() {
        
        
        //1.-  Generamos la consulta en un string
        String sentencia = "Select c from Colaborador c";
        
        //2.- Instanciamos un TypedQuery
        TypedQuery<Colaborador> typed = em.createQuery(sentencia, Colaborador.class);
        
        List<Colaborador> resultado = typed.getResultList();
                              
        return resultado;
    }

    @Override
    public Colaborador buscarColaborador(int id) {
        
        
         //1.-  Generamos la consulta en un string
        String sentencia = "Select c from Colaborador c where c.idColaborador = " + id;
        
        //2.- Instanciamos un TypedQuery
        TypedQuery<Colaborador> typed = em.createQuery(sentencia, Colaborador.class);
        
        Colaborador resultado = typed.getSingleResult();
                              
        return resultado;
    }

    @Override
    public List<Colaborador> buscarColaboradorPorApellidos(String apellido) {
          
         //1.-  Generamos la consulta en un string
        String sentencia = "Select c from Colaborador c where c.apellidos like '%" + apellido + "%' ";
        
        //2.- Instanciamos un TypedQuery
        TypedQuery<Colaborador> typed = em.createQuery(sentencia, Colaborador.class);
        
        List<Colaborador> resultado = typed.getResultList();
                              
        return resultado;  
    }

}
