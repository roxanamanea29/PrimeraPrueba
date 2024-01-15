
package com.mycompany.pokemon;


public class Charmander extends pokemon implements iFuego{

    public Charmander() {
    }

   
    
    @Override
    protected void atacarPlacaje() {
       System.out.println("Hola, soy Charmander y este es mi ataque Placaje");
    }

    @Override
    protected void atacarAraniazo() {
         System.out.println("Hola, soy Charmander y este es mi ataque Arañazo");
    }
    @Override
    protected void atacarMordisco() {
        System.out.println("Hola, soy Charmander y este es mi ataque Mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Hola, soy Charmander y este es mi ataque PunioFuego");
    }

    @Override
    public void atacarLanzaLamas() {
        System.out.println("Hola, soy Charmander y este es mi ataqueLanza Llamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Hola, soy Charmander y este es mi ataque Ascuas");
    }
    
}
