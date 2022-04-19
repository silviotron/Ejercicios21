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
public class Disco extends Elemento{
    private final String discografica;
    private final String grupo;
    private final Genero genero;

    public Disco(String discografica, String grupo, Genero genero, String titulo, int ano, boolean isEdicionEspecial, Posicion posicion) {
        super(titulo, ano, isEdicionEspecial, posicion);
        Preconditions.checkNotNull(genero);
        checkString(grupo);
        checkString(discografica);
        this.discografica = discografica;
        this.grupo = grupo;
        this.genero = genero;
    }

    public String getDiscografica() {
        return discografica;
    }

    public String getGrupo() {
        return grupo;
    }

    public Genero getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return super.getTitulo() + '-' + discografica + '-' + grupo + '-' + genero + '-' + super.getPosicion();
    }
    
    
    
}
