package william_martinez_proyecto2_q3;

import javax.swing.JOptionPane;

public class Pagina_Inicial extends javax.swing.JFrame {
    
    public Manejo_user manejoUser;
    
    public Pagina_Inicial() {
        initComponents();
        manejoUser = new Manejo_user();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bloqueUsuarioTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botonARegistro = new javax.swing.JButton();
        botonInicioSesion = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        bloqueContraTxt = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jPanel2.setLayout(new javax.swing.OverlayLayout(jPanel2));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Switch");

        bloqueUsuarioTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloqueUsuarioTxtActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Usuario:");

        jLabel3.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Contraceña:");

        botonARegistro.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 14)); // NOI18N
        botonARegistro.setText("No tiene una cuenta registrada? Apriete este boton para registrarse");
        botonARegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonARegistroActionPerformed(evt);
            }
        });

        botonInicioSesion.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 24)); // NOI18N
        botonInicioSesion.setText("Iniciar sesion");
        botonInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInicioSesionActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/switch_LogoPng.png"))); // NOI18N
        jLabel4.setText("Imagenpronto");

        bloqueContraTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloqueContraTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bloqueUsuarioTxt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonARegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(botonInicioSesion)
                        .addGap(107, 107, 107))
                    .addComponent(bloqueContraTxt))
                .addGap(47, 47, 47))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bloqueUsuarioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bloqueContraTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(botonInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(botonARegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(133, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3);

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInicioSesionActionPerformed
        

        String texto= bloqueUsuarioTxt.getText();
        User_info user =manejoUser.buscar(texto);
        System.out.println(user);
        if(user!=null){
            //aqui va la pagina principal pero no esta hecho aun
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Ingrese un usuario registrado de lo contrario registrarse.");
        }
    }//GEN-LAST:event_botonInicioSesionActionPerformed

    private void botonARegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonARegistroActionPerformed
        Pagina_Registro pgRegistro = new Pagina_Registro(this);
        pgRegistro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonARegistroActionPerformed

    private void bloqueContraTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloqueContraTxtActionPerformed
        
    }//GEN-LAST:event_bloqueContraTxtActionPerformed

    private void bloqueUsuarioTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloqueUsuarioTxtActionPerformed
        
    }//GEN-LAST:event_bloqueUsuarioTxtActionPerformed

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
            java.util.logging.Logger.getLogger(Pagina_Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pagina_Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pagina_Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pagina_Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pagina_Inicial().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField bloqueContraTxt;
    private javax.swing.JTextField bloqueUsuarioTxt;
    private javax.swing.JButton botonARegistro;
    private javax.swing.JButton botonInicioSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
