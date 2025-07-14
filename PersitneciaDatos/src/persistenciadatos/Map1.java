
package persistenciadatos;
import java.util.*;

public class Map1 {
    public static void main(String[] args) {
        
      Map numeros= new HashMap();  
      numeros.put(1,"Uno");
      numeros.put(2,"Dos");
      numeros.put(3,"tres");
      numeros.put(4,"cuatro");
      numeros.put(5,"Cinco");
      
        System.out.println(numeros);
        System.out.println(numeros.get(5));
        
        for(Object clave: numeros.keySet()){
            System.out.println(clave+""+numeros.get(clave));
        }
            //para eliminar un solo elemento  puedo utilizar las claves
            
            numeros.remove(5);
            System.out.println(numeros);
            
            //para eliminar todo puedo utilizar el clear
            System.out.println(numeros);
        
    }
    
}
