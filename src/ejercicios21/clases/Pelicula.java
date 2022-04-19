/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios21.clases;

import com.google.common.base.Preconditions;

/**
 *
 * @author alumno
 */
public class Pelicula extends Elemento{
    private final String paisOrigen;
    private final String actorPrincipal;
    private final int duracion;

    public Pelicula(String paisOrigen, String actorPrincipal, int duracion, String titulo, int ano, boolean isEdicionEspecial, Posicion posicion) {
        super(titulo, ano, isEdicionEspecial, posicion);
        checkString(paisOrigen);
        checkString(actorPrincipal);
        checkGreaterThanZero(duracion);        
        this.paisOrigen = paisOrigen;
        this.actorPrincipal = actorPrincipal;
        this.duracion = duracion;
    }
    
    private static void checkGreaterThanZero(Number n) {
        Preconditions.checkArgument(n.doubleValue() > 0);
    } 

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public int getDuracion() {
        return duracion;
    }
    
    @Override
    public String toString() {
        return super.getTitulo() + '-' + super.getAno() + '-' + actorPrincipal + '-' + super.getPosicion();
    }    
    
    
    
}
