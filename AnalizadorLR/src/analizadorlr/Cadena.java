package analizadorlr;

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

        TxtArea.setColumns(20);
        TxtArea.setRows(5);
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
        char insertar;
        pila pilaCadena = new pila();
        pila pilaLenguaje = new pila();
        int longitud = strCadena.length();

        for (int i=longitud-1;i>=0;i--){
         insertar=strCadena.charAt(i);
         pilaCadena.InsertarPilaCadena(insertar);
            }
        TxtArea.setText("La cadena que ingreso, se ha insertado en la pila para su lectura LR/n");
        TxtArea.setText("Empezamos ingresando la variable de inicio a la pila : S");

        for (int i=0;i<numerofilas;i++){
            for (int j=0;j<numerocolumnas;j++){
                if (TablaRecibida[i][j]==" "){
                    for (int k=0;k<numerocolumnas;k++){
                        String contenido = TablaRecibida[i][k];
                        for (int n=0;n<contenido.length();n++){
                           char celda=contenido.charAt(n);
                           char anterior= celda;
                            if (celda==TablaRecibida[0][j].charAt(0)){
                                if (anterior==TablaRecibida[i][0].charAt(0)){
                                    if (TablaRecibida[i][numerocolumnas-1]=="$"){
                                        TablaRecibida[i][j]="$";
                                    }
                                }
                            }

                        }

                    }
                }

            }
        }
        pilaLenguaje.InsertarPilaLenguaje('#');
        pilaLenguaje.InsertarPilaLenguaje(TablaRecibida[1][0].charAt(0));
    }//GEN-LAST:event_ButtonEvaluarMouseClicked

    /**
    * @param args the command line arguments
    */
    public static void main() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadena().setVisible(true);
            }
        });
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

    public 


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