
package Excepciones;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ExcepcionVerificada {
    public static void main(String[] args) {
        readFile1();
    }
    public static void readFile1(){
            //lanzar una excepcion en el metodo
            File file= new File("C://file.txt");
        try {
            FileReader fr = new FileReader(file);
        } catch (IOException ex) {
            Logger.getLogger(ExcepcionVerificada.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
