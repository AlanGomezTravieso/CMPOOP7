/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mpoop7;

/**
 *
 * @author alang
 */
public class Triangulo extends Poligono{
    /**
     * alpha, beta y gamma de tipo entero
     * a, b, c, base y altura de tipo flotante
     */
    private int alpha,beta,gamma;
    private float a,b,c,base,altura;

    public Triangulo() {
    }
    /**
     * constructor
     * @param a flotante
     * @param b flotante 
     * @param c flotante
     */
    public Triangulo(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    /**
     * métodp getAlpha
     * @return alpha 
     */
    public int getAlpha() {
        return alpha;
    }
    /**
     * método setAlpha
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
     * método getGamma
     * @return gamma
     */
    public int getGamma() {
        return gamma;
    }
    /**
     * método setGamma
     * @param gamma 
     */
    public void setGamma(int gamma) {
        this.gamma = gamma;
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
     * método getC
     * @return c
     */
    public float getC() {
        return c;
    }
    /**
     * método setC
     * @param c 
     */
    public void setC(float c) {
        this.c = c;
    }
    /**
     * método getBase
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
     * método toString
     * @return alpha, beta, gamma, a , b, c, base, altura
     */
    @Override
    public String toString() {
        return "Triangulo{" + "alpha=" + alpha + ", beta=" + beta + ", gamma=" + gamma + ", a=" + a + ", b=" + b + ", c=" + c + ", base=" + base + ", altura=" + altura + '}';
    }
}
