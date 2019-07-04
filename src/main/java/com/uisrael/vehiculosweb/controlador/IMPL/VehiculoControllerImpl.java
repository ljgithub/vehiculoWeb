/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.vehiculosweb.controlador.IMPL;

import com.uisrael.vehiculosweb.controlador.IVehiculoController;
import com.uisrael.vehiculosweb.modelo.DAO.IMPL.VehiculoDaoImpl;
import com.uisrael.vehiculosweb.modelo.Entidades.Vehiculo;
import java.util.List;

/**
 *
 * @author jjmm7
 */
public class VehiculoControllerImpl implements IVehiculoController{
    public void insertarVehiculo(Vehiculo v){
        VehiculoDaoImpl vd = new VehiculoDaoImpl();
        vd.insertarVehiculo(v);
    }

    @Override
    public List<Vehiculo> listarVehiculoes() {
        VehiculoDaoImpl vd = new VehiculoDaoImpl();
        
        return vd.listarVehiculoes();
    }

    @Override
    public Vehiculo buscarVehiculo(int id) {
        VehiculoDaoImpl vd = new VehiculoDaoImpl();
        return vd.buscarVehiculo(id);
        
    }

    @Override
    public List<Vehiculo> buscarVehiculosPorCapacidadPasajeros(int cantidadPasajeros) {
        VehiculoDaoImpl vd = new VehiculoDaoImpl();
        return vd.buscarVehiculosPorCapacidadPasajeros(cantidadPasajeros);
    }
}
