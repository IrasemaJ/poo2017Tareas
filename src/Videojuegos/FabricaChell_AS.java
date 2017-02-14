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
public class FabricaChell_AS {
    
    Estrategia est;
    Aventura ave;
    Aprendizaje apr;
    
    public Estrategia concepcionEstrategia(String heroe, String villano, int fuerzaVillano, int fuerzaHeroe){
        
        System.out.println("Creacion videojuego de Estrategia");
        System.out.println("Creando heroe... Nombre:" + est.getHeroe());
        System.out.println("Creando villano... Nombre:" + est.getVillano());
        System.out.println("Fuerza de Heroe:" + est.getFuerzaHeroe());
        System.out.println("Fuerza de Villano" + est.getFuerzaVillano());
        
        est.setHeroe(heroe);
        est.setVillano(villano);
        est.setFuerzaVillano(fuerzaVillano);
        est.setFuerzaHeroe(fuerzaHeroe);
        return est;
    }
    
    public Aventura concepcionAventura(String nomJugador, String paisaje, int numNivel, String Reto){
        
        System.out.println("Creacion videojuego de Aventura");
        System.out.println("Nombre de jugador:" + ave.getNomJugador());
        System.out.println("Paisaje:" + ave.getPaisaje());
        System.out.println("Numero de Niveles:" + ave.getNumNivel());
        System.out.println("Reto de videojuego:" + ave.getReto());
        
        ave.setNomJugador(nomJugador);
        ave.setPaisaje(paisaje);
        ave.setNumNivel(numNivel);
        ave.setReto(Reto);
        return ave;
    }
    
    public Aprendizaje concepcionAprendizaje(String concepto, String narrador, String problema, String solucion){
        
        System.out.println("Creacion de videojuego Aprendizaje");
        System.out.println("Concepto del videojuego:" + apr.getConcepto());
        System.out.println("Nombre de narrador:" + apr.getNarrador());
        System.out.println("Creando problema:" + apr.getProblema());
        System.out.println("Creando solucion:" + apr.getSolucion());
        
        apr.setConcepto(concepto);
        apr.setNarrador(narrador);
        apr.setProblema(problema);
        apr.setSolucion(solucion);
        return apr;
    }
    
    public void diseño(){
        
        System.out.println("Creando diseño y mejorando graficos");
    }
    
    public void planificacion(){
        
        System.out.println("Creando niveles...");
    }
    
    public void produccion(int estcodigo, int avecodigo, int aprcodigo){
        
        est.setCodigo(estcodigo);
        ave.setCodigo(avecodigo);
        apr.setCodigo(aprcodigo);
    }
    
    public void acceptacion(){
        
        System.out.println("Aceptando creacion de videojuegos...");
    }
    
    public static void main(String[] args) {
        
        FabricaChell_AS crear = new FabricaChell_AS();
        crear.concepcionAprendizaje("Matematicas", "Lilo", "¿Cuanto es?", "Sumas");
        crear.concepcionAventura("Oliver", "Ciudad", 20, "Laberinto");
        crear.concepcionEstrategia("Strange", "Mordo", 5, 6);
        crear.planificacion();
        crear.diseño();
        crear.produccion(1, 2, 3);
        crear.acceptacion();
    }
    
}
