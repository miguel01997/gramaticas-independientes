package analizadorlr;

import java.util.Stack;
import java.util.Vector;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Cadena.java
 *
 * Created on 29/11/2011, 12:30:46 PM
 */

/**
 *
 * @author juanda
 */
public class Cadena extends javax.swing.JFrame {

    public String strCadena= new String();
    public String[][] TablaRecibida;
    int numerofilas;
    int numerocolumnas;
    String vieneLenguaje;
    Vector VectorSimbolos= new Vector();
    String vieneCadena;
    char strvieneLenguaje;
    char strvieneCadena;
    String contenido;
    char letra;
    char variable;
    String parainsertar;
    char celda;
    char anterior;
    Stack pilaCadena = new Stack();
    Stack pilaLenguaje = new Stack();
    boolean aceptado=false;
    int filanumero;
    int columnanumero;

    /** Creates new form Cadena */
    public Cadena() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TxtArea = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ButtonEvaluar = new javax.swing.JButton();
        TxtCadena = new javax.swing.JTextField();
        ButtonCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Analizador Sintactico LR(1)");

        TxtArea.setColumns(20);
        TxtArea.setRows(5);
        TxtArea.setTabSize(10);
        jScrollPane1.setViewportView(TxtArea);

        jLabel1.setText("Ingrese la cadena que desea analizar :");

