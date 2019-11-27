package com.ufidelitas.beans;

import java.io.Serializable;
import javax.ejb.Stateless;
import javax.inject.Named;

/**
 *
 * @author Lab04-PC16
 */
@Named(value="persona")
@Stateless
public class Persona implements Serializable{
    private String nombre;
    private String apellidos;
    private String genero;
    private Integer edad;
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

     public Persona() {
    }
     
    public Persona(String nombre, String apellidos, String genero, Integer edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.genero = genero;
        this.edad = edad;
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
