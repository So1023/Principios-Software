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
public class Comercial extends javax.swing.JFrame {

    /**
     * Creates new form Com
     */
    public Comercial() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        regresar = new javax.swing.JButton();
        video1 = new javax.swing.JButton();
        video2 = new javax.swing.JButton();
        video3 = new javax.swing.JButton();
        video4 = new javax.swing.JButton();

        regresar.setText("Pag.Principal");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        video1.setBackground(new java.awt.Color(204, 102, 255));
        video1.setText("Conferencia sobre habilidades comerciales");
        video1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                video1ActionPerformed(evt);
            }
        });

        video2.setBackground(new java.awt.Color(204, 102, 255));
        video2.setText("La creatividad no reconoce muros");
        video2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                video2ActionPerformed(evt);
            }
        });

        video3.setBackground(new java.awt.Color(204, 102, 255));
        video3.setText("Estrategia Comercial");
        video3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                video3ActionPerformed(evt);
            }
        });

        video4.setBackground(new java.awt.Color(204, 102, 255));
        video4.setText("¿Cómo crear una propuesta de servicios irresistible?");
        video4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                video4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(regresar))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(video4, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(video3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(video2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(video1, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(regresar)
                .addGap(30, 30, 30)
                .addComponent(video1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(video2)
                .addGap(33, 33, 33)
                .addComponent(video3)
                .addGap(33, 33, 33)
                .addComponent(video4)
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
 Principal_info PP = new Principal_info();   
 PP.setVisible(true);
 this.dispose();
    }//GEN-LAST:event_regresarActionPerformed

    private void video1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_video1ActionPerformed
     if(java.awt.Desktop.isDesktopSupported()){
           java.awt.Desktop desktop= java.awt.Desktop.getDesktop();
           
           if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
               
           try{ 
           java.net.URI uri = new URI("https://youtu.be/lFltgj23hNA");
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
           java.net.URI uri = new URI("https://youtu.be/Kf1Nieb4qT4");
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
           java.net.URI uri = new URI("https://youtu.be/MQIJmusXVfc");
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
           java.net.URI uri = new URI("https://youtu.be/-5CVeBim8BQ");
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
            java.util.logging.Logger.getLogger(Comercial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Comercial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Comercial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Comercial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Comercial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton regresar;
    private javax.swing.JButton video1;
    private javax.swing.JButton video2;
    private javax.swing.JButton video3;
    private javax.swing.JButton video4;
    // End of variables declaration//GEN-END:variables
}
