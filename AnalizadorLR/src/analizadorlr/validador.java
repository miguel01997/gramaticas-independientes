/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package analizadorlr;

import java.util.Vector;
import java.util.regex.*;

/**
 *
 * @author juanda
 */
public class validador {
    public Vector variables = new Vector();
    public Vector simbolos = new Vector();
    int largoVector;
    int intIniciales = 0;
    public Vector iniciales = new Vector();

    public void inicializar(int longitudCadena) {
    }

    public boolean revisarVariable(char a) {//metodo que evalua si un simbolo ya se encuentra
        boolean existe = false;   //dentro del vector de simbolos
        for (int i = 0; i < variables.size(); i++) {// evita que se ingresen valores repetidos al vector
            
            if (a==variables.elementAt(i)) {
                existe = true;
                break;
            }
        }
        return existe;
    }

     public boolean revisarSimbolo(char a) {//metodo que evalua si un simbolo ya se encuentra
        boolean existe = false;   //dentro del vector de simbolos
        for (int i = 0; i < simbolos.size(); i++) {// evita que se ingresen valores repetidos al vector
             if (a==simbolos.elementAt(i)) {
                existe = true;
                break;
            }
        }
        return existe;
    }

       public boolean revisarSimboloInicial(char a) {//metodo que evalua si un simbolo ya se encuentra
        boolean existe = false;   //dentro del vector de simbolos
        for (int i = 0; i < iniciales.size(); i++) {// evita que se ingresen valores repetidos al vector
             if (a==simbolos.elementAt(i)) {
                existe = true;
                break;
            }
        }
        return existe;
    }

    public boolean validar(String entrada) {

        String input = entrada;
        boolean correcto = false;
        Pattern p = Pattern.compile("^[a-z|A-Z|0-9|$| ]");
        Pattern q = Pattern.compile("[^A-Z]");
        Matcher m = p.matcher(input);
        Matcher n = q.matcher(input);
        if (m.find() && n.find()) {
            correcto = true;
        }

        return correcto;
    }

    public boolean variables(String entrada) {
        boolean aceptada = true;//almacena el valor que indica si la gramatica lleva un orden adecuado
        char letra;//almacena la letra que se esta leyendo
        boolean revisar = false;
        int longitudEntrada = entrada.length();
        int numvar = 0; //variable que lleva el control de la posicion de almacenamiento de las variables en el arreglo variables.
        int numsimb = 0;//variable que lleva el control de la posicion de almacenamiento de los simbolos en el arreglo simbolos.
        char input2[] = new char[longitudEntrada];
        for (int z = 0; z < longitudEntrada; z++) {
            input2[z] = entrada.charAt(z);
            letra = input2[z];
            if ((int) input2[z] >= 65 && (int) input2[z] <= 90) {//mayusculas
                revisar = revisarVariable(letra);
                if (revisar == false && letra!='S') {
                    variables.add(numvar, input2[z]);
                    numvar++;
                }
                aceptada = true;

            }
            if (z == 1 && ((int) input2[z] < 65 | (int) input2[z] > 90)) {//Valida que la segunda letra ingresada, sea una variable y no un simbolo
                aceptada = false;
                break;
            }
            if ((int) input2[z] >= 97 && (int) input2[z] <= 122) {//minusculas
                revisar = revisarSimbolo(letra);
                if (revisar == false) {
                    simbolos.add(numsimb,letra);
                    numsimb++;
                }
            }
            if ((int) input2[z] >= 48 && (int) input2[z] <= 57) {
                revisar = revisarSimbolo(letra);
                if (revisar == false) {
                    simbolos.add(numsimb, letra);
                    numsimb++;
                }
            }
        }

        return aceptada;

    }

    public boolean repite(String cadena){
        boolean repite=revisarSimboloInicial(cadena.charAt(0));
        return repite;
    }

    public Vector getSimbolos() {
        return simbolos;
    }

    public Vector getVariables() {
        return variables;
    }

//    public Vector iniciacon(String a){
//
//    }
}
