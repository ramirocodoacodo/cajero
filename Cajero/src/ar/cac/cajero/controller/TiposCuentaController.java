package ar.cac.cajero.controller;

import ar.cac.cajero.model.TiposCuenta;
import ar.cac.cajero.util.CajeroHibernateUtil;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TiposCuentaController {
    public void altaTipoCuenta(TiposCuenta tcu){
        SessionFactory mySessionFactory = CajeroHibernateUtil.getSessionFactory();
        Session session = mySessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(tcu);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "El Tipo de Cuenta se ha dado de alta correctamente con los siguientes datos: \n" + tcu.toString());
    }

    public void bajaTipoCuenta(TiposCuenta tcu){
        SessionFactory mySessionFactory = CajeroHibernateUtil.getSessionFactory();
        Session session = mySessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        tcu.setHabilitado(false);
        session.update(tcu);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "El Tipo de Cuenta se ha dado de baja.");
    }    
    
    public void bajaFisicaTipoCuenta(TiposCuenta tcu){
        SessionFactory mySessionFactory = CajeroHibernateUtil.getSessionFactory();
        Session session = mySessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.delete(tcu);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "El Tipo de Cuenta se ha eliminado de la base de datos.");
    }
}