/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios21.clases;

/**
 *
 * @author alumno
 */
public enum Genero {
    Pop, Rock, Dance, RandB, Tradicional, House, Otro;
    
    public static Genero of(int n) {
        if (n < 0 || n > Genero.values().length) {
            throw new IllegalArgumentException("Inserte un número entre 1 y " + Genero.values().length);
        } else {
            return Genero.values()[n - 1];
        }
    }
    
}
