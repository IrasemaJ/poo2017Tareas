/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Videojuegos;

/**
 *
 * @author Itzel
 */
public class Estrategia {
    
    private String heroe;
    private String villano;
    private int fuerzaVillano;
    private int fuerzaHeroe;
    private int estcodigo;
    

    public String getHeroe() {
        return heroe;
    }

    public String getVillano() {
        return villano;
    }

    public int getFuerzaVillano() {
        return fuerzaVillano;
    }

    public int getFuerzaHeroe() {
        return fuerzaHeroe;
    }

    public int getCodigo() {
        return estcodigo;
    }

    public void setHeroe(String heroe) {
        this.heroe = heroe;
    }

    public void setVillano(String villano) {
        this.villano = villano;
    }

    public void setFuerzaVillano(int fuerzaVillano) {
        this.fuerzaVillano = fuerzaVillano;
    }

    public void setFuerzaHeroe(int fuerzaHeroe) {
        this.fuerzaHeroe = fuerzaHeroe;
    }

    public void setCodigo(int estcodigo) {
        this.estcodigo = estcodigo;
    }
    
}
