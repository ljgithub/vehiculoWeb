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
public class VehiculoDaoImpl extends GenericaDaoImpl<Vehiculo>implements IVehiculoDao {


    @Override
    public void insertarVehiculo(Vehiculo v) {
        this.create(v);
    }

    @Override
    public List<Vehiculo> listarVehiculoes() {
        
        String sentencia = "Select v from Vehiculo v";
        
        TypedQuery typed = this.entityManager.createQuery(sentencia, Vehiculo.class);
        
        List<Vehiculo> resultado = typed.getResultList();
        
        
        return resultado;
      
    }

    @Override
    public Vehiculo buscarVehiculo(int id) {
        
        String sentencia = "Select v from Vehiculo v where v.idVehiculo = "+ id ;
        
        TypedQuery<Vehiculo> typed = this.entityManager.createQuery(sentencia, Vehiculo.class);
        
        Vehiculo resultado = typed.getSingleResult();
                
        return resultado;
  
    }

    @Override
    public List<Vehiculo> buscarVehiculosPorCapacidadPasajeros(int cantidadPasajeros) {
        /*
        String sentencia = "Select v from Vehiculo v where v.capacidadPasajeros >= " + cantidadPasajeros;
        
        TypedQuery typed = em.createQuery(sentencia, Vehiculo.class);
        
        List<Vehiculo> resultado = typed.getResultList();
        
        
        return resultado;*/
        return null;
    }

}
