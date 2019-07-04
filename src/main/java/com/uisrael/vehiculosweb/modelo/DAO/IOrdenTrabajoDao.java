/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.vehiculosweb.modelo.DAO;

import com.uisrael.vehiculosweb.modelo.Entidades.OrdenTrabajo;
import java.util.List;

/**
 *
 * @author jjmm7
 */
public interface IOrdenTrabajoDao {
    public void insertarOrdenTrabajo(OrdenTrabajo ot);
    public List<OrdenTrabajo> listarOrdenTrabajoes();
    public OrdenTrabajo buscarOrdenTrabajo(int id);
    
    public List<OrdenTrabajo> buscarOrdenTrabajoPorCosto(int costo);
}
