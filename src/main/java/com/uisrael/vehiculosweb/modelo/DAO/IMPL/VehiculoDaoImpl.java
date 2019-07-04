/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.vehiculosweb.modelo.DAO.IMPL;

import com.uisrael.vehiculosweb.modelo.DAO.IVehiculoDao;
import com.uisrael.vehiculosweb.modelo.Entidades.Vehiculo;
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
public class VehiculoDaoImpl implements IVehiculoDao {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoVehiculosPU");
    EntityManager em = emf.createEntityManager();

    EntityTransaction et = em.getTransaction();

    @Override
    public void insertarVehiculo(Vehiculo v) {
        try {
            et.begin();
            em.persist(v);
            et.commit();            
        } catch (Exception e) {
            System.out.println("DAO:  Se produjo un error :" + e.getStackTrace());
        }
    }

    @Override
    public List<Vehiculo> listarVehiculoes() {
        
        String sentencia = "Select v from Vehiculo v";
        
        TypedQuery typed = em.createQuery(sentencia, Vehiculo.class);
        
        List<Vehiculo> resultado = typed.getResultList();
        
        
        return resultado;
    }

    @Override
    public Vehiculo buscarVehiculo(int id) {
        String sentencia = "Select v from Vehiculo v where v.idVehiculo = "+ id ;
        
        TypedQuery typed = em.createQuery(sentencia, Vehiculo.class);
        
        Vehiculo resultado = (Vehiculo)typed.getResultList();
        
        
        return resultado;
    }

    @Override
    public List<Vehiculo> buscarVehiculosPorCapacidadPasajeros(int cantidadPasajeros) {
        String sentencia = "Select v from Vehiculo v where v.capacidadPasajeros >= " + cantidadPasajeros;
        
        TypedQuery typed = em.createQuery(sentencia, Vehiculo.class);
        
        List<Vehiculo> resultado = typed.getResultList();
        
        
        return resultado;
    }

}
