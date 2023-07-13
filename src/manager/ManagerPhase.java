/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package manager;
import Products.getBills;
import Products.Customerinfo;
import Products.ViewCustomersFrame;
import Products.manager_products_frame;
import billing_system_project.login;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.ui.FlatListCellBorder.Default;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
        

/**
 *
 * @author medo4
 */
public class ManagerPhase extends javax.swing.JFrame {
 

Color Default,Clicked,Dragged,color;

    public ManagerPhase() {
        initComponents();
         //Theme initialize
         Default=new Color(255,255,255);
         Dragged=new Color(229,229,229);
         Clicked=new Color(51,204,255);
          color=new Color(60,110,113);
        try {           
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(ManagerPhase.class.getName()).log(Level.SEVERE, null, ex);
        }
       this.setResizable(false);
       
    }

    //Functions To change colors of Buttons
    public void colorset(JPanel p,Color a)
    {
        p.setBackground(a);
    }
    public void compositecoloringset(JPanel panel1,Color a,JPanel panel2,Color b,JPanel panel3,Color c,JPanel panel4,Color d)
    {
        panel1.setBackground(a);
        panel2.setBackground(b);
        panel3.setBackground(c);
        panel4.setBackground(d);
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
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        viewbillslabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        viewstocklabel = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        viewemployeeslabel = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        viewcustomerslabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setBackground(new java.awt.Color(0, 102, 102));
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(812, 584));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/manager menu page_1.jpg"))); // NOI18N

        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 930, 670));

        jPanel2.setBackground(new java.awt.Color(53, 53, 53));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel5MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel5MousePressed(evt);
            }
        });

        viewbillslabel.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        viewbillslabel.setForeground(new java.awt.Color(60, 110, 113));
        viewbillslabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewbillslabel.setText("View Bills");
        viewbillslabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewbillslabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewbillslabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewbillslabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viewbillslabel, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viewbillslabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 190, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
        });

        viewstocklabel.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        viewstocklabel.setForeground(new java.awt.Color(60, 110, 113));
        viewstocklabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewstocklabel.setText("View Stock");
        viewstocklabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewstocklabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewstocklabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewstocklabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viewstocklabel, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viewstocklabel, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 190, 40));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel7MouseExited(evt);
            }
        });

        viewemployeeslabel.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        viewemployeeslabel.setForeground(new java.awt.Color(60, 110, 113));
        viewemployeeslabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewemployeeslabel.setText("View Employees");
        viewemployeeslabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewemployeeslabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewemployeeslabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewemployeeslabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viewemployeeslabel, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viewemployeeslabel, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 190, 40));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel8MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel8MousePressed(evt);
            }
        });

        viewcustomerslabel.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        viewcustomerslabel.setForeground(new java.awt.Color(60, 110, 113));
        viewcustomerslabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewcustomerslabel.setText("View Customers");
        viewcustomerslabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewcustomerslabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewcustomerslabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewcustomerslabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                viewcustomerslabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(viewcustomerslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viewcustomerslabel)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 190, 40));

        jLabel3.setFont(new java.awt.Font("Candara Light", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 40, -1));

        jLabel4.setFont(new java.awt.Font("Candara Light", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jPanel6.setBackground(new java.awt.Color(0, 153, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("The Bold Font", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Menu");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 135, 50));

        jLabel1.setFont(new java.awt.Font("The Bold Font", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("’Manager");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 20, 200, 50));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 120));

        jPanel9.setBackground(new java.awt.Color(255, 102, 102));
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel9MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel9MousePressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Log Out");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel11MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 190, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 230, 670));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 660));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed

  
       
        
    }//GEN-LAST:event_jPanel5MousePressed

    private void jPanel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MousePressed
        //Coloring each buton
        compositecoloringset(jPanel8,Clicked,jPanel5,Default,jPanel7,Default,jPanel3,Default);
        //Calling internal frame into this desktop panel
        ViewCustomerInternalFrame view=new ViewCustomerInternalFrame();
        jDesktopPane1.removeAll();
          jDesktopPane1.updateUI();
        jDesktopPane1.add(view).setVisible(true);
        
        
        
       
    }//GEN-LAST:event_jPanel8MousePressed

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
    
    }//GEN-LAST:event_jPanel3MouseDragged

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
       
       
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
        
        
     
    }//GEN-LAST:event_jPanel3MouseExited

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
       compositecoloringset(jPanel3,Clicked,jPanel5,Default,jPanel7,Default,jPanel8,Default);
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
         //Coloring each buton 
        compositecoloringset(jPanel5,Clicked,jPanel3,Default,jPanel7,Default,jPanel8,Default);
         //Calling internal frame into this desktop panel
        GetBillsInternalFrame view=new GetBillsInternalFrame();
        jDesktopPane1.removeAll();
        jDesktopPane1.updateUI();
        jDesktopPane1.add(view).setVisible(true);
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
    
    }//GEN-LAST:event_jPanel8MouseClicked

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        compositecoloringset(jPanel7,Clicked,jPanel5,Default,jPanel3,Default,jPanel8,Default);
        ViewEmployeesInternalFrame view=new ViewEmployeesInternalFrame();
         jDesktopPane1.removeAll();
         jDesktopPane1.updateUI();
        jDesktopPane1.add(view).setVisible(true);
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
       
    }//GEN-LAST:event_jPanel5MouseEntered

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseExited
       
    }//GEN-LAST:event_jPanel5MouseExited

    private void jPanel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseEntered
     
    }//GEN-LAST:event_jPanel8MouseEntered

    private void jPanel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseExited
        
    }//GEN-LAST:event_jPanel8MouseExited

    private void jPanel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseEntered
      
        
    }//GEN-LAST:event_jPanel7MouseEntered

    private void jPanel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseExited
       
    }//GEN-LAST:event_jPanel7MouseExited

    private void viewcustomerslabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewcustomerslabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_viewcustomerslabelMouseClicked

    private void viewcustomerslabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewcustomerslabelMousePressed
         compositecoloringset(jPanel8,Clicked,jPanel5,Default,jPanel7,Default,jPanel3,Default); 
        ViewCustomerInternalFrame view=new ViewCustomerInternalFrame();
        jDesktopPane1.removeAll();
        jDesktopPane1.updateUI();
        jDesktopPane1.add(view).setVisible(true);
       
    }//GEN-LAST:event_viewcustomerslabelMousePressed

    private void viewstocklabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewstocklabelMouseClicked
        compositecoloringset(jPanel3,Clicked,jPanel5,Default,jPanel7,Default,jPanel8,Default);
        ViewStockInternalFrame view=new ViewStockInternalFrame();
         jDesktopPane1.removeAll();
           jDesktopPane1.updateUI();
        jDesktopPane1.add(view).setVisible(true);
     
    }//GEN-LAST:event_viewstocklabelMouseClicked

    private void viewemployeeslabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewemployeeslabelMouseClicked
        compositecoloringset(jPanel7,Clicked,jPanel5,Default,jPanel3,Default,jPanel8,Default);
        ViewEmployeesInternalFrame view=new ViewEmployeesInternalFrame();
         jDesktopPane1.removeAll();
         jDesktopPane1.updateUI();
        jDesktopPane1.add(view).setVisible(true);
    }//GEN-LAST:event_viewemployeeslabelMouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        this.setVisible(false);
        login x= new login();
        x.setVisible(true);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MousePressed

    private void jPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel9MouseClicked

    private void jPanel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel9MouseEntered

    private void jPanel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel9MouseExited

    private void jPanel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel9MousePressed

    private void viewstocklabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewstocklabelMouseEntered
       viewstocklabel.setForeground(Color.red);
    }//GEN-LAST:event_viewstocklabelMouseEntered

    private void viewstocklabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewstocklabelMouseExited
     
        viewstocklabel.setForeground(color);
    }//GEN-LAST:event_viewstocklabelMouseExited

    private void viewbillslabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewbillslabelMouseEntered
       viewbillslabel.setForeground(Color.red);
    }//GEN-LAST:event_viewbillslabelMouseEntered

    private void viewbillslabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewbillslabelMouseExited
         viewbillslabel.setForeground(color);
    }//GEN-LAST:event_viewbillslabelMouseExited

    private void viewcustomerslabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewcustomerslabelMouseEntered
        viewcustomerslabel.setForeground(Color.red);
    }//GEN-LAST:event_viewcustomerslabelMouseEntered

    private void viewcustomerslabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewcustomerslabelMouseExited
        viewcustomerslabel.setForeground(color);
    }//GEN-LAST:event_viewcustomerslabelMouseExited

    private void viewemployeeslabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewemployeeslabelMouseEntered
         viewemployeeslabel.setForeground(Color.red);
    }//GEN-LAST:event_viewemployeeslabelMouseEntered

    private void viewemployeeslabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewemployeeslabelMouseExited
        viewemployeeslabel.setForeground(color);
    }//GEN-LAST:event_viewemployeeslabelMouseExited

    private void viewbillslabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewbillslabelMouseClicked
         compositecoloringset(jPanel5,Clicked,jPanel3,Default,jPanel7,Default,jPanel8,Default);
         //Calling internal frame into this desktop panel
        GetBillsInternalFrame view=new GetBillsInternalFrame();
        jDesktopPane1.removeAll();
        jDesktopPane1.updateUI();
        jDesktopPane1.add(view).setVisible(true);
    }//GEN-LAST:event_viewbillslabelMouseClicked

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
       jLabel11.setForeground(color);
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
         jLabel11.setForeground(Color.white);
    }//GEN-LAST:event_jLabel11MouseExited

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
            java.util.logging.Logger.getLogger(ManagerPhase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerPhase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerPhase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerPhase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerPhase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel viewbillslabel;
    private javax.swing.JLabel viewcustomerslabel;
    private javax.swing.JLabel viewemployeeslabel;
    private javax.swing.JLabel viewstocklabel;
    // End of variables declaration//GEN-END:variables
}