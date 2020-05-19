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
public class FechaJuzgadoDTO {
    
    private int id_fecha_juzgado;
    private Date fecha_cita_documentacion;
    private Date fecha_audiencia_preparatoria;
    private Date fecha_audiencia_juicio;

    public FechaJuzgadoDTO() {
    }

    public FechaJuzgadoDTO(int id_fecha_juzgado, Date fecha_cita_documentacion, Date fecha_audiencia_preparatoria, Date fecha_audiencia_juicio) {
        this.id_fecha_juzgado = id_fecha_juzgado;
        this.fecha_cita_documentacion = fecha_cita_documentacion;
        this.fecha_audiencia_preparatoria = fecha_audiencia_preparatoria;
        this.fecha_audiencia_juicio = fecha_audiencia_juicio;
    }

    public int getId_fecha_juzgado() {
        return id_fecha_juzgado;
    }

    public void setId_fecha_juzgado(int id_fecha_juzgado) {
        this.id_fecha_juzgado = id_fecha_juzgado;
    }

    public Date getFecha_cita_documentacion() {
        return fecha_cita_documentacion;
    }

    public void setFecha_cita_documentacion(Date fecha_cita_documentacion) {
        this.fecha_cita_documentacion = fecha_cita_documentacion;
    }

    public Date getFecha_audiencia_preparatoria() {
        return fecha_audiencia_preparatoria;
    }

    public void setFecha_audiencia_preparatoria(Date fecha_audiencia_preparatoria) {
        this.fecha_audiencia_preparatoria = fecha_audiencia_preparatoria;
    }

    public Date getFecha_audiencia_juicio() {
        return fecha_audiencia_juicio;
    }

    public void setFecha_audiencia_juicio(Date fecha_audiencia_juicio) {
        this.fecha_audiencia_juicio = fecha_audiencia_juicio;
    }

    @Override
    public String toString() {
        return "FechaJuzgadoDTO{" + "id_fecha_juzgado=" + id_fecha_juzgado + ", fecha_cita_documentacion=" + fecha_cita_documentacion + ", fecha_audiencia_preparatoria=" + fecha_audiencia_preparatoria + ", fecha_audiencia_juicio=" + fecha_audiencia_juicio + '}';
    }

    
    
}
