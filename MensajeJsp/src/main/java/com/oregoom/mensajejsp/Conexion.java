
package com.oregoom.mensajejsp;
import java.sql.*;
public class Conexion {
    
    private static final String URS="jdbc:mysql://localhost/mensajes_db?serverTimezone=UTC";
    private static final String USER="root";
    private static final String PASS="123456";
    
    public static Connection getConexion() throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URS,USER,PASS);
    }

    
    public static void cerrar(ResultSet rs) throws SQLException {
        rs.close();
     
    }
    public static void cerrar(PreparedStatement ps) throws SQLException{
        ps.close();
     
    }
    public static void cerrar(Connection  conn) throws SQLException{
        conn.close();
     
    }

   
}
