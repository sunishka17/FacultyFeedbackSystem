/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facultyfeedbacksystem;

import java.sql.*;

/**
 *
 * @author Sunishka Sharma
 */
public class HomePage_Student extends javax.swing.JFrame {

    String fname, lname, grade, sub1, sub2, sub3, sub4, sub5, sub6;

    /**
     * Creates new form HomePage_Student
     */
    public HomePage_Student() {
        initComponents();
        this.setLocationRelativeTo(null); //to set the position at center
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        add_feedback_btn = new javax.swing.JButton();
        add_sug_btn = new javax.swing.JButton();
        edit_profile = new javax.swing.JButton();
        Log_out = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/feedback image2.jpeg"))); // NOI18N
        jLabel4.setText("jLabel4");

        jPanel2.setBackground(new java.awt.Color(0, 0, 63));

        add_feedback_btn.setBackground(new java.awt.Color(255, 183, 76));
        add_feedback_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add_feedback_btn.setForeground(new java.awt.Color(0, 0, 153));
        add_feedback_btn.setText("ADD TEACHER FEEDBACK");
        add_feedback_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_feedback_btnActionPerformed(evt);
            }
        });

        add_sug_btn.setBackground(new java.awt.Color(255, 183, 76));
        add_sug_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add_sug_btn.setForeground(new java.awt.Color(0, 0, 153));
        add_sug_btn.setText("ADD SUGGESTION");
        add_sug_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_sug_btnActionPerformed(evt);
            }
        });

        edit_profile.setBackground(new java.awt.Color(255, 183, 76));
        edit_profile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        edit_profile.setForeground(new java.awt.Color(0, 0, 153));
        edit_profile.setText("EDIT PROFILE");
        edit_profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_profileActionPerformed(evt);
            }
        });

        Log_out.setBackground(new java.awt.Color(255, 183, 76));
        Log_out.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Log_out.setForeground(new java.awt.Color(0, 0, 153));
        Log_out.setText("Log Out");
        Log_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Log_outActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(add_feedback_btn))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(add_sug_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(edit_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Log_out)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(add_feedback_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(add_sug_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(edit_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Log_out, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 230, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_sug_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_sug_btnActionPerformed
       AddSuggestion_Student sgt=new AddSuggestion_Student();
       sgt.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_add_sug_btnActionPerformed

    private void add_feedback_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_feedback_btnActionPerformed
        DatabaseConnection db = new DatabaseConnection();
        try {
            Class.forName("java.sql.DriverManager");
            Connection con = db.getConnect();
            Statement st = con.createStatement();
            ResultSet r = st.executeQuery("select * from student_details_tbl where admission_no='"
                    + Login.adno + "'");//inheriting propery of Login class
            while (r.next()) { //fetching the details of the student that will be used for taking teacher feedback
                fname = r.getString(2);
                lname = r.getString(3);
                grade = r.getString(4);
                sub1 = r.getString(5);
                sub2 = r.getString(6);
                sub3 = r.getString(7);
                sub4 = r.getString(8);
                sub5 = r.getString(9);
                sub6 = r.getString(10);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        
        AddFeedback_Student fb = new AddFeedback_Student(fname, lname, grade, sub1, sub2, sub3, sub4, sub5, sub6);
        fb.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_add_feedback_btnActionPerformed

    private void edit_profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_profileActionPerformed
       EditProfile_Student k=new EditProfile_Student();
       k.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_edit_profileActionPerformed

    private void Log_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Log_outActionPerformed
        MainPage ch = new MainPage();
        ch.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Log_outActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage_Student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Log_out;
    private javax.swing.JButton add_feedback_btn;
    private javax.swing.JButton add_sug_btn;
    private javax.swing.JButton edit_profile;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
