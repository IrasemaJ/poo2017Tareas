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
public class Font extends CuadroTexto{
   
    protected double puntos;
    protected String estilo;

    public void setPuntos(double puntos) {
        this.puntos = puntos;
    }

    public void setEstilo(String estilo) {
        try {
            this.estilo = estilo;
            TipoDeEstlio al = new TipoDeEstlio();
            System.out.println("El tipo de tamaño que eligio es: " + 
            TipoDeEstlio.Estilo.valueOf(estilo));
            System.out.println(TipoDeEstlio.Estilo.valueOf(estilo));
        }
        catch(Exception e){            
            Font f = new Font();
            f.tipo();
            System.out.println("Intente de nuevo");
        }
    }

    public double getPuntos() {
        return puntos;
    }

    public String getEstilo() {
        return estilo;
    }

    public Font() {
    }

    public Font(String estilo) {
        this.estilo = estilo;
    }

    public Font(double puntos) {
        this.puntos = puntos;
    }
    
    
    @Override
    public String tipo() {
        System.out.println("////////////////////////////");
        System.out.println("Los valores deben ser introducidos en mayusculas");
        System.out.println("Solo se puede seleccionar CURSIVAS, NEGRITAS, TACHADO y SUBRAYADO");
        return "";
    }
    
    
    
}
