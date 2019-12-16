/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.framework.struts.controller;

import com.framework.struts.entity.Struts;
import com.framework.struts.service.IStrutsService;
import com.framework.struts.service.StrutsService;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author labtw13
 */
@ManagedBean(name = "strutsBean")
@ViewScoped
public class StrutsController extends ActionSupport {

    IStrutsService service;
    private Struts framework;
    private List<Struts> listaRegistros;
    public String obtenerRegistro() throws Exception {
        return SUCCESS;
    }
    
    public String obtenerRegistros(){
        try{
            service= new StrutsService();
        this.listaRegistros= service.obtenerRegistros();
        return SUCCESS;
        }catch(Exception e){
            System.out.println("Error al obtener Registros. \n"+e.getMessage());
            return ERROR;
        }
    }
    public String crearRegistro() {
        service = new StrutsService();
        try {
            service = new StrutsService();
            service.crearRegistro(framework);
            this.listaRegistros=(ArrayList<Struts>) service.obtenerRegistros();
            return SUCCESS;
        } catch (Exception e) {
            System.out.println("ERROR  --------\n"+e.getMessage());
            return ERROR;
        }
        

    }

    //getters and setters

    public Struts getFramework() {
        return framework;
    }

    public void setFramework(Struts framework) {
        this.framework = framework;
    }

    public List<Struts> getListaRegistros() {
        return listaRegistros;
    }

    public void setListaRegistros(ArrayList<Struts> listaRegistros) {
        this.listaRegistros = listaRegistros;
    }
    
    
    
}
