
package test;
import interfaces.*;

public class TestInterface {
    public static void main(String[] args) {
        BaseDatos datos= new ImplementMySQL();
        datos.insertar();
        datos.actualizar();
    }
    
}
