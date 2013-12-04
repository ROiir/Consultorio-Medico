package org.beans;
public class Receta {
    private int recetacol;
    private String paciente_curp;
    private String enfermedades;
    private String medicamento;

    public int getRecetacol() {
        return recetacol;
    }

    public void setRecetacol(int recetacol) {
        this.recetacol = recetacol;
    }

    public String getPaciente_curp() {
        return paciente_curp;
    }

    public void setPaciente_curp(String paciente_curp) {
        this.paciente_curp = paciente_curp;
    }

    public String getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(String enfermedades) {
        this.enfermedades = enfermedades;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

}
