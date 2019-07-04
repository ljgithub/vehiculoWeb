/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.vehiculosweb.modelo.Entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author jjmm7
 */
@Entity
@Table(name = "tipo")
public class Tipo implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)        
    int idTipoVehiculo;
    String descripcionTipoVehiculo;
    String funcionTipoVehiculo;
    
    @OneToMany(mappedBy = "tipo", cascade = CascadeType.ALL)
    private List<Vehiculo> vehiculos = new ArrayList<>();

    public Tipo() {
    }

    public Tipo(int idTipoVehiculo, String descripcionTipoVehiculo, String funcionTipoVehiculo) {
        this.idTipoVehiculo = idTipoVehiculo;
        this.descripcionTipoVehiculo = descripcionTipoVehiculo;
        this.funcionTipoVehiculo = funcionTipoVehiculo;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
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

    @Override
    public String toString() {
        return "Tipo{" + "idTipoVehiculo=" + idTipoVehiculo + ", descripcionTipoVehiculo=" + descripcionTipoVehiculo + ", funcionTipoVehiculo=" + funcionTipoVehiculo + '}';
    }

}
