/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops_java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class commerce_enquiry extends javax.swing.JFrame {

    /**
     * Creates new form commerce_enquiry
     */
    public commerce_enquiry() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtcontact = new javax.swing.JTextField();
        txtprodname = new javax.swing.JTextField();
        txtram = new javax.swing.JTextField();
        txtstore = new javax.swing.JTextField();
        btnsubmit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,100));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Harrington", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ENQUIRE US");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 250, 40));

        jLabel3.setFont(new java.awt.Font("Harrington", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, -1, 30));

        jLabel4.setFont(new java.awt.Font("Harrington", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contact details");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Harrington", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Product name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, -1, -1));

        jLabel6.setFont(new java.awt.Font("Harrington", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Specifications");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, -1, -1));

        jLabel7.setFont(new java.awt.Font("Harrington", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("RAM");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, -1, -1));

        jLabel8.setFont(new java.awt.Font("Harrington", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Storage");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, -1, -1));
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 220, 40));
        jPanel1.add(txtcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 210, 40));
        jPanel1.add(txtprodname, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 210, 40));
        jPanel1.add(txtram, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, 150, 30));
        jPanel1.add(txtstore, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 490, 150, 30));

        btnsubmit.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnsubmit.setForeground(new java.awt.Color(204, 0, 51));
        btnsubmit.setText("Submit");
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btnsubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 600, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, 690, 680));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\oops_java\\src\\oops_java\\icons\\Untitled design (2) (1).png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1930, 1030));

        setBounds(0, 0, 1952, 1086);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        // TODO add your handling code here:
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ecommerce_enquire","root","");
            
            String name = txtname.getText();
            String contact = txtcontact.getText();
            String pn = txtprodname.getText();
            String ram = txtram.getText();
            String store = txtstore.getText();
            Statement stm = con.createStatement();
            
            String sql =  "INSERT INTO commerce_enquire (Name, EmailID,Prod_name,RAM,Storage) VALUES ('" + name + "', '" + contact + "','" + pn + "','" + ram + "','" + store + "')";
            stm.executeUpdate(sql);
            JOptionPane.showMessageDialog(this, "Data saved successfully.");
          
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        Userreciept_commerce uc = new Userreciept_commerce();
        uc.usernamefield.setText(txtname.getText());
        uc.prodnamefield.setText(txtprodname.getText());
        uc.ramfield.setText(txtram.getText());
        uc.storefield.setText(txtstore.getText());
        
        /*if(uc.prodnamefield.getText() == "HP Pavillion G6"){
            uc.imagepane.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\oops_java\\src\\oops_java\\icons\\hpg6.jpeg"));
        }*/
        String img = uc.prodnamefield.getText();
        
        switch(img){
            case "HP Pavillion G6":
                uc.imagepane.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\oops_java\\src\\oops_java\\icons\\hpg6.jpeg"));
                break;
            case "Hp Pavillion G6":
                uc.imagepane.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\oops_java\\src\\oops_java\\icons\\hpg6.jpeg"));
                break;
            case "Hp pavillion G6":
                uc.imagepane.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\oops_java\\src\\oops_java\\icons\\hpg6.jpeg"));
                break;
            case "Asus Zenbook 14":
                uc.imagepane.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\oops_java\\src\\oops_java\\icons\\asuszen14.jpeg"));
                break;
            case "Asus zenbook 14":
                uc.imagepane.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\oops_java\\src\\oops_java\\icons\\asuszen14.jpeg"));
                break;
            case "ASUS Zenbook 14":
                uc.imagepane.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\oops_java\\src\\oops_java\\icons\\asuszen14.jpeg"));
                break;
            case "ASUS TUF Gaming A17":
                uc.imagepane.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\oops_java\\src\\oops_java\\icons\\asustufa17.jpeg"));
                break;
            case "Asus TUF a17":
                uc.imagepane.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\oops_java\\src\\oops_java\\icons\\asustufa17.jpeg"));
                break;
            case "Asus tuf a17":
                uc.imagepane.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\oops_java\\src\\oops_java\\icons\\asustufa17.jpeg"));
                break;
            case "ASUS Vivobook Pro 15":
                uc.imagepane.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\oops_java\\src\\oops_java\\icons\\asusvivo15.jpeg"));
                break;
            case "Asus vivobook Pro 15":
                uc.imagepane.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\oops_java\\src\\oops_java\\icons\\asusvivo15.jpeg"));
                break;
            case "Asus Vivobook Pro 15":
                uc.imagepane.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\oops_java\\src\\oops_java\\icons\\asusvivo15.jpeg"));
                break;
            case "APPLE 2020 Macbook Air M1":
                uc.imagepane.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\oops_java\\src\\oops_java\\icons\\applemacm1.jpeg"));
                break;
            case "Apple Macbook Air M1":
                uc.imagepane.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\oops_java\\src\\oops_java\\icons\\applemacm1.jpeg"));
                break;
            case "Apple Macbook air M1":
                uc.imagepane.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\oops_java\\src\\oops_java\\icons\\applemacm1.jpeg"));
                break;
            case "ASUS Core i7 11th Gen":
                uc.imagepane.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\oops_java\\src\\oops_java\\icons\\asusi7.jpeg"));
                break;
            case "Asus i7 core 11th Gen":
                uc.imagepane.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\oops_java\\src\\oops_java\\icons\\asusi7.jpeg"));
                break;
            case "Asus i7 core 11th gen":
                uc.imagepane.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\oops_java\\src\\oops_java\\icons\\asusi7.jpeg"));
                break;
            case "Mackbook Air with M2":
                uc.imagepane.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\oops_java\\src\\oops_java\\icons\\macm2.jpeg"));
                break;
            case "Apple Mackbook Air M2":
                uc.imagepane.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\oops_java\\src\\oops_java\\icons\\macm2.jpeg"));
                break;
            case "Apple Mackbook Air with M2":
                uc.imagepane.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\oops_java\\src\\oops_java\\icons\\macm2.jpeg"));
                break;
            case "HP Spectre x360 14":
                uc.imagepane.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\oops_java\\src\\oops_java\\icons\\hpspectre.jpeg"));
                break;
            case "Hp Spectre x360":
                uc.imagepane.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\oops_java\\src\\oops_java\\icons\\hpspectre.jpeg"));
                break;
            case "Hp spectre x360 14":
                uc.imagepane.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\oops_java\\src\\oops_java\\icons\\hpspectre.jpeg"));
                break;
            case "Asus ROG Zephyrus G15":
                uc.imagepane.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\oops_java\\src\\oops_java\\icons\\asusrog.jpeg"));
                break;
            case "ASUS ROG Zephyrus G15":
                uc.imagepane.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\oops_java\\src\\oops_java\\icons\\asusrog.jpeg"));
                break;
            case "Asus rog G15":
                uc.imagepane.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\oops_java\\src\\oops_java\\icons\\asusrog.jpeg"));
                break;
            case "Asus Chromebook Flip CX5":
                uc.imagepane.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\oops_java\\src\\oops_java\\icons\\asuschromebk.jpeg"));
                break;
            case "ASUS Chromebook Flip cx5":
                uc.imagepane.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\oops_java\\src\\oops_java\\icons\\asuschromebk.jpeg"));
                break;
            case "Asus chromebook flip":
                uc.imagepane.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\oops_java\\src\\oops_java\\icons\\asuschromebk.jpeg"));
                break;
        }
        dispose();
        //commerce_UI my = new commerce_UI();
        //my.show();
        uc.show();
    }//GEN-LAST:event_btnsubmitActionPerformed

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
            java.util.logging.Logger.getLogger(commerce_enquiry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(commerce_enquiry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(commerce_enquiry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(commerce_enquiry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new commerce_enquiry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtcontact;
    public javax.swing.JTextField txtname;
    public javax.swing.JTextField txtprodname;
    public javax.swing.JTextField txtram;
    public javax.swing.JTextField txtstore;
    // End of variables declaration//GEN-END:variables
}