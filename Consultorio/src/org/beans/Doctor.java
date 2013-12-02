/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.beans;

/**
 *
 * @author rodrigo
 */
public class Doctor {
    private String nombre_doc;
    private String username_doc;
    private String password_doc;
    private String especialidad;
    private String cedula;
    private String direccion_doc;
    private String telefono_doc;
    private String email;

    public String getNombre_doc() {
        return nombre_doc;
    }

    public void setNombre_doc(String nombre_doc) {
        this.nombre_doc = nombre_doc;
    }

    public String getUser_name() {
        return username_doc;
    }

    public void setUser_name(String username_doc) {
        this.username_doc = username_doc;
    }

    public String getPassword_doc() {
        return password_doc;
    }

    public void setPassword_doc(String password_doc) {
        this.password_doc = password_doc;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion_doc() {
        return direccion_doc;
    }

    public void setDireccion_doc(String direccion_doc) {
        this.direccion_doc = direccion_doc;
    }

    public String getTelefono_doc() {
        return telefono_doc;
    }

    public void setTelefono_doc(String telefono_doc) {
        this.telefono_doc = telefono_doc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
