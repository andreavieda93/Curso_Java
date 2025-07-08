


public class FuncionesSumar {
    public static void main(String[] args) {
        sumar(10,40);
        saludar("Alex Roel",25);
    }
    static void sumar (int a, int b){
        int suma=a+b;
        System.out.println("La suma es: "+suma );
    }
    static void saludar (String nombre, int edad){
        System.out.printf("Hola %s tu edad es %d \n",nombre,edad);
    }
}
