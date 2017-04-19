/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantallas;


import Controladores.RegistroCalificaciones;
import Controladores.RegistroExamenes;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

/**
 *
 * @author Olivera
 */
public class Contestar extends javax.swing.JDialog {

    private RegistroExamenes cuatro;
    private RegistroCalificaciones uno;
    private int res;
    private int p;
   
   
    public Contestar(java.awt.Frame parent, boolean modal, RegistroExamenes a, int examenes, RegistroCalificaciones b) {
        super(parent, modal);
        
        initComponents();
        
        
        setLocationRelativeTo(null);
        setTitle("Elaborar Examen");
        ((JPanel)getContentPane()).setOpaque(fal­se); 
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/Imagenes/Plataforma.png")); 
        JLabel fondo= new JLabel(); 
        fondo.setIcon(uno); 
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER); 
        fondo.setBounds(0,0,uno.getIconWidth(),u­no.getIconHeight());
        
        cuatro = a;
        res = examenes;
        completar(examenes);
        this.uno = b;
    }
    
    private void completar(int e){
        Examen Exa = GE.ver(e);
        ExamenField.setText(Exa.getTema());
        ParcialField.setText(String.valueOf(Exa.getParcial()));
        MaestroField.setText(Exa.getMaestro());
        PreguntasField.setText(String.valueOf(Exa.getPreguntas())+"/"+String.valueOf(Exa.getTotal()));
        MateriaField.setText(Exa.getMateria());
        ExamenField.setEditable(false);
        ParcialField.setEditable(false);
        MaestroField.setEditable(false);
        PreguntasField.setEditable(false);
        MateriaField.setEditable(false);
        p=Exa.getPreguntas();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaPregunta = new javax.swing.JLabel();
        etiquetaCorrecta = new javax.swing.JLabel();
        etiquetaIncorrecta = new javax.swing.JLabel();
        etiquetaIncorrecta2 = new javax.swing.JLabel();
        etiquetaIncorrecta3 = new javax.swing.JLabel();
        editablePregunta = new javax.swing.JTextField();
        editableCorrecta = new javax.swing.JTextField();
        editableIncorrecta = new javax.swing.JTextField();
        editableIncorrecta2 = new javax.swing.JTextField();
        editableIncorrecta3 = new javax.swing.JTextField();
        botonSiguiente = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        etiquetaPregunta.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        etiquetaPregunta.setForeground(new java.awt.Color(0, 51, 255));
        etiquetaPregunta.setText("Pregunta");

        etiquetaCorrecta.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        etiquetaCorrecta.setForeground(new java.awt.Color(0, 153, 51));
        etiquetaCorrecta.setText("Respuesta correcta");

        etiquetaIncorrecta.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        etiquetaIncorrecta.setForeground(new java.awt.Color(153, 0, 0));
        etiquetaIncorrecta.setText("Respuesta Incorrecta");

        etiquetaIncorrecta2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        etiquetaIncorrecta2.setForeground(new java.awt.Color(153, 0, 0));
        etiquetaIncorrecta2.setText("Respuesta Incorrecta");

        etiquetaIncorrecta3.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        etiquetaIncorrecta3.setForeground(new java.awt.Color(153, 0, 0));
        etiquetaIncorrecta3.setText("Respuesta Incorrecta");

        editablePregunta.setBackground(new java.awt.Color(255, 255, 102));
        editablePregunta.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        editableCorrecta.setBackground(new java.awt.Color(51, 204, 0));
        editableCorrecta.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        editableIncorrecta.setBackground(new java.awt.Color(153, 0, 0));
        editableIncorrecta.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        editableIncorrecta2.setBackground(new java.awt.Color(153, 0, 0));
        editableIncorrecta2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        editableIncorrecta3.setBackground(new java.awt.Color(153, 0, 0));
        editableIncorrecta3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        botonSiguiente.setBackground(new java.awt.Color(255, 153, 0));
        botonSiguiente.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        botonSiguiente.setText("Confirmar");
        botonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSiguienteActionPerformed(evt);
            }
        });

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jCheckBox3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jCheckBox4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jCheckBox5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addComponent(etiquetaPregunta)
                        .addGap(99, 99, 99)
                        .addComponent(botonSiguiente))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(editableIncorrecta3, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(editableIncorrecta, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(editableCorrecta, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaIncorrecta)
                                    .addComponent(etiquetaIncorrecta2)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(editableIncorrecta2, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(etiquetaIncorrecta3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(editablePregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(etiquetaCorrecta)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(etiquetaPregunta)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonSiguiente)
                        .addGap(28, 28, 28)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editablePregunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addGap(18, 18, 18)
                .addComponent(etiquetaCorrecta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editableCorrecta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(etiquetaIncorrecta)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(editableIncorrecta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jCheckBox3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etiquetaIncorrecta2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(editableIncorrecta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(etiquetaIncorrecta3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBox5)
                    .addComponent(editableIncorrecta3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSiguienteActionPerformed
         
         
    }//GEN-LAST:event_botonSiguienteActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonSiguiente;
    private javax.swing.JTextField editableCorrecta;
    private javax.swing.JTextField editableIncorrecta;
    private javax.swing.JTextField editableIncorrecta2;
    private javax.swing.JTextField editableIncorrecta3;
    private javax.swing.JTextField editablePregunta;
    private javax.swing.JLabel etiquetaCorrecta;
    private javax.swing.JLabel etiquetaIncorrecta;
    private javax.swing.JLabel etiquetaIncorrecta2;
    private javax.swing.JLabel etiquetaIncorrecta3;
    private javax.swing.JLabel etiquetaPregunta;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    // End of variables declaration//GEN-END:variables
}