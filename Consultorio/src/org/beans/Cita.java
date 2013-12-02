/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.beans;
import java.util.Date;
/**
 *
 * @author rodrigo
 */
public class Cita {
    private int cve_cita;
    private String curp;
    private Date fecha;
    private int id_estatud;

    public int getCve_cita() {
        return cve_cita;
    }

    public void setCve_cita(int cve_cita) {
        this.cve_cita = cve_cita;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getId_estatud() {
        return id_estatud;
    }

    public void setId_estatud(int id_estatud) {
        this.id_estatud = id_estatud;
    }
    
}
