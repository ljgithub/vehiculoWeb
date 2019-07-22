/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.vehiculosweb.Beans;

import com.uisrael.vehiculosweb.controlador.IMPL.TipoControllerImpl;
import com.uisrael.vehiculosweb.controlador.ITipoController;
import com.uisrael.vehiculosweb.modelo.Entidades.Tipo;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import javax.faces.view.ViewScoped;

/**
 *
 * @author JAVIER
 */
@ManagedBean(name = "tipoVehiculoBean")
@ViewScoped
public class TipoVehiculoBean implements Serializable{

    private static final  ITipoController controller = new TipoControllerImpl();
    
    private int idTipoVehiculo;
    private  String descripcionTipoVehiculo;
    private String funcionTipoVehiculo;
    
    private Tipo tipo;
    private List<Tipo> listaTipoVehiculos;
           
    
    /**
     * Creates a new instance of TipoVehiculoBean
     */
    public TipoVehiculoBean() {
    }
    
    @PostConstruct
    public void init(){
            System.out.println("Manejador Creado");  
    }

      public void insertarTipoVehiculo(){   
          tipo = new  Tipo();
        tipo.setDescripcionTipoVehiculo(descripcionTipoVehiculo);
        tipo.setFuncionTipoVehiculo(funcionTipoVehiculo);
        controller.insertarTipo(tipo);
        
        System.out.println("Tipo insertado" + descripcionTipoVehiculo);
    }
    
    
    public int getIdTipoVehiculo() {
        return idTipoVehiculo;
    }

    public void setIdTipoVehiculo(int idTipoVehiculo) {
        this.idTipoVehiculo = idTipoVehiculo;
    }

    public String getDescripcionTipoVehiculo() {
        return descripcionTipoVehiculo;
    }

    public void setDescripcionTipoVehiculo(String descripcionTipoVehiculo) {
        this.descripcionTipoVehiculo = descripcionTipoVehiculo;
    }

    public String getFuncionTipoVehiculo() {
        return funcionTipoVehiculo;
    }

    public void setFuncionTipoVehiculo(String funcionTipoVehiculo) {
        this.funcionTipoVehiculo = funcionTipoVehiculo;
    }    

    public List<Tipo> getListaTipoVehiculos() {
        return listaTipoVehiculos;
    }

    public void setListaTipoVehiculos(List<Tipo> listaTipoVehiculos) {
        this.listaTipoVehiculos = listaTipoVehiculos;
    }
    
  
}
