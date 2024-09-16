package william_martinez_proyecto2_q3;


import javax.swing.JOptionPane;


public class Pagina_Multiple extends javax.swing.JFrame {
    Pagina_Inicial pgInicial;
    
    
    public Pagina_Multiple(Pagina_Inicial pgInicial) {
        initComponents();
        this.pgInicial = pgInicial;
        this.setLocation(0, 0);
        twitsTimeline.setText(pgInicial.twits_Generales.imprimirTwits());
        
    

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
        Menciones = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        HashtagtrendingView = new javax.swing.JTextArea();
        buscarMenciones = new javax.swing.JTextField();
        Hashtag = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        zonaEscribir = new javax.swing.JTextArea();
        pgBotonPerfil = new javax.swing.JButton();

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

        Menciones.setEditable(false);
        Menciones.setColumns(20);
        Menciones.setRows(5);
        Menciones.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                MencionesComponentAdded(evt);
            }
        });
        jScrollPane2.setViewportView(Menciones);

        HashtagtrendingView.setEditable(false);
        HashtagtrendingView.setColumns(20);
        HashtagtrendingView.setRows(5);
        HashtagtrendingView.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                HashtagtrendingViewComponentAdded(evt);
            }
        });
        jScrollPane3.setViewportView(HashtagtrendingView);

        buscarMenciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarMencionesActionPerformed(evt);
            }
        });

        Hashtag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HashtagActionPerformed(evt);
            }
        });

        zonaEscribir.setColumns(20);
        zonaEscribir.setRows(5);
        jScrollPane4.setViewportView(zonaEscribir);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(323, 323, 323)
                                .addComponent(botonEnviarTwit))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 43, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addComponent(buscarMenciones)
                    .addComponent(Hashtag))
                .addGap(23, 23, 23))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(buscarMenciones, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Hashtag, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonEnviarTwit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 780, 560));

        pgBotonPerfil.setBackground(new java.awt.Color(51, 51, 51));
        pgBotonPerfil.setFont(new java.awt.Font("Roboto Black", 0, 11)); // NOI18N
        pgBotonPerfil.setText("Perfil");
        pgBotonPerfil.setBorderPainted(false);
        pgBotonPerfil.setContentAreaFilled(false);
        pgBotonPerfil.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        pgBotonPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pgBotonPerfilActionPerformed(evt);
            }
        });
        jPanel4.add(pgBotonPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 150, -1));

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

    private void pgBotonPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pgBotonPerfilActionPerformed
        pgPerfil_Usuario perfilUsuario = new pgPerfil_Usuario(pgInicial);
        
        perfilUsuario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_pgBotonPerfilActionPerformed

    private void buscarMencionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarMencionesActionPerformed
        String username = buscarMenciones.getText();
    
    // Llamada al método para buscar menciones
    String[] menciones = pgInicial.manejoUser.buscarMenciones(username);
    
    // Mostrar el resultado en un componente adecuado (por ejemplo, un JTextArea o JLabel)
    StringBuilder resultado = new StringBuilder("Menciones encontradas:\n");
    for (String mencion : menciones) {
        if (mencion != null) {
            resultado.append(mencion).append("\n");
        }
    }
    
    // Supongamos que tienes un JTextArea para mostrar las menciones
    Menciones.setText(resultado.toString());
    }//GEN-LAST:event_buscarMencionesActionPerformed

    private void MencionesComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_MencionesComponentAdded
        // TODO add your handling code here:
        // Podrías cargar datos de menciones o actualizar la vista cuando el componente se añada
    String username = buscarMenciones.getText();
    if (!username.isEmpty()) {
        String[] menciones = pgInicial.manejoUser.buscarMenciones(username);
        StringBuilder resultado = new StringBuilder("Menciones encontradas:\n");
        for (String mencion : menciones) {
            if (mencion != null) {
                resultado.append(mencion).append("\n");
            }
          Menciones.setText(resultado.toString());
        }
    }
    }//GEN-LAST:event_MencionesComponentAdded

    private void HashtagtrendingViewComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_HashtagtrendingViewComponentAdded
        // TODO add your handling code here:
         // Podrías mostrar los hashtags en tendencia cuando el componente se añada
    pgInicial.manejoUser.mostrarTrendingHashtags();
    }//GEN-LAST:event_HashtagtrendingViewComponentAdded

    private void HashtagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HashtagActionPerformed
        // TODO add your handling code here:
         String hashtag = Hashtag.getText();
    
    // Buscar tweets por hashtag
    String[] twitsConHashtag = pgInicial.manejoUser.buscarTwitsPorHashtag(hashtag);
    
    // Mostrar los tweets en un componente adecuado (por ejemplo, un JTextArea o JLabel)
    StringBuilder resultado = new StringBuilder("Tweets con el hashtag ").append(hashtag).append(":\n");
    for (String twit : twitsConHashtag) {
        if (twit != null) {
            resultado.append(twit).append("\n");
        }
    }
    
    // Supongamos que tienes un JTextArea para mostrar los tweets
    HashtagtrendingView.setText(resultado.toString());
    }//GEN-LAST:event_HashtagActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Hashtag;
    private javax.swing.JTextArea HashtagtrendingView;
    private javax.swing.JTextArea Menciones;
    private javax.swing.JLabel TituloTxt;
    private javax.swing.JPanel background;
    private javax.swing.JButton botonEnviarTwit;
    private javax.swing.JButton botonPgCerrarSesion;
    private javax.swing.JTextField buscarMenciones;
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
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton pgBotonPerfil;
    private javax.swing.JTextArea twitsTimeline;
    private javax.swing.JTextArea zonaEscribir;
    // End of variables declaration//GEN-END:variables

    void mostrarPantalla(String paginaInicial) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
