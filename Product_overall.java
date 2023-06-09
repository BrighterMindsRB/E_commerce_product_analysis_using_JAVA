/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops_java;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.event.RowSorterEvent;
import javax.swing.event.RowSorterListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class Product_overall extends javax.swing.JFrame {

    /**
     * Creates new form Product_overall
     */
    Connection con;
    public Product_overall() {
        initComponents();
        String url = "jdbc:mysql://localhost/emarket";
        String user = "root";
        String pass = "";
        try{
            con = DriverManager.getConnection(url, user, pass);
        }catch(Exception ex){
            System.out.println("Error " + ex.getMessage());
        }
        String sql="SELECT prod_price,reviews FROM  emarket_table";
        try{
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            DefaultTableModel model= (DefaultTableModel)tbloverall.getModel();
            model.setRowCount(0);
            //table.setRowHeight(30);
            while(rs.next()){
                model.addRow(new String[]{rs.getString(1),rs.getString(2)});
                //model.setRowHeight(40);
            }
        }catch(Exception ex){
            System.out.println("Error : " + ex.getMessage());
        }
        algorithm();
    }

    /**
     *
     */
    public void algorithm(){
        int row1 = tbloverall.getRowCount();
        double tot_price = 0, tot_review = 0;
        double avg_price,avg_rev;
        double x = 0;
        double temp;
        
     
    //DefaultTableModel models= (DefaultTableModel)tblextra.getModel();
    DefaultTableModel model= (DefaultTableModel)tbloverall.getModel();
        String overall = null;
        for(int i =0;i < row1;i++){
            double val = Double.valueOf(tbloverall.getValueAt(i,0).toString());
            double rev = Double.valueOf(tbloverall.getValueAt(i,1).toString());
            tot_price += val;
            tot_review += rev;
            //double array;
            
        }
        avg_price = tot_price/row1;
        avg_rev = tot_review/row1;
        avgprice.setText(Double.toString(avg_price));
        avgreview.setText(Double.toString(avg_rev));
        
        for(int i = 0;i < row1;i++)
        {
            double val = Double.valueOf(tbloverall.getValueAt(i,0).toString());
            double rev = Double.valueOf(tbloverall.getValueAt(i,1).toString());
            x = (val * rev)/(avg_price * avg_rev);
            //models.addRow(new Object[]{x});
            //model.addColumn("City", new Object[] {x});
            Object[] Overall_rating = {x};
            model.setValueAt(x, i, 2);
        }
        /*Object[] Overall_rating = {x};
    for (int i = 0; i < Overall_rating.length; i++) {
      model.setValueAt(Overall_rating[i], i, 2); // Insert the city name into column 3
    }*/
        
        
    }
    
    //DefaultTableModel model = (DefaultTableModel)tblextra.getModel();
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tbloverall = new javax.swing.JTable();
        avgprice = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        avgreview = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnoverallcal = new javax.swing.JButton();
        txtmove = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbloverall.setBackground(new java.awt.Color(153, 255, 51));
        tbloverall.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 51)));
        tbloverall.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        tbloverall.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "prod_price", "reviews", "Overall_rating"
            }
        ));
        tbloverall.setRowHeight(30);
        tbloverall.setRowMargin(5);
        jScrollPane2.setViewportView(tbloverall);

        avgprice.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        avgprice.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Average Price :");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Average Review : ");

        avgreview.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        avgreview.setText("jLabel3");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel3.setText("OVERALL RATING CALCULATION OF EACH PRODUCT");

        btnoverallcal.setBackground(new java.awt.Color(153, 153, 153));
        btnoverallcal.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnoverallcal.setForeground(new java.awt.Color(204, 0, 204));
        btnoverallcal.setText("CLICK HERE TO VIEW THE TOP PRODUCT BRANDS");
        btnoverallcal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnoverallcal.setDefaultCapable(false);
        btnoverallcal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnoverallcalActionPerformed(evt);
            }
        });

        txtmove.setText("Hello");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(avgprice, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(162, 162, 162)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(avgreview, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(523, 523, 523))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnoverallcal, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(417, 417, 417))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(755, 755, 755)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(txtmove)))
                .addContainerGap(510, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(txtmove)
                .addGap(45, 45, 45)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(avgprice, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(avgreview, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnoverallcal, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnoverallcalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnoverallcalActionPerformed
        // TODO add your handling code here:
        overall top = new overall();
        top.setVisible(true);
        top.setSize(450,350);
        
    }//GEN-LAST:event_btnoverallcalActionPerformed

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
            java.util.logging.Logger.getLogger(Product_overall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Product_overall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Product_overall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Product_overall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Product_overall().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avgprice;
    private javax.swing.JLabel avgreview;
    private javax.swing.JButton btnoverallcal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbloverall;
    private javax.swing.JLabel txtmove;
    // End of variables declaration//GEN-END:variables
}
