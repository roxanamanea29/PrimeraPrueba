package poo;


import java.util.Date;
import java.util.GregorianCalendar;

public class uso_persona {

    public static void main(String[] args) {
       
        
        Persona [] lasPersonas =new Persona[2];
        lasPersonas[0]= new Empleado2("Florin manea",5000,2009,02,24 );
        lasPersonas[1]= new Alumno("Roxana Manea", "Informatica");
        for(Persona p:lasPersonas){
            System.out.println(p.dameNombre()+ " "+ p.dameDescripcion());
        }
        
        
    }

    private static class Alumno extends Persona {

        public Alumno(String nom , String car) {
            super(nom);
            carrera =car;
            
        }
         public String dameDescripcion() {
            return "Este alumno está estudiando la carrera de  " + carrera;

        }
        private String carrera;

    }
}

abstract class Persona {

    public Persona(String nom) {
        nombre = nom;

    }

    public String dameNombre() {

        return nombre;
    }

    public abstract String dameDescripcion();

    private String nombre;

}

class Empleado2 extends Persona {

    public Empleado2(String nom, double sue, int agno, int mes, int dia) {

        super(nom);
        sueldo = sue;

        GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);

        altaContrato = calendario.getTime();
        ++IdSiguiente;
        Id = IdSiguiente;

    }

    private double sueldo;
    private Date altaContrato;
    private static int IdSiguiente;
    private int Id;

  

    public double dame_sueldo() {//getter
        return sueldo;
    }

    public Date dameFechaContrato() {//getter
        return altaContrato;

    }

    public void subeSueldo(double porcentaje) {//setter
        double aumento = sueldo * porcentaje / 100;
        sueldo += aumento;
    }

    @Override
    public String dameDescripcion() {

        return "Este empleado tiene un Id = " + Id + " con un sueldo de: " + sueldo;
    }
}
