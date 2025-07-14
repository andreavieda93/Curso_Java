
package test;

import enumeraciones.*;
public class TestEnumeraciones {
    public static void main(String[] args) {
        System.out.println(Dias.DOMINGO);
        System.out.println(Dias.LUNES);
        System.out.println("====================");
        System.out.println(Continentes.AFRICA);
        System.out.println(Continentes.AFRICA.getpaises());
        System.out.println("====================");
        System.out.println(Continentes.EUROPA);
        Continentes continente = Continentes.EUROPA;
        System.out.println(continente.getpaises());
    }
}
