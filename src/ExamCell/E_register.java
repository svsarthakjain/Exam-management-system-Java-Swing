/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamCell;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import test.MySQLConnection;

/**
 *
 * @author ikuna
 */
public class E_register extends javax.swing.JPanel {
        public static String StudEnrollID;
    /**
     * Creates new form E_register
     */
    public E_register() {
        initComponents();
        
        SearchStudentTable.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD,14));
        SearchStudentTable.getTableHeader().setOpaque(false);
        SearchStudentTable.getTableHeader().setBackground(new Color(32,136,203));
        SearchStudentTable.getTableHeader().setForeground(new Color(255,255,255));
        SearchStudentTable.setRowHeight(25);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Years = new javax.swing.JComboBox<>();
        SearchStudentBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        SearchStudentTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        Department = new javax.swing.JComboBox<>();
        PromoteBtn = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        StudSem = new javax.swing.JComboBox<>();
        UpdateStudBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(250, 250, 250));
        setForeground(new java.awt.Color(250, 250, 250));
        setMinimumSize(new java.awt.Dimension(886, 551));
        setPreferredSize(new java.awt.Dimension(886, 551));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("Department");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Year");

        Years.setBackground(new java.awt.Color(19, 103, 149));
        Years.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        Years.setForeground(new java.awt.Color(250, 250, 250));
        Years.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "FY", "SY", "TY", "BE" }));

        SearchStudentBtn.setBackground(new java.awt.Color(19, 103, 149));
        SearchStudentBtn.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        SearchStudentBtn.setForeground(new java.awt.Color(250, 250, 250));
        SearchStudentBtn.setText("Search");
        SearchStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchStudentBtnActionPerformed(evt);
            }
        });

        SearchStudentTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        SearchStudentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Sr. No.", "Student Name", "Enrollment No.", "Department", "Class"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SearchStudentTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        SearchStudentTable.setRowHeight(25);
        SearchStudentTable.setSelectionBackground(new java.awt.Color(232, 57, 95));
        SearchStudentTable.setShowVerticalLines(false);
        SearchStudentTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(SearchStudentTable);

        jButton2.setBackground(new java.awt.Color(19, 103, 149));
        jButton2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(250, 250, 250));
        jButton2.setText("New Register");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Department.setBackground(new java.awt.Color(19, 103, 149));
        Department.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        Department.setForeground(new java.awt.Color(250, 250, 250));
        Department.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "CSE", "IT", "ENTC", "ELN", "CIVIL", "MECH", "MTECH", " " }));

        PromoteBtn.setBackground(new java.awt.Color(19, 103, 149));
        PromoteBtn.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        PromoteBtn.setForeground(new java.awt.Color(250, 250, 250));
        PromoteBtn.setText("Promote ");
        PromoteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PromoteBtnActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel21.setText("Semester");

        StudSem.setBackground(new java.awt.Color(19, 103, 149));
        StudSem.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        StudSem.setForeground(new java.awt.Color(250, 250, 250));
        StudSem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "1", "2", "3", "4", "5", "6", "7", "8" }));
        StudSem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudSemActionPerformed(evt);
            }
        });

        UpdateStudBtn.setBackground(new java.awt.Color(19, 103, 149));
        UpdateStudBtn.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        UpdateStudBtn.setForeground(new java.awt.Color(250, 250, 250));
        UpdateStudBtn.setText("Update ");
        UpdateStudBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateStudBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Years, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(StudSem, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                        .addComponent(SearchStudentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134)
                        .addComponent(UpdateStudBtn)
                        .addGap(201, 201, 201))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PromoteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Years)
                    .addComponent(SearchStudentBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StudSem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateStudBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PromoteBtn)
                .addGap(98, 98, 98))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SearchStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchStudentBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tbmodel = (DefaultTableModel) SearchStudentTable.getModel();
        
        tbmodel.setRowCount(0);
        try {
            
            Connection myConn = MySQLConnection.getConnection();
            
            String dept_select = "=" + "'" + Department.getSelectedItem().toString() + "'";
            String year = "=" + "'" + Years.getSelectedItem().toString() + "'";
            String sem = "=" + "'" + StudSem.getSelectedItem().toString() + "'";
            
            String stud_deptid = "=Student.DeptId";
            
            if (dept_select.equals("='All'")) {
                dept_select = " in('IT','CSE','ELN','ENTC','MECH','CIVIL','MTECH')";
                // stud_deptid=" in('IT','CSE','ELN','ENTC','MECH','CIVIL','MTECH')";
            }
            if (year.equals("='All'")) {
                year = " in('FY','SY','TY','BE')";
                
            }
            if (sem.equals("='All'")) {
                sem = " in('1','2','3','4','5','6','7','8')";
                
            }
            
            String mySqlQuery
                    = "SELECT StudName,EnrollmentId,(select Dept_code from department where Department.Dept_Id =Student.DeptId "
                    + ")as DeptCode,Class from student where cast((substring(Student.class,1,2)) as char(2))" + year
                    + "and cast((substring(Student.class,5,5)) as char(1))" + sem
                    + " and DeptId in (select Dept_Id from department where Dept_code" + dept_select + ")";
            PreparedStatement preparedStatement = myConn.prepareStatement(mySqlQuery);
            //System.out.println(mySqlQuery);
            ResultSet resultSet = preparedStatement.executeQuery();
            int src = 0;
            while (resultSet.next()) {
                
                String SRC = String.valueOf((++src));
                String studname = resultSet.getString("StudName");
                String enroll = resultSet.getString("EnrollmentId");
                String dept_code = resultSet.getString("DeptCode");
                
                String Class = resultSet.getString("Class");
                
                String tbdata[] = {SRC, studname, enroll, dept_code, Class};
                /*DefaultTableModel tbmodel = (DefaultTableModel)course_table.getModel();*/
                
                tbmodel.addRow(tbdata);
                
            }
            
        } catch (Exception exception) {
            //System.out.print(exception);
            JOptionPane.showMessageDialog(this, "Database error: " + exception.getMessage());
        }
    }//GEN-LAST:event_SearchStudentBtnActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        // close();
        New_Register i = new New_Register();
        i.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void PromoteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PromoteBtnActionPerformed
        
        String[] promoteclass = {"FY-01", "FY-02", "SY-03", "SY-04", "TY-05", "TY-06", "BE-07", "BE-08", "Graduated"};
        try {
            
            Connection myConn = MySQLConnection.getConnection();
            
            int select_row = 0;
            for (select_row = 0; select_row < SearchStudentTable.getRowCount(); select_row++) {
                String enrollmentid = (SearchStudentTable.getModel().getValueAt(select_row, 2).toString());
                String fromclass = (SearchStudentTable.getModel().getValueAt(select_row, 4).toString());
                int k = 0;
                for (k = 0; k < promoteclass.length; k++) {
                    if (fromclass.equals(promoteclass[k])) {
                        break;
                    }
                }
                String query = "Update student set Class='" + promoteclass[k + 1] + "' where EnrollmentId =" + enrollmentid;
                PreparedStatement preparedStatement = myConn.prepareStatement(query);
                
                //System.out.print(query);
                preparedStatement.executeUpdate();
                
            }
            
            DefaultTableModel tbmodel = (DefaultTableModel) SearchStudentTable.getModel();
            tbmodel.setRowCount(0);
            JOptionPane.showMessageDialog(null, "PROMOTED  Successfully!!");
            
        } catch (Exception exception) {
            //System.out.print(exception);
            JOptionPane.showMessageDialog(this, "Database error: " + exception.getMessage());
        }

    }//GEN-LAST:event_PromoteBtnActionPerformed

    private void StudSemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudSemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StudSemActionPerformed

    private void UpdateStudBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateStudBtnActionPerformed
        E_updatestud i = new E_updatestud();
        i.setVisible(true);
        
        
        int select_row = SearchStudentTable.getSelectedRow();
    
        StudEnrollID = (SearchStudentTable.getModel().getValueAt(select_row, 2).toString());
        i.setOldValues(StudEnrollID);
        
        

    }//GEN-LAST:event_UpdateStudBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Department;
    private javax.swing.JButton PromoteBtn;
    private javax.swing.JButton SearchStudentBtn;
    private javax.swing.JTable SearchStudentTable;
    private javax.swing.JComboBox<String> StudSem;
    private javax.swing.JButton UpdateStudBtn;
    private javax.swing.JComboBox<String> Years;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
