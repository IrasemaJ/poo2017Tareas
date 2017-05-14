/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComponentesGraficos;

import static ComponentesGraficos.TipoDeEstlio.Alineacion.JUSTIFICADO;

/**
 *
 * @author Itzel
 */
public class Test {
    public static void main(String[] args) {
        
        /////// Botones //////////////
        Buttons b = new Buttons("Click");
        b.setAction();
        b.setAlto(10.0);
        b.setAncho(10.0);
        System.out.println("El tamaño del boton es de: " + b.getAlto() + " por: " + b.getAncho());
        System.out.println("La acccion del es: " + b.getAction());
        System.out.println("///////////////////////");
        
        /////// Cuadro Texto //////////
        CuadroTexto cu = new CuadroTexto();
        cu.setAlineacion("DERECHA");
        cu.setLineas("MULTILINEA");
        cu.setfont("CURSIVAS");
        cu.setContraseña();
        cu.setPuntos(12.0);
        cu.setTitulo("HOLA");
        cu.setPuntos(10.0);
        cu.setTexto("Como estas?");
        
        API [] arreglo = new API[3];
        arreglo[0] = cu;
        arreglo[1] = b;
        
        for (int i = 0; i < 2; i++) {
            System.out.println("///////////////////");
            System.out.println("Es de Tipo: " + arreglo[i].toString());
        }
        
    }
 
}
