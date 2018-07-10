package ar.cac.cajero.controller;

import ar.cac.cajero.model.TiposMovimiento;
import ar.cac.cajero.util.CajeroHibernateUtil;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TiposMovimientoController {
    public void altaTipoMovimiento(TiposMovimiento tmo){
        SessionFactory mySessionFactory = CajeroHibernateUtil.getSessionFactory();
        Session session = mySessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(tmo);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "El Tipo de Movimiento se ha dado de alta correctamente con los siguientes datos: \n" + tmo.toString());
    }

    public void bajaTipoMovimiento(TiposMovimiento tmo){
        SessionFactory mySessionFactory = CajeroHibernateUtil.getSessionFactory();
        Session session = mySessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        tmo.setHabilitado(false);
        session.update(tmo);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "El Tipo de Movimiento se ha dado de baja.");
    }    
    
    public void bajaFisicaTipoMovimiento(TiposMovimiento tmo){
        SessionFactory mySessionFactory = CajeroHibernateUtil.getSessionFactory();
        Session session = mySessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.delete(tmo);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "El Tipo de Movimiento se ha eliminado de la base de datos.");
    }
}