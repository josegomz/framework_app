/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.framework.struts.model;


import com.framework.struts.entity.Struts;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author labtw03
 */
public class StrutsModelImpl implements IStrutsModel {

    private SessionFactory sessionFactory;
    private Session session;

    @Override
    public void crearRegistro(Struts struts) {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(struts);
            session.getTransaction().commit();
            session.close();
            sessionFactory.close();
        } catch (HibernateException e) {
            System.out.println(e.toString());
        }
    }

    @Override
    public void actualizarRegistro(Struts struts){
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.update(struts);
            session.getTransaction().commit();
            session.close();
            sessionFactory.close();
        } catch (HibernateException e) {
            System.out.println(e.toString());
        }
    }

    @Override
    public void eliminarRegistro(Struts struts){
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.delete(struts);
            session.getTransaction().commit();
            session.close();
            sessionFactory.close();
        } catch (HibernateException e) {
            System.out.println(e.toString());
        }
    }

    @Override
    public Struts obtenerRegistro(Long codigo){
        Struts struts = null;
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            struts = (Struts) session.get(Struts.class, codigo);
            session.close();
            sessionFactory.close();
        } catch (HibernateException e) {
            System.out.println(e);
        }
        return struts;
    }

    @Override
    public List<Struts> obtenerRegistros() {
        List<Struts> lista = null;
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            lista = (ArrayList<Struts>) session.createQuery("FROM Struts").list();
            for (Struts u : lista) {
                System.out.println("Nombre: " + u.getNombre());
            }
            session.close();
            sessionFactory.close();
        } catch (HibernateException e) {
            System.out.println("Error de actualización de liga");
            System.out.println(e);
        }
        return lista;
    }

    public static void main(String[] args) {

        IStrutsModel sm = new StrutsModelImpl();
        System.out.println(sm.obtenerRegistros());

    }

}
