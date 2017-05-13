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
    
    //extends solo de una implements de muchas
    protected String etiqueta;

    public Buttons(String etiqueta) {
        this.etiqueta = etiqueta;
    }
    
    public void setAction(){
        Action a = new Action(etiqueta);
    }
    
    public String getAction(){
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
        Buttons b = new Buttons(etiqueta);
        b.setAction();
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
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

    @Override
    public String tipo() {
        return "";
    }
    
    
}
