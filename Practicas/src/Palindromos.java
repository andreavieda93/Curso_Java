
import java.util.Scanner;


public class Palindromos {
    public static void main(String[] args) {
        //una palabra palindromo es que se puede leer de la misma forma de isquierda a derecha
        Scanner leer= new Scanner (System.in);
        System.out.println("Ingrese una palabra: ");
        String cadena=leer.nextLine();
        
        if(esPalindromo(cadena)){
            System.out.println("=======================");
            System.out.println("Es Palindromo");
            System.out.println("=======================");
        }else{
            System.out.println("=======================");
            System.out.println("No es Palindromo");
            System.out.println("=======================");
        }
    }
    static boolean esPalindromo(String cadena){
        cadena=cadena.replace(" ","");
        cadena=cadena.toLowerCase();
        
        StringBuilder cadenaInvertida= new StringBuilder();
        
        for(int i = cadena.length()-1;i>=0;i--){
            cadenaInvertida.append(cadena.charAt(i));
            
        }
        
        return cadena.equals(cadenaInvertida.toString());
    }
}
