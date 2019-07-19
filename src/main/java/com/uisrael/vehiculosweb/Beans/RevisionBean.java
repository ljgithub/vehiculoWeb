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
@Named(value = "revisionBean")
@Dependent
public class RevisionBean {

    private int idRevision;
    private String motivo;
    private int numeroComponentesRevisados;
    private String detalle;
    private String observacionRevision;
    
    /**
     * Creates a new instance of RevisionBean
     */
    public RevisionBean() {
    }

    public int getIdRevision() {
        return idRevision;
    }

    public void setIdRevision(int idRevision) {
        this.idRevision = idRevision;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public int getNumeroComponentesRevisados() {
        return numeroComponentesRevisados;
    }

    public void setNumeroComponentesRevisados(int numeroComponentesRevisados) {
        this.numeroComponentesRevisados = numeroComponentesRevisados;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getObservacionRevision() {
        return observacionRevision;
    }

    public void setObservacionRevision(String observacionRevision) {
        this.observacionRevision = observacionRevision;
    }
    
    
    
}
