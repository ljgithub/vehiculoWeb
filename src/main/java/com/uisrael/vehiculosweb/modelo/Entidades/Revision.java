/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.vehiculosweb.modelo.Entidades;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.*;

/**
 *
 * @author jjmm7
 */
@Entity
@Table(name = "revision")
public class Revision implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idRevision;
    private String motivo;
    private int numeroComponentesRevisados;
    private String detalle;
    private String observacionRevision;
    
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "fkIdOrden")    
    private OrdenTrabajo orden;

    public Revision() {
    }

    public Revision(int idRevision, String motivo, int numeroComponentesRevisados, String detalle, String observacionRevision, OrdenTrabajo orden) {
        this.idRevision = idRevision;
        this.motivo = motivo;
        this.numeroComponentesRevisados = numeroComponentesRevisados;
        this.detalle = detalle;
        this.observacionRevision = observacionRevision;
        this.orden = orden;
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

    @Override
    public String toString() {
        return "Revision{" + "idRevision=" + idRevision + ", motivo=" + motivo + ", numeroComponentesRevisados=" + numeroComponentesRevisados + ", detalle=" + detalle + ", observacionRevision=" + observacionRevision + ", orden=" + orden + '}';
    }

}
