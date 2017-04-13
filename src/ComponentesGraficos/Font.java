/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComponentesGraficos;

/**
 *
 * @author Itzel
 */
public class Font {
   
    protected int tamaño;
    protected String tipo;
    protected String estilo;

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public int getTamaño() {
        return tamaño;
    }

    public String getTipo() {
        return tipo;
    }

    public String getEstilo() {
        return estilo;
    }

    public Font(int tamaño, String tipo, String estilo) {
        this.tamaño = tamaño;
        this.tipo = tipo;
        this.estilo = estilo;
    }
    
    
    
    
}
