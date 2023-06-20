/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package billing_system_project;
import Products.stockmanager_products_frame;
import cashier.cashierFrame;
import com.formdev.flatlaf.FlatDarkLaf;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import db_connection.db_connection;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;
import manager.manager_frame;
/**
 *
 * @author abdoa
 */

public class login extends javax.swing.JFrame {

    
    
    /**
     * Creates new form login
     */
    public login() {
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

        jButton1 = new javax.swing.JButton();
        id_TextField = new javax.swing.JTextField();
        password_TextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        role_ComboBox = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign In");
        setBackground(new java.awt.Color(255, 153, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("LOGIN");
        jButton1.setToolTipText("Sign in");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 174, 40));

        id_TextField.setBackground(new java.awt.Color(102, 102, 102));
        id_TextField.setFont(new java.awt.Font("Sitka Text", 2, 18)); // NOI18N
        id_TextField.setForeground(new java.awt.Color(255, 255, 255));
        id_TextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id_TextField.setSelectionColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(id_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 230, 30));

        password_TextField1.setBackground(new java.awt.Color(102, 102, 102));
        password_TextField1.setFont(new java.awt.Font("Sitka Text", 2, 18)); // NOI18N
        password_TextField1.setForeground(new java.awt.Color(255, 255, 255));
        password_TextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password_TextField1.setName(""); // NOI18N
        password_TextField1.setSelectionColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(password_TextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 230, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 100, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Role");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 37, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("ID");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 37, -1));

        role_ComboBox.setBackground(new java.awt.Color(0, 153, 255));
        role_ComboBox.setFont(new java.awt.Font("Sitka Text", 2, 18)); // NOI18N
        role_ComboBox.setForeground(new java.awt.Color(255, 255, 255));
        role_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Manager", "Cashier", "Stock manager" }));
        role_ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                role_ComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(role_ComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 230, 30));

        jButton2.setBackground(new java.awt.Color(255, 0, 51));
        jButton2.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Clear");
        jButton2.setToolTipText("clear all fields");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 110, 30));

        jLabel1.setBackground(new java.awt.Color(51, 153, 255));
        jLabel1.setFont(new java.awt.Font("The Bold Font", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText(" ome To WalMart");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 440, 40));

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setForeground(new java.awt.Color(102, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/06-loader_telega.gif"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 610, 420));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("The Bold Font", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("WELC ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 try {
            Connection con;
            db_connection c= new db_connection();
            con= c.connect();
            String id =id_TextField.getText();
            String password=password_TextField1.getText();
            
   if(id.isEmpty()||password.isEmpty()) {
        JOptionPane.showMessageDialog(this, "fill all fields");

   }
   else{
            if(role_ComboBox.getSelectedIndex()!=0){ 
                        String role=role_ComboBox.getSelectedItem().toString();
                        PreparedStatement ps = con.prepareStatement("select * from employee where role = ?");
                        ps.setString(1, role);
                        ResultSet rs=ps.executeQuery();
                        boolean found =false;
                        while(rs.next()){
                        if(rs.getString("employee_id").equals(id)){
                            if(rs.getString("password").equals(password)){
                                found= true;
                                this.setVisible(false);
                                switch(role_ComboBox.getSelectedIndex()){
                                    case 1:                                                                     //manager frame 
                                        manager_frame x = new manager_frame();
                                        x.setVisible(true);
                                        break;
                                    case 2:                                                                     //Cashier frame
                                    {
                                        this.setVisible(false);
                                        cashierFrame cf=new cashierFrame();
                                        cf.setVisible(true);
                                    } 
                                        break;
                                    case 3:                                                                      //stock manager
                                        stockmanager_products_frame y = new stockmanager_products_frame();
                                        y.setVisible(true);
                                        break;
                                        
                                }
                                
                                break;
                            }
                            else{
                               JOptionPane.showMessageDialog(this, "wrong password"); 
                               found= true;
                            }
                         }}
                        if(!rs.next()&& found==false){
          
                                JOptionPane.showMessageDialog(this, "not found");
                        }
            
            
            }
           
            else{
                JOptionPane.showMessageDialog(this, "enter role");
            }
            }
            
            
        }
        
      
        catch(SQLException e){
                        System.out.println("connection failed");
                        e.printStackTrace();

        }     }//GEN-LAST:event_jButton1ActionPerformed

    private void role_ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_role_ComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_role_ComboBoxActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        id_TextField.setText("");
        id_TextField.setText("");
        role_ComboBox.setSelectedIndex(0);

    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws UnsupportedLookAndFeelException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       // UIManager.setLookAndFeel(new FlatDarkLaf());
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField id_TextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField password_TextField1;
    private javax.swing.JComboBox<String> role_ComboBox;
    // End of variables declaration//GEN-END:variables
}
