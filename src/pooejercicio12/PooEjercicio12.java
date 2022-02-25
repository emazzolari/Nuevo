
package pooejercicio12;

import Entidades.Persona;
import PersonaServicio.PersonaServicio;
import java.util.Scanner;

public class PooEjercicio12 {

    public static void main(String[] args) {
         
        Persona p1 = new Persona();
       PersonaServicio p = new PersonaServicio();
        
        p.Personas(p1);
        p.calcularEdad(p1);
        p.menorQue(p1);
        p.mostrarPersona(p1);
    }
    
}
