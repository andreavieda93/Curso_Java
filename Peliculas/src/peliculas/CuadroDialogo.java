
package peliculas;

import javax.swing.JOptionPane;

public class CuadroDialogo {
    public static void main(String[] args) {
        //crea cuadro de dialogo
        
      String valor= JOptionPane.showInputDialog(
              null,
              "Ingrese Texto",
              "Entrada",
              3);
      JOptionPane.showMessageDialog(
              null,
              valor,
              "Mi mensaje",
              JOptionPane.ERROR_MESSAGE);  
    }
    
}
