/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package analizadorlr;

/**
 *
 * @author juanda
 */
public class matriz {
    int i =0;
    int j=0 ;
    String variables[][] = new String[4][4];


  public void setVariables (String a){
    this.variables[i][j] = a;
    
      }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

 
    public void setI(int i) {
        this.i = i;
    }

    public void setJ(int j) {
        this.j = j;
    }

  //public String set

}
