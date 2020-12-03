/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package claseAbstracta;

/**
 * Esta clase es una extención de la clase Poligono, define nuevos atributos privados, los métodos area y perimetro de un cuadrilatero, ademas de que deefine los métodos getter and setters de cada atributo
 * @author alang, jacqueline
 */
public class Cuadrilatero extends Poligono{
    /**
     alpha y beta de tipo enteros
     a, b, base y altura de tipoo flotante
     */
    private int alpha, beta;
    private float a, b, base, altura;

    public Cuadrilatero() {
    }
    /**
     * Método constructor con dos parametros
     * @param a de tipo flotante
     * @param b de tipo flotante
     */
    public Cuadrilatero(float a, float b) {
        this.a = a;
        this.b = b;
    }
    /**
     * método getAlpha
     * @return alpha
     */
    public int getAlpha() {
        return alpha;
    }
    /**
     * métoto setAlpha
     * @param alpha
     */
    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }
    /**
     * método getBeta
     * @return beta
     */
    public int getBeta() {
        return beta;
    }
    /**
     * método setBeta
     * @param beta
     */
    public void setBeta(int beta) {
        this.beta = beta;
    }
    /**
     * método getA
     * @return a
     */
    public float getA() {
        return a;
    }
    /**
     * método setA
     * @param a 
     */
    public void setA(float a) {
        this.a = a;
    }
    /**
     * método getB
     * @return b
     */
    public float getB() {
        return b;
    }
    /**
     * método setB
     * @param b
     */
    public void setB(float b) {
        this.b = b;
    }
    
    /**
     * método setBase
     * @return base
     */
    public float getBase() {
        return base;
    }
    /**
     * método setBase
     * @param base 
     */
    public void setBase(float base) {
        this.base = base;
    }
    /**
     * método getAltura
     * @return altura
     */
    public float getAltura() {
        return altura;
    }
    /**
     * método setAltura
     * @param altura
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
    /**
     * toString
     * @return alpha, beta, a, b, base, altura
     */
    @Override
    public String toString() {
        return "Cuadrilatero{" + "alpha=" + alpha + ", beta=" + beta + ", a=" + a + ", b=" + b + ", base=" + base + ", altura=" + altura + '}';
    }
    /**
     * metodo area obtiene el area dada una base y una altura
     * @return base*altura
     */
    @Override
    public float area() {
        return base * altura;
    }
    
    /**
     * método perimetro obtiene el perimetro dada a y b
     * @return 2*a + 2*b
     */
    @Override
    public float perimetro() {
        return 2 * a + 2 * b;

    }
}
