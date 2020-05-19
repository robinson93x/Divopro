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
public class AbogadoDTO {
    private int id_abogado;
    private int id_usuario;
    private String nombre_abogado;
    private String apellido_paterno_abogado;
    private String apellido_materno_abogado;
    private String rut_abogado;
    private String email;

    public AbogadoDTO() {
    }

    public AbogadoDTO(int id_abogado, int id_usuario, String nombre_abogado, String apellido_paterno_abogado, String apellido_materno_abogado, String rut_abogado, String email) {
        this.id_abogado = id_abogado;
        this.id_usuario = id_usuario;
        this.nombre_abogado = nombre_abogado;
        this.apellido_paterno_abogado = apellido_paterno_abogado;
        this.apellido_materno_abogado = apellido_materno_abogado;
        this.rut_abogado = rut_abogado;
        this.email = email;
    }

    public int getId_abogado() {
        return id_abogado;
    }

    public void setId_abogado(int id_abogado) {
        this.id_abogado = id_abogado;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre_abogado() {
        return nombre_abogado;
    }

    public void setNombre_abogado(String nombre_abogado) {
        this.nombre_abogado = nombre_abogado;
    }

    public String getApellido_paterno_abogado() {
        return apellido_paterno_abogado;
    }

    public void setApellido_paterno_abogado(String apellido_paterno_abogado) {
        this.apellido_paterno_abogado = apellido_paterno_abogado;
    }

    public String getApellido_materno_abogado() {
        return apellido_materno_abogado;
    }

    public void setApellido_materno_abogado(String apellido_materno_abogado) {
        this.apellido_materno_abogado = apellido_materno_abogado;
    }

    public String getRut_abogado() {
        return rut_abogado;
    }

    public void setRut_abogado(String rut_abogado) {
        this.rut_abogado = rut_abogado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "AbogadoDTO{" + "id_abogado=" + id_abogado + ", id_usuario=" + id_usuario + ", nombre_abogado=" + nombre_abogado + ", apellido_paterno_abogado=" + apellido_paterno_abogado + ", apellido_materno_abogado=" + apellido_materno_abogado + ", rut_abogado=" + rut_abogado + ", email=" + email + '}';
    }
    
    
}
