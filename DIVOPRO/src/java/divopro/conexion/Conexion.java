
package divopro.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Robinson
 */
public class Conexion {
    
        private Connection cnn;
    private static Conexion instance;

    private Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver"); //driver
            cnn = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-382KRNB:1433;databaseName=DIVOPRO", "sa", "1234567890");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Connection getCnn() {
        return cnn;
    }

    public static Conexion saberEstado() {

        if (instance == null) {
            instance = new Conexion();
        }

        return instance;

    }

    public void cerrarConexion() {
        instance = null;
    }
    
}
