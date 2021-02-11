/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.PacienteDAO;

/**
 *
 * @author Usuario
 */
public class FormInicial extends javax.swing.JFrame {

    /**
     * Creates new form FormInicial
     */
    public FormInicial() {
        initComponents();
        configurarFormulario();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        btnUpdate = new javax.swing.JButton();
        btnCompleto = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnIniciar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnUpdate.setBackground(new java.awt.Color(102, 255, 102));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnUpdate.setText("CRUD-Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        desktopPane.add(btnUpdate);
        btnUpdate.setBounds(650, 190, 200, 60);

        btnCompleto.setBackground(new java.awt.Color(153, 255, 255));
        btnCompleto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCompleto.setForeground(new java.awt.Color(51, 51, 51));
        btnCompleto.setText("CRUD COMPLETO");
        btnCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompletoActionPerformed(evt);
            }
        });
        desktopPane.add(btnCompleto);
        btnCompleto.setBounds(20, 120, 200, 60);

        btnListar.setBackground(new java.awt.Color(102, 255, 102));
        btnListar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnListar.setText("CRUD-Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        desktopPane.add(btnListar);
        btnListar.setBounds(230, 190, 200, 60);

        btnDeletar.setBackground(new java.awt.Color(102, 255, 102));
        btnDeletar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDeletar.setText("CRUD-Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });
        desktopPane.add(btnDeletar);
        btnDeletar.setBounds(440, 190, 200, 60);

        btnIniciar.setBackground(new java.awt.Color(102, 255, 102));
        btnIniciar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnIniciar.setText("CRUD-Inserir");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        desktopPane.add(btnIniciar);
        btnIniciar.setBounds(20, 190, 200, 60);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("CRUD - Evolua ");
        desktopPane.add(jLabel1);
        jLabel1.setBounds(290, 0, 320, 70);

        btnFechar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnFechar.setForeground(new java.awt.Color(255, 102, 102));
        btnFechar.setText("Bye Bye");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });
        desktopPane.add(btnFechar);
        btnFechar.setBounds(720, 280, 150, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 879, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompletoActionPerformed
       FormPaciente completo = new FormPaciente();
       completo.setVisible(true);
       dispose();
    }//GEN-LAST:event_btnCompletoActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        FormPacienteInserir inserir = new FormPacienteInserir();
        inserir.setVisible(true);
       dispose();
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        FormPacienteListar listar = new FormPacienteListar();
        listar.setVisible(true);
       dispose();
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        FormPacienteApagar deletar = new FormPacienteApagar();
        deletar.setVisible(true);
       dispose();
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        FormPacienteAtualizar update = new FormPacienteAtualizar();
        update.setVisible(true);
       dispose();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

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
            java.util.logging.Logger.getLogger(FormInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCompleto;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    
     private void configurarFormulario(){
     this.setTitle("Java Intermediário - Escola Evolua Sumaré");
     this.setResizable(false);
     this.setLocationRelativeTo(null);
    }
   
}
