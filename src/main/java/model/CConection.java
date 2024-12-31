package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class CConection {
    
    private Connection conectar;
    private String id_actual; 

    String usuario = "root";
    String contrasenia = "220204";
    String bd = "gestion_pedidos"; 
    String ip = "localhost";
    String puerto = "3306";

    String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd;

    public Connection estableceConexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena, usuario, contrasenia);
            JOptionPane.showMessageDialog(null, "Se conectó correctamente a la base de datos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas en la conexión: " + e.toString());
        }
        return conectar;
    }
    
    public Statement createStatement() {
        try {
            if (conectar != null) {
                return conectar.createStatement();
            } else {
                throw new SQLException("Conexión no establecida.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Problemas creando el Statement: " + e.toString());
            return null;
        }
    }
}