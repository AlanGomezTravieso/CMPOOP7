/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaz;

/**
 * Esta clase es una extención de InstrumentoViento, que define el método tipoInstrumento
 * @author alang, jacqueline
 */
public class Flauta extends InstrumentoViento{
    public Flauta() {
    }
    /**
     * Método tipoInstrumento regresa un string
     * @return "flauta"
     */
    @Override
    public String tipoInstrumento(){
    return "flauta";
    }
    /**
     * Método toString
     * @return
     */
    @Override
    public String toString() {
        return "Flauta{" + '}';
    }
}
