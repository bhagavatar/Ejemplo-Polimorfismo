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
public class Enano extends Personaje{

    public Enano() {
        super(70, 3, 6, 0, null);
    }
    
    @Override
    public void habilidad() {
        setDefensa((int) (getDefensa() * 1.5));
    }

    @Override
    public int defender() {
        return (int) (((Math.random() * 5) + 6) * getDefensa());
    }

    @Override
    public int atacar() {
                return (int) (((Math.random() * 5) + 1) * getAtaque());
    }
    
}
