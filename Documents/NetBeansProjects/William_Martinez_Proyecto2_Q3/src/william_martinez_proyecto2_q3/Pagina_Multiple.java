package william_martinez_proyecto2_q3;

import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

public class Pagina_Multiple extends javax.swing.JFrame {
    Pagina_Inicial pgInicial;
    
    public Pagina_Multiple(Pagina_Inicial pgInicial) {
        initComponents();
        this.pgInicial = pgInicial;
        this.setLocation(0, 0);
        
//        System.out.println("Estado de loggedUser antes de obtener el usuario: " + pgInicial.loggedUser);
//        User_info user = pgInicial.loggedUser.getLoggedUser();
//        System.out.println("Usuario en loggedUser: " + pgInicial.loggedUser.getLoggedUser());
//        
//        System.out.println("Estado de usuario en mostrarTimeline: " + user);
//        
//        if (pgInicial.loggedUser != null) {
//        
//            if (user != null) {
//        // Llama a mostrarTimeline solo si el usuario no es null
//        twitsTimeline.setText(pgInicial.twits_Timeline.mostrarTimeline(user));
//            } else {
//                System.out.println("Error: El usuario no está inicializado.");
//        }
//        } else {
//            System.out.println("Error: loggedUser no está inicializado.");
//        }
//        
//        String timelineTexto = pgInicial.twits_Timeline.mostrarTimeline(user);
//        twitsTimeline.setText(timelineTexto);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        background = new javax.swing.JPanel();
        cajaPaneles = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        TituloTxt = new javax.swing.JLabel();
        botonPgEditar_Perfil = new javax.swing.JButton();
        botonPgCerrarSesion = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        twitsTimeline = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        botonEnviarTwit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        zonaEscribir = new javax.swing.JTextField();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jPanel1.setLayout(new javax.swing.OverlayLayout(jPanel1));
        getContentPane().add(jPanel1);

        background.setBackground(new java.awt.Color(239, 239, 244));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cajaPaneles.setLayout(new javax.swing.OverlayLayout(cajaPaneles));
        background.add(cajaPaneles, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 268, -1, -1));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TituloTxt.setFont(new java.awt.Font("Roboto Black", 0, 11)); // NOI18N
        TituloTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloTxt.setText("SWITCH");
        jPanel4.add(TituloTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 12, 150, 39));

        botonPgEditar_Perfil.setBackground(new java.awt.Color(51, 51, 51));
        botonPgEditar_Perfil.setFont(new java.awt.Font("Roboto Black", 0, 11)); // NOI18N
        botonPgEditar_Perfil.setText("Editar perfil");
        botonPgEditar_Perfil.setBorderPainted(false);
        botonPgEditar_Perfil.setContentAreaFilled(false);
        botonPgEditar_Perfil.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        botonPgEditar_Perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPgEditar_PerfilActionPerformed(evt);
            }
        });
        jPanel4.add(botonPgEditar_Perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 150, -1));

        botonPgCerrarSesion.setBackground(new java.awt.Color(51, 51, 51));
        botonPgCerrarSesion.setFont(new java.awt.Font("Roboto Black", 0, 11)); // NOI18N
        botonPgCerrarSesion.setText("Cerrar sesion");
        botonPgCerrarSesion.setBorderPainted(false);
        botonPgCerrarSesion.setContentAreaFilled(false);
        botonPgCerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        botonPgCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPgCerrarSesionActionPerformed(evt);
            }
        });
        jPanel4.add(botonPgCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 150, -1));

        jPanel5.setBackground(new java.awt.Color(219, 219, 255));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("En que estas pensando?");

        twitsTimeline.setEditable(false);
        twitsTimeline.setColumns(20);
        twitsTimeline.setRows(5);
        jScrollPane1.setViewportView(twitsTimeline);

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Twits");

        botonEnviarTwit.setText("Enviar twit");
        botonEnviarTwit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEnviarTwitActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Buscar menciones: ");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Buscar Hashtags:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonEnviarTwit))
                    .addComponent(zonaEscribir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addComponent(jTextField2)
                    .addComponent(jTextField3))
                .addGap(23, 23, 23))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(zonaEscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(botonEnviarTwit))
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 780, 560));

        background.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 560));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonPgCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPgCerrarSesionActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null,
            "¿Estás seguro de que quieres cerrar sesion?",
            "Confirmar acción",
            JOptionPane.YES_NO_OPTION);

        if (opcion==JOptionPane.YES_OPTION){
            pgInicial.loggedUser.unloggedUser();
            pgInicial.setVisible(true);
            this.setVisible(false);
        }

        else if(opcion==JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(rootPane, "Cierre de sesion cancelado.");
        }
    }//GEN-LAST:event_botonPgCerrarSesionActionPerformed

    private void botonPgEditar_PerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPgEditar_PerfilActionPerformed

    }//GEN-LAST:event_botonPgEditar_PerfilActionPerformed

    private void botonEnviarTwitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEnviarTwitActionPerformed

//        System.out.println(pgInicial.loggedUser.isLogged());
        String contenidoTwit= zonaEscribir.getText();

        User_info user = pgInicial.loggedUser.getLoggedUser();
//        String timelineTexto = pgInicial.twits_Timeline.mostrarTimeline(user);
        
        System.out.println(contenidoTwit);
        
        String usuario = pgInicial.loggedUser.getLoggedUser().getNombreUser();
        
        if(contenidoTwit.length()<=140 && contenidoTwit.length()>0){
            boolean twit = pgInicial.twits_Generales.agregarTwit(contenidoTwit, usuario);
            pgInicial.manejoUser.agregarTwit(pgInicial.loggedUser.getLoggedUser().getNombreUser(), contenidoTwit);
//            pgInicial.manejoUser.agregarTwit(contenidoTwit, contenidoTwit)
            System.out.println(twit);
            if (twit){
//                System.out.println(timelineTexto);
                twitsTimeline.setText(pgInicial.twits_Generales.imprimirTwits());
                zonaEscribir.setText("");
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "No ingrese twits repetidos ni twits vacios.  ");
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Ingreso mas de 140 letras o ninguna letra.");
        }
    }//GEN-LAST:event_botonEnviarTwitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TituloTxt;
    private javax.swing.JPanel background;
    private javax.swing.JButton botonEnviarTwit;
    private javax.swing.JButton botonPgCerrarSesion;
    private javax.swing.JButton botonPgEditar_Perfil;
    private javax.swing.JPanel cajaPaneles;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextArea twitsTimeline;
    private javax.swing.JTextField zonaEscribir;
    // End of variables declaration//GEN-END:variables

    void mostrarPantalla(String paginaInicial) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
