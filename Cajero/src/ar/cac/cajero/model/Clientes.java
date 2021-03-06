package ar.cac.cajero.model;
// Generated 06/07/2018 20:22:37 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Clientes generated by hbm2java
 */
public class Clientes  implements java.io.Serializable {


     private Integer id;
     private String nombre;
     private String apellido;
     private int dni;
     private Integer cuil;
     private Date fechaNacimiento;
     private Boolean habilitado;
     private Set cuentases = new HashSet(0);
     private LoginData loginData;

    public Clientes() {
    }

	
    public Clientes(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.habilitado = true;
    }

    public Clientes(String nombre, String apellido, int dni, boolean habilitado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.habilitado = habilitado;
    }

    public Clientes(String nombre, String apellido, int dni, Integer cuil, Date fechaNacimiento, Boolean habilitado, Set cuentases, LoginData loginData) {
       this.nombre = nombre;
       this.apellido = apellido;
       this.dni = dni;
       this.cuil = cuil;
       this.fechaNacimiento = fechaNacimiento;
       this.habilitado = habilitado;
       this.cuentases = cuentases;
       this.loginData = loginData;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getDni() {
        return this.dni;
    }
    
    public void setDni(int dni) {
        this.dni = dni;
    }
    public Integer getCuil() {
        return this.cuil;
    }
    
    public void setCuil(Integer cuil) {
        this.cuil = cuil;
    }
    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }
    
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public Boolean getHabilitado() {
        return this.habilitado;
    }
    
    public void setHabilitado(Boolean habilitado) {
        this.habilitado = habilitado;
    }
    public Set getCuentases() {
        return this.cuentases;
    }
    
    public void setCuentases(Set cuentases) {
        this.cuentases = cuentases;
    }
    public LoginData getLoginData() {
        return this.loginData;
    }
    
    public void setLoginData(LoginData loginData) {
        this.loginData = loginData;
    }

    @Override
    public String toString() {
        return "Cliente: {" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + '}';
    }

}


