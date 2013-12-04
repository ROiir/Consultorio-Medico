package org.beans;
public class Paciente {
    private String curp;
    private String nombre_pa;
    private String direccion_pa;
    private String telefono_pa;
    private String email_pa;
    private String doctor_username_doc;

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getNombre_pa() {
        return nombre_pa;
    }

    public void setNombre_pa(String nombre_pa) {
        this.nombre_pa = nombre_pa;
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

    public String getDoctor_username_doc() {
        return doctor_username_doc;
    }

    public void setDoctor_username_doc(String doctor_username_doc) {
        this.doctor_username_doc = doctor_username_doc;
    }
}
