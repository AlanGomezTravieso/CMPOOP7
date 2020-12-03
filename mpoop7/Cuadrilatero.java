/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mpoop7;

/**
 *
 * @author alang, jaqueline
 */
public class Cuadrilatero extends Poligono{
    
    private int alpha,beta;
    private float a,b,base,altura;

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
     *  método getAltura
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
}
