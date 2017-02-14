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
public class Aventura {
  
    private String nomJugador;
    private String paisaje;
    private int numNivel;
    private String reto;
    private int avecodigo;

    public String getNomJugador() {
        return nomJugador;
    }

    public String getPaisaje() {
        return paisaje;
    }

    public int getNumNivel() {
        return numNivel;
    }

    public String getReto() {
        return reto;
    }

    public int getCodigo() {
        return avecodigo;
    }

    public void setNomJugador(String nomJugador) {
        this.nomJugador = nomJugador;
    }

    public void setPaisaje(String paisaje) {
        this.paisaje = paisaje;
    }

    public void setNumNivel(int numNivel) {
        this.numNivel = numNivel;
    }

    public void setReto(String reto) {
        this.reto = reto;
    }

    public void setCodigo(int avecodigo) {
        this.avecodigo = avecodigo;
    }
    
}
