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
public class CeseConvivenciaDTO {
    private int id_cese_convivencia;
    private String doc_acta_cese_conviv;
    private String doc_prueba_cese_conviv;

    public CeseConvivenciaDTO() {
    }

    public CeseConvivenciaDTO(int id_cese_convivencia, String doc_acta_cese_conviv, String doc_prueba_cese_conviv) {
        this.id_cese_convivencia = id_cese_convivencia;
        this.doc_acta_cese_conviv = doc_acta_cese_conviv;
        this.doc_prueba_cese_conviv = doc_prueba_cese_conviv;
    }

    public int getId_cese_convivencia() {
        return id_cese_convivencia;
    }

    public void setId_cese_convivencia(int id_cese_convivencia) {
        this.id_cese_convivencia = id_cese_convivencia;
    }

    public String getDoc_acta_cese_conviv() {
        return doc_acta_cese_conviv;
    }

    public void setDoc_acta_cese_conviv(String doc_acta_cese_conviv) {
        this.doc_acta_cese_conviv = doc_acta_cese_conviv;
    }

    public String getDoc_prueba_cese_conviv() {
        return doc_prueba_cese_conviv;
    }

    public void setDoc_prueba_cese_conviv(String doc_prueba_cese_conviv) {
        this.doc_prueba_cese_conviv = doc_prueba_cese_conviv;
    }

    @Override
    public String toString() {
        return "CeseConvivenciaDTO{" + "id_cese_convivencia=" + id_cese_convivencia + ", doc_acta_cese_conviv=" + doc_acta_cese_conviv + ", doc_prueba_cese_conviv=" + doc_prueba_cese_conviv + '}';
    }
    
    
}
