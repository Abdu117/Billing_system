package Products;


import db_connection.db_connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author user
 */
public class getBills extends javax.swing.JFrame {

    /**
     * Creates new form getBills
     */
    Connection con;
            db_connection c= new db_connection();
    public getBills() throws SQLException {
        initComponents();
        con= c.connect();
        try{
            String selectedColoumns = "order_id,first_name,last_name,cashier_id";
                PreparedStatement stmt = con.prepareStatement(
                    String.format("SELECT %s FROM orders join customer on customer.customer_id = orders.customer_id;",selectedColoumns));

                ResultSet resultSet = stmt.executeQuery();

                BillsInfo.setModel(DbUtils.resultSetToTableModel(resultSet));
        }
        catch(SQLException ex)
        {
            
        }
        
       
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        displayAllBills = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BillsInfo = new javax.swing.JTable();
        searchLabel = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        searchType = new javax.swing.JComboBox<>();
        showBillButton = new javax.swing.JButton();
        showBill = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        info_bills = new javax.swing.JTable();
        customerName = new javax.swing.JLabel();
        backtoEmployeesDataButton = new javax.swing.JButton();
        retCustomerName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        displayAllBills.setBackground(new java.awt.Color(12, 19, 79));

        BillsInfo.setBackground(new java.awt.Color(29, 38, 125));
        BillsInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(212, 173, 252)));
        BillsInfo.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        BillsInfo.setForeground(new java.awt.Color(255, 255, 255));
        BillsInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Bills_id", "Customer id", "Cashier_id", "Date"
            }
        ));
        BillsInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BillsInfoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(BillsInfo);

        searchLabel.setForeground(new java.awt.Color(255, 250, 244));
        searchLabel.setText("Serch:");

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        searchType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Order ID", "Customer ID", "Cashier ID" }));

        showBillButton.setText("Show Bill Info");
        showBillButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBillButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout displayAllBillsLayout = new javax.swing.GroupLayout(displayAllBills);
        displayAllBills.setLayout(displayAllBillsLayout);
        displayAllBillsLayout.setHorizontalGroup(
            displayAllBillsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayAllBillsLayout.createSequentialGroup()
                .addGroup(displayAllBillsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(displayAllBillsLayout.createSequentialGroup()
                        .addGroup(displayAllBillsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(displayAllBillsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(searchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(searchType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(210, 210, 210)
                                .addComponent(searchButton))
                            .addGroup(displayAllBillsLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(showBillButton)))
                        .addGap(0, 137, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        displayAllBillsLayout.setVerticalGroup(
            displayAllBillsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayAllBillsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(displayAllBillsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(showBillButton)
                .addGap(27, 27, 27))
        );

        showBill.setBackground(new java.awt.Color(12, 19, 79));

        info_bills.setBackground(new java.awt.Color(29, 38, 125));
        info_bills.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(212, 173, 252)));
        info_bills.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        info_bills.setForeground(new java.awt.Color(255, 255, 255));
        info_bills.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Employee_id", "name", "role", "phone", "address", "gender", "sallary"
            }
        ));
        info_bills.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                info_billsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(info_bills);

        customerName.setForeground(new java.awt.Color(255, 250, 244));
        customerName.setText("Customer name:");

        backtoEmployeesDataButton.setText("Back");
        backtoEmployeesDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backtoEmployeesDataButtonActionPerformed(evt);
            }
        });

        retCustomerName.setForeground(new java.awt.Color(255, 250, 244));
        retCustomerName.setText("Customer name:");

        javax.swing.GroupLayout showBillLayout = new javax.swing.GroupLayout(showBill);
        showBill.setLayout(showBillLayout);
        showBillLayout.setHorizontalGroup(
            showBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showBillLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(showBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showBillLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(backtoEmployeesDataButton))
                    .addGroup(showBillLayout.createSequentialGroup()
                        .addComponent(customerName)
                        .addGap(18, 18, 18)
                        .addComponent(retCustomerName)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE))
                .addContainerGap())
        );
        showBillLayout.setVerticalGroup(
            showBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showBillLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(showBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(retCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(backtoEmployeesDataButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(displayAllBills, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(showBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(displayAllBills, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(showBill, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showBillButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBillButtonActionPerformed
        // TODO add your handling code here:
        displayAllBills.setVisible(false);
        showBill.setVisible(true);
        int row =        BillsInfo.getSelectedRow();
        String BillID =    BillsInfo.getValueAt(row, 1).toString();
        String FirstNameCustomer =    BillsInfo.getValueAt(row, 1).toString();
        String SecondNameCustomer =    BillsInfo.getValueAt(row, 2).toString();
        String orderID =    BillsInfo.getValueAt(row, 0).toString();
        
        retCustomerName.setText(FirstNameCustomer+" "+SecondNameCustomer);
        String selectedColoumns = "products.name,order_items.quantity,products.price,products.discount";
                PreparedStatement stmt;
        try {
            stmt = con.prepareStatement(
                    String.format("SELECT %s FROM order_items join products on order_items.product_id = products.product_id where order_id = ?;",selectedColoumns));
            stmt.setString(1, orderID);
            ResultSet resultSet = stmt.executeQuery();

            info_bills.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch (SQLException ex) {
            Logger.getLogger(getBills.class.getName()).log(Level.SEVERE, null, ex);
        }

                
        
    }//GEN-LAST:event_showBillButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        if("".equals(searchField.getText().trim()))
        {
            JOptionPane.showMessageDialog(this, "Enter a value");
        }
        else
        {

            try {
                String s;
                switch (searchType.getSelectedIndex()) {
                    case 1 ->  s = "customer_id";
                    case 2 ->  s = "cashier_id";
                    default -> s = "order_id";
                }
                String selectedColoumns = "order_id,first_name,last_name,cashier_id";
                PreparedStatement stmt = con.prepareStatement(
                    String.format("SELECT %s FROM orders join customer on customer.customer_id = orders.customer_id where order_id = ?;",selectedColoumns,s));

                stmt.setString(1, searchField.getText().trim());

                ResultSet resultSet = stmt.executeQuery();

                BillsInfo.setModel(DbUtils.resultSetToTableModel(resultSet));

            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void BillsInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BillsInfoMouseClicked
        // TODO add your handling code here:
        

        
    }//GEN-LAST:event_BillsInfoMouseClicked

    private void backtoEmployeesDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backtoEmployeesDataButtonActionPerformed
        // TODO add your handling code here:
        displayAllBills.setVisible(true);
        showBill.setVisible(false);
    }//GEN-LAST:event_backtoEmployeesDataButtonActionPerformed

    private void info_billsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_info_billsMouseClicked
        // TODO add your handling code here:
        

        
    }//GEN-LAST:event_info_billsMouseClicked

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
            java.util.logging.Logger.getLogger(getBills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(getBills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(getBills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(getBills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new getBills().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(getBills.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BillsInfo;
    private javax.swing.JButton backtoEmployeesDataButton;
    private javax.swing.JLabel customerName;
    private javax.swing.JPanel displayAllBills;
    private javax.swing.JTable info_bills;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel retCustomerName;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JComboBox<String> searchType;
    private javax.swing.JPanel showBill;
    private javax.swing.JButton showBillButton;
    // End of variables declaration//GEN-END:variables
}
