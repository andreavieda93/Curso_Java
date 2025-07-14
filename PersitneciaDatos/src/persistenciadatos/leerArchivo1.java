
package persistenciadatos;

import java.io.*;


public class leerArchivo1 {
        
public static void leerArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try {
            BufferedReader entrada= new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();
            while (lectura!=null){
                System.out.println(lectura);
                lectura= entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
   }
}
