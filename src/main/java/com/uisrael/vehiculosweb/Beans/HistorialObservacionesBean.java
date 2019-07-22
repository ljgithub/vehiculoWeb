/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.vehiculosweb.Beans;

import com.uisrael.vehiculosweb.controlador.IHistorialObservacionesController;
import com.uisrael.vehiculosweb.controlador.IMPL.HistorialObservaControllerImpl;
import com.uisrael.vehiculosweb.modelo.Entidades.HistorialObservaciones;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author JAVIER
 */
@ManagedBean(name = "historialBean")
@ViewScoped
public class HistorialObservacionesBean implements Serializable{

    private static  final IHistorialObservacionesController controller = new HistorialObservaControllerImpl();
    
    private int idHistorial;
    private String observaciones;    
    private Date proximaVisitaRe;
    
    private HistorialObservaciones historial;

    private List<HistorialObservaciones> listaHistorial;

    public HistorialObservacionesBean() {
    }
    
    @PostConstruct
    public void init(){
        
    }
    
     public void insertarHistorial(){
         historial= new HistorialObservaciones();
        historial.setObservaciones(observaciones);
        historial.setProximaVisitaRe(proximaVisitaRe);
        controller.insertarHistorialObservaciones(historial);
        System.err.println("Historial Insertado" +  observaciones);
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

    public List<HistorialObservaciones> getListaHistorial() {
        return listaHistorial;
    }

    public void setListaHistorial(List<HistorialObservaciones> listaHistorial) {
        this.listaHistorial = listaHistorial;
    }
 
    
    
}
