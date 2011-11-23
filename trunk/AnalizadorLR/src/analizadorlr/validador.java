/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package analizadorlr;

import java.util.regex.*;

/**
 *
 * @author juanda
 */
public class validador {
    public boolean validar(String entrada){
    
    String input = entrada;
    boolean correcto = false;
    Pattern p = Pattern.compile("^[A-Z|a-z|0-9]");
    Pattern q = Pattern.compile("[^A-Z|a-z|0-9]");
    Matcher m = p.matcher(input);
    Matcher n = q.matcher (input);
       if (m.find() && !n.find()){
          correcto = true;
        }

       return correcto;
    }

  /*  public String variables (String entrada){

        String input = entrada;
        String salida[] = new String[];
        Pattern p = Pattern.compile("^[A-Z|a-z|0-9]");
        Pattern q = Pattern.compile("[^A-Z|a-z|0-9]");
        Matcher m = p.matcher(input);
        Matcher n = q.matcher (input);

        return salida;
    }*/




}
