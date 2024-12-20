/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import DefenseObservable.DefenseObservable;
import DefenseObserver.DefenseObserver;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Sahan Chamara
 */
public class SubmarineView extends javax.swing.JFrame implements DefenseObserver {

    private boolean isSelected;
    private DefenseObservable observable;
    

    /**
     * Creates new form SubmarineView
     * @param observable
     */
    public SubmarineView(DefenseObservable observable) {
        this.observable=observable;
        
        initComponents();
        setBottomRightPosition();
        btnShoot1.setEnabled(false);
        btnSonar.setEnabled(false);
        btnTomohowkMissle.setEnabled(false);
        btnTradient2Missile.setEnabled(false);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        lblAreaSubmarine = new javax.swing.JLabel();
        txtFieldSubmarine = new javax.swing.JTextField();
        btnTomohowkMissle = new javax.swing.JButton();
        btnSonar = new javax.swing.JButton();
        jSlider1 = new javax.swing.JSlider();
        btnSendHelicopter = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaSubmarine = new javax.swing.JTextArea();
        btnShoot1 = new javax.swing.JButton();
        chkPositionSubmarine = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        btnTradient2Missile = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSlider2 = new javax.swing.JSlider();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(null);
        getContentPane().add(jSpinner1);
        jSpinner1.setBounds(530, 40, 55, 22);

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jLabel1.setText("Submarine");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 0, 142, 50);
        getContentPane().add(jSpinner2);
        jSpinner2.setBounds(530, 70, 55, 22);

        lblAreaSubmarine.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lblAreaSubmarine.setForeground(new java.awt.Color(255, 255, 255));
        lblAreaSubmarine.setText("Area Not Cleared");
        getContentPane().add(lblAreaSubmarine);
        lblAreaSubmarine.setBounds(30, 50, 176, 21);

