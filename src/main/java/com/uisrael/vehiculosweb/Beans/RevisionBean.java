/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.vehiculosweb.Beans;

import com.sun.org.apache.bcel.internal.generic.IREM;
import com.uisrael.vehiculosweb.controlador.IMPL.RevisionControllerImpl;
import com.uisrael.vehiculosweb.controlador.IRevisionController;
import com.uisrael.vehiculosweb.modelo.Entidades.Revision;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

/**
 *
 * @author JAVIER
 */
@ManagedBean(name = "revisionBean")
@ViewScoped
public class RevisionBean implements Serializable{

    private static final IRevisionController controller = new RevisionControllerImpl();
    
    private int idRevision;
    private String motivo;
    private int numeroComponentesRevisados;
    private String detalle;
    private String observacionRevision;
    
    private Revision revision;
    private List<Revision> listaRevision;
    
    /**
     * Creates a new instance of RevisionBean
     */
    public RevisionBean() {
    }
    
    @PostConstruct
    public void init(){
        
    }
    
    public void insertarRevision(){
        revision= new Revision();
        revision.setMotivo(motivo);
        revision.setNumeroComponentesRevisados(numeroComponentesRevisados);
        revision.setDetalle(detalle);
        revision.setObservacionRevision(observacionRevision);
        
        controller.insertarRevision(revision);
        
        System.out.println("Revision insertada: " + motivo);
        
        
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

    public List<Revision> getListaRevision() {
        return listaRevision;
    }

    public void setListaRevision(List<Revision> listaRevision) {
        this.listaRevision = listaRevision;
    }
    
    
    
}
