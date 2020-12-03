/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaz;

/**
 * En esta clase de imprimen los atributos del objeto creado y se aplica la funcion afinar.
 * @author alang, jacqueline
 */
public class MPOOP7 {
    public static void main(String[] args){
        System.out.println("4***********");
        InstrumentoMusical instrumento;
        instrumento= new InstrumentoViento();
        instrumento.afinar();
        System.out.println(instrumento);
        instrumento= new Flauta();
        instrumento.afinar();
        System.out.println(instrumento);
        
    }
}
