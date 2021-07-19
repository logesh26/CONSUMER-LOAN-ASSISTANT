
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class LoanAssistant extends javax.swing.JFrame {

    
     double loan;
     double interest;
     double paymentno;
     double monthpayment;
    /**
     * Creates new form LoanAssistant
     */
    public LoanAssistant() {
        initComponents();
        txtpayments.setBackground(Color.white);
        txtmonth.setBackground(Color.yellow);
        paymentbtn.setVisible(true);
        monthbtn.setVisible(false);
        newloan.setEnabled(false);
        computempayment.setFocusable(false);
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
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtloan = new javax.swing.JTextArea();
        txtlbalance = new javax.swing.JTextField();
        txtrate = new javax.swing.JTextField();
        txtpayments = new javax.swing.JTextField();
        txtmonth = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        computempayment = new javax.swing.JButton();
        newloan = new javax.swing.JButton();
        paymentbtn = new javax.swing.JButton();
        monthbtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("loan balance");

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("interest rate");

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("number of payments");

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("monthly payment");

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("LOAN ANALYSIS:");

        txtloan.setColumns(20);
        txtloan.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        txtloan.setRows(5);
        jScrollPane1.setViewportView(txtloan);

        txtlbalance.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        txtrate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        txtpayments.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        txtmonth.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jButton2.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        computempayment.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        computempayment.setText("COMPUTE MONTHLY PAYMENT");
        computempayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computempaymentActionPerformed(evt);
            }
        });

        newloan.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        newloan.setText("NEW LOAN ANALYSIS");
        newloan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newloanActionPerformed(evt);
            }
        });

        paymentbtn.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        paymentbtn.setText("X");
        paymentbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentbtnActionPerformed(evt);
            }
        });

        monthbtn.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        monthbtn.setText("X");
        monthbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthbtnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Bradley Hand ITC", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CONSUMER LOAN ASSISTANT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(newloan, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(150, 150, 150))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtrate)
                            .addComponent(txtpayments)
                            .addComponent(txtlbalance)
                            .addComponent(txtmonth, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(computempayment)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(paymentbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(monthbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(txtlbalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtrate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtpayments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtmonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(computempayment))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(paymentbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(monthbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(3, 3, 3)
                .addComponent(newloan)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void newloanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newloanActionPerformed
          
    txtmonth.setText("");
    newloan.setEnabled(false);
    computempayment.setEnabled(true);
    txtlbalance.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_newloanActionPerformed

    private void computempaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computempaymentActionPerformed
        if(paymentbtn.isVisible())
    {
    newloan.setEnabled(true);
    computempayment.setEnabled(false);
    String monthpay;
    double payment;
    double interestgain;
    txtmonth.setFocusable(true);
    loan= Double.parseDouble(txtlbalance.getText());
    interest= Double.parseDouble(txtrate.getText());
    paymentno= Double.parseDouble(txtpayments.getText());
    txtmonth.setFocusable(true);
    payment= loan +(loan*interest/100);
    monthpayment = payment/paymentno;
    monthpay= Double.toString(monthpayment);
    txtmonth.setText(monthpay);
    interestgain= (payment-loan); 
    txtloan.append("\n\nLoan Amount:\n\n"+loan+"\n\nInterest:\n\n"+interest+"\n\nNumber of Payment:\n\n"+paymentno+"\n\nMonthly Payment:\n\n"+monthpayment+"\n\nInterest Gained:\n\n"+interestgain);
    }
    else{
    newloan.setEnabled(true);
    computempayment.setEnabled(false);
    String noofpay;
    double payment;
    double interestgain;
    txtmonth.setFocusable(true);
    loan= Double.parseDouble(txtlbalance.getText());
    interest= Double.parseDouble(txtrate.getText());
    double monthpayment = Double.parseDouble(txtmonth.getText());
    txtpayments.setFocusable(true);
    payment= loan +(loan*interest/100);
    paymentno= payment/monthpayment;
    noofpay= Double.toString(paymentno);
    txtpayments.setText(noofpay);
    interestgain= (payment-loan);
    txtloan.append("\n\nLoan Amount:\n\n"+loan+"\n\nInterest:\n\n"+interest+"\n\nNumber of Payment:\n\n"+paymentno+"\n\nMonthly Payment:\n\n"+monthpayment+"\n\nInterest Gained:\n\n"+interestgain);
    }                     // TODO add your handling code here:
    }//GEN-LAST:event_computempaymentActionPerformed

    private void paymentbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentbtnActionPerformed
         txtlbalance.setText("");
         txtrate.setText("");
         txtpayments.setText("");
         txtmonth.setText("");
         txtpayments.setBackground(Color.yellow);
         txtmonth.setBackground(Color.white);
         paymentbtn.setVisible(false);
         monthbtn.setVisible(true);
         txtmonth.setFocusable(true);
         txtpayments.setFocusable(false);
         newloan.setEnabled(false);
         computempayment.setEnabled(true);          // TODO add your handling code here:
    }//GEN-LAST:event_paymentbtnActionPerformed

    private void monthbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthbtnActionPerformed
         txtlbalance.setText("");
         txtrate.setText("");
         txtpayments.setText("");
         txtmonth.setText("");
         txtpayments.setBackground(Color.white);
         txtmonth.setBackground(Color.yellow);
         paymentbtn.setVisible(true);
         monthbtn.setVisible(false);
         txtpayments.setFocusable(true);
         txtmonth.setFocusable(false);
         newloan.setEnabled(false);
         computempayment.setEnabled(true);        // TODO add your handling code here:
    }//GEN-LAST:event_monthbtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(LoanAssistant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoanAssistant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoanAssistant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoanAssistant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoanAssistant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton computempayment;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton monthbtn;
    private javax.swing.JButton newloan;
    private javax.swing.JButton paymentbtn;
    private javax.swing.JTextField txtlbalance;
    private javax.swing.JTextArea txtloan;
    private javax.swing.JTextField txtmonth;
    private javax.swing.JTextField txtpayments;
    private javax.swing.JTextField txtrate;
    // End of variables declaration//GEN-END:variables
}
