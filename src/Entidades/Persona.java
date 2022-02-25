package Entidades;

import static java.util.Calendar.DATE;
import java.util.Date;

public class Persona {

    private String nombre;
    private double edad;
    private Date fechaNacimiento;
    private Date fecha2;

    public Persona() {
    }

    public Persona(String nombre, double edad, Date fechaNacimiento, Date fecha2) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.fecha2 = fecha2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFecha2() {
        return fecha2;
    }

    public void setFecha2(Date fecha2) {
        this.fecha2 = fecha2;
    }

   }
