package model;

import controller.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CarneDAO {
    private CConection cConnection;

    public CarneDAO() {
        this.cConnection = new CConection(); 
    }

    public List<String> obtenerTiposCarne() {
        List<String> tiposCarne = new ArrayList<>();
        Connection conexion = cConnection.estableceConexion();

        try (Statement statement = conexion.createStatement();
             ResultSet resultSet =  statement.executeQuery("SELECT tipo FROM tipos_carne")) {

            while (resultSet.next()) {
                tiposCarne.add(resultSet.getString("tipo")); 
            }
        } catch (Exception e) {
            System.err.println("Error al obtener los tipos de carne: " + e.getMessage());
        }

        return tiposCarne;
    }
    
    public boolean guardarCliente(Cliente cliente) {
        String sql = "INSERT INTO clientes (nombre, telefono, direccion, nota) VALUES (?, ?, ?, ?)";
        try (Connection con = conexion.estableceConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getTelefono());
            ps.setString(3, cliente.getDireccion());
            ps.setString(4, cliente.getNota());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
