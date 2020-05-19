/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divopro.dto;

import java.sql.Date;

/**
 *
 * @author Robinson
 */
public class CasoDTO {
    private int id_caso;
    private AbogadoDTO id_abogado;
    private FechaJuzgadoDTO id_fecha_juzgado;
    private DemandanteDTO id_demandante;
    private DemandadoDTO id_demandado;
    private EstadoCasoDTO id_estado_caso;
    private TestigoDTO id_testigo;
    private DocumentacionCasoDTO id_documentacion;
    private CeseConvivenciaDTO id_cese_convivencia;
    private Date fecha_celebracion_matri;
    private String observaciones;

    public CasoDTO() {
    }

    public CasoDTO(int id_caso, AbogadoDTO id_abogado, FechaJuzgadoDTO id_fecha_juzgado, DemandanteDTO id_demandante, DemandadoDTO id_demandado, EstadoCasoDTO id_estado_caso, TestigoDTO id_testigo, DocumentacionCasoDTO id_documentacion, CeseConvivenciaDTO id_cese_convivencia, Date fecha_celebracion_matri, String observaciones) {
        this.id_caso = id_caso;
        this.id_abogado = id_abogado;
        this.id_fecha_juzgado = id_fecha_juzgado;
        this.id_demandante = id_demandante;
        this.id_demandado = id_demandado;
        this.id_estado_caso = id_estado_caso;
        this.id_testigo = id_testigo;
        this.id_documentacion = id_documentacion;
        this.id_cese_convivencia = id_cese_convivencia;
        this.fecha_celebracion_matri = fecha_celebracion_matri;
        this.observaciones = observaciones;
    }

    public int getId_caso() {
        return id_caso;
    }

    public void setId_caso(int id_caso) {
        this.id_caso = id_caso;
    }

    public AbogadoDTO getId_abogado() {
        return id_abogado;
    }

    public void setId_abogado(AbogadoDTO id_abogado) {
        this.id_abogado = id_abogado;
    }

    public FechaJuzgadoDTO getId_fecha_juzgado() {
        return id_fecha_juzgado;
    }

    public void setId_fecha_juzgado(FechaJuzgadoDTO id_fecha_juzgado) {
        this.id_fecha_juzgado = id_fecha_juzgado;
    }

    public DemandanteDTO getId_demandante() {
        return id_demandante;
    }

    public void setId_demandante(DemandanteDTO id_demandante) {
        this.id_demandante = id_demandante;
    }

    public DemandadoDTO getId_demandado() {
        return id_demandado;
    }

    public void setId_demandado(DemandadoDTO id_demandado) {
        this.id_demandado = id_demandado;
    }

    public EstadoCasoDTO getId_estado_caso() {
        return id_estado_caso;
    }

    public void setId_estado_caso(EstadoCasoDTO id_estado_caso) {
        this.id_estado_caso = id_estado_caso;
    }

    public TestigoDTO getId_testigo() {
        return id_testigo;
    }

    public void setId_testigo(TestigoDTO id_testigo) {
        this.id_testigo = id_testigo;
    }

    public DocumentacionCasoDTO getId_documentacion() {
        return id_documentacion;
    }

    public void setId_documentacion(DocumentacionCasoDTO id_documentacion) {
        this.id_documentacion = id_documentacion;
    }

    public CeseConvivenciaDTO getId_cese_convivencia() {
        return id_cese_convivencia;
    }

    public void setId_cese_convivencia(CeseConvivenciaDTO id_cese_convivencia) {
        this.id_cese_convivencia = id_cese_convivencia;
    }

    public Date getFecha_celebracion_matri() {
        return fecha_celebracion_matri;
    }

    public void setFecha_celebracion_matri(Date fecha_celebracion_matri) {
        this.fecha_celebracion_matri = fecha_celebracion_matri;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "CasoDTO{" + "id_caso=" + id_caso + ", id_abogado=" + id_abogado + ", id_fecha_juzgado=" + id_fecha_juzgado + ", id_demandante=" + id_demandante + ", id_demandado=" + id_demandado + ", id_estado_caso=" + id_estado_caso + ", id_testigo=" + id_testigo + ", id_documentacion=" + id_documentacion + ", id_cese_convivencia=" + id_cese_convivencia + ", fecha_celebracion_matri=" + fecha_celebracion_matri + ", observaciones=" + observaciones + '}';
    }

    

    
    
}
