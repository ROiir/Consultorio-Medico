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
public class Receta {
    private int recetacol;
    private String curp;
    private String enfermedades;
    private String medicina;

    public int getRecetacol() {
        return recetacol;
    }

    public void setRecetacol(int recetacol) {
        this.recetacol = recetacol;
    }
    
    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(String enfermedades) {
        this.enfermedades = enfermedades;
    }

    public String getMedicina() {
        return medicina;
    }

    public void setMedicina(String medicina) {
        this.medicina = medicina;
    }
    
}
