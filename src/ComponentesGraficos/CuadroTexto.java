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
public class CuadroTexto implements API{

    @Override
    public void exececuteAP() {
        
    }
    @Override
    public String toString() {
        return "Boton";
    }
    
    protected String titulo;
    protected String texto;
    protected String contraseña;
    protected String alineacion;
    protected String multilinea;
    protected Font font;

    public String getAlineacion() {
        return alineacion;
    }

    public String getMultilinea() {
        return multilinea;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getTexto() {
        return texto;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setAlineacion(String alineacion) {
        this.alineacion = alineacion;
    }

    public void setMultilinea(String multilinea) {
        this.multilinea = multilinea;
    }
    

    public CuadroTexto(String titulo, String texto, String contraseña) {
        if (contraseña.equals("SI")) {
            this.titulo = titulo;
            this.texto = texto;
            this.contraseña = "xxxx";
        }
        else {
            this.titulo = titulo;
            this.texto = texto;
        }  
    }
    
    public void alineacion(String tipo){
        System.out.println("Eligiendo alineacion " + tipo);
        this.alineacion = tipo;
    }
    
    public void setfont(Font font){
        this.font = font;
    } 
    
}
