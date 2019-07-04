/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.vehiculosweb.controlador.IMPL;

import com.uisrael.vehiculosweb.controlador.ITipoController;
import com.uisrael.vehiculosweb.modelo.DAO.IMPL.TipoDaoImpl;
import com.uisrael.vehiculosweb.modelo.Entidades.Tipo;
import java.util.List;

/**
 *
 * @author jjmm7
 */
public class TipoControllerImpl implements ITipoController{

    @Override
    public void insertarTipo(Tipo t) {
         TipoDaoImpl td = new TipoDaoImpl();
        td.insertarTipo(t);
    }

    @Override
    public List<Tipo> listarTipoes() {
        TipoDaoImpl td = new TipoDaoImpl();
        
        return td.listarTipoes();
    }

    @Override
    public Tipo buscarTipo(int id) {
        TipoDaoImpl td = new TipoDaoImpl();
        return td.buscarTipo(id);
        
    }

    @Override
    public List<Tipo> buscarTipoPorFuncion(String funcion) {
        TipoDaoImpl td = new TipoDaoImpl();
        return td.buscarTipoPorFuncion(funcion);
    }
   
}
