/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.vehiculosweb.modelo.Entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author jjmm7
 */
@Entity
@Table(name = "historialObservaciones")
public class HistorialObservaciones implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idHistorial;
    private String observaciones;
    @Temporal(TemporalType.DATE)
    private Date proximaVisitaRe;
    
    
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "fkIdOrdenTrabajo")
    private OrdenTrabajo orden;

    public HistorialObservaciones() {
    }

       
    public HistorialObservaciones(int idHistorial, String observaciones, Date proximaVisitaRe, OrdenTrabajo orden) {
        this.idHistorial = idHistorial;
        this.observaciones = observaciones;
        this.proximaVisitaRe = proximaVisitaRe;
        this.orden = orden;
    }

    public OrdenTrabajo getOrden() {
        return orden;
    }

    public void setOrden(OrdenTrabajo orden) {
        this.orden = orden;
    }

    public int getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(int idHistorial) {
        this.idHistorial = idHistorial;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Date getProximaVisitaRe() {
        return proximaVisitaRe;
    }

    public void setProximaVisitaRe(Date proximaVisitaRe) {
        this.proximaVisitaRe = proximaVisitaRe;
    }

    @Override
    public String toString() {
        return "HistorialObservaciones{" + "idHistorial=" + idHistorial + ", observaciones=" + observaciones + ", proximaVisitaRe=" + proximaVisitaRe + ", orden=" + orden + '}';
    }

}
