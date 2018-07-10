package ar.cac.cajero.controller;

import ar.cac.cajero.model.LoginData;
import ar.cac.cajero.util.CajeroHibernateUtil;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class LoginDataController {
    public void altaLogin(LoginData ld){
        SessionFactory mySessionFactory = CajeroHibernateUtil.getSessionFactory();
        Session session = mySessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(ld);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "El Login de Usuario se ha dado de alta correctamente con los siguientes datos: \n" + ld.toString());
    }

    public void bajaFisicaLogin(LoginData ld){
        SessionFactory mySessionFactory = CajeroHibernateUtil.getSessionFactory();
        Session session = mySessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.delete(ld);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "El Login de Usuario se ha eliminado de la base de datos.");
    }
}