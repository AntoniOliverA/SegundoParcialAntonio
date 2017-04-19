/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertidordetemperatura;
/**
 *
 * @author Olivera
 */


import javax.swing.*;


public class Convertidor extends javax.swing.JFrame {

    public Convertidor() {
        initComponents();
        setLocationRelativeTo(null);
       
    }

    Double numero;
    Double resultado;
    String grados;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLCelcius = new javax.swing.JLabel();
        jLFarengeit = new javax.swing.JLabel();
        jTCelcius = new javax.swing.JTextField();
        jTFarengeit = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CT");
        setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLCelcius.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLCelcius.setText("Celcius:");

        jLFarengeit.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLFarengeit.setText("Farenheit:");

        jTCelcius.setBackground(new java.awt.Color(102, 153, 0));
        jTCelcius.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jTCelcius.setForeground(new java.awt.Color(255, 255, 204));
        jTCelcius.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTCelcius.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTCelciusFocusLost(evt);
            }
        });
        jTCelcius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCelciusActionPerformed(evt);
            }
        });
        jTCelcius.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTCelciusKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTCelciusKeyTyped(evt);
            }
        });

        jTFarengeit.setBackground(new java.awt.Color(102, 153, 0));
        jTFarengeit.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jTFarengeit.setForeground(new java.awt.Color(255, 255, 204));
        jTFarengeit.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTFarengeit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFarengeitFocusLost(evt);
            }
        });
        jTFarengeit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFarengeitKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFarengeitKeyTyped(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 153, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/convertidordetemperatura/thermometer.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLCelcius, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTCelcius))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLFarengeit, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTFarengeit, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLCelcius)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTCelcius, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLFarengeit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFarengeit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(237, 237, 237))
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTCelciusKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCelciusKeyTyped
        char caracter = evt.getKeyChar();
        if ((caracter < '0')||(caracter > '9')) {
            if ((caracter!='.')&&(caracter!='-')){
                evt.consume();
            }
        }
    }//GEN-LAST:event_jTCelciusKeyTyped

    private void jTFarengeitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFarengeitKeyTyped
        jTCelciusKeyTyped(evt);
    }//GEN-LAST:event_jTFarengeitKeyTyped

    private void jTCelciusFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCelciusFocusLost
        if(validar(jTCelcius)==false){
            JOptionPane.showMessageDialog(this,jTCelcius.getText()+"No posible a convertir","Dato Invalido",JOptionPane.WARNING_MESSAGE);
                jTCelcius.requestFocusInWindow();
                jTCelcius.selectAll();
        }else{
            jTCelcius.setText("");
        }
    }//GEN-LAST:event_jTCelciusFocusLost

    private void jTFarengeitFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFarengeitFocusLost
        if(validar(jTFarengeit)==false){
            JOptionPane.showMessageDialog(this,jTFarengeit.getText()+"No posible a convertir","Dato Invalido",JOptionPane.WARNING_MESSAGE);
                jTFarengeit.requestFocusInWindow();
                jTFarengeit.selectAll();
        }else{
            jTFarengeit.setText("");
        }
    }//GEN-LAST:event_jTFarengeitFocusLost

    private void jTCelciusKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCelciusKeyReleased
        if(validar(jTCelcius)==true){
            resultado=((numero*1.8)+(32));
            grados = String.valueOf(Math.round(resultado*Math.pow(10,2))/Math.pow(10,2));
            jTFarengeit.setText(grados);
        }else{
            jTFarengeit.setText("");
        }
    }//GEN-LAST:event_jTCelciusKeyReleased

    private void jTFarengeitKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFarengeitKeyReleased
        if(validar(jTFarengeit)==true){
            resultado=(numero-32)/(1.8);
            grados = String.valueOf(Math.round(resultado*Math.pow(10,2))/Math.pow(10,2));
            jTCelcius.setText(grados);
        }else{
            jTCelcius.setText("");
        }
    }//GEN-LAST:event_jTFarengeitKeyReleased

    private void jTCelciusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCelciusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCelciusActionPerformed

    private boolean validar(JTextField oText){
        if(!oText.getText().isEmpty()){
            try{
                numero=Double.valueOf(oText.getText());
                return true;
            }catch(Exception e){
                return false;
            }
        }
        return true;
    }
    
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
            java.util.logging.Logger.getLogger(Convertidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Convertidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Convertidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Convertidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Convertidor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLCelcius;
    private javax.swing.JLabel jLFarengeit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTCelcius;
    private javax.swing.JTextField jTFarengeit;
    // End of variables declaration//GEN-END:variables
}
