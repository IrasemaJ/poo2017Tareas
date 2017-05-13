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
public class CuadroTexto extends Componentes implements API {

    @Override
    public void exececuteAP() {
        
    }
    @Override
    public String toString() {
        return "Cuadro de Texto";
    }
    
    protected String titulo;
    protected String texto;
    protected String contraseña;
    protected String alineacion; //enumerador 
    protected String lineas;
    
    ///CONSTRUCTOR//////
    public CuadroTexto() {
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

    public String getAlineacion() {
        return alineacion;
    }

    public String getLineas() {
        return lineas;
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

    public void setContraseña() {
            
        this.contraseña = "XXXX";
        System.out.println("La contraseña es XXXX");
    }

    public void setAlineacion(String alineacion) {
        try {
            this.alineacion = alineacion;
            TipoDeEstlio al = new TipoDeEstlio();
            System.out.println("El tipo de alineacion que eligio es: " + 
            TipoDeEstlio.Alineacion.valueOf(alineacion));
            //System.out.println(TipoDeEstlio.Alineacion.valueOf(alineacion));
        }
        catch(Exception e){            
            CuadroTexto cu = new CuadroTexto();
            cu.tipo();
            //System.out.println("Intente de nuevo");
        }
        
    }

    public void setLineas(String lineas) {
        try {
            this.lineas = lineas;
            TipoDeEstlio al = new TipoDeEstlio();
            System.out.println("El tipo de tamaño que eligio es: " + 
            TipoDeEstlio.Tamaño.valueOf(lineas));
            //System.out.println(TipoDeEstlio.Tamaño.valueOf(lineas));
            if (lineas == "MULTILINEA") {
                Scroll s = new Scroll();
                s.addScroll();
            }
        }
        catch(Exception e){            
            CuadroTexto cu = new CuadroTexto();
            cu.tipo();
            //System.out.println("Intente de nuevo");
        }
    }
    
    public void setfont(String estilo){
        Font f = new Font(estilo);
        f.setEstilo(estilo);
    } 

    public void setPuntos(double puntos) {
        Font f = new Font(puntos);
    }
    
    public void getPuntos(double puntos) {
        Font f = new Font(puntos);
        f.getPuntos();
    }
    
    @Override
    public String tipo() {
        System.out.println("////////////////////////////");
        System.out.println("Los valores deben ser introducidos en mayusculas");
        System.out.println("Solo se puede ultizar la alineacion: ");
        System.out.println("Centrada, Justificada, Izquierda o Derecha");
        System.out.println("El tamaño solo puede ser de UnaLinea o multilineas");
        return "";
    }
    
    
}
