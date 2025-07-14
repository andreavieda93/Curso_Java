
package com.oregoom.mensajes;
import java.sql.*;
import static com.oregoom.mensajes.ListarRegistros.listaRegistros;
public class InsertarRegistros {
    public static void main(String[] args) throws SQLException{
        listaRegistros();
        System.out.println("==============================");
        insertaRegistros("Hola desde Java", "Roel");
        System.out.println("==============================");
        listaRegistros();
    }
    static void insertaRegistros(String mensaje, String autor) throws SQLException{
        Connection conectar= DriverManager.getConnection(
                "jdbc:mysql://localhost/mensajes_db?serverTimezone=UTC",
                "root",
                "123456"
        );
        System.out.println("Conexion Exitosa");
        
        //crear variable para contener la consulta
        
        String sql="INSERT INTO mensajes(mensaje,autor,fecha) VALUES(?,?, CURRENT_TIME())";
                                                 
        // INTERFAZ
        PreparedStatement ps= conectar.prepareStatement(sql);
        //ejecutar sql con otra interfaz
        ps.setString(1, mensaje);
        ps.setString(2, autor);
        ps.executeUpdate();
        ps.close();
        conectar.close();
        
    } 
      
    
}
