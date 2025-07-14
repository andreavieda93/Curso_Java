
import clases.Persona;
import clases.Calculadora;
import clases.Constructor;
import clases.SobreCarga;
import clases.Rectangulo;

public class Main {

 
    public static void main(String[] args) {
        // creamos objeto de la clase persona
        
        Persona persona1 =new Persona();
        persona1.nombre="Andrea";
        persona1.edad=31;
        persona1.mostrarDatos();
        System.out.println("========================");

        Persona persona2 =new Persona();
        persona2.nombre="Dani";
        persona2.edad=25;
        persona2.mostrarDatos();
        
        System.out.println("========================");
        System.out.println(Calculadora.PI);
        System.out.println("========================");
        System.out.println(Calculadora.sumar(40,50));

        System.out.println("========================");
        Constructor  persona3  = new Constructor();
       
        //clase sobrecarga
        System.out.println("========================");
        SobreCarga  calcular1 = new SobreCarga();
        System.out.println(calcular1.resta(50, 30));
        
        System.out.println("========================");
        Rectangulo r1 = new Rectangulo();
        System.out.println("========================");
        System.out.println(r1.area(8,4));
        System.out.println("========================");
        System.out.println(r1);

        
       
    }
    
}
