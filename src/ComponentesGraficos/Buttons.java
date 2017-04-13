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
public class Buttons extends Componentes implements API{
    
    protected String etiqueta;
    protected Action action;

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public Buttons(String etiqueta) {
        this.etiqueta = etiqueta;
    }
    
    public void addAction(Action accion){
        this.action = accion;
        
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public Action getAction() {
        return action;
    }

    public double getAlto() {
        return alto;
    }

    public double getAncho() {
        return ancho;
    }
    
    @Override
    public void exececuteAP() {
        
    }
    
    @Override
    public String toString() {
        return "Boton";
    }
}
