/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FormMatriz.java
 *
 * Created on 24/11/2011, 10:07:33 PM
 */

package analizadorlr;

import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JPanel;
import java.awt.*;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;
import javax.swing.table.TableColumn;
/**
 *
 * @author juanda
 */
public class TablaAnalisis extends JFrame {

    Container contenedor;
    JPanel panel;
    JScrollPane scroll;
    JTable tabla;
    TableColumn columna;
    Vector vectorSimbolos;
    String simbolos[];//={"casita","casa"};
    String Matriz[][];//={{"casota","casa"},{"casa","casota"}};
  //  String vectorDatosTabla[][];

    public TablaAnalisis( ) {
    contenedor=getContentPane();
    panel = new JPanel();
    tabla=new JTable(Matriz,simbolos);
    scroll = new JScrollPane(tabla);
    panel.add(scroll);
    contenedor.add(panel);

    setVisible(true);
    setLocation(300,340);
    setSize(600,400);


    }
    public static void main(){
        Vector vectorSimbolos = new Vector();
        TablaAnalisis matriz=new TablaAnalisis();
    }

    public void setMatriz(String[][] Matriz) {
        this.Matriz = Matriz;
    }

    public void setSimbolos(String[] strsimbolos) {
        this.simbolos = strsimbolos;
    }

    





}