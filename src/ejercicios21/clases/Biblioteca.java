/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios21.clases;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author alumno
 */
public class Biblioteca {
    private List <Elemento> almacen;
    private Set<Posicion> ocupadas;

    public Biblioteca() {
        almacen = new ArrayList<>();
        ocupadas = new HashSet<Posicion>();
    }
    
    public void add(Elemento e){
        checkNull(e);
        if(!ocupadas.contains(e.getPosicion())){
            almacen.add(e);
            ocupadas.add(e.getPosicion());
        }

        
    }
    
    public boolean remove(int n){
        if (almacen.remove(almacen.get(n))) {
            ocupadas.remove(almacen.get(n).getPosicion());
            return true;
        }
        return false;
    }
    
    private static void checkNull(Object o) {
        if (o == null) {
            throw new IllegalArgumentException("no se permiten nulos.");
        }
    }      

    @Override
    public String toString() {
        String resultado = "";
        for (Elemento elemento : almacen) {
            resultado += "\n" + elemento;
        }
        return resultado;
    }
    
    
    
    
    
}
