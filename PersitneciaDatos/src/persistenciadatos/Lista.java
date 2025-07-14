
package persistenciadatos;
import java.util.*;

public class Lista {

    
    public static void main(String[] args) {
        List lista1= new ArrayList();
        
        lista1.add(1);
        lista1.add("Alex Roel");
        lista1.add(25);
        lista1.add(1.67);
        lista1.add(true);
        
        lista1.forEach(dato ->{
            System.out.println(dato);
        });
        System.out.println(lista1.get(1));
        
        lista1.remove(0);
        System.out.println(lista1);
        
        lista1.set(0,"Alex Roel");
        System.out.println(lista1);
        
        
        //elimina todos los elementos de una lista
        lista1.clear();
        System.out.println(lista1);
    }
    
}
