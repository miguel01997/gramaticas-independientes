/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FormIngreso.java
 *
 * Created on 15/11/2011, 06:39:22 PM
 */
package analizadorlr;

import javax.swing.JOptionPane;

/**
 *
 * @author juanda
 */
public class FormIngreso extends javax.swing.JFrame {
    String var = "S";
     matriz ArregloVariables = new matriz();


    /** Creates new form FormIngreso */
    public FormIngreso() {
        initComponents();
       
       LabelVariable.setText(var);
      // ArregloVariables.setVariables(var);

    }

    public String getVar() {
        return var;
    }

    public void setVar(String var) {
        this.var = var;
    }

    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        LabelVariable = new javax.swing.JLabel();
        TextFieldProduccion = new javax.swing.JTextField();
        ButtonNuevaProduccion = new javax.swing.JButton();
        ButtonCancel = new javax.swing.JButton();
        ButtonNext = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Producciones de   :");

        ButtonNuevaProduccion.setText("Agregar produccion");
        ButtonNuevaProduccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonNuevaProduccionMouseClicked(evt);
            }
        });

        ButtonCancel.setText("Cancelar");
        ButtonCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonCancelMouseClicked(evt);
            }
        });

        ButtonNext.setText("Siguiente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonCancel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TextFieldProduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(ButtonNext)
                                        .addComponent(ButtonNuevaProduccion)))))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(LabelVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldProduccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonNuevaProduccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonCancel)
                    .addComponent(ButtonNext))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonCancelMouseClicked
    System.exit(0);        // Salir de la aplicacion
    }//GEN-LAST:event_ButtonCancelMouseClicked

    private void ButtonNuevaProduccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonNuevaProduccionMouseClicked

        String varchar = TextFieldProduccion.getText();//Obtener el texto ingresado por el usuario
        validador validacion = new validador();
        boolean correcto = validacion.validar(varchar);
        if (correcto == true){
            int k = ArregloVariables.getJ(); //mover el puntero en el arreglo para la
            ArregloVariables.setJ(k+1);// insercion de las producciones
            ArregloVariables.setVariables(varchar);//Inserta el valor dentro de la matriz
            TextFieldProduccion.setText(null);//Limpia el cuadro de texto para que el usuario
            }                                 //ingrese una nueva produccion.
        else
            JOptionPane.showMessageDialog(rootPane, "Verifique e ingrese "
                                             + "nuevamente la produccion", "ERROR!", JOptionPane.ERROR_MESSAGE);
            TextFieldProduccion.setText(null);
        
        //char a=varchar.toUpperCase().charAt(0);//Capturar primera letra unicamente y convertir a mayuscula
        //varchar = Character.toString(a);
        

    }//GEN-LAST:event_ButtonNuevaProduccionMouseClicked

    /**
    * @param args the command line arguments=
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormIngreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCancel;
    private javax.swing.JButton ButtonNext;
    private javax.swing.JButton ButtonNuevaProduccion;
    private javax.swing.JLabel LabelVariable;
    private javax.swing.JTextField TextFieldProduccion;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
