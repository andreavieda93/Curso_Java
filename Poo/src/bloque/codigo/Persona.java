
package bloque.codigo;


public class Persona {
    private final int idPersona;
    private static int contadorPersona;
    
    static{
        System.out.println("Ejecucion bloque estatico");
        ++Persona.contadorPersona;
        
    }
    {
        System.out.println("Ejecucion bloque no estatico");
        this.idPersona=Persona.contadorPersona++;
    }

    public Persona() {
        System.out.println("Ejecucion del constructor");
    }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
   
}
