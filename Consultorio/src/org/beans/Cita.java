package org.beans;
import java.util.Date;

public class Cita {
    private int cve_cita;
    private String paciente_curp;
    private Date fecha;
    private int estatus_idestatud;

    public int getCve_cita() {
        return cve_cita;
    }

    public void setCve_cita(int cve_cita) {
        this.cve_cita = cve_cita;
    }

    public String getPaciente_curp() {
        return paciente_curp;
    }

    public void setPaciente_curp(String paciente_curp) {
        this.paciente_curp = paciente_curp;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getEstatus_idestatud() {
        return estatus_idestatud;
    }

    public void setEstatus_idestatud(int estatus_idestatud) {
        this.estatus_idestatud = estatus_idestatud;
    }
}
