/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantallas;
/**
 *
 * @author Olivera
 */
import Controlador.CarreraModelo;
import Modelo.Carrera;
import Modelo.Rol;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;


public class Examenes extends javax.swing.JDialog {

    private DefaultComboBoxModel comboModel;
    private ArrayList<Carrera> oEstudiantes;
    
    
    public ArrayList<Carrera> getoEstudiantes() {
        return oEstudiantes;
    }

    public void setoEstudiantes(ArrayList<Carrera> oEstudiantes) {
        this.oEstudiantes = oEstudiantes;
    }

 
    public Examenes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        
        comboModel = new DefaultComboBoxModel();
        comboModel.addElement(Rol.Pedro);
        comboModel.addElement(Rol.Noe);
        comboModel.addElement(Rol.Karim);
        comboModel.addElement(Rol.Barrita);
        
        
       
        
        initComponents();
        
        setLocationRelativeTo(null);
        setTitle("Examenes");
        
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonCancelar = new javax.swing.JButton();
        botonAgregar = new javax.swing.JButton();
        etiquetaMateria = new javax.swing.JLabel();
        etiquetaParcial = new javax.swing.JLabel();
        etiquetaTema = new javax.swing.JLabel();
        etiquetaTutor = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        editableMateria = new javax.swing.JTextField();
        comboBoxParcial = new javax.swing.JComboBox();
        editableTema = new javax.swing.JTextField();
        comboBoxTutor = new javax.swing.JComboBox();
        editablePreguntas = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        editablePregAReaizar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        spinnerIntentos = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        botonCancelar.setBackground(new java.awt.Color(153, 0, 0));
        botonCancelar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        botonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        botonAgregar.setBackground(new java.awt.Color(153, 0, 0));
        botonAgregar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        botonAgregar.setForeground(new java.awt.Color(255, 255, 255));
        botonAgregar.setText("Siguiente");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        etiquetaMateria.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        etiquetaMateria.setForeground(new java.awt.Color(255, 153, 0));
        etiquetaMateria.setText("Materia:");

        etiquetaParcial.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        etiquetaParcial.setForeground(new java.awt.Color(255, 153, 0));
        etiquetaParcial.setText("Parcial:");

        etiquetaTema.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        etiquetaTema.setForeground(new java.awt.Color(255, 153, 0));
        etiquetaTema.setText("Tema:");

        etiquetaTutor.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        etiquetaTutor.setForeground(new java.awt.Color(255, 153, 0));
        etiquetaTutor.setText("Profesor:");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("N° Preguntas:");

        editableMateria.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        comboBoxParcial.setBackground(new java.awt.Color(0, 153, 51));
        comboBoxParcial.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        comboBoxParcial.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Primer parcial", "Segundo parcial", "Tercer Parcial", "Ordinario" }));

        editableTema.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        comboBoxTutor.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        comboBoxTutor.setModel(comboModel);
        comboBoxTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxTutorActionPerformed(evt);
            }
        });

        editablePreguntas.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Preg. a realizar:");

        editablePregAReaizar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel2.setText("Intentos:");

        spinnerIntentos.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        spinnerIntentos.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaMateria)
                    .addComponent(etiquetaParcial)
                    .addComponent(etiquetaTema)
                    .addComponent(etiquetaTutor)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(editableMateria)
                    .addComponent(editableTema)
                    .addComponent(editablePreguntas)
                    .addComponent(comboBoxTutor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboBoxParcial, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editablePregAReaizar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(spinnerIntentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonCancelar)
                            .addComponent(botonAgregar))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaMateria)
                    .addComponent(editableMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(spinnerIntentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboBoxParcial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaParcial)
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaTema)
                            .addComponent(editableTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaTutor)
                            .addComponent(comboBoxTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(editablePreguntas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonCancelar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(editablePregAReaizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAgregar))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        
        Carrera nueva = new Carrera (editableMateria.getText(), Integer.valueOf(comboBoxParcial.getSelectedIndex()+1),editableTema.getText(),(Rol)comboModel.getSelectedItem(),Integer.valueOf(editablePreguntas.getText()),Integer.valueOf(editablePregAReaizar.getText()),(int)spinnerIntentos.getValue());
        oEstudiantes.add(nueva);
        setVisible(false);

        
        Preguntas tercero = new Preguntas(null, true);
        tercero.setVisible(true);
        
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void comboBoxTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxTutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxTutorActionPerformed


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
            java.util.logging.Logger.getLogger(Examenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Examenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Examenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Examenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Examenes dialog = new Examenes(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JComboBox comboBoxParcial;
    private javax.swing.JComboBox comboBoxTutor;
    private javax.swing.JTextField editableMateria;
    private javax.swing.JTextField editablePregAReaizar;
    private javax.swing.JTextField editablePreguntas;
    private javax.swing.JTextField editableTema;
    private javax.swing.JLabel etiquetaMateria;
    private javax.swing.JLabel etiquetaParcial;
    private javax.swing.JLabel etiquetaTema;
    private javax.swing.JLabel etiquetaTutor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSpinner spinnerIntentos;
    // End of variables declaration//GEN-END:variables

   
}
