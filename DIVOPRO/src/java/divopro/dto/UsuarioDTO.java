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
public class UsuarioDTO {
    
    private int id_usuario;
    private int id_tipo_usuario;
    private String nombre_usuario;
    private String contraseña;

    public UsuarioDTO() {
    }

    public UsuarioDTO(int id_usuario, int id_tipo_usuario, String nombre_usuario, String contraseña) {
        this.id_usuario = id_usuario;
        this.id_tipo_usuario = id_tipo_usuario;
        this.nombre_usuario = nombre_usuario;
        this.contraseña = contraseña;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_tipo_usuario() {
        return id_tipo_usuario;
    }

    public void setId_tipo_usuario(int id_tipo_usuario) {
        this.id_tipo_usuario = id_tipo_usuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "UsuarioDTO{" + "id_usuario=" + id_usuario + ", id_tipo_usuario=" + id_tipo_usuario + ", nombre_usuario=" + nombre_usuario + ", contrase\u00f1a=" + contraseña + '}';
    }
    
    

    
    
    
    
    
}
