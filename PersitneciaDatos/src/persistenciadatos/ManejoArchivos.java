

package persistenciadatos;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManejoArchivos {
    public static void crearArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida= new PrintWriter(archivo);
            salida.close();
            System.out.println("Se creo el archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }
        
public static void escribirArchivo(String nombreArchivo,String contenido){
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida= new PrintWriter( new FileWriter(archivo, true));
            salida.println(contenido);
            salida.close();
            System.out.println("Se escribio en el archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
