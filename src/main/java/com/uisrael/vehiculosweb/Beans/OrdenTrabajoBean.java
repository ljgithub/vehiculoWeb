/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.vehiculosweb.Beans;

import com.uisrael.vehiculosweb.controlador.IColaboradorController;
import com.uisrael.vehiculosweb.controlador.IMPL.ColaboradorControllerImpl;
import com.uisrael.vehiculosweb.controlador.IMPL.OrdenTrabajoControllerImpl;
import com.uisrael.vehiculosweb.controlador.IMPL.VehiculoControllerImpl;
import com.uisrael.vehiculosweb.controlador.IOrdenTrabajoController;
import com.uisrael.vehiculosweb.controlador.IVehiculoController;
import com.uisrael.vehiculosweb.modelo.Entidades.Colaborador;
import com.uisrael.vehiculosweb.modelo.Entidades.OrdenTrabajo;
import com.uisrael.vehiculosweb.modelo.Entidades.Vehiculo;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author JAVIER
 */
@ManagedBean(name = "ordenTrabajoBean")
@ViewScoped
public class OrdenTrabajoBean implements Serializable{

    private static final IOrdenTrabajoController controller = new OrdenTrabajoControllerImpl();
    private static final IColaboradorController controllerColaborador = new ColaboradorControllerImpl();
    private static final IVehiculoController controllerVehiculo = new VehiculoControllerImpl();
    
    
    private int idOrdTrabajo;
    private String infoAdicional;
    private Date fechaRevision;
    private double costoTotal;
    
    private int fkIdColaborador;
    private int fkIdVehiculo;

    private OrdenTrabajo orden;
    private List<OrdenTrabajoBean> listaOrdenes;
    
    private Colaborador colaborador;
    private Vehiculo vehiculo;
    private List<Colaborador> listaColaboradores;
    private List<Vehiculo> listaVehiculos;
            
    
    /**
     * Creates a new instance of OrdenTrabajoBean
     */
    public OrdenTrabajoBean() {
        listaColaboradores= controllerColaborador.listarColaboradores();
        listaVehiculos= controllerVehiculo.listarVehiculoes();
        
    }

    @PostConstruct
    public void init(){
        
    }
    
    public void insertarOrden(){
        
        colaborador=controllerColaborador.buscarColaborador(fkIdColaborador);
        vehiculo=controllerVehiculo.buscarVehiculo(fkIdVehiculo);
        
        orden = new OrdenTrabajo();
        orden.setCostoTotal(costoTotal);
        orden.setInfoAdicional(infoAdicional);
        orden.setFechaRevisión(fechaRevision);
        orden.setColaborador(colaborador);
        orden.setVehiculo(vehiculo);
        controller.insertarOrdenTrabajo(orden);
        
        System.out.println("Orden Insertada " +  infoAdicional);
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

    public List<OrdenTrabajoBean> getListaOrdenes() {
        return listaOrdenes;
    }

    public void setListaOrdenes(List<OrdenTrabajoBean> listaOrdenes) {
        this.listaOrdenes = listaOrdenes;
    }

    public int getFkIdColaborador() {
        return fkIdColaborador;
    }

    public void setFkIdColaborador(int fkIdColaborador) {
        this.fkIdColaborador = fkIdColaborador;
    }

    public int getFkIdVehiculo() {
        return fkIdVehiculo;
    }

    public void setFkIdVehiculo(int fkIdVehiculo) {
        this.fkIdVehiculo = fkIdVehiculo;
    }

    public OrdenTrabajo getOrden() {
        return orden;
    }

    public void setOrden(OrdenTrabajo orden) {
        this.orden = orden;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public List<Colaborador> getListaColaboradores() {
        return listaColaboradores;
    }

    public void setListaColaboradores(List<Colaborador> listaColaboradores) {
        this.listaColaboradores = listaColaboradores;
    }

    public List<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(List<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }
    
    

}