        txtFieldSubmarine.setBackground(new java.awt.Color(2, 48, 63));
        txtFieldSubmarine.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtFieldSubmarine);
        txtFieldSubmarine.setBounds(180, 330, 180, 22);

        btnTomohowkMissle.setBackground(new java.awt.Color(5, 75, 90));
        btnTomohowkMissle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTomohowkMissle.setForeground(new java.awt.Color(255, 255, 255));
        btnTomohowkMissle.setText("Tomohawk Missile");
        btnTomohowkMissle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTomohowkMissleActionPerformed(evt);
            }
        });
        getContentPane().add(btnTomohowkMissle);
        btnTomohowkMissle.setBounds(110, 150, 160, 30);

        btnSonar.setBackground(new java.awt.Color(5, 75, 90));
        btnSonar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSonar.setForeground(new java.awt.Color(255, 255, 255));
        btnSonar.setText("Sonar Operation");
        btnSonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSonarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSonar);
        btnSonar.setBounds(330, 100, 160, 30);

        jSlider1.setMajorTickSpacing(20);
        jSlider1.setMinorTickSpacing(5);
        jSlider1.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setValue(0);
        getContentPane().add(jSlider1);
        jSlider1.setBounds(20, 180, 46, 210);

        btnSendHelicopter.setBackground(new java.awt.Color(2, 48, 63));
        btnSendHelicopter.setForeground(new java.awt.Color(255, 255, 255));
        btnSendHelicopter.setText("Send");
        btnSendHelicopter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendHelicopterActionPerformed(evt);
            }
        });
        getContentPane().add(btnSendHelicopter);
        btnSendHelicopter.setBounds(380, 330, 63, 22);

        txtAreaSubmarine.setBackground(new java.awt.Color(3, 67, 87));
        txtAreaSubmarine.setColumns(20);
        txtAreaSubmarine.setForeground(new java.awt.Color(255, 255, 255));
        txtAreaSubmarine.setRows(5);
        jScrollPane1.setViewportView(txtAreaSubmarine);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(180, 200, 250, 110);

        btnShoot1.setBackground(new java.awt.Color(5, 75, 90));
        btnShoot1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnShoot1.setForeground(new java.awt.Color(255, 255, 255));
        btnShoot1.setText("Shoot");
        btnShoot1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShoot1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnShoot1);
        btnShoot1.setBounds(120, 100, 140, 30);

        chkPositionSubmarine.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        chkPositionSubmarine.setText("Position");
        chkPositionSubmarine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPositionSubmarineActionPerformed(evt);
            }
        });
        getContentPane().add(chkPositionSubmarine);
        chkPositionSubmarine.setBounds(260, 70, 80, 23);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Soldire Count");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(420, 40, 91, 20);

        btnTradient2Missile.setBackground(new java.awt.Color(5, 75, 90));
        btnTradient2Missile.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTradient2Missile.setForeground(new java.awt.Color(255, 255, 255));
        btnTradient2Missile.setText("Tradeint 2 Missile");
        btnTradient2Missile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTradient2MissileActionPerformed(evt);
            }
        });
        getContentPane().add(btnTradient2Missile);
        btnTradient2Missile.setBounds(330, 150, 160, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ammo Count");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(420, 70, 88, 20);

        jSlider2.setMajorTickSpacing(20);
        jSlider2.setMinorTickSpacing(5);
        jSlider2.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider2.setPaintLabels(true);
        jSlider2.setPaintTicks(true);
        jSlider2.setValue(0);
        getContentPane().add(jSlider2);
        jSlider2.setBounds(530, 170, 46, 210);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Oxygen");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(530, 150, 60, 20);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Energy");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 160, 50, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Background Videos/submarine.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setMaximumSize(new java.awt.Dimension(600, 400));
        jLabel2.setMinimumSize(new java.awt.Dimension(600, 400));
        jLabel2.setPreferredSize(new java.awt.Dimension(600, 400));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-3, -4, 600, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void defense(int position) {
        if (position > 20 && isSelected) {
            btnShoot1.setEnabled(true);
        } else {
            btnShoot1.setEnabled(false);
        }
        if (position > 35 && isSelected) {
            btnSonar.setEnabled(true);
        } else {
            btnSonar.setEnabled(false);
        }
        if (position > 75 && isSelected) {
            btnTomohowkMissle.setEnabled(true);
        } else {
            btnTomohowkMissle.setEnabled(false);
        }
        if (position > 85 && isSelected) {
            btnTradient2Missile.setEnabled(true);
        } else {
            btnTradient2Missile.setEnabled(false);
        }
    }
    
    @Override
    public void setAreaText(boolean isSelected){
        if(isSelected){
            lblAreaSubmarine.setText("Area Cleared");
        }else{
            lblAreaSubmarine.setText("Area Not Cleared");
        }
    }
    
    @Override
    public void setSendMsg(String msg){
        txtAreaSubmarine.setText(msg);
    }

    private void btnTomohowkMissleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTomohowkMissleActionPerformed

    }//GEN-LAST:event_btnTomohowkMissleActionPerformed

    private void btnSonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSonarActionPerformed

    }//GEN-LAST:event_btnSonarActionPerformed

    private void btnShoot1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShoot1ActionPerformed

    }//GEN-LAST:event_btnShoot1ActionPerformed

    private void chkPositionSubmarineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPositionSubmarineActionPerformed
        isSelected = chkPositionSubmarine.isSelected();
    }//GEN-LAST:event_chkPositionSubmarineActionPerformed

    private void btnTradient2MissileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTradient2MissileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTradient2MissileActionPerformed

    private void btnSendHelicopterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendHelicopterActionPerformed
        observable.militaryVehicleSendMsg("Submarine : "+txtFieldSubmarine.getText());        
    }//GEN-LAST:event_btnSendHelicopterActionPerformed

    private void setBottomRightPosition() {
    // Get the screen dimensions
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    // Get the width and height of the JFrame
    int frameWidth = this.getWidth();
    int frameHeight = this.getHeight();

    // Calculate the bottom-right position
    int x = screenSize.width - frameWidth; // Right edge
    int y = screenSize.height - frameHeight; // Bottom edge

    // Set the JFrame's location
    this.setLocation(x, y);
}
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(SubmarineView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(SubmarineView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(SubmarineView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(SubmarineView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new SubmarineView().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSendHelicopter;
    private javax.swing.JButton btnShoot1;
    private javax.swing.JButton btnSonar;
    private javax.swing.JButton btnTomohowkMissle;
    private javax.swing.JButton btnTradient2Missile;
    private javax.swing.JCheckBox chkPositionSubmarine;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JLabel lblAreaSubmarine;
    private javax.swing.JTextArea txtAreaSubmarine;
    private javax.swing.JTextField txtFieldSubmarine;
    // End of variables declaration//GEN-END:variables
}
