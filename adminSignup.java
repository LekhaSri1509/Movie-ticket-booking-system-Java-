
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pooja
 */
public class adminSignup extends javax.swing.JFrame {

    /**
     * Creates new form adminSignup
     */
    public adminSignup() {
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

        label1 = new java.awt.Label();
        name = new javax.swing.JLabel();
        phno = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        pass = new javax.swing.JLabel();
        name1 = new javax.swing.JTextField();
        phno1 = new javax.swing.JTextField();
        id1 = new javax.swing.JTextField();
        pass1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        result = new javax.swing.JLabel();

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        name.setText("NAME");
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 96, -1, -1));

        phno.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        phno.setText("PHONE NUMBER");
        getContentPane().add(phno, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 182, -1, -1));

        id.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        id.setText("EMAIL ID");
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 272, -1, -1));

        pass.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pass.setText("PASSWORD");
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 361, -1, -1));
        getContentPane().add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 102, 206, 29));
        getContentPane().add(phno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 188, 206, 29));
        getContentPane().add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 272, 206, 29));
        getContentPane().add(pass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 361, 206, 29));

        jButton1.setBackground(new java.awt.Color(0, 153, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 426, 164, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 522, -1, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 559, 82, -1));

        result.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(result, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 522, 316, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/movieticket?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
            Statement stmt=c.createStatement();

            String n=name1.getText();
            String p=phno1.getText();
            String e=id1.getText();
            String pass=pass1.getText();
            String sql="insert into admindetails(admName,emailId,pass,phno) values('"+n+"','"+e+"','"+pass+"','"+p+"')";
            stmt.executeUpdate(sql);
            if(name1.getText().isEmpty()&&phno.getText().isEmpty()&&id1.getText().isEmpty()&&pass1.getText().isEmpty()){
                result.setText("ENTER VALID INPUT");
            }
            else{
                close();
                movie m=new movie();
                m.setVisible(true);
            }}catch(Exception e){
                System.out.println(e);
            }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(adminSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminSignup().setVisible(true);
            }
        });
    }
public void close(){
      WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
      Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
  }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel id;
    private javax.swing.JTextField id1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private java.awt.Label label1;
    private javax.swing.JLabel name;
    private javax.swing.JTextField name1;
    private javax.swing.JLabel pass;
    private javax.swing.JTextField pass1;
    private javax.swing.JLabel phno;
    private javax.swing.JTextField phno1;
    private javax.swing.JLabel result;
    // End of variables declaration//GEN-END:variables
}