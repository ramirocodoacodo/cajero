package ar.cac.cajero.controller;

import ar.cac.cajero.model.Movimientos;
import ar.cac.cajero.util.CajeroHibernateUtil;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class MovimientosController {
    public void altaMovimiento(Movimientos mov){
        SessionFactory mySessionFactory = CajeroHibernateUtil.getSessionFactory();
        Session session = mySessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(mov);
        tx.commit();
        session.close();
    }

    public void bajaFisicaMovimiento(Movimientos mov){
        SessionFactory mySessionFactory = CajeroHibernateUtil.getSessionFactory();
        Session session = mySessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.delete(mov);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "El Movimiento de Cuenta se ha eliminado de la base de datos.");
    }
}