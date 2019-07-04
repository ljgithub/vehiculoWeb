/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.vehiculosweb.modelo.DAO;

import com.uisrael.vehiculosweb.modelo.Entidades.Revision;
import java.util.List;

/**
 *
 * @author jjmm7
 */
public interface IRevisionDao {
    public void insertarRevision(Revision ot);
    public List<Revision> listarRevisiones();
    public Revision buscarRevision(int id);
    
    public List<Revision> buscarRevisionPorMotivo(String motivo);
}
