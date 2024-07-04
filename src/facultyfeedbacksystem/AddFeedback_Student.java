/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facultyfeedbacksystem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AddFeedback_Student extends javax.swing.JFrame {
    Connection con;
    DatabaseConnection obj = new DatabaseConnection(); 

    public AddFeedback_Student() {
        initComponents();
        this.setLocationRelativeTo(null); //to set the position at center
    }
    
    /**
     * Use of polymorphism.
     * Constructor with the parameters of the details of the student giving the feedback.
     * Getting the subjects is required because the student can only give feedback to their subject teachers.
     * The name of the student will be shown in the ViewTeacherFeedback_Coordinator so that
     * the coordinator can know the name of the student if he/she gives a false feedback. 
     * */
    public AddFeedback_Student(String fname, String lname, String grade, String sub1, String sub2, String sub3, 
            String sub4, String sub5, String sub6) {
        initComponents();
        this.setLocationRelativeTo(null); //to set the position at center
        try {
            DefaultTableModel data = (DefaultTableModel) teacher_table.getModel();
            data.setRowCount(0);
            Class.forName("java.sql.DriverManager");
            Connection con = obj.getConnect();
            Statement st = con.createStatement();
            //fetching all records from the mySQL teacher_details_tbl table
            ResultSet r = st.executeQuery("select * from teacher_details_tbl"); 
            String db_subject = null; //holds subject of any teacher matches the subjects of the student
            String teacher_subject = null; //to store the subject of the teachers from the database
            String teacher_name = null; //to store the name of the teacher from the database
            String teacher_id = null; //to store the id of the teacher from the database
            while (r.next()) {
                db_subject = r.getString(3); //storing the subject of a specific teacher in this variable 
                if (db_subject.equals(sub1) || db_subject.equals(sub2) || db_subject.equals(sub3) || 
                        db_subject.equals(sub4) || db_subject.equals(sub5) || db_subject.equals(sub6)) {
                    teacher_name = r.getString(2);
                    teacher_subject = r.getString(3);
                    teacher_id = r.getString(1);
                    data.addRow(new Object[]{false, teacher_name, teacher_subject, teacher_id}); //adding the values in the table
                }
            }
        } 
        //in case of a runtime error, this will catch the error and show an error message, our system will not crash
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage()); 
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel41 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel42 = new javax.swing.JPanel();
        add_feedback_btn = new javax.swing.JButton();
        back_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        teacher_table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel41.setBackground(new java.awt.Color(255, 255, 255));
        jPanel41.setForeground(new java.awt.Color(255, 255, 255));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/feedback image2.jpeg"))); // NOI18N
        jLabel20.setText("jLabel4");

        jPanel42.setBackground(new java.awt.Color(0, 0, 63));
        jPanel42.setForeground(new java.awt.Color(255, 255, 255));

        add_feedback_btn.setBackground(new java.awt.Color(255, 183, 76));
        add_feedback_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add_feedback_btn.setForeground(new java.awt.Color(0, 0, 153));
        add_feedback_btn.setText("ADD FEEDBACK");
        add_feedback_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_feedback_btnActionPerformed(evt);
            }
        });

        back_btn.setBackground(new java.awt.Color(255, 183, 76));
        back_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back_btn.setForeground(new java.awt.Color(0, 0, 153));
        back_btn.setText("BACK");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });

        teacher_table.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        teacher_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "Teacher Name", "Teacher Subject", "Teacher ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(teacher_table);

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(add_feedback_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel42Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_feedback_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_feedback_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_feedback_btnActionPerformed
        DefaultTableModel model = (DefaultTableModel) teacher_table.getModel();
        int rows = model.getRowCount();
        String teacherID;
        for (int i = 0; i < model.getRowCount(); i++) {
            if (model.getValueAt(i, 0).toString().equals("true")) {//to check which teacher record from a table is selected
                teacherID = model.getValueAt(i, 3).toString();
                TeacherFeedback_Student sm = new TeacherFeedback_Student(teacherID);//sending teacher's data to TeacherFeedback2.java to add feedback
                sm.setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_add_feedback_btnActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        HomePage_Student back = new HomePage_Student(); //to go back to the student homepage after the feedback is submitted 
        back.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back_btnActionPerformed

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
            java.util.logging.Logger.getLogger(AddFeedback_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddFeedback_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddFeedback_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddFeedback_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddFeedback_Student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_feedback_btn;
    private javax.swing.JButton back_btn;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable teacher_table;
    // End of variables declaration//GEN-END:variables
}
