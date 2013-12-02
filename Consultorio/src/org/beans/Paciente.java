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
public class Paciente {
    private String curp;
    private String nombre;
    private String direccion_pa;
    private String telefono_pa;
    private String email_pa;

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion_pa() {
        return direccion_pa;
    }

    public void setDireccion_pa(String direccion_pa) {
        this.direccion_pa = direccion_pa;
    }

    public String getTelefono_pa() {
        return telefono_pa;
    }

    public void setTelefono_pa(String telefono_pa) {
        this.telefono_pa = telefono_pa;
    }

    public String getEmail_pa() {
        return email_pa;
    }

    public void setEmail_pa(String email_pa) {
        this.email_pa = email_pa;
    }
    
    
}
