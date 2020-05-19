/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divopro.dto;

/**
 *
 * @author Robinson
 */
public class DemandanteDTO {
    private int id_demandante;
    private String nombre_demandante;
    private String apellido_paterno_demandante;
    private String apellido_materno_demandante;
    private int rut_demandante;

    public DemandanteDTO() {
    }

    public DemandanteDTO(int id_demandante, String nombre_demandante, String apellido_paterno_demandante, String apellido_materno_demandante, int rut_demandante) {
        this.id_demandante = id_demandante;
        this.nombre_demandante = nombre_demandante;
        this.apellido_paterno_demandante = apellido_paterno_demandante;
        this.apellido_materno_demandante = apellido_materno_demandante;
        this.rut_demandante = rut_demandante;
    }

    public int getId_demandante() {
        return id_demandante;
    }

    public void setId_demandante(int id_demandante) {
        this.id_demandante = id_demandante;
    }

    public String getNombre_demandante() {
        return nombre_demandante;
    }

    public void setNombre_demandante(String nombre_demandante) {
        this.nombre_demandante = nombre_demandante;
    }

    public String getApellido_paterno_demandante() {
        return apellido_paterno_demandante;
    }

    public void setApellido_paterno_demandante(String apellido_paterno_demandante) {
        this.apellido_paterno_demandante = apellido_paterno_demandante;
    }

    public String getApellido_materno_demandante() {
        return apellido_materno_demandante;
    }

    public void setApellido_materno_demandante(String apellido_materno_demandante) {
        this.apellido_materno_demandante = apellido_materno_demandante;
    }

    public int getRut_demandante() {
        return rut_demandante;
    }

    public void setRut_demandante(int rut_demandante) {
        this.rut_demandante = rut_demandante;
    }

    @Override
    public String toString() {
        return "DemandanteDTO{" + "id_demandante=" + id_demandante + ", nombre_demandante=" + nombre_demandante + ", apellido_paterno_demandante=" + apellido_paterno_demandante + ", apellido_materno_demandante=" + apellido_materno_demandante + ", rut_demandante=" + rut_demandante + '}';
    }

    
}