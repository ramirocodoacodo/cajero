package ar.cac.cajero.controller;

import ar.cac.cajero.model.Cuentas;
import ar.cac.cajero.util.CajeroHibernateUtil;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CuentasController {
    public void altaCuenta(Cuentas cue){
        SessionFactory mySessionFactory = CajeroHibernateUtil.getSessionFactory();
        Session session = mySessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(cue);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "La Cuenta se ha dado de alta correctamente con los siguientes datos: \n" + cue.toString());
    }

    public void bajaCuenta(Cuentas cue){
        SessionFactory mySessionFactory = CajeroHibernateUtil.getSessionFactory();
        Session session = mySessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        cue.setHabilitado(false);
        session.update(cue);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "La Cuenta se ha dado de baja.");
    }    
    
    public void bajaFisicaCliente(Cuentas cue){
        SessionFactory mySessionFactory = CajeroHibernateUtil.getSessionFactory();
        Session session = mySessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.delete(cue);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "La Cuenta se ha eliminado de la base de datos.");
    }
}