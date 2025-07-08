
public class ClaseString {
    public static void main(String[] args) {
        String nombre ="Oregoom";
        System.out.println(nombre.charAt(6));    
        System.out.println(nombre.length());
        
        for(int i=0; i< nombre.length();i++){
            System.out.println(nombre.charAt(i));
        }
        
        System.out.println(nombre.substring(0,4));
        //devuelve a minuscula
        System.out.println(nombre.toLowerCase());
        //devuelve a mayuscula
         System.out.println(nombre.toUpperCase());
         // reemplazar caracteres en este caso vamos a quitar los espacios
         nombre= "O r e g o o m";
         System.out.println(nombre.replace(" ",""));
         
         System.out.println("Hola"=="Hola");
         System.out.println("Hola".equals("Hola"));
                  System.out.println("Hola".equals("hola"));

    }
    
}
