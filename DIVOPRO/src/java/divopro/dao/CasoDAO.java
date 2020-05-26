/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divopro.dao;

import divopro.conexion.Conexion;
import divopro.dto.CasoDTO;
import divopro.interfaces.CRUD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Robinson
 */
public class CasoDAO implements CRUD<CasoDTO> {
    
    private static final String SQL_INSERT = "INSERT INTO CASO "
            + "(ID_ABOGADO,ID_FECHA_JUZGADO,ID_DEMANDANTE,ID_DEMANDADO,"
            + "ID_ESTADO_CASO,ID_TESTIGO,ID_DOCUMENTACION,ID_CESE_CONVIVENCIA,"
            + "FECHA_CELEBRACION_MATRI,OBSERVACIONES) VALUES (?,?,?,?,?,?,?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE CASO "
            + " SET ID_ABOGADO=?,ID_FECHA_JUZGADO=?,ID_DEMANDANTE=?,ID_DEMANDADO=?,"
            + "ID_ESTADO_CASO=?,ID_TESTIGO=?,ID_DOCUMENTACION=?,ID_CESE_CONVIVENCIA=?,"
            + "FECHA_CELEBRACION_MATRI=?,OBSERVACIONES=?";
    private static final String SQL_READXRUT = "SELECT * FROM CASO "
            + "INNER JOIN DEMANDANTE ON CASO.ID_DEMANDANTE = DEMANDANTE.ID_DEMANDANTE "
            + "WHERE RUT_DEMANDANTE=?";
    
    private static final Conexion cnn = Conexion.saberEstado();
    
    @Override
    public boolean create(CasoDTO x) {
        try {
            PreparedStatement ps = cnn.getCnn().prepareStatement(SQL_INSERT);
            /*Tengo dudas de como va a traer el campo 
                (este metodo realiza la query de arriba), ya que en esta seccion
                Deberia decirle "insterte los valores que estan en esta ubicacion"
                */
            ps.setInt(1, x.getId_abogado().getId_abogado());
            ps.setInt(2, x.getId_fecha_juzgado().getId_fecha_juzgado());
            ps.setInt(3, x.getId_demandante().getId_demandante());
            ps.setInt(4, x.getId_demandado().getId_demandado());
            ps.setInt(5, x.getId_estado_caso().getId_estado_caso());
            ps.setInt(6, x.getId_testigo().getId_testigo());
            ps.setInt(7, x.getId_documentacion().getId_documentacion());
            ps.setInt(8, x.getId_cese_convivencia().getId_cese_convivencia());
            ps.setDate(9, x.getFecha_celebracion_matri());
            ps.setString(10, x.getObservaciones());

            if (ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CasoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    @Override
    public boolean update(CasoDTO x) {
        try {
            PreparedStatement ps = cnn.getCnn().prepareStatement(SQL_UPDATE);
            
            ps.setInt(1, x.get().getId_abogado());
            ps.setInt(2, x.getId_fecha_juzgado().getId_fecha_juzgado());
            ps.setInt(3, x.getId_demandante().getId_demandante());
            ps.setInt(4, x.getId_demandado().getId_demandado());
            ps.setInt(5, x.getId_estado_caso().getId_estado_caso());
            ps.setInt(6, x.getId_testigo().getId_testigo());
            ps.setInt(7, x.getId_documentacion().getId_documentacion());
            ps.setInt(8, x.getId_cese_convivencia().getId_cese_convivencia());
            ps.setDate(9, x.getFecha_celebracion_matri());
            ps.setString(10, x.getObservaciones());

            if (ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CasoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    @Override
    public CasoDTO read(Object key) {
        CasoDTO caso = new CasoDTO();
        try {
            PreparedStatement ps = cnn.getCnn().prepareStatement(SQL_READXRUT);
            ps.setInt(1, Integer.parseInt(key.toString()));

            ResultSet res = ps.executeQuery();

            if (res.next()) {
                
                caso.set(1, x.getId_abogado().getId_abogado());
                caso.set(2, x.getId_abogado().getId_abogado());
                caso.set(3, x.getId_fecha_juzgado().getId_fecha_juzgado());
                caso.set(4, x.getId_demandante().getId_demandante());
                caso.set(5, x.getId_demandado().getId_demandado());
                caso.set(6, x.getId_estado_caso().getId_estado_caso());
                caso.set(7, x.getId_testigo().getId_testigo());
                caso.set(8, x.getId_documentacion().getId_documentacion());
                caso.set(9, x.getId_cese_convivencia().getId_cese_convivencia());
                caso.set(10, x.getFecha_celebracion_matri());
                caso.set(11, x.getObservaciones());
            }

        } catch (SQLException ex) {
            Logger.getLogger(CasoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return caso;
    }
    
}
