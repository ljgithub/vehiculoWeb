/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.vehiculosweb.Beans;

import com.uisrael.vehiculosweb.controlador.IMPL.TipoControllerImpl;
import com.uisrael.vehiculosweb.controlador.IMPL.VehiculoControllerImpl;
import com.uisrael.vehiculosweb.controlador.ITipoController;
import com.uisrael.vehiculosweb.controlador.IVehiculoController;
import com.uisrael.vehiculosweb.modelo.Entidades.Tipo;
import com.uisrael.vehiculosweb.modelo.Entidades.Vehiculo;
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
@ManagedBean(name = "vehiiculoBean")
@ViewScoped
public class VehiiculoBean implements Serializable{

    private static final IVehiculoController controller = new VehiculoControllerImpl();
    private static final ITipoController controllerTipo = new TipoControllerImpl();
    
    private int idVehiculo;
    private String descripcionVehiculo;
    private int capacidadPasajeros;
    private int estado;
    private int idTipoVehiculo;
    
    private String idTipoSelected ="";
    private Vehiculo vehiculo;
    private List<Vehiculo> listaVehiculos;
    private List<Tipo> listaTipos;

    /**
     * Creates a new instance of VehiiculoBean
     */
    public VehiiculoBean() {
    }

    @PostConstruct
    public void init(){
        listaTipos = controllerTipo.listarTipoes();
        
        System.out.println("ManagedBean created successFully");
            
    }
    
    public void insertarVehiculo(){
        Tipo tipo=controllerTipo.buscarTipo(Integer.parseInt(idTipoSelected));
        
        vehiculo = new Vehiculo();
        vehiculo.setDescripcionVehiculo(descripcionVehiculo);
        vehiculo.setCapacidadPasajeros(capacidadPasajeros);
        vehiculo.setEstado(estado);
        vehiculo.setTipo(tipo);
        controller.insertarVehiculo(vehiculo);
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

    public List<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(List<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    public int getIdTipoVehiculo() {
        return idTipoVehiculo;
    }

    public void setIdTipoVehiculo(int idTipoVehiculo) {
        this.idTipoVehiculo = idTipoVehiculo;
    }

    public List<Tipo> getListaTipos() {
        return listaTipos;
    }

    public void setListaTipos(List<Tipo> listaTipos) {
        this.listaTipos = listaTipos;
    }

    public String getIdTipoSelected() {
        return idTipoSelected;
    }

    public void setIdTipoSelected(String idTipoSelected) {
        this.idTipoSelected = idTipoSelected;
    }
    
    

}
