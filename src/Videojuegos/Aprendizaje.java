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
public class Aprendizaje {
   
    private String concepto;
    private String narrador;
    private String problema;
    private String solucion;
    private int aprcodigo;

    public String getConcepto() {
        return concepto;
    }

    public String getNarrador() {
        return narrador;
    }

    public String getProblema() {
        return problema;
    }

    public String getSolucion() {
        return solucion;
    }

    public int getCodigo() {
        return aprcodigo;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public void setNarrador(String narrador) {
        this.narrador = narrador;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public void setSolucion(String solucion) {
        this.solucion = solucion;
    }

    public void setCodigo(int aprcodigo) {
        this.aprcodigo = aprcodigo;
    }
    
}
