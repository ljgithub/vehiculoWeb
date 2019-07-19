/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.vehiculosweb.Beans;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author JAVIER
 */
@Named(value = "vehiiculoBean")
@Dependent
public class VehiiculoBean {

    private int idVehiculo;
    private String descripcionVehiculo;
    private int capacidadPasajeros;
    private int estado;

    /**
     * Creates a new instance of VehiiculoBean
     */
    public VehiiculoBean() {
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getDescripcionVehiculo() {
        return descripcionVehiculo;
    }

    public void setDescripcionVehiculo(String descripcionVehiculo) {
        this.descripcionVehiculo = descripcionVehiculo;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    

}
