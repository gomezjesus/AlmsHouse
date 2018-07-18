/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

import java.io.Serializable;

/**
 *
 * @author chuy_
 */
public class Voluntario implements Serializable {

    private String nombre;
    private int id;
    private String apellido;
    private String email;
    private String telefono;
    private String domicilio;
    private String estado;
    private String ciudad;
    private String zip;
    private String estudios;
    private String servicio;
   

    /**
     * @return the nombre
     */
    public Voluntario(String nombre, String apellido, String email, String domicilio, String estado, String ciudad, String zip, String estudios, String servicio, String telefono) {
        {
            this.nombre = nombre;
            this.apellido = apellido;
            this.email = email;
            this.domicilio = domicilio;
            this.estado = estado;
            this.ciudad = ciudad;
            this.zip = zip;
            this.estudios = estudios;
            this.servicio = servicio;
            this.telefono = telefono;
        }
        
        
                
    }
    
    public Voluntario(){}
    
        public Voluntario(int id,String nombre, String apellido, String email, String domicilio, String estado, String ciudad, String zip, String estudios, String servicio, String telefono) 
        {
            this.nombre = nombre;
            this.apellido = apellido;
            this.email = email;
            this.domicilio = domicilio;
            this.estado = estado;
            this.ciudad = ciudad;
            this.zip = zip;
            this.estudios = estudios;
            this.servicio = servicio;
            this.telefono = telefono;
            this.id = id;
        }

    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the domicilio
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * @param domicilio the domicilio to set
     */
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * @return the zip
     */
    public String getZip() {
        return zip;
    }

    /**
     * @param zip the zip to set
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     * @return the estudios
     */
    public String getEstudios() {
        return estudios;
    }

    /**
     * @param estudios the estudios to set
     */
    public void setEstudios(String estudios) {
        this.estudios = estudios;
    }

    /**
     * @return the servicio
     */
    public String getServicio() {
        return servicio;
    }

    /**
     * @param servicio the servicio to set
     */
    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
}
