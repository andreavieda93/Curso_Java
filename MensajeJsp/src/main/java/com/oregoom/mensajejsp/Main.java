package com.oregoom.mensajejsp;

import java.sql.SQLException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //Conexion.getConexion();
        //System.out.println("Conexion exitosa");
        //creamos un objeto de la calse mensaje dao
        MensajeDao mensajeDao = new MensajeDao();

        /* //creamos objeto de tipo mensaje
       Mensaje msm=new Mensaje("Hola desde Main","Main");
       //creamos variable entero
       int registro= mensajeDao.Insertar(msm);
        System.out.println("Se inserto "+ registro +" registro");
       //creamos lista
       
       //modificar
       Mensaje msn=new Mensaje(1,"Hola desde Java Web","Java Web");
       int registro1 = mensajeDao.Editar(msn);
       System.out.println("Se ha editado" + registro1 + "registro");
         */
        // eliminar
        Mensaje msm = new Mensaje(6);//eliminamos el registro 6
        int registro = mensajeDao.Eliminar(msm);
        System.out.println("Se elimino un registro"+registro+"registro");
        //devuelve los registros
        List<Mensaje> mensajes = mensajeDao.seleccionar();

        for (Mensaje mensaje : mensajes) {
            System.out.println(mensaje);
        }
    }
}
