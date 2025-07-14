
package Excepciones;
import java.util.InputMismatchException;
import java.util.Scanner;
public class TestException {
    public static void main(String[] args) {
      
       // int resultado=4/0;// la excepcion dice que el numero entero no se
        //puede dividir entre0 
        Scanner leer = new Scanner(System.in);
        boolean continuarEjecucion=true;
        do{
             //controlar errores
            try{
            System.out.println("Ingrese N1: "); 
            int n1=leer.nextInt();
            System.out.println("Ingrese N2: ");
            int n2 =leer.nextInt();
            
            int resultado = n1/n2;
            System.out.println("Resultado---> "+resultado);
            continuarEjecucion=false;
            //capturar errores e imprimir una excepción
        }catch (InputMismatchException  e){
            //mandar mensaje sobre supuesto error
            System.err.println("Ocurrio un error: Ingrese solo numeros enteros");
            e.printStackTrace(System.out);
        }catch (ArithmeticException e){
            System.err.println("Error: No se puede dividir entre cero");
        }catch(Exception e){
            e.printStackTrace(System.out);
        }finally{
            System.out.println("Se reviso la división");
        }
        }while(continuarEjecucion);
       
        
    }
    static int dividir (int n, int d) throws OperadorExcepcion{
        if (d==0){
            throw new OperadorExcepcion("Dividir entre cero ");
        }
        return n/d;
    }
}
