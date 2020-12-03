/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package claseAbstracta;

/**
 * Esta clase es de tipo abstracta, en la cual creamos dos métodos, area y perimetro
 * @author alang, jacqueline
 */
public abstract class Poligono {
    
    public abstract float area();
    public abstract float perimetro();

    /**
     * 
     * @return toString
     */
    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
}
