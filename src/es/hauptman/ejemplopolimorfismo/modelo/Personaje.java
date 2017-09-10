package es.hauptman.ejemplopolimorfismo.modelo;

import java.util.ArrayList;

/**
 *
 * @author mundakamacbook
 */
public abstract class Personaje implements Combate {
    
    private int vida;
    private int ataque;
    private int defensa;
    private int monedas;
    private ArrayList<Objeto> inventario;

    public Personaje(int vida, int ataque, int defensa, int monedas, ArrayList<Objeto> inventario) {
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.monedas = monedas;
        this.inventario = inventario;
    }
    
    
    
    public void comprarObjeto(Objeto objeto) {
        monedas -= objeto.getPrecio();
        add(objeto);
    }

    private void add(Objeto objeto) {
        getInventario().add(objeto);
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getMonedas() {
        return monedas;
    }

    public void setMonedas(int monedas) {
        this.monedas = monedas;
    }

    public ArrayList<Objeto> getInventario() {
        if(inventario == null) {
            inventario = new ArrayList<>();
        }    
        return inventario;
    }

    public void setInventario(ArrayList<Objeto> inventario) {
        this.inventario = inventario;
    }
    
    abstract void habilidad();
}
