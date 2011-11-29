/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package analizadorlr;

import java.util.Stack;
import java.util.Vector;

/**
 *
 * @author juanda
 */
public class pila {

    Stack pilaCadena = new Stack();
    Stack pilaLenguaje = new Stack();

   
    public void InsertarPilaCadena (char elemento) {
        pilaCadena.push(elemento);
    }

    public void InsertarPilaLenguaje (char elemento) {
        pilaLenguaje.push(elemento);
    }
}
