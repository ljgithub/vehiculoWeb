/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.vehiculosweb.Beans;

import java.util.Date;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author JAVIER
 */
@Named(value = "ordenTrabajoBean")
@Dependent
public class OrdenTrabajoBean {

    private int idOrdTrabajo;
    private String infoAdicional;
    private Date fechaRevision;
    private double costoTotal;

    /**
     * Creates a new instance of OrdenTrabajoBean
     */
    public OrdenTrabajoBean() {
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

    public Date getFechaRevision() {
        return fechaRevision;
    }

    public void setFechaRevision(Date fechaRevision) {
        this.fechaRevision = fechaRevision;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }
    
    

}
