package test;

import ExamCell.E_Home;
import ExamCell.E_Exam;
import ExamCell.E_HallTicket;
import ExamCell.E_register;
import ExamCell.E_Report;
import ExamCell.E_Course;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.*;
import javax.swing.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ikuna
 */
public class Examcell_Dashboard extends javax.swing.JFrame {
    GridBagLayout layout = new GridBagLayout();
    E_Home E1;
    E_Course E2;
    E_Report E3;
    E_register E4;
    E_HallTicket E5;
    E_Exam E6;
    
    
    
            

    /*
     * Creates new form Examcell_Dashboard
     */
    public Examcell_Dashboard() {
        initComponents();
        ExamcellName.setText(LoginSession.UserName);
        ExamcellId.setText(LoginSession.UserId);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        E1 = new E_Home();
        E2 = new E_Course();
        E3 = new E_Report();
        E4 = new E_register();
        E5 = new E_HallTicket();
        E6 = new E_Exam();
        DynamicPanel.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx =0;
        c.gridy=0;
        DynamicPanel.add(E1,c);
        c.gridx =0;
        c.gridy=0;
        DynamicPanel.add(E2,c);
        c.gridx =0;
        c.gridy=0;
        DynamicPanel.add(E3,c);
        c.gridx =0;
        c.gridy=0;
        DynamicPanel.add(E4,c);
        c.gridx =0;
        c.gridy=0;
        DynamicPanel.add(E5,c);
        c.gridx =0;
        c.gridy=0;
        DynamicPanel.add(E6,c);
        E1.setVisible(true);
        E2.setVisible(false);
        E3.setVisible(false);
        E4.setVisible(false);
        E5.setVisible(false);
        E6.setVisible(false);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        coursebtn = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Logout = new javax.swing.JButton();
        ExamcellId = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ExamcellName = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DynamicPanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1098, 673));

        jPanel1.setBackground(new java.awt.Color(19, 103, 149));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setPreferredSize(new java.awt.Dimension(192, 472));

        jButton1.setBackground(new java.awt.Color(19, 103, 149));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(250, 250, 250));
        jButton1.setText("Home");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        coursebtn.setBackground(new java.awt.Color(19, 103, 149));
        coursebtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        coursebtn.setForeground(new java.awt.Color(250, 250, 250));
        coursebtn.setText("Courses");
        coursebtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        coursebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursebtnActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(19, 103, 149));
        jButton5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(250, 250, 250));
        jButton5.setText("Register");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(19, 103, 149));
        jButton6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(250, 250, 250));
        jButton6.setText("Hall Ticket");
        jButton6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(19, 103, 149));
        jButton7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(250, 250, 250));
        jButton7.setText("Exam");
        jButton7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(19, 103, 149));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel1.setText("Image");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Logout.setBackground(new java.awt.Color(19, 103, 149));
        Logout.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Logout.setForeground(new java.awt.Color(250, 250, 250));
        Logout.setText("Logout");
        Logout.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        ExamcellId.setBackground(new java.awt.Color(19, 103, 149));
        ExamcellId.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ExamcellId.setForeground(new java.awt.Color(255, 255, 255));
        ExamcellId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ExamcellId.setText("Enrollment ID");
        ExamcellId.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        ExamcellName.setEditable(false);
        ExamcellName.setBackground(new java.awt.Color(19, 103, 149));
        ExamcellName.setColumns(1);
        ExamcellName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ExamcellName.setForeground(new java.awt.Color(255, 255, 255));
        ExamcellName.setLineWrap(true);
        ExamcellName.setRows(3);
        ExamcellName.setWrapStyleWord(true);
        ExamcellName.setAutoscrolls(false);
        ExamcellName.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane4.setViewportView(ExamcellName);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rec/navdown.png"))); // NOI18N
        jLabel9.setText("jLabel9");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Logout, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(coursebtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ExamcellId, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ExamcellId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton1)
                .addGap(26, 26, 26)
                .addComponent(coursebtn)
                .addGap(36, 36, 36)
                .addComponent(jButton5)
                .addGap(33, 33, 33)
                .addComponent(jButton6)
                .addGap(36, 36, 36)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(19, 103, 149));
        jPanel2 = new RoundedPanel(50, new Color (19, 103, 149));
        jPanel2.setForeground(new java.awt.Color(19, 103, 149));
        jPanel2.setOpaque(false);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(19, 103, 149));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(250, 250, 250));
        jTextArea1.setRows(1);
        jTextArea1.setText("Walchand\nInstitute Of Technology");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rec/camp.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rec/circle.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rec/wifi.png"))); // NOI18N
        jLabel6.setText("jLabel6");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rec/setting.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rec/navdown.png"))); // NOI18N
        jLabel8.setText("jLabel8");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rec/laptop.png"))); // NOI18N
        jLabel10.setText("jLabel10");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rec/last.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jTextArea1, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                .addGap(44, 44, 44)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(101, 101, 101))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)))
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jScrollPane1.setBorder(null);

        DynamicPanel = new RoundedPanel(100, new Color (250, 250, 250));
        DynamicPanel.setBackground(new java.awt.Color(255, 255, 255));
        DynamicPanel.setOpaque(false);

        jLabel11.setBackground(new java.awt.Color(250, 250, 250));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rec/wittra.png"))); // NOI18N

        javax.swing.GroupLayout DynamicPanelLayout = new javax.swing.GroupLayout(DynamicPanel);
        DynamicPanel.setLayout(DynamicPanelLayout);
        DynamicPanelLayout.setHorizontalGroup(
            DynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DynamicPanelLayout.createSequentialGroup()
                .addGap(471, 471, 471)
                .addComponent(jLabel11)
                .addContainerGap(1112, Short.MAX_VALUE))
        );
        DynamicPanelLayout.setVerticalGroup(
            DynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DynamicPanelLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel11)
                .addContainerGap(168, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(DynamicPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1126, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void close() {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         
        E1.setVisible(true);
        E2.setVisible(false);
        E3.setVisible(false);
        E4.setVisible(false);
        E5.setVisible(false);
        E6.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void coursebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursebtnActionPerformed
        
        E1.setVisible(false);
        E2.setVisible(true);
        E3.setVisible(false);
        E4.setVisible(false);
        E5.setVisible(false);
        E6.setVisible(false);


    }//GEN-LAST:event_coursebtnActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
         
        E1.setVisible(false);
        E2.setVisible(false);
        E3.setVisible(false);
        E4.setVisible(false);
        E5.setVisible(false);
        E6.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        int yes_no = JOptionPane.showConfirmDialog(this, "Do you want to logout?","Confirm",JOptionPane.YES_NO_OPTION);
        if(yes_no==JOptionPane.YES_OPTION){
            close();
            Switch_User pi = new Switch_User();
            pi.setVisible(true);
        }
    }//GEN-LAST:event_LogoutActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         
        E1.setVisible(false);
        E2.setVisible(false);
        E3.setVisible(false);
        E4.setVisible(true);
        E5.setVisible(false);
        E6.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
          
        E1.setVisible(false);
        E2.setVisible(false);
        E3.setVisible(false);
        E4.setVisible(false);
        E5.setVisible(true);
        E6.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed
    
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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Examcell_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Examcell_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Examcell_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Examcell_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Examcell_Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DynamicPanel;
    private javax.swing.JLabel ExamcellId;
    private javax.swing.JTextArea ExamcellName;
    private javax.swing.JButton Logout;
    private javax.swing.JButton coursebtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
//rounded border
class RoundedPanel extends JPanel
    {
        private Color backgroundColor;
        private int cornerRadius = 15;

        public RoundedPanel(LayoutManager layout, int radius) {
            super(layout);
            cornerRadius = radius;
        }

        public RoundedPanel(LayoutManager layout, int radius, Color bgColor) {
            super(layout);
            cornerRadius = radius;
            backgroundColor = bgColor;
        }

        public RoundedPanel(int radius) {
            super();
            cornerRadius = radius;
        }

        public RoundedPanel(int radius, Color bgColor) {
            super();
            cornerRadius = radius;
            backgroundColor = bgColor;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Dimension arcs = new Dimension(cornerRadius, cornerRadius);
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            //Draws the rounded panel with borders.
            if (backgroundColor != null) {
                graphics.setColor(backgroundColor);
            } else {
                graphics.setColor(getBackground());
            }
            graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint background
            graphics.setColor(getForeground());
            graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint border
        }
    }
