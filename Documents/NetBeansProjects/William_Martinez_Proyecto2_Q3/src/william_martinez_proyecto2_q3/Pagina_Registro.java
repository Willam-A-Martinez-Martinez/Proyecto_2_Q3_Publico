package william_martinez_proyecto2_q3;

import javax.swing.JOptionPane;

public class Pagina_Registro extends javax.swing.JFrame {
    
    Pagina_Inicial pgInicial;
    
    public Pagina_Registro(Pagina_Inicial pgInicial) {
        initComponents();
        this.pgInicial = pgInicial;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        botonReg = new javax.swing.JButton();
        bloqueRegNombre = new javax.swing.JTextField();
        bloqueRegEdad = new javax.swing.JTextField();
        bloqueRegUsername = new javax.swing.JTextField();
        bloqueRegGenero = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        bloqueRegContra = new javax.swing.JPasswordField();
        bloqueRegConfirmContra = new javax.swing.JPasswordField();
        botonAInicioSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro");

        jLabel2.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Genero (M/F)");

        jLabel3.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nombre de usuario");

        jLabel4.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Username");

        jLabel5.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Contraseña");

        jLabel6.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Confirmar contraseña");

        jLabel7.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Edad");

        botonReg.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 24)); // NOI18N
        botonReg.setText("Registrar");
        botonReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegActionPerformed(evt);
            }
        });

        bloqueRegNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloqueRegNombreActionPerformed(evt);
            }
        });

        bloqueRegEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloqueRegEdadActionPerformed(evt);
            }
        });

        bloqueRegUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloqueRegUsernameActionPerformed(evt);
            }
        });

        bloqueRegGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloqueRegGeneroActionPerformed(evt);
            }
        });

        bloqueRegContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloqueRegContraActionPerformed(evt);
            }
        });

        botonAInicioSesion.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 24)); // NOI18N
        botonAInicioSesion.setText("Volver al inicio de sesion");
        botonAInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAInicioSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(bloqueRegNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(bloqueRegEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)))))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(bloqueRegUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bloqueRegContra, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(bloqueRegGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bloqueRegConfirmContra, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(233, 233, 233))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonAInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonReg, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(264, 264, 264))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bloqueRegNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bloqueRegEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bloqueRegUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(bloqueRegContra))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bloqueRegGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bloqueRegConfirmContra, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(botonReg, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonAInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAInicioSesionActionPerformed
        Pagina_Inicial pgInicial = new Pagina_Inicial();
        pgInicial.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonAInicioSesionActionPerformed

    private void botonRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegActionPerformed
        
        String nombre = bloqueRegNombre.getText(), username = bloqueRegUsername.getText(), edadStr = bloqueRegEdad.getText();
        String generoStr = bloqueRegGenero.getText(), contra = bloqueRegContra.getText(), contraConfirm = bloqueRegContra.getText();
        int edadInt = Integer.parseInt(edadStr), largoGenero= generoStr.length();
        char generoChar = generoStr.charAt(0);
        
        User_info usuario= pgInicial.manejoUser.buscar(nombre);
        
        if(usuario == null && edadInt>0 && edadInt<100 && (generoChar=='M' || generoChar=='F' || generoChar=='m' || generoChar=='f') && contra.equalsIgnoreCase(contraConfirm) && largoGenero==1){
            boolean active=true;
            pgInicial.manejoUser.agregarUsuario(username, nombre, contra, generoChar, edadInt, active);
            pgInicial.setVisible(true);
            this.setVisible(false);
        }
        else if(usuario!=null){
            JOptionPane.showMessageDialog(rootPane, "Este nombre de usuario ya a sido utilizado, intente con otro nombre.");
        }else if(edadInt<=0 && edadInt>=100){
            JOptionPane.showMessageDialog(rootPane, "No se pueden ingresar edades menores o iguales a 0 y mayores o iguales a 100, intentelo denuevo.");
        }else if(generoChar!='M' && generoChar!='F'){
            JOptionPane.showMessageDialog(rootPane, "Solo se puede ingresar M(masculino) o F(femenino), intente otra vez.");
        }else if(!contra.equalsIgnoreCase(contraConfirm)){
            JOptionPane.showMessageDialog(rootPane, "Las contraseñas no son iguales, intentelo denuevo.");
        }else if(largoGenero!=1){
            JOptionPane.showMessageDialog(rootPane, "No ingrese mas de una letra que no sea M(Masculino) o F(Femenino) en la seccion de genero, intentelo denuevo.");
        }
    }//GEN-LAST:event_botonRegActionPerformed

    private void bloqueRegNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloqueRegNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bloqueRegNombreActionPerformed

    private void bloqueRegUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloqueRegUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bloqueRegUsernameActionPerformed

    private void bloqueRegEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloqueRegEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bloqueRegEdadActionPerformed

    private void bloqueRegContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloqueRegContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bloqueRegContraActionPerformed

    private void bloqueRegGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloqueRegGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bloqueRegGeneroActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField bloqueRegConfirmContra;
    private javax.swing.JPasswordField bloqueRegContra;
    private javax.swing.JTextField bloqueRegEdad;
    private javax.swing.JTextField bloqueRegGenero;
    private javax.swing.JTextField bloqueRegNombre;
    private javax.swing.JTextField bloqueRegUsername;
    private javax.swing.JButton botonAInicioSesion;
    private javax.swing.JButton botonReg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
