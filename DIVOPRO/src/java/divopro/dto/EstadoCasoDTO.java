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
public class EstadoCasoDTO {
    private int id_estado_caso;
    private String nombre_estado_caso;

    public EstadoCasoDTO() {
    }

    public EstadoCasoDTO(int id_estado_caso, String nombre_estado_caso) {
        this.id_estado_caso = id_estado_caso;
        this.nombre_estado_caso = nombre_estado_caso;
    }

    public int getId_estado_caso() {
        return id_estado_caso;
    }

    public void setId_estado_caso(int id_estado_caso) {
        this.id_estado_caso = id_estado_caso;
    }

    public String getNombre_estado_caso() {
        return nombre_estado_caso;
    }

    public void setNombre_estado_caso(String nombre_estado_caso) {
        this.nombre_estado_caso = nombre_estado_caso;
    }

    @Override
    public String toString() {
        return "EstadoCasoDTO{" + "id_estado_caso=" + id_estado_caso + ", nombre_estado_caso=" + nombre_estado_caso + '}';
    }
    
    
}
