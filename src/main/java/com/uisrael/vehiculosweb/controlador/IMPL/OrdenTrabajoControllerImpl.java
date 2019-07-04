/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.vehiculosweb.controlador.IMPL;

import com.uisrael.vehiculosweb.controlador.IOrdenTrabajoController;
import com.uisrael.vehiculosweb.modelo.DAO.IMPL.OrdenTrabajoDaoImpl;
import com.uisrael.vehiculosweb.modelo.Entidades.OrdenTrabajo;
import java.util.List;

/**
 *
 * @author jjmm7
 */
public class OrdenTrabajoControllerImpl implements IOrdenTrabajoController{
        
    @Override
    public void insertarOrdenTrabajo(OrdenTrabajo ot) {
        OrdenTrabajoDaoImpl od = new OrdenTrabajoDaoImpl();
        od.insertarOrdenTrabajo(ot);
    }

    @Override
    public List<OrdenTrabajo> listarOrdenTrabajoes() {
         OrdenTrabajoDaoImpl od = new OrdenTrabajoDaoImpl();         
         return od.listarOrdenTrabajoes();
    }

    @Override
    public OrdenTrabajo buscarOrdenTrabajo(int id) {
        OrdenTrabajoDaoImpl od = new OrdenTrabajoDaoImpl();
        return od.buscarOrdenTrabajo(id);
         
    }

    @Override
    public List<OrdenTrabajo> buscarOrdenTrabajoPorCosto(int costo) {
        OrdenTrabajoDaoImpl od = new OrdenTrabajoDaoImpl();
        return od.buscarOrdenTrabajoPorCosto(costo);
    }
}
