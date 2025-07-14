
package test;
import herencia.*;
import java.util.Date;
public class TestHerencia2 {
    public static void main(String[] args) {
        Empleado empleado1=new Empleado(3000,"Andrea");
        System.out.println(empleado1);
        
        Empleado empleado2=new Empleado(4000,"Alexa");
        System.out.println(empleado2);
        
        Empleado empleado3=new Empleado(5000,"Daniela");
        System.out.println(empleado3);
        
        var fecha= new Date();
        Clientes cliente1= new Clientes(fecha,true,"Andres London",'M',28,"Santo Role");
        System.out.println(cliente1);
        
        determinarTipo(cliente1);
        
        //Conversion de objetos Downcasting
        Persona persona1 = new Empleado(3000, "Alex Vieda");
        Empleado empleado4=(Empleado)persona1;
        empleado4.getSueldo();
        System.out.println(empleado4.obtenerDetalle());
        
        //Upcasting
        Persona persona2= empleado4;
        System.out.println(persona2.obtenerDetalle());
        
        //equals
        Persona p1 = new Persona ("Andy",'F',29,"Cusco");
        Persona p2 = new Persona ("Andy",'F',29,"Cusco");
        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        
        if(p1.hashCode()==p2.hashCode()){
            System.out.println("Los objetos son iguales");
        }else{
            System.out.println("Los objetos no son iguales");
        }
    } 
    public static void determinarTipo (Object objeto){
        if(objeto instanceof Empleado){
            System.out.println("Es de tipo empleado");
        }else if(objeto instanceof Clientes){
            System.out.println("Es de tipo Cliente");
        }else if (objeto instanceof Persona){
            System.out.println("Es de tipo persona");  
        }else if (objeto instanceof Object){
            System.out.println("Es de tipo object");
        }
    }
    
}
