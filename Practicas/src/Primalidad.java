
import java.util.Scanner;

public class Primalidad {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un numero: ");
        int numero=leer.nextInt();
        
        if(esPrimo(numero)){
            System.out.println("=============");
            System.out.println("Es numero primo");
            System.out.println("=============");

        }else{
            System.out.println("=============");
            System.out.println("No es numero primo");
            System.out.println("=============");

        }
    }
    static boolean esPrimo(int  numero){
        int contador=0;
        int[] numeros =new int [numero];
        for (int i=0; i<numeros.length; i++){
            numeros[i]=i+1;
        }
        for(int i:numeros){
            if (i==1|| i==numero){
                continue;
            }
            if(numero %i==0){
                contador++;
            }
        }
            
        return contador==0;
    }
}
