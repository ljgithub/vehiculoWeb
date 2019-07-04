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
@Table(name = "vehiculo")
public class Vehiculo implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idVehiculo;
    private String descripcionVehiculo;
    private int capacidadPasajeros;    
    private int estado;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name ="fkIdTipoVehiculo")
    private  Tipo tipo;
    
    @OneToMany(mappedBy = "vehiculo", cascade = CascadeType.ALL)
    private List<OrdenTrabajo> ordenes = new ArrayList<>();

    public Vehiculo() {
    }

    public Vehiculo(int idVehiculo, String descripcionVehiculo, int capacidadPasajeros, int estado, Tipo tipo) {
        this.idVehiculo = idVehiculo;
        this.descripcionVehiculo = descripcionVehiculo;
        this.capacidadPasajeros = capacidadPasajeros;
        this.estado = estado;
        this.tipo = tipo;
    }

    
    
    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public List<OrdenTrabajo> getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(List<OrdenTrabajo> ordenes) {
        this.ordenes = ordenes;
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

    @Override
    public String toString() {
        return "Vehiculo{" + "idVehiculo=" + idVehiculo + ", descripcionVehiculo=" + descripcionVehiculo + ", capacidadPasajeros=" + capacidadPasajeros + ", estado=" + estado + ", tipo=" + tipo + ", ordenes=" + ordenes + '}';
    }


}
