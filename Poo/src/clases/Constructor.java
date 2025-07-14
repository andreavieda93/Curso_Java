
package clases;


public class Constructor {
     public String nombre;
    public int edad;
    
    public Constructor(){
        System.out.println("Construyendo el objeto");
    }

   public  void mostrarDatos(){//metodos
        System.out.println("Nombre: "+ nombre);
        
        System.out.println("Edad: "+ edad);
        
    }
}
