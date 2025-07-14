
package peliculas;
import java.util.ArrayList;
public class Coleccionador {

    
    public static void main(String[] args) {
        //coleccionador de datos
     ArrayList<String> meses = new ArrayList<>();
     meses.add("Enero");
     meses.add("Febrero");
     meses.add("Marzo");
        System.out.println(meses);
        
        for (String dato: meses){
            System.out.println(dato);
        }
    }
    
}
