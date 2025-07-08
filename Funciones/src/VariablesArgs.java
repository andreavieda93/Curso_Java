


public class VariablesArgs {
    public static void main(String[] args) {
        System.out.println(sumar(4,8,9,6));
    }
    static int sumar(int... numeros){
        int suma=0;
        for(int num: numeros)
        {
            suma += num;
        }
        return suma;
    }
}
