/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.vehiculosweb.controlador.IMPL;

import com.uisrael.vehiculosweb.controlador.IRevisionController;
import com.uisrael.vehiculosweb.modelo.DAO.IMPL.RevisionDaoImpl;
import com.uisrael.vehiculosweb.modelo.Entidades.Revision;
import java.util.List;

/**
 *
 * @author jjmm7
 */
public class RevisionControllerImpl implements IRevisionController{

    @Override
    public void insertarRevision(Revision ot) {
        RevisionDaoImpl od = new RevisionDaoImpl();
        od.insertarRevision(ot);
    }

    @Override
    public List<Revision> listarRevisiones() {
        RevisionDaoImpl od = new RevisionDaoImpl();
        
        return od.listarRevisiones();
    }

    @Override
    public Revision buscarRevision(int id) {
        RevisionDaoImpl od = new RevisionDaoImpl();
        return od.buscarRevision(id);        
    }

    @Override
    public List<Revision> buscarRevisionPorMotivo(String motivo) {
         RevisionDaoImpl od = new RevisionDaoImpl();
        return od.buscarRevisionPorMotivo(motivo);
    }
    
           
}
