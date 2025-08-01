
public class GenerarPassword {
    public static void main(String[] args) {
        System.out.println(generaContrasena());
    }
    static String generaContrasena(){
        char[]mayusculas ={'A','B','C','D','E','F','G'};
        char[]minusculas={'a','b','c','d','e','f','g'};
        char[]numeros={'1','2','3','4','5','6','7','8','9','0'};
        
        //unimos los arrays en uno solo
        StringBuilder caracteres=new StringBuilder();
        caracteres.append(mayusculas);
        caracteres.append(minusculas);
        caracteres.append(numeros);
        
        StringBuilder contrasena = new StringBuilder();
        for(int i=0; i<=15; i++){
            int cantidadCaracteres = caracteres.length();
            //generamos numero random
            int numeroRandom=(int)(Math.random()*cantidadCaracteres);
            
            contrasena.append((caracteres.toString()).charAt(numeroRandom));
        }
        return contrasena.toString();
    }
}
