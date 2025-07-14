
package persistenciadatos;
import java.io.*;
public class EliminarArchivo1 {
    public static void eliminarArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        archivo.exists();
        archivo.delete();
        System.out.println("Se elimino el archivo");
    }
}
