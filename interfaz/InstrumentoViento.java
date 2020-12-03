/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaz;

/**
 * Esta clase implementa los métodos de InstrumentoMusical
 * @author alang, jacqueline
 */
public class InstrumentoViento implements InstrumentoMusical{
    
    public InstrumentoViento() {
    }
    /**
     * método tocar, define un texto a imprimir
     */
    @Override
    public void tocar(){
    System.out.println("Estoy tocando un instrumento de viento");
    }
    /**
     * método afinar, define un texto a imprimir
     */
    @Override
    public void afinar(){
    System.out.println("Estoy afinando mi instrumento");
    }
    /**
     * método tipoInstrumento define en un string el tipo de instrumento que es el objeto que se cree
     * @return "Instrumento de viento"
     */
    @Override
    public String tipoInstrumento() {
        return "Instrumento de viento";
    }
    
    /**
     * método toString
     * @return
     */
    @Override
    public String toString() {
        return "InstrumentoViento{" + '}';
    }
    
}
