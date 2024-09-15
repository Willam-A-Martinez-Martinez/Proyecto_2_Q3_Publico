package william_martinez_proyecto2_q3;

import javax.swing.JOptionPane;

public class Pagina_Inicial extends javax.swing.JFrame {
    
    public Manejo_user manejoUser;
    public Twits_Generales twits;
    public LoggedUser loggedUser;
    
    public Pagina_Inicial() {
        initComponents();
        manejoUser = new Manejo_user();
        twits= new Twits_Generales();
        loggedUser=new LoggedUser();        
        
        this.setLocation(0, 0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        bloqueUsuarioTxt = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        botonARegistro7 = new javax.swing.JButton();
        botonInicioSesion7 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        bloqueContraTxt = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jPanel2.setLayout(new javax.swing.OverlayLayout(jPanel2));

        jPanel25.setBackground(new java.awt.Color(230, 242, 254));

        jLabel29.setFont(new java.awt.Font("Roboto Black", 1, 48)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Switch");

        bloqueUsuarioTxt.setBackground(new java.awt.Color(255, 255, 255));
        bloqueUsuarioTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloqueUsuarioTxtActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Usuario:");

        jLabel31.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Contraceña:");

        botonARegistro7.setBackground(new java.awt.Color(255, 255, 255));
        botonARegistro7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        botonARegistro7.setForeground(new java.awt.Color(0, 0, 255));
        botonARegistro7.setText("No tiene una cuenta registrada? Apriete este boton para registrarse");
        botonARegistro7.setBorderPainted(false);
        botonARegistro7.setContentAreaFilled(false);
        botonARegistro7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonARegistroActionPerformed(evt);
            }
        });

        botonInicioSesion7.setBackground(new java.awt.Color(255, 255, 255));
        botonInicioSesion7.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        botonInicioSesion7.setForeground(new java.awt.Color(0, 0, 0));
        botonInicioSesion7.setText("Iniciar sesion");
        botonInicioSesion7.setBorderPainted(false);
        botonInicioSesion7.setContentAreaFilled(false);
        botonInicioSesion7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInicioSesionActionPerformed(evt);
            }
        });

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/switch_LogoPng.png"))); // NOI18N

        bloqueContraTxt.setBackground(new java.awt.Color(255, 255, 255));
        bloqueContraTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloqueContraTxtActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bloqueUsuarioTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonARegistro7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bloqueContraTxt))
                        .addGap(47, 47, 47))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(botonInicioSesion7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bloqueUsuarioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bloqueContraTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(botonInicioSesion7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonARegistro7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(133, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel25);

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bloqueContraTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloqueContraTxtActionPerformed

    }//GEN-LAST:event_bloqueContraTxtActionPerformed

    private void botonInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInicioSesionActionPerformed
        System.out.println(loggedUser.isLogged());
        Pagina_Multiple pgMultiple = new Pagina_Multiple(this);
        String username= bloqueUsuarioTxt.getText();
        String password= bloqueContraTxt.getText();
        System.out.println("Buscando usuario: " + username);
        
        //informacion agregada
        User_info user =manejoUser.buscarLogged(username, password);
        System.out.println("Usuario encontrado: " + user);
        
        System.out.println(user);
        if(user!=null ){
            this.loggedUser.setLoggedUser(user);
            
            pgMultiple.setVisible(true);
            this.setVisible(false);
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Ingrese un usuario y contraseña registrado de lo contrario registrarse.");
        }
    }//GEN-LAST:event_botonInicioSesionActionPerformed

    private void botonARegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonARegistroActionPerformed
        Pagina_Registro pgRegistro = new Pagina_Registro(this);
        pgRegistro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonARegistroActionPerformed

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
    private javax.swing.JButton botonARegistro7;
    private javax.swing.JButton botonInicioSesion7;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel25;
    // End of variables declaration//GEN-END:variables
}
