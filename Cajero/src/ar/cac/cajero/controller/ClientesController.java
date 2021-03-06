package ar.cac.cajero.controller;

import ar.cac.cajero.model.Clientes;
import ar.cac.cajero.util.CajeroHibernateUtil;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ClientesController {
    public void altaCliente(Clientes cli){
        SessionFactory mySessionFactory = CajeroHibernateUtil.getSessionFactory();
        Session session = mySessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(cli);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "El Cliente se ha dado de alta correctamente con los siguientes datos: \n" + cli.toString());
    }

    public void bajaCliente(Clientes cli){
        SessionFactory mySessionFactory = CajeroHibernateUtil.getSessionFactory();
        Session session = mySessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        cli.setHabilitado(false);
        session.update(cli);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "El Cliente se ha dado de baja.");
    }    
    
    public void bajaFisicaCliente(Clientes cli){
        SessionFactory mySessionFactory = CajeroHibernateUtil.getSessionFactory();
        Session session = mySessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.delete(cli);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "El Cliente se ha eliminado de la base de datos.");
    }
}