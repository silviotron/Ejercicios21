/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios21.clases;

import com.google.common.base.Preconditions;
import java.util.Objects;

/**
 *
 * @author alumno
 */
public class Posicion implements Comparable<Posicion>{
    private String pasillo;
    private int ubicacion;
    private int altura;

    public Posicion(String pasillo, int ubicacion, int altura) {
        checkString(pasillo);
        checkGreaterThanZero(ubicacion);
        checkGreaterThanZero(altura);
        this.pasillo = pasillo;
        this.ubicacion = ubicacion;
        this.altura = altura;
    }
    
    
    private static void checkString(String s) {
        if (s == null || s.isBlank()) {
            throw new IllegalArgumentException("String no valida.");
        }
    }   
    
    private static void checkGreaterThanZero(Number n) {
        Preconditions.checkArgument(n.doubleValue() > 0);
    }     

    @Override
    public String toString() {
        return pasillo + "-" + ubicacion + "-" + altura;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.toString());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (obj == this) {
            return true;
        } else if (obj instanceof Posicion) {
            Posicion aux = (Posicion) obj;
            return this.pasillo.equals(aux.pasillo) && this.ubicacion == aux.ubicacion && this.altura == aux.altura;
        } else {
            return false;
        }
    }

    @Override
    public int compareTo(Posicion p) {
        if (p == null) {
            throw new NullPointerException();
        } else {
            if (this.pasillo.compareTo(p.pasillo) != 0) {
                return this.pasillo.compareTo(p.pasillo);

            } else if(Integer.compare(this.ubicacion, p.ubicacion) != 0){
                return Integer.compare(this.ubicacion, p.ubicacion);
            }else{
                return Integer.compare(this.altura, p.altura);
            }
        }
    }
    
    
    
}
