/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.vehiculosweb.Beans;

import java.util.Date;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author JAVIER
 */
@Named(value = "historialObservacionesBean")
@ViewScoped
public class HistorialObservacionesBean {

    private int idHistorial;
    private String observaciones;    
    private Date proximaVisitaRe;

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
 
    
    
}
