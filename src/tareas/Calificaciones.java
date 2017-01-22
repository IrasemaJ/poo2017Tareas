/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareas;

/**
 *
 * @author Itzel
 */
public class Calificaciones {
    
    private int [] calificaciones;
    private int contador;
    
    public void inicializArreglo(int size) {
        
        calificaciones = new int[size];
        contador=0;
    }
    
    public void agregarCali(int num) {
        
        calificaciones[contador] = num;
        contador = contador + 1;
    }
    
    public void imprimirArreglo() {
        for (int i = 0; i < contador; i++) {
            
            System.out.println("Su Calificacion es: " + calificaciones[i]);
            
        }
    }
    
}
