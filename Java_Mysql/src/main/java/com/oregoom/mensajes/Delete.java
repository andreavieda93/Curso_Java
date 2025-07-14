
package com.oregoom.mensajes;
import static com.oregoom.mensajes.ListarRegistros.listaRegistros;
import java.sql.*;

public class Delete {
    public static void main(String[] args) throws SQLException {
        listaRegistros();
        System.out.println("==============================");
        eliminarRegistros("Hola desde Java", "Java",4);
        System.out.println("==============================");
        listaRegistros();
    }
     static void eliminarRegistros(String mensaje, String autor,int id) throws SQLException{
        Connection conectar= DriverManager.getConnection(
                "jdbc:mysql://localhost/mensajes_db?serverTimezone=UTC",
                "root",
                "123456"
        );
        System.out.println("Conexion Exitosa");
        
        //crear variable para contener la consulta
        
        String sql= "DELETE FROM mensajes  WHERE id_mensaje=?"; 
        PreparedStatement ps= conectar.prepareStatement(sql);
        //ejecutar sql con otra interfaz
        ps.setInt(1,id );
        ps.executeUpdate();
        
        ps.close();
        conectar.close();
        
    } 
}
