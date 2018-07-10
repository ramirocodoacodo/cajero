/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.cac.cajero.controller;

import ar.cac.cajero.model.TiposCuenta;
import ar.cac.cajero.model.TiposMovimiento;
import ar.cac.cajero.util.CajeroHibernateUtil;
import java.util.ArrayList;
import org.hibernate.SessionFactory;

/**
 *
 * @author alumno
 */
public class CajeroController {

    public ArrayList<TiposCuenta> getTiposCuenta() {
        ArrayList<TiposCuenta> tiposDeCuenta = new ArrayList<>();
        SessionFactory mySessionFactory = CajeroHibernateUtil.getSessionFactory();
        tiposDeCuenta.addAll(mySessionFactory.getCurrentSession().createCriteria(TiposCuenta.class).list());
        return tiposDeCuenta;
    }

    public ArrayList<TiposMovimiento> getTiposMovimiento() {
        ArrayList<TiposMovimiento> tiposDeMovimiento = new ArrayList<>();
        SessionFactory mySessionFactory = CajeroHibernateUtil.getSessionFactory();
        tiposDeMovimiento.addAll(mySessionFactory.getCurrentSession().createCriteria(TiposMovimiento.class).list());
        return tiposDeMovimiento;
    }
}