        ButtonEvaluar.setText("Evaluar");
        ButtonEvaluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonEvaluarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(ButtonEvaluar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(TxtCadena, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TxtCadena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ButtonEvaluar)
                .addContainerGap())
        );

        ButtonCerrar.setText("Cerrar");
        ButtonCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonCerrarMouseClicked(evt);
            }
        });
        ButtonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(ButtonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(ButtonCerrar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCerrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonCerrarActionPerformed

    private void ButtonCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonCerrarMouseClicked
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonCerrarMouseClicked

    private void ButtonEvaluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonEvaluarMouseClicked
        strCadena=TxtCadena.getText();
        for (int longCadena=0;longCadena<strCadena.length();longCadena++){
//            char revisar=strCadena.charAt(longCadena);
//           // recorrerSimbolos(revisar);
//           while (!VectorSimbolos.contains(revisar)){
//
//            JOptionPane.showMessageDialog(rootPane, "Verifique e ingrese "
//                                             + "nuevamente la cadena que desea analizar!", "ERROR!", JOptionPane.ERROR_MESSAGE);
//            TxtCadena.setText(null);
//
//            break;
//            }
//
        }
        char insertar;
        int longitud = strCadena.length();

        for (int i=longitud-1;i>=0;i--){
         insertar=strCadena.charAt(i);
         pilaCadena.push(insertar);
            }
//        TxtArea.setText(TablaRecibida.toString());

        TxtArea.append("La cadena que ingreso, se ha insertado en la pila para su lectura LR \n");
//        TxtArea.getColumns();
        TxtArea.append("Empezamos ingresando la variable de inicio a la pila : S \n");


        for (int i=1;i<numerofilas;i++){//**1**Ubicamos un espacio en blanco
            for (int j=1;j<numerocolumnas;j++){
                //TxtArea.append(TablaRecibida[i][j]+" \n");
                if (TablaRecibida[i][j].charAt(0)==' ' ){
                    letra=TablaRecibida[0][j].charAt(0);//**2**tomar el simbolo cabeza donde se encuentra el espacio en blanco
                    for (int a=1;a<numerocolumnas;a++){//contador de filas para recorrer la fila en busca de producciones que contngan el simbolo almacenado en letra



                        for (int b=0;b<TablaRecibida[i][a].length();b++){//recorremos cada produccion de atras para adelante, buscando el simbolo
                                if (TablaRecibida[i][a].charAt(b)==letra){
                                    variable=TablaRecibida[i][a].charAt(b-1);
                                }
                            }



                        if(variable==TablaRecibida[i][0].charAt(0)){//compara que la variable almacenada corresponda a la variable del renglon que estoy leyendo
                                    if (TablaRecibida[i][numerocolumnas-1].charAt(0)=='$'){
                                        TablaRecibida[i][j]="$";
                                        //a=numerocolumnas;
                                    }
                                    else{
                                        TablaRecibida[i][j]="%";
                                    }
                                }
                        else{

                        }
                            }
                        }
                }

            }
        TxtArea.append("La tabla de analisis Sintactico es: \n");
        PintarTabla(TablaRecibida);
//                if (TablaRecibida[i][j].charAt(0)==' ' ){
//                    for (int k=0;k<numerocolumnas;k++){
//                            contenido = TablaRecibida[i][k];//obtenemos la variable que tiene el espacio en blanco
//                        for (int n=0;n<contenido.length();n++){
//                                celda=contenido.charAt(n);
//                                anterior= celda;
//                            if (celda==TablaRecibida[0][j].charAt(0)){
//                                if (anterior==TablaRecibida[i][0].charAt(0)){
//                                    if (TablaRecibida[i][numerocolumnas-1]=="$"){
//                                        TablaRecibida[i][j]="$";
//                                    }
//                                    else {
//                                        TablaRecibida[i][j]="%";
//                                    }
//
//                                }
//                            }
//
//                        }
//
//                    }
//                }
//
//            }
//        }
        TxtArea.append("Inserta # en la pila \n" );
        pilaLenguaje.push("FIN");
        TxtArea.append("Inserta S en la pila \n" );
        pilaLenguaje.push(TablaRecibida[1][0].charAt(0));

      // boolean  finPila=true;
        while(pilaLenguaje.peek().toString()!="FIN"){
           // finPila=pilaLenguaje.peek().toString()!="FIN";
            strvieneCadena=VienePilaCadena().charAt(0);
            strvieneLenguaje=VienePilaLenguaje().charAt(0);
//            if(strvieneCadena==strvieneLenguaje){
//                TxtArea.append("saca " + strvieneLenguaje + " de la pila \n");
//                TxtArea.append("lee el simbolo" + strvieneCadena + " de la cadena \n");
//                pilaCadena.pop();
//                pilaLenguaje.pop();
//            }
            if(strvieneLenguaje=='$'){
                TxtArea.append("saca " + strvieneLenguaje + " de la pila \n");
                pilaLenguaje.pop();
                strvieneCadena=VienePilaCadena().charAt(0);
                strvieneLenguaje=VienePilaLenguaje().charAt(0);

            }
              while(strvieneCadena==strvieneLenguaje){
                TxtArea.append("saca " + strvieneLenguaje + " de la pila \n");
                TxtArea.append("lee el simbolo " + strvieneCadena + " de la cadena \n");
                pilaCadena.pop();
                pilaLenguaje.pop();
                if (pilaCadena.size()!=0){
                strvieneCadena=VienePilaCadena().charAt(0);
                  }
                strvieneLenguaje=VienePilaLenguaje().charAt(0);
                
            }

            if(strvieneLenguaje=='%'){
                TxtArea.append("ERROR!!!! \n");
                break;
            }
            if (pilaCadena.size()!=0){
            strvieneCadena=VienePilaCadena().charAt(0);
            }
            strvieneLenguaje=VienePilaLenguaje().charAt(0);
            if (pilaLenguaje.peek().toString()=="FIN"){
                pilaLenguaje.pop();
                break;
            }

            filanumero=recorrerVariables(strvieneLenguaje);
            columnanumero= recorrerSimbolos(strvieneCadena);
            parainsertar=TablaRecibida[filanumero][columnanumero];
            String imprimir=pilaLenguaje.peek().toString();
            TxtArea.append("Saca " + imprimir + " de la pila \n");
            pilaLenguaje.pop();
            for (int i=parainsertar.length()-1;i>=0;i--){
                 insertar=parainsertar.charAt(i);
                 TxtArea.append("Inserta "+ insertar + " en la pila \n");
                 pilaLenguaje.push(insertar);
            }
        }
        aceptado=true;
        if (aceptado==true && pilaCadena.size()==0 && pilaLenguaje.size()==0){
            TxtCadena.setEditable(false);
            TxtArea.append("Saca el simbolo # de la pila \n");
            TxtArea.append("Cadena aceptada satisfactoriamente!\n");
        }

    }//GEN-LAST:event_ButtonEvaluarMouseClicked

    /**
    * @param args the command line arguments
    */
  public  void main( ) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
            //public void run() {
//                new Cadena().setVisible(true);
                    this.setVisible(true);
//
           // }
//        });
//
    }

    public void setNumerocolumnas(int numerocolumnas) {
        this.numerocolumnas = numerocolumnas;
    }

    public void setNumerofilas(int numerofilas) {
        this.numerofilas = numerofilas;
    }

    public void setTablaRecibida(String[][] TablaRecibida) {
        this.TablaRecibida = TablaRecibida;
    }

    public int buscarRegistro(){
        int columna=0;

        return columna;
    }

    public String VienePilaLenguaje(){
        vieneLenguaje=pilaLenguaje.peek().toString();
        return vieneLenguaje;
    }

    public String VienePilaCadena(){
        vieneCadena=pilaCadena.peek().toString();
        return vieneCadena;
    }

    public int recorrerSimbolos(char a){
        int columna=0;
         for (int i=1;i<numerocolumnas;i++){
             if (a==TablaRecibida[0][i].charAt(0))
                 columna=i;
         }
        return columna;
    }
    public int recorrerVariables(char a){
    int fila=0;
         for (int i=1;i<numerofilas;i++){
             if (a==TablaRecibida[i][0].charAt(0))
                 fila=i;
         }
    return fila;
    }

    public void insertarPila(String insertar){
        pilaLenguaje.push(insertar.toString());
    }

    public void PintarTabla(String tabla[][]){
        for (int fila=0;fila<numerofilas;fila++){
            for (int columna=0; columna<numerocolumnas;columna++){
                TxtArea.append(TablaRecibida[fila][columna] + "      ");
                if (columna==numerocolumnas-1)
                    TxtArea.append("   " + "  \n");
            }
        }
    }

    public void setVectorSimbolos(Vector VectorSimbolos) {
        this.VectorSimbolos = VectorSimbolos;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCerrar;
    private javax.swing.JButton ButtonEvaluar;
    private javax.swing.JTextArea TxtArea;
    private javax.swing.JTextField TxtCadena;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
