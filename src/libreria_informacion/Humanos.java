/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria_informacion;

import java.net.URI;

/**
 *
 * @author LENOVO
 */
public class Humanos extends javax.swing.JFrame {

    /**
     * Creates new form Humanos
     */
    public Humanos() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        pag_principal = new javax.swing.JButton();
        video1 = new javax.swing.JButton();
        video2 = new javax.swing.JButton();
        video3 = new javax.swing.JButton();
        video4 = new javax.swing.JButton();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        pag_principal.setText("Pag.Principal");
        pag_principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pag_principalActionPerformed(evt);
            }
        });

        video1.setBackground(new java.awt.Color(153, 153, 255));
        video1.setText("10 cosas que hace un empleado exitoso");
        video1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                video1ActionPerformed(evt);
            }
        });

        video2.setBackground(new java.awt.Color(153, 153, 255));
        video2.setText("Recursos humanos: habilidades laborales");
        video2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                video2ActionPerformed(evt);
            }
        });

        video3.setBackground(new java.awt.Color(153, 153, 255));
        video3.setText("  Establecer habilidades, competencias y actitudes de puesto");
        video3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                video3ActionPerformed(evt);
            }
        });

        video4.setBackground(new java.awt.Color(153, 153, 255));
        video4.setText("¿Cómo motivar a los empleados?");
        video4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                video4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pag_principal))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(video3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(video1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(video2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(video4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 44, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pag_principal)
                .addGap(26, 26, 26)
                .addComponent(video1)
                .addGap(28, 28, 28)
                .addComponent(video2)
                .addGap(35, 35, 35)
                .addComponent(video3)
                .addGap(30, 30, 30)
                .addComponent(video4)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pag_principalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pag_principalActionPerformed
 Principal_info PP = new Principal_info();   
 PP.setVisible(true);
 this.dispose();
    }//GEN-LAST:event_pag_principalActionPerformed

    private void video1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_video1ActionPerformed
      if(java.awt.Desktop.isDesktopSupported()){
           java.awt.Desktop desktop= java.awt.Desktop.getDesktop();
           
           if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
               
           try{ 
           java.net.URI uri = new URI("https://youtu.be/1bIzxaqNGMM");
          desktop.browse(uri);
           }catch(Exception e){
               
       }
      }
     }
    }//GEN-LAST:event_video1ActionPerformed

    private void video2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_video2ActionPerformed
      if(java.awt.Desktop.isDesktopSupported()){
           java.awt.Desktop desktop= java.awt.Desktop.getDesktop();
           
           if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
               
           try{ 
           java.net.URI uri = new URI("https://youtu.be/VOqZOHliwoU");
          desktop.browse(uri);
           }catch(Exception e){
               
       }
      }
     }
    }//GEN-LAST:event_video2ActionPerformed

    private void video3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_video3ActionPerformed
    if(java.awt.Desktop.isDesktopSupported()){
           java.awt.Desktop desktop= java.awt.Desktop.getDesktop();
           
           if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
               
           try{ 
           java.net.URI uri = new URI("https://youtu.be/uzEgmT6hGio");
          desktop.browse(uri);
           }catch(Exception e){
               
       }
      }
     }
    }//GEN-LAST:event_video3ActionPerformed

    private void video4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_video4ActionPerformed
     if(java.awt.Desktop.isDesktopSupported()){
           java.awt.Desktop desktop= java.awt.Desktop.getDesktop();
           
           if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
               
           try{ 
           java.net.URI uri = new URI("https://youtu.be/FyajMe_3XNk");
          desktop.browse(uri);
           }catch(Exception e){
               
       }
      }
     }
    }//GEN-LAST:event_video4ActionPerformed

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
            java.util.logging.Logger.getLogger(Humanos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Humanos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Humanos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Humanos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Humanos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JButton pag_principal;
    private javax.swing.JButton video1;
    private javax.swing.JButton video2;
    private javax.swing.JButton video3;
    private javax.swing.JButton video4;
    // End of variables declaration//GEN-END:variables
}
