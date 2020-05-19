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
public class DemandadoDTO {
    private int id_demandado;
    private String nombre_demandado;
    private String apellido_paterno_demandado;
    private String apellido_materno_demandado;
    private String rut_demandado;
    private String direccion_demandado;

    public DemandadoDTO() {
    }

    public DemandadoDTO(int id_demandado, String nombre_demandado, String apellido_paterno_demandado, String apellido_materno_demandado, String rut_demandado, String direccion_demandado) {
        this.id_demandado = id_demandado;
        this.nombre_demandado = nombre_demandado;
        this.apellido_paterno_demandado = apellido_paterno_demandado;
        this.apellido_materno_demandado = apellido_materno_demandado;
        this.rut_demandado = rut_demandado;
        this.direccion_demandado = direccion_demandado;
    }

    public int getId_demandado() {
        return id_demandado;
    }

    public void setId_demandado(int id_demandado) {
        this.id_demandado = id_demandado;
    }

    public String getNombre_demandado() {
        return nombre_demandado;
    }

    public void setNombre_demandado(String nombre_demandado) {
        this.nombre_demandado = nombre_demandado;
    }

    public String getApellido_paterno_demandado() {
        return apellido_paterno_demandado;
    }

    public void setApellido_paterno_demandado(String apellido_paterno_demandado) {
        this.apellido_paterno_demandado = apellido_paterno_demandado;
    }

    public String getApellido_materno_demandado() {
        return apellido_materno_demandado;
    }

    public void setApellido_materno_demandado(String apellido_materno_demandado) {
        this.apellido_materno_demandado = apellido_materno_demandado;
    }

    public String getRut_demandado() {
        return rut_demandado;
    }

    public void setRut_demandado(String rut_demandado) {
        this.rut_demandado = rut_demandado;
    }

    public String getDireccion_demandado() {
        return direccion_demandado;
    }

    public void setDireccion_demandado(String direccion_demandado) {
        this.direccion_demandado = direccion_demandado;
    }

    @Override
    public String toString() {
        return "DemandadoDTO{" + "id_demandado=" + id_demandado + ", nombre_demandado=" + nombre_demandado + ", apellido_paterno_demandado=" + apellido_paterno_demandado + ", apellido_materno_demandado=" + apellido_materno_demandado + ", rut_demandado=" + rut_demandado + ", direccion_demandado=" + direccion_demandado + '}';
    }
    
    
}
