/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.vehiculosweb.controlador;

import com.uisrael.vehiculosweb.modelo.Entidades.Vehiculo;
import java.util.List;

/**
 *
 * @author jjmm7
 */
public interface IVehiculoController {
    public void insertarVehiculo(Vehiculo v);
    public List<Vehiculo> listarVehiculoes();
    public Vehiculo buscarVehiculo(int id);
    
    public List<Vehiculo> buscarVehiculosPorCapacidadPasajeros(int cantidadPasajeros);
}
