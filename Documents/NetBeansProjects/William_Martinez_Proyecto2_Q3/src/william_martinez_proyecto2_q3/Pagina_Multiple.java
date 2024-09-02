package william_martinez_proyecto2_q3;

import java.awt.Dimension;
import javax.swing.JPanel;

public class Pagina_Multiple extends javax.swing.JFrame {
    Pagina_Inicial pgInicial;
    
    public Pagina_Multiple(Pagina_Inicial pgInicial) {
        initComponents();
        this.pgInicial = pgInicial;
        this.setLocation(0, 0);
        PgTimeline pgTimeline= new PgTimeline(pgInicial);
        
        cambioPg(pgTimeline);
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
        botonPgTimeline = new javax.swing.JButton();
        botnonPgBusqueda = new javax.swing.JButton();
        BotonPgInteracciones = new javax.swing.JButton();
        botonPgEditar_Perfil = new javax.swing.JButton();
        botonPgCerrarSesion = new javax.swing.JButton();
        fondoMult = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();

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

        TituloTxt.setFont(new java.awt.Font("Roboto Black", 0, 11)); // NOI18N
        TituloTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloTxt.setText("SWITCH");

        botonPgTimeline.setBackground(new java.awt.Color(0, 0, 0));
        botonPgTimeline.setFont(new java.awt.Font("Roboto Black", 0, 11)); // NOI18N
        botonPgTimeline.setText("Timeline");
        botonPgTimeline.setBorderPainted(false);
        botonPgTimeline.setContentAreaFilled(false);
        botonPgTimeline.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        botonPgTimeline.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonPgTimeline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPgTimelineActionPerformed(evt);
            }
        });

        botnonPgBusqueda.setBackground(new java.awt.Color(51, 51, 51));
        botnonPgBusqueda.setFont(new java.awt.Font("Roboto Black", 0, 11)); // NOI18N
        botnonPgBusqueda.setText("Hashtags");
        botnonPgBusqueda.setBorderPainted(false);
        botnonPgBusqueda.setContentAreaFilled(false);
        botnonPgBusqueda.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        botnonPgBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botnonPgBusquedaActionPerformed(evt);
            }
        });

        BotonPgInteracciones.setBackground(new java.awt.Color(51, 51, 51));
        BotonPgInteracciones.setFont(new java.awt.Font("Roboto Black", 0, 11)); // NOI18N
        BotonPgInteracciones.setText("Interacciones");
        BotonPgInteracciones.setBorderPainted(false);
        BotonPgInteracciones.setContentAreaFilled(false);
        BotonPgInteracciones.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        BotonPgInteracciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPgInteraccionesActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BotonPgInteracciones, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
            .addComponent(botonPgTimeline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botnonPgBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(TituloTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonPgEditar_Perfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonPgCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TituloTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(botonPgTimeline)
                .addGap(15, 15, 15)
                .addComponent(botnonPgBusqueda)
                .addGap(15, 15, 15)
                .addComponent(BotonPgInteracciones)
                .addGap(15, 15, 15)
                .addComponent(botonPgEditar_Perfil)
                .addGap(18, 18, 18)
                .addComponent(botonPgCerrarSesion)
                .addContainerGap(294, Short.MAX_VALUE))
        );

        background.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 560));

        fondoMult.setBackground(new java.awt.Color(230, 242, 254));
        fondoMult.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        fondoMult.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 560));

        background.add(fondoMult, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 770, 560));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonPgInteraccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPgInteraccionesActionPerformed
        PgInteracciones pgInteracciones = new PgInteracciones(pgInicial);
        cambioPg(pgInteracciones);
    }//GEN-LAST:event_BotonPgInteraccionesActionPerformed

    private void botonPgTimelineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPgTimelineActionPerformed
        PgTimeline pgTimeline= new PgTimeline(pgInicial);
        cambioPg(pgTimeline);
    }//GEN-LAST:event_botonPgTimelineActionPerformed

    private void botonPgCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPgCerrarSesionActionPerformed
        Cerrar_Sesion cerrarSesion = new Cerrar_Sesion(pgInicial);
        cambioPg(cerrarSesion);
    }//GEN-LAST:event_botonPgCerrarSesionActionPerformed

    private void botnonPgBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botnonPgBusquedaActionPerformed
        PgBusqueda_Twit_Hashtag pgBuscTwitHasht = new PgBusqueda_Twit_Hashtag(pgInicial);
        cambioPg(pgBuscTwitHasht);
    }//GEN-LAST:event_botnonPgBusquedaActionPerformed

    private void botonPgEditar_PerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPgEditar_PerfilActionPerformed
        PgEditar_perfil pgEditarPerfil = new PgEditar_perfil(pgInicial);
        cambioPg(pgEditarPerfil);
    }//GEN-LAST:event_botonPgEditar_PerfilActionPerformed
private void cambioPg(JPanel p){
    
    if (p == null) {
        System.out.println("El panel a cambiar es nulo.");
        return;
    }
    
    System.out.println("Tamaño de fondoMult: " + fondoMult.getSize());
    System.out.println("Tamaño del nuevo panel: " + p.getSize());
    
    p.setSize(fondoMult.getWidth(), fondoMult.getHeight());
    p.setPreferredSize(new Dimension(770, 560));
    p.setLocation(0, 0);
    p.setBounds(0, 0, fondoMult.getWidth(), fondoMult.getHeight());
    
    fondoMult.removeAll();
    fondoMult.add(p);
    fondoMult.revalidate();
    fondoMult.repaint();
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonPgInteracciones;
    private javax.swing.JLabel TituloTxt;
    private javax.swing.JPanel background;
    private javax.swing.JButton botnonPgBusqueda;
    private javax.swing.JButton botonPgCerrarSesion;
    private javax.swing.JButton botonPgEditar_Perfil;
    private javax.swing.JButton botonPgTimeline;
    private javax.swing.JPanel cajaPaneles;
    private javax.swing.JPanel fondoMult;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
