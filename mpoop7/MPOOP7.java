/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mpoop7;

/**
 * En esta clase se define em método selectorPoligonos, se crean objetos de tipo poligono, cuadrilatero y triangulo, para posteriormente aplicar el método selectorPoligonios y saber que tipo de objeto es.
 * @author alang, jacqueline
 */
public class MPOOP7 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("1******************");
        /**
         * se crea poligono haciendo un nuevo poligono y se imprime 
         */
        Poligono poligono=new Poligono();
        System.out.println(poligono);
        /**
         * se crea un nuevo objeto y se imprime
         */
        Object objeto= new Object();
        System.out.println("Objeto "+objeto);
        /**
         * se iguala objeto a poligono y se imprime
         */
        objeto = poligono;
        System.out.println("Objeto como Poligono "+objeto);
        /**
         * se crea un objeto nuevo con poligono 
         */
        objeto = new Poligono();
        System.out.println("Objeto como Poligono "+objeto);
        
        System.out.println("2******************");
        //Uso de instanceof 
        /**
         * se crea un nuevo poligono 
         */
        poligono = new Poligono();
        System.out.println(poligono);
        selectorPoligonos(poligono);
        /**
         * se crea un triangulo y se imprime
         */
        poligono = new Triangulo();
        System.out.println(poligono);
        selectorPoligonos(poligono);
        /**
         * se crea un cuadrilatero 
         */
        poligono = new Cuadrilatero();
        System.out.println(poligono);
        selectorPoligonos(poligono);
    }
    
    /**
     * se crea una estructura if para verificar a que es igual el objeto y
     * se imprime su igualdad 
     * @param poligono 
     */
    public static void selectorPoligonos(Poligono poligono){
        if(poligono instanceof Triangulo){
            System.out.println("El objeto es un Triangulo");   
        }else if(poligono instanceof Cuadrilatero){
            System.out.println("El objeto es un Cuadrilatero");
        }else if(poligono instanceof Poligono){
            System.out.println("El objeto es un Poligono");
        }else{
            System.out.println("El objeto es otra figura");
        }
    }
}
