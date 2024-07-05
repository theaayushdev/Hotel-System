
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class billing extends javax.swing.JFrame {

    /**
     * Creates new form billing
     */
    public billing() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox<>();
        reserv = new javax.swing.JTextField();
        guest = new javax.swing.JTextField();
        amount = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        gen = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        invoices = new javax.swing.JTextField();
        amt = new javax.swing.JTextField();
        pay = new javax.swing.JButton();
        combox = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        invoiceField = new javax.swing.JTextPane();
        back = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Reservation ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel2.setText("Guest ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 72, -1));

        jLabel3.setText("Amount");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 56, -1));

        jLabel4.setText("Status");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 37, -1));

        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Paid", "Unpaid" }));
        jPanel1.add(combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 93, -1));
        jPanel1.add(reserv, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 92, -1));
        jPanel1.add(guest, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 92, -1));
        jPanel1.add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 93, -1));

        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 261, -1, -1));

        gen.setText("Generate");
        gen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genActionPerformed(evt);
            }
        });
        jPanel1.add(gen, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 261, -1, -1));

        jLabel11.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        jLabel11.setText("INVOICE");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 110, 61));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/colorful-windows-10-gradient-minimalism-soft-gradient-hd-wallpaper-preview.jpg"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 300));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 84, -1, 295));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Invoice ID");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 113, -1, -1));

        jLabel6.setText("Amount");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 150, 50, -1));

        jLabel7.setText("Method");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 195, 50, -1));
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 192, 37, -1));
        jPanel2.add(invoices, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 107, 105, -1));
        jPanel2.add(amt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 147, 106, -1));

        pay.setText("Pay");
        pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payActionPerformed(evt);
            }
        });
        jPanel2.add(pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        combox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Online", "Cheque", "Card", "Cash" }));
        jPanel2.add(combox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 192, 106, -1));

        jLabel9.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        jLabel9.setText("PAYMENT");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 140, 61));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/colorful-windows-10-gradient-minimalism-soft-gradient-hd-wallpaper-preview.jpg"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 290));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 84, -1, -1));

        jScrollPane2.setViewportView(invoiceField);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 385, 350, 163));

        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 480, -1, -1));

        jLabel13.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Billing & Payments");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 360, 61));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/aesthetic-computer-4k-c9qdhe02pr84wh3a.jpg"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void genActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genActionPerformed
       String ID = reserv.getText();
    String Guest = guest.getText();
    String Amount = amount.getText();
   String billstatus = (String)combo.getSelectedItem();
           
           
           String invoiceText = "Dear customer your ID is: \n\n" + "Reservation ID: " + ID + "\n" +
                             "Guest ID: " + Guest + "\n" +
                             "Amount: " + Amount + "\n" +
                             "Bill Status: " + billstatus;

           invoiceField.setText(invoiceText);
    }//GEN-LAST:event_genActionPerformed

    private void payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payActionPerformed
 String ID = invoices.getText();
      
        String Amount = amt.getText();
        String Type = (String) combox.getSelectedItem();
       

         try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/hotel";


            Connection connection = DriverManager.getConnection(url, "root","");

            String sql = "INSERT INTO billing2 (`Invoice`,`Amount`,`Method`) VALUES (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, ID);
            statement.setString(2, Amount);
            
            statement.setString(3, Type);
            statement.executeUpdate();

            JOptionPane.showMessageDialog(null,"Paid!,Thank You ");

         }catch(ClassNotFoundException | SQLException e){System.out.print(e);}
               
    }//GEN-LAST:event_payActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
           try {
    // Load the MySQL JDBC driver
    Class.forName("com.mysql.cj.jdbc.Driver");

    // Database URL, change according to your setup
    String url = "jdbc:mysql://localhost:3306/hotel";

    // Connect to the database
    Connection connection = DriverManager.getConnection(url, "root", "");

    // Retrieve the data from the text fields
    String res = reserv.getText();
    String ID = guest.getText();
    String Amount = amount.getText();
     String Type = (String) combox.getSelectedItem();
    

    // Prepare the SQL query
    String sql = "INSERT INTO billing (`Reservation`, `Guest`, `Amount`, `Status`) VALUES (?, ?, ?, ?)";
    PreparedStatement statement = connection.prepareStatement(sql);
    statement.setString(1, res);
    statement.setString(2, ID);
    statement.setString(3, Amount);
    statement.setString(4, Type);
    

    // Execute the query
    statement.executeUpdate();

    // Close the statement and connection
    statement.close();
    connection.close();

} catch(ClassNotFoundException | SQLException e){System.out.print(e);}
      JOptionPane.showMessageDialog(null,"Added Successfully");
    }//GEN-LAST:event_addActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
       Management b = new Management();
       b.show();
       this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new billing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField amount;
    private javax.swing.JTextField amt;
    private javax.swing.JButton back;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JComboBox<String> combox;
    private javax.swing.JButton gen;
    private javax.swing.JTextField guest;
    private javax.swing.JTextPane invoiceField;
    private javax.swing.JTextField invoices;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton pay;
    private javax.swing.JTextField reserv;
    // End of variables declaration//GEN-END:variables
}