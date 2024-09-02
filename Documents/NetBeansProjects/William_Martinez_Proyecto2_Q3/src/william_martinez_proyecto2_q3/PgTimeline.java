/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package william_martinez_proyecto2_q3;

import java.awt.Dimension;
import javax.swing.JPanel;

/**
 *
 * @author DELL
 */
public class PgTimeline extends javax.swing.JPanel {
    
    Pagina_Inicial pgInicial;
    
    public PgTimeline(Pagina_Inicial pgInicial) {
        initComponents();
        this.pgInicial=pgInicial;
        setPreferredSize(new Dimension(770, 560));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
