
package persistenciadatos;
import java.util.*;

public class ConjuntosDatos {
    public static void main(String[] args) {
        //para crear un set podemos crearlo con hashset
        
        HashSet dias=new HashSet();
        //no permite almacenar un mismo dato dos veces
        dias.add("Lunes");
        dias.add("Martes");
        dias.add("Miercoles");
        dias.add("Jueves");
        dias.add("Viernes");
        dias.add("Viernes");
        
        //pasamos a iterar
        for(Object dia : dias){
            System.out.println(dia);
            
        }
        
        dias.remove("Lunes");
        System.out.println("dias");
        
        //eliminar todos los elementos
        dias.clear();
        System.out.println(dias);
    }
   
}
