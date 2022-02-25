package PersonaServicio;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaServicio {

    Scanner leer = new Scanner(System.in);
   
 public Persona crearPersona() {
        Persona p1 = new Persona();
        return p1;
    }
    public void Personas(Persona p1) {
        
         Date nacimiento = new Date();

        System.out.println("Ingrese el nombre de la persona: ");
        p1.setNombre(leer.next());

        System.out.println("Ingrese el dia");
        nacimiento.setDate(leer.nextInt());

        System.out.println("Ingrese el mes");
        nacimiento.setMonth(leer.nextInt() - 1);

        System.out.println("Ingrese el año");
        nacimiento.setYear(leer.nextInt() - 1900);

        System.out.println("La fecha de nacimiento de " + p1.getNombre() + " es " + nacimiento);

        p1.setFechaNacimiento(nacimiento);
     
       
    }

    public double calcularEdad(Persona p1) {

        Date fechaActual = new Date();
        Date edades = new Date();
        p1.getFechaNacimiento().getTime();
        long fechNaci =  p1.getFechaNacimiento().getTime();//nacimiento.getTime();
      
        fechaActual.getTime();
        long fgechAct = fechaActual.getTime();
       
        long edade = fgechAct - fechNaci;
 
        edades.setTime(edade);
       
        long difAnios = Math.abs(edade);

        long difAni = (difAnios / 31536000);
        double difeani = difAni / 1000;

        p1.setEdad(difeani);
        System.out.println("Tiene " + p1.getEdad() + " años");

        //if (fechaActual.getMonth() <= fechaNacimiento.getMonth()) {
        //  edad--;
        //} else if (fechaNacimiento.getDay() > fechaActual.getDay()) {
        //  edad--;
        //}
        //System.out.println(" tiene " + edad);
        return difeani;
    }

    public void menorQue(Persona p1) {

        System.out.println("COMPARAMOS LA EDAD");
        System.out.println("Ingrese un nuevo dia");
        int dia2 = (leer.nextInt());

        System.out.println("Ingrese un nuevo mes");
        int mes2 = (leer.nextInt());

        System.out.println("Ingrese un nuevo año");
        int anio2 = (leer.nextInt());

        Date fecha2 = new Date(anio2 - 1900, mes2 - 1, dia2);

        System.out.println("La nueva fecha es: " + fecha2);
        System.out.println("La primer fecha es: " +  p1.getFechaNacimiento());
        boolean result = p1.getFechaNacimiento().before(fecha2);
        System.out.println("La nueva fecha es menor?: " + result);

        p1.setFecha2(fecha2);
    }

    public void mostrarPersona(Persona p1) {
        System.out.println("El nombre es: " + p1.getNombre());
        System.out.println("La fecha de nacimiento es: " +  p1.getFechaNacimiento());
        System.out.println("La edad es: " +p1.getEdad() );
        
        System.out.println("La fecha de nacimiento del metodo anterior es: "+p1.getFecha2());
    }
}
//no puedo
