/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios21.clases;

import com.google.common.base.Preconditions;
import java.time.LocalDate;

/**
 *
 * @author alumno
 */
public abstract class Elemento {
    private final String titulo;
    private final int ano;
    private final boolean isEdicionEspecial;
    private Posicion posicion;

    public Elemento(String titulo, int ano, boolean isEdicionEspecial, Posicion posicion) {
        checkString(titulo);
        checkYear(ano);
        Preconditions.checkNotNull(posicion);
        this.titulo = titulo;
        this.ano = ano;
        this.isEdicionEspecial = isEdicionEspecial;
        this.posicion = posicion;
    }
    
    protected static void checkString(String s) {
        if (s == null || s.isBlank()) {
            throw new IllegalArgumentException("String no valida.");
        }
    }     
       
    
    private static void checkYear(int n) {
        if (LocalDate.now().getYear() - n < 0) {
            throw new IllegalArgumentException("el año de compra no puede ser posterior al actual.");
        }
    }   

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    public boolean isIsEdicionEspecial() {
        return isEdicionEspecial;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        Preconditions.checkNotNull(posicion);;
        this.posicion = posicion;
    }
    
    
}
