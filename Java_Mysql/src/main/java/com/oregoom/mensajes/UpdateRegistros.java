
package com.oregoom.mensajes;
import static com.oregoom.mensajes.ListarRegistros.listaRegistros;
import java.sql.*;

public class UpdateRegistros {
    public static void main(String[] args) throws SQLException {
        listaRegistros();
        System.out.println("==============================");
        editarRegistros("Hola desde Java", "Java",4);
        System.out.println("==============================");
        listaRegistros();
    }
    static void editarRegistros(String mensaje, String autor,int id) throws SQLException{
        Connection conectar= DriverManager.getConnection(
                "jdbc:mysql://localhost/mensajes_db?serverTimezone=UTC",
                "root",
                "123456"
        );
        System.out.println("Conexion Exitosa");
        
        //crear variable para contener la consulta
        
        String sql= "UPDATE mensajes SET mensaje=?, autor=?  WHERE id_mensaje=?"; 
        PreparedStatement ps= conectar.prepareStatement(sql);
        //ejecutar sql con otra interfaz
        ps.setString(1, mensaje);
        ps.setString(2, autor);
        ps.setInt(3,id );
        ps.executeUpdate();
        
        ps.close();
        conectar.close();
        
    } 
    
}
