package william_martinez_proyecto2_q3;

import javax.swing.JOptionPane;

public class Pagina_Registro extends javax.swing.JFrame {
    
    Pagina_Inicial pgInicial;
    
    public Pagina_Registro(Pagina_Inicial pgInicial) {
        initComponents();
        this.pgInicial = pgInicial;
        this.setLocation(0, 0);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        botonAInicioSesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        generoRegGenero = new javax.swing.JComboBox<>();
        botonReg = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        bloqueRegEdad = new javax.swing.JTextField();
        bloqueRegContra = new javax.swing.JPasswordField();
        bloqueRegConfirmContra = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bloqueRegUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        bloqueRegNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.setBackground(new java.awt.Color(230, 242, 254));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nombre de usuario");

        botonAInicioSesion.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        botonAInicioSesion.setText("Volver al Inicio de Sesion");
        botonAInicioSesion.setBorderPainted(false);
        botonAInicioSesion.setContentAreaFilled(false);
        botonAInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAInicioSesionActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto", 3, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro");

        generoRegGenero.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        generoRegGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        generoRegGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generoRegGeneroActionPerformed(evt);
            }
        });

        botonReg.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        botonReg.setText("Registrar");
        botonReg.setBorderPainted(false);
        botonReg.setContentAreaFilled(false);
        botonReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Edad");

        bloqueRegEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloqueRegEdadActionPerformed(evt);
            }
        });

        bloqueRegContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloqueRegContraActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Confirmar Contraseña");

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Genero (M/F)");

        bloqueRegUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloqueRegUsernameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Username");

        bloqueRegNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloqueRegNombreActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Contraseña");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addComponent(generoRegGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(bloqueRegUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(bloqueRegNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(bloqueRegEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(bloqueRegContra, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(bloqueRegConfirmContra, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addComponent(botonReg, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonAInicioSesion)
                .addGap(264, 264, 264))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bloqueRegEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bloqueRegNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bloqueRegContra, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bloqueRegUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bloqueRegConfirmContra, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(generoRegGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botonReg, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(botonAInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 560));

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAInicioSesionActionPerformed
        pgInicial.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonAInicioSesionActionPerformed

    private void botonRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegActionPerformed
        Pagina_Multiple pgMultiple = new Pagina_Multiple(pgInicial);
        
        String nombre = bloqueRegNombre.getText(), username = bloqueRegUsername.getText(), edadStr = bloqueRegEdad.getText();
        String generoStr = generoRegGenero.getSelectedItem().toString() , contra = bloqueRegContra.getText(), contraConfirm = bloqueRegConfirmContra.getText();
        int edadInt = Integer.parseInt(edadStr), largoGenero= generoStr.length();
        char generoChar = generoStr.charAt(0);
        
        System.out.println("Username: " + username);
    System.out.println("Nombre: " + nombre);
    System.out.println("Edad: " + edadInt);
    System.out.println("Genero: " + generoChar);
        
        User_info usuario= pgInicial.manejoUser.buscar(username);
        
        if(usuario == null && edadInt>0 && edadInt<100 && (generoChar=='M' || generoChar=='F' || generoChar=='m' || generoChar=='f') && contra.equalsIgnoreCase(contraConfirm) && largoGenero==1){
            pgInicial.manejoUser.agregarUsuario(username, nombre, contra, generoChar, edadInt);
            pgMultiple.setVisible(true);
            this.setVisible(false);
        }
        else if(usuario!=null){
            JOptionPane.showMessageDialog(rootPane, "Este nombre de usuario ya a sido utilizado, intente con otro nombre.");
        }else if(edadInt<=0 || edadInt>=100){
            JOptionPane.showMessageDialog(rootPane, "No se pueden ingresar edades menores o iguales a 0 y mayores o iguales a 100, intentelo denuevo.");
        }else if(generoChar!='M' && generoChar!='F' && generoChar!='m' && generoChar!='f'){
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

    private void generoRegGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generoRegGeneroActionPerformed

    }//GEN-LAST:event_generoRegGeneroActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField bloqueRegConfirmContra;
    private javax.swing.JPasswordField bloqueRegContra;
    private javax.swing.JTextField bloqueRegEdad;
    private javax.swing.JTextField bloqueRegNombre;
    private javax.swing.JTextField bloqueRegUsername;
    private javax.swing.JButton botonAInicioSesion;
    private javax.swing.JButton botonReg;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> generoRegGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
