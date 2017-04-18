/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ProyectoLenguajes;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Cuestionario extends javax.swing.JFrame {

  int posicion =0;
    Respuestas r=new Respuestas();
    Preguntas p=new Preguntas();
    Object[] select={"","","","","","","","","",""};
    
    public Cuestionario() {
        initComponents();
        respuesta.setText(p.getPregunta(posicion));
        String[] a= r.setRespuestas(posicion);
            buttonGroup1.clearSelection();
            op1.setText(a[0]);
            op2.setText(a[1]);
            op3.setText(a[2]);
            op4.setText(a[3]);
            op1.requestFocus();
             
            regresar.setEnabled(false);
            terminar.setEnabled(false);
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pregunta = new javax.swing.JLabel();
        respuesta = new javax.swing.JLabel();
        op1 = new javax.swing.JRadioButton();
        op2 = new javax.swing.JRadioButton();
        op3 = new javax.swing.JRadioButton();
        op4 = new javax.swing.JRadioButton();
        regresar = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();
        terminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pregunta.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        pregunta.setText("Pregunta");

        respuesta.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        respuesta.setText("¿Respuesta 1?");

        buttonGroup1.add(op1);
        op1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(op2);
        op2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(op3);
        op3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(op4);
        op4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op4ActionPerformed(evt);
            }
        });

        regresar.setText("<<Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        siguiente.setText("Siguiente>>");
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        terminar.setText("Terminar Cuestionario");
        terminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(op3)
                            .addComponent(op2)
                            .addComponent(op1)
                            .addComponent(respuesta)
                            .addComponent(pregunta))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(op4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 259, Short.MAX_VALUE)
                        .addComponent(regresar)
                        .addGap(18, 18, 18)
                        .addComponent(siguiente)
                        .addGap(70, 70, 70))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(terminar)
                .addGap(104, 104, 104))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(pregunta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(respuesta)
                .addGap(28, 28, 28)
                .addComponent(op1)
                .addGap(18, 18, 18)
                .addComponent(op2)
                .addGap(18, 18, 18)
                .addComponent(op3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(op4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(regresar)
                            .addComponent(siguiente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(terminar)
                        .addGap(14, 14, 14))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        
        if(posicion == 8){
            siguiente.setEnabled(false);
            terminar.setEnabled(true);
        }
        
        
        if(posicion <10){
            regresar.setEnabled(true);
            posicion++;
            respuesta.setText(p.getPregunta(posicion));
            String[] a= r.setRespuestas(posicion);
            buttonGroup1.clearSelection();
            op1.setText(a[0]);
            op2.setText(a[1]);
            op3.setText(a[2]);
            op4.setText(a[3]);
            op1.requestFocus();
            
        }else{
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_siguienteActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
    
        
        if(posicion == 0){
            regresar.setEnabled(false);
        }
        
        if(posicion > -1){
            posicion--;
           siguiente.setEnabled(true);
           respuesta.setText(p.getPregunta(posicion));
            String[] a= r.setRespuestas(posicion);
            buttonGroup1.clearSelection();
            op1.setText(a[0]);
            op2.setText(a[1]);
            op3.setText(a[2]);
            op4.setText(a[3]);
            op1.requestFocus();
           
       }else{
           Toolkit.getDefaultToolkit().beep();
       }
    }//GEN-LAST:event_regresarActionPerformed

    private void terminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminarActionPerformed
        int calificacion = 0;
        for(int i =0; i<10; i++){
          if(select[i].equals(r.getRespuesta(i))){
                calificacion++; 
            }
        }
         JOptionPane.showMessageDialog(null, "Tu calificacion es " +  calificacion);
    }//GEN-LAST:event_terminarActionPerformed

    private void op1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op1ActionPerformed
        select[posicion] = op1.getLabel();
    }//GEN-LAST:event_op1ActionPerformed

    private void op2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op2ActionPerformed
        select[posicion] = op2.getLabel();
    }//GEN-LAST:event_op2ActionPerformed

    private void op3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op3ActionPerformed
       select[posicion] = op3.getLabel();
    }//GEN-LAST:event_op3ActionPerformed

    private void op4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op4ActionPerformed
        select[posicion] = op4.getLabel();
    }//GEN-LAST:event_op4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cuestionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton op1;
    private javax.swing.JRadioButton op2;
    private javax.swing.JRadioButton op3;
    private javax.swing.JRadioButton op4;
    private javax.swing.JLabel pregunta;
    private javax.swing.JButton regresar;
    private javax.swing.JLabel respuesta;
    private javax.swing.JButton siguiente;
    private javax.swing.JButton terminar;
    // End of variables declaration//GEN-END:variables
}
