


public class SobrecargaFunciones {
     public static void main(String[] args) {
         System.out.println(sumar(4.5,5.0));
         
    }
    static int  sumar(int a, int b){
        return a+b;
    
    }
    static double sumar(double a , double b){
        return a +b ;
    }//sorecaraga se pueden crear funciones con el mismo nombre
    //que retornen diferentes tipos de datos en este caso 
    //la primera es enteros y la segunda es decimales
}
