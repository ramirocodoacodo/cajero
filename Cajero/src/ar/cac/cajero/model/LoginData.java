package ar.cac.cajero.model;
// Generated 06/07/2018 20:22:37 by Hibernate Tools 4.3.1



/**
 * LoginData generated by hbm2java
 */
public class LoginData  implements java.io.Serializable {


     private int clienteId;
     private Clientes clientes;

    public LoginData() {
    }

    public LoginData(Clientes clientes) {
       this.clientes = clientes;
    }
   
    public int getClienteId() {
        return this.clienteId;
    }
    
    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }
    public Clientes getClientes() {
        return this.clientes;
    }
    
    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }




}


