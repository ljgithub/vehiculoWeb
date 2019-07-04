/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.vehiculosweb.modelo.Entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author jjmm7
 */
@Entity
@Table(name = "ordenTrabajo")
public class OrdenTrabajo implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idOrdTrabajo;
    private String infoAdicional;
    @Temporal(TemporalType.DATE)    
    private Date fechaRevision;
    private double costoTotal;
    
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name= "fkIdVehiculo")
    private Vehiculo vehiculo;
    
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name ="fkIdColaborador")
    private Colaborador colaborador;

    @OneToMany(mappedBy = "orden", cascade = CascadeType.ALL)
    private List<Revision> revisiones = new ArrayList<>();
    
    @OneToMany(mappedBy = "orden", cascade = CascadeType.ALL)
    private List<HistorialObservaciones> historiales = new ArrayList<>();
    
    public OrdenTrabajo() {
    }

    public OrdenTrabajo(int idOrdTrabajo, String infoAdicional, Date fechaRevision, double costoTotal, Vehiculo vehiculo, Colaborador colaborador) {
        this.idOrdTrabajo = idOrdTrabajo;
        this.infoAdicional = infoAdicional;
        this.fechaRevision = fechaRevision;
        this.costoTotal = costoTotal;
        this.vehiculo = vehiculo;
        this.colaborador = colaborador;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }

    public List<Revision> getRevisiones() {
        return revisiones;
    }

    public void setRevisiones(List<Revision> revisiones) {
        this.revisiones = revisiones;
    }

    public List<HistorialObservaciones> getHistoriales() {
        return historiales;
    }

    public void setHistoriales(List<HistorialObservaciones> historiales) {
        this.historiales = historiales;
    }

    
    
    public int getIdOrdTrabajo() {
        return idOrdTrabajo;
    }

    public void setIdOrdTrabajo(int idOrdTrabajo) {
        this.idOrdTrabajo = idOrdTrabajo;
    }

    public String getInfoAdicional() {
        return infoAdicional;
    }

    public void setInfoAdicional(String infoAdicional) {
        this.infoAdicional = infoAdicional;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

   
    public Date getFechaRevision() {
        return fechaRevision;
    }

    public void setFechaRevisión(Date fechaRevisión) {
        this.fechaRevision = fechaRevisión;
    }

    @Override
    public String toString() {
        return "OrdenTrabajo{" + "idOrdTrabajo=" + idOrdTrabajo + ", infoAdicional=" + infoAdicional + ", fechaRevision=" + fechaRevision + ", costoTotal=" + costoTotal + '}';
    }
}
