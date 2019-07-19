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
@Named(value = "tipoVehiculoBean")
@Dependent
public class TipoVehiculoBean {

    int idTipoVehiculo;
    String descripcionTipoVehiculo;
    String funcionTipoVehiculo;
    
    /**
     * Creates a new instance of TipoVehiculoBean
     */
    public TipoVehiculoBean() {
    }

    public int getIdTipoVehiculo() {
        return idTipoVehiculo;
    }

    public void setIdTipoVehiculo(int idTipoVehiculo) {
        this.idTipoVehiculo = idTipoVehiculo;
    }

    public String getDescripcionTipoVehiculo() {
        return descripcionTipoVehiculo;
    }

    public void setDescripcionTipoVehiculo(String descripcionTipoVehiculo) {
        this.descripcionTipoVehiculo = descripcionTipoVehiculo;
    }

    public String getFuncionTipoVehiculo() {
        return funcionTipoVehiculo;
    }

    public void setFuncionTipoVehiculo(String funcionTipoVehiculo) {
        this.funcionTipoVehiculo = funcionTipoVehiculo;
    }
    
    
    
}
