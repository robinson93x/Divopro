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
public class TestigoDTO {
    private int id_testigo;
    private String nombres_testigo;
    private String apellidos_testigo;

    public TestigoDTO() {
    }

    public TestigoDTO(int id_testigo, String nombres_testigo, String apellidos_testigo) {
        this.id_testigo = id_testigo;
        this.nombres_testigo = nombres_testigo;
        this.apellidos_testigo = apellidos_testigo;
    }

    public int getId_testigo() {
        return id_testigo;
    }

    public void setId_testigo(int id_testigo) {
        this.id_testigo = id_testigo;
    }

    public String getNombres_testigo() {
        return nombres_testigo;
    }

    public void setNombres_testigo(String nombres_testigo) {
        this.nombres_testigo = nombres_testigo;
    }

    public String getApellidos_testigo() {
        return apellidos_testigo;
    }

    public void setApellidos_testigo(String apellidos_testigo) {
        this.apellidos_testigo = apellidos_testigo;
    }

    @Override
    public String toString() {
        return "TestigoDTO{" + "id_testigo=" + id_testigo + ", nombres_testigo=" + nombres_testigo + ", apellidos_testigo=" + apellidos_testigo + '}';
    }
    
    
}
