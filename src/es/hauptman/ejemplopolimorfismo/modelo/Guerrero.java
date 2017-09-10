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
public class Guerrero extends Personaje {

    public Guerrero() {
        super(30, 5, 2, 0, null);
    }
    
     @Override
    public void habilidad() {
        setAtaque(getAtaque() * 2);
    }

    @Override
    public int atacar() {
        return (int) (((Math.random() * 5) + 6) * getAtaque());
    }

    @Override
    public int defender() {
                return (int) (((Math.random() * 5) + 1) * getDefensa());
    }
    
}
