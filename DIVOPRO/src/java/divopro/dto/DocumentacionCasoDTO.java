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
public class DocumentacionCasoDTO {
    private int id_documentacion;
    private String doc_certificado_matrimonio;
    private String doc_acta_matrimonio;
    private String doc_certificado_nacimiento;
    private String doc_certificado_demanda;

    public DocumentacionCasoDTO() {
    }

    public DocumentacionCasoDTO(int id_documentacion, String doc_certificado_matrimonio, String doc_acta_matrimonio, String doc_certificado_nacimiento, String doc_certificado_demanda) {
        this.id_documentacion = id_documentacion;
        this.doc_certificado_matrimonio = doc_certificado_matrimonio;
        this.doc_acta_matrimonio = doc_acta_matrimonio;
        this.doc_certificado_nacimiento = doc_certificado_nacimiento;
        this.doc_certificado_demanda = doc_certificado_demanda;
    }

    public int getId_documentacion() {
        return id_documentacion;
    }

    public void setId_documentacion(int id_documentacion) {
        this.id_documentacion = id_documentacion;
    }

    public String getDoc_certificado_matrimonio() {
        return doc_certificado_matrimonio;
    }

    public void setDoc_certificado_matrimonio(String doc_certificado_matrimonio) {
        this.doc_certificado_matrimonio = doc_certificado_matrimonio;
    }

    public String getDoc_acta_matrimonio() {
        return doc_acta_matrimonio;
    }

    public void setDoc_acta_matrimonio(String doc_acta_matrimonio) {
        this.doc_acta_matrimonio = doc_acta_matrimonio;
    }

    public String getDoc_certificado_nacimiento() {
        return doc_certificado_nacimiento;
    }

    public void setDoc_certificado_nacimiento(String doc_certificado_nacimiento) {
        this.doc_certificado_nacimiento = doc_certificado_nacimiento;
    }

    public String getDoc_certificado_demanda() {
        return doc_certificado_demanda;
    }

    public void setDoc_certificado_demanda(String doc_certificado_demanda) {
        this.doc_certificado_demanda = doc_certificado_demanda;
    }

    @Override
    public String toString() {
        return "DocumentacionCasoDTO{" + "id_documentacion=" + id_documentacion + ", doc_certificado_matrimonio=" + doc_certificado_matrimonio + ", doc_acta_matrimonio=" + doc_acta_matrimonio + ", doc_certificado_nacimiento=" + doc_certificado_nacimiento + ", doc_certificado_demanda=" + doc_certificado_demanda + '}';
    }
    
            
}
