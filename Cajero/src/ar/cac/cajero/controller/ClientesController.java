/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.cac.cajero.controller;

import ar.cac.cajero.model.Clientes;
import ar.cac.cajero.util.CajeroHibernateUtil;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author alumno
 */
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
}
