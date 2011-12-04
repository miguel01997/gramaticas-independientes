/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package analizadorlr;

import java.util.Vector;

/**
 *
 * @author juanda
 */
public class matriz {
    int i =0;//filas
    int j=0 ;//columnas
    int f=0;//numero de variables existentes
//    int filas;
//    int columnas;
    int c=0;//numero de simbolos existentes
    String[][] TablaVariables;

//   static void rango(int num, int den)throws ExcepcionIntervalo{
//        if((num>100)||(den<-5)){
//            throw new ExcepcionIntervalo("Números fuera del intervalo");
//        }
//    }

    public void setTabla (String a){
      //TablaVariables = new String[f][c];
    TablaVariables[i][j] = a;
    
      }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setF(int f) {
        this.f = f;
    }

 
    public void setI(int i) {
        this.i = i;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public void inicializarTablaVariables (int filas, int columnas){
       TablaVariables=new String[filas][columnas];
    }

    public String[][] construirTabla(Vector simbolos, Vector ordenados, int numColumnas, int numproduccion){
        int longitudVectorSimbolos = simbolos.size();
        int longitudVectorOrdenados = ordenados.size();
        setF(numproduccion);
        //setI(numproduccion);
        setC(numColumnas);
        
        inicializarTablaVariables(2,c);
        //if (numproduccion==1){
        for (int k=0;k<longitudVectorSimbolos;k++){
            setTabla(simbolos.elementAt(k).toString());
            setJ(j+1);
        }
        setJ(0);
        //}
        setI(numproduccion);
        for (int k=0;k<longitudVectorOrdenados;k++){
            setTabla(ordenados.elementAt(k).toString());
            setJ(j+1);
        }
        return TablaVariables;
    }

}
