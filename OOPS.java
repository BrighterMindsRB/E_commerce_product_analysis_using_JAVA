/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops_java;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author user
 */
public class OOPS extends javax.swing.JFrame {
    
    Connection con;
    private Object frame;
    private Object jTable;
    /**
     * Creates new form OOPS
     */
    public OOPS() {
        initComponents();
        
        String url = "jdbc:mysql://localhost/emarket";
        String user = "root";
        String pass = "";
        try{
            con = DriverManager.getConnection(url, user, pass);
        }catch(Exception ex){
            System.out.println("Error " + ex.getMessage());
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

        btnview = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblcommerce = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        top_btn = new javax.swing.JButton();
        btnprint = new javax.swing.JButton();
        piechartpanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnview.setBackground(new java.awt.Color(0, 255, 255));
        btnview.setForeground(new java.awt.Color(255, 0, 204));
        btnview.setText("VIEW");
        btnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewActionPerformed(evt);
            }
        });
        getContentPane().add(btnview, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 16, 132, 42));

        btnclear.setText("CLOSE");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        getContentPane().add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(884, 16, 134, 42));

        tblcommerce.setBackground(new java.awt.Color(204, 255, 204));
        tblcommerce.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblcommerce.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        tblcommerce.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Si No", "prod_name", "prod_price", "description", "reviews"
            }
        ));
        tblcommerce.setGridColor(new java.awt.Color(51, 0, 51));
        tblcommerce.setIntercellSpacing(new java.awt.Dimension(2, 4));
        tblcommerce.setRowHeight(30);
        jScrollPane2.setViewportView(tblcommerce);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 185, 210, 80));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Enter text to search :  ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 97, 267, 56));

        txt_search.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });
        getContentPane().add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(622, 108, 325, -1));

        jButton1.setBackground(new java.awt.Color(255, 0, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 51, 51));
        jButton1.setText("ANALYSIS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1038, 108, 172, 43));

        top_btn.setText("TOP");
        top_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                top_btnActionPerformed(evt);
            }
        });
        getContentPane().add(top_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 117, 106, 36));

        btnprint.setText("print");
        btnprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprintActionPerformed(evt);
            }
        });
        getContentPane().add(btnprint, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 550, -1, -1));

        piechartpanel.setBackground(new java.awt.Color(255, 255, 255));
        piechartpanel.setLayout(new java.awt.BorderLayout());
        getContentPane().add(piechartpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 720, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewActionPerformed
        // TODO add your handling code here:
        String sql="SELECT * FROM  emarket_table";
        try{
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            DefaultTableModel model= (DefaultTableModel)tblcommerce.getModel();
            model.setRowCount(0);
            //table.setRowHeight(30);
            while(rs.next()){
                model.addRow(new String[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
                //model.setRowHeight(40);
            }
        }catch(Exception ex){
            System.out.println("Error : " + ex.getMessage());
        }
        
    }//GEN-LAST:event_btnviewActionPerformed

    public void search(String str){
        DefaultTableModel model= (DefaultTableModel)tblcommerce.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        tblcommerce.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
        
    }
    
    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel)tblcommerce.getModel();
        model.setRowCount(0);
        model.setRowCount(10);
    }//GEN-LAST:event_btnclearActionPerformed

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        // TODO add your handling code here:
        String searchString = txt_search.getText();
        search(searchString);
    }//GEN-LAST:event_txt_searchKeyReleased

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("HP",new Double(20));
        dataset.setValue("ASUS",new Double(20));
        dataset.setValue("Apple",new Double(40));
        dataset.setValue("Lenovo",new Double(10));
        JFreeChart chart = ChartFactory.createPieChart("E-Commerce Analysis",dataset,false, true, false);
        PiePlot p = (PiePlot)chart.getPlot();
        
        p.setSectionPaint("HP",new Color(255,255,102));
        p.setSectionPaint("ASUS",new Color(102,255,102));
        p.setSectionPaint("Apple",new Color(255,102,153));
        p.setSectionPaint("Lenovo",new Color(0,204,204));
        
        p.setBackgroundPaint(Color.white);
        ChartPanel frame = new ChartPanel(chart);
        piechartpanel.removeAll();
        piechartpanel.add(frame,BorderLayout.CENTER);
        piechartpanel.validate();
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void top_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_top_btnActionPerformed
        // TODO add your handling code here:
        
        
        Product_overall top = new Product_overall();
        top.setVisible(true);
        top.setSize(450,350);
    }//GEN-LAST:event_top_btnActionPerformed

    private void btnprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprintActionPerformed

        // TODO add your handling code here:
        
        //printRecord(jPanel1);
    }//GEN-LAST:event_btnprintActionPerformed

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
            java.util.logging.Logger.getLogger(OOPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OOPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OOPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OOPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OOPS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnprint;
    private javax.swing.JButton btnview;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel piechartpanel;
    private javax.swing.JTable tblcommerce;
    private javax.swing.JButton top_btn;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables

    
    private void printRecord(final JPanel panel){
        PrinterJob printerJob = PrinterJob.getPrinterJob();
        printerJob.setJobName("Print Record");
        printerJob.setPrintable(new Printable(){
            public int print(Graphics graphics,PageFormat pageFormat,int pageIndex) throws PrinterException {
               if(pageIndex > 0){
                   return Printable.NO_SUCH_PAGE;
               }
               
               Graphics2D graphics2D = (Graphics2D)graphics;
               graphics2D.translate(pageFormat.getImageableX()*2,pageFormat.getImageableY()*2);
               
               graphics2D.scale(0.5, 0.5);
               panel.paint(graphics2D);
               return Printable.PAGE_EXISTS;
            }
        });
        boolean returningResult = printerJob.printDialog();
        if(returningResult){
            try{
                printerJob.print();
            }catch(PrinterException printerException){
                JOptionPane.showMessageDialog(this,"Print Error: " + printerException.getMessage());
            }
        }
    }
}
