/*
 Equipo No. 1
 * Cardenas Lara Jose Armando
 * Lara Mora Ana Cecilia
 * Ramirez Soto Rodrigo
 * Violante Hernandez Miguel Angel
 */
package org.consultoriomedico.bans;
public class Paciente {
    private String Nombre;
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    private String Apellido;
    public String getApellidos() {
        return Apellido;
    }
    public void setApellidos(String Apellido) {
        this.Apellido = Apellido;
    }
    
    private String Telefono;
    public String getTelefono() {
        return Telefono;
    }
    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
    private String Direccion;
    public String getDireccion() {
        return Direccion;
    }
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
}
