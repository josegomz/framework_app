/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.framework.struts.service;

import com.framework.struts.entity.Struts;
import com.framework.struts.model.IStrutsModel;
import com.framework.struts.model.StrutsModelImpl;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author labtw13
 */
@ManagedBean(name="strutsService")
@ApplicationScoped
public class StrutsService  implements IStrutsService{
    private final IStrutsModel sm= new StrutsModelImpl();
    @Override
    public void crearRegistro(Struts struts) {
        sm.crearRegistro(struts);
    }

    @Override
    public void actualizarRegistro(Struts struts) {
        sm.actualizarRegistro(struts);
    }

    @Override
    public void eliminarRegistro(Struts struts) {
        sm.eliminarRegistro(struts);
    }

    @Override
    public Struts obtenerRegistro(Long codigo) {
        return sm.obtenerRegistro(codigo);
    }

    @Override
    public List<Struts> obtenerRegistros() {
        return sm.obtenerRegistros();
    }
    
}
