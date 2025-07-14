
package com.oregoom.mensajes;
import java.sql.*;
public class ListarRegistros {

    public static void main(String[] args)throws SQLException {
     //llamamos la funcion
     listaRegistros();
    }
    //creamos una funcion
    static void listaRegistros() throws SQLException{
        Connection conectar= DriverManager.getConnection(
                "jdbc:mysql://localhost/mensajes_db?serverTimezone=UTC",
                "root",
                "123456"
        );
        System.out.println("Conexion Exitosa");
        
        //crear variable para contener la consulta
        
        String sql="SELECT * FROM MENSAJES";
        // INTERFAZ
        PreparedStatement ps= conectar.prepareStatement(sql);
        //ejecutar sql con otra interfaz
        ResultSet rs= ps.executeQuery();
        //recuperar el registro
        
        while(rs.next()){
            int id=rs.getInt("id_mensaje");
            //recuperar mensaje
            String mensaje=rs.getString("mensaje");
            String autor=rs.getString("autor");
            String fecha=rs.getString("fecha");
            
            //mostrar en panatalla
            System.out.printf("%d %s %s %s \n",id,mensaje,autor,fecha);
        }
        rs.close();
        ps.close();
        conectar.close();
        
    } 
    
}
