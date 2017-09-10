/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.hauptman.ejemplopolimorfismo.modelo;

/**
 *
 * @author mundakamacbook
 */
public class Lucha {
    public static void main(String[] args) {
        Personaje guerrero = new Guerrero();
        Combate enano = new Enano();
        luchad((Enano) enano, guerrero);
        System.err.println("Enano: " + ((Enano)enano).getVida());
        System.out.println("Guerrero: " + guerrero.getVida());

    }

    private static void luchad(Personaje enano, Personaje guerrero) {
        do {            
           lance(enano, guerrero);//Que es este metodo lance?
           lance(guerrero, enano);
        } while (enano.getVida() > 0 && guerrero.getVida() > 0);
    }

    private static void lance(Personaje enano, Personaje guerrero) {
        int ataqueEnano = enano.getAtaque();
        int defensaGuerrero = guerrero.getDefensa();
        if(ataqueEnano > defensaGuerrero) {
            guerrero.setVida(guerrero.getVida() - ataqueEnano + defensaGuerrero);
        }
    }
}
