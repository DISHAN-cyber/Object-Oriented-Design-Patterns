/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.BorderLayout;
import java.awt.Font;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.DefaultCaret;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import model.CardPayment;
import model.CashPayment;
import model.PayPalPayment;
import model.PaymentProcessor;

/**
 *
 * @author Dilhara
 */
public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
        validateDoubleValue();
        loadPaymentMethods();
    }

    private void validateDoubleValue() {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        NumberFormatter formatter = new NumberFormatter(decimalFormat);
        formatter.setValueClass(Double.class);
        formatter.setAllowsInvalid(false); // reject invalid characters
        formatter.setMinimum(0.0);
        formatter.setMaximum(Double.MAX_VALUE);

        DefaultFormatterFactory defaultFormatterFactory = new DefaultFormatterFactory(formatter);
        amountField.setFormatterFactory(defaultFormatterFactory);
    }

    private void loadPaymentMethods() {
        String[] methods = new String[]{"Select Payment Type", "Cash", "Card", "PayPal"};
        DefaultComboBoxModel<String> dcm = new DefaultComboBoxModel<>(methods);
        paymentCombo.setModel(dcm);
    }

    private void processPayment() {
        String paymentType = String.valueOf(paymentCombo.getSelectedItem());
        String input = amountField.getText().trim();
        double amount;

        if (input.isBlank()) {
            outputArea.setText("Please enter the amount...");
            return;
        }
        try {
            amount = Double.parseDouble(input);
            if (amount <= 0) {
                outputArea.setText("Amount must be greater than 0...");
                return;
            }
        } catch (NumberFormatException e) {
            outputArea.setText("Invalid amount format...");
            return;
        }
        PaymentProcessor paymentProcessor;
        switch (paymentType) {
            case "Cash":
                paymentProcessor = new CashPayment(amount);
                break;
            case "Card":
                paymentProcessor = new CardPayment(amount);
                break;
            case "PayPal":
                paymentProcessor = new PayPalPayment(amount);
                break;
            default:
                outputArea.setText("Unknown payment method...");
                return;
        }
        StringBuilder log = new StringBuilder();
        paymentProcessor.processPayment(log);
        outputArea.setText(log.toString());

        double tax = amount * (PaymentProcessor.TAX_PRECENTAGE / 100);
        double total = amount + tax;
        showReceipt(paymentType, amount, tax, total);
    }

    private void showReceipt(String paymentType, double amount, double tax, double total) {
        StringBuilder receipt = new StringBuilder();
        receipt.append("=============== RECEIPT ===============\n");
        receipt.append("Date/Time: ")
                .append(new SimpleDateFormat("yyyy-MMM-dd hh:mm a").format(new Date())).append("\n");

        receipt.append("Payment Type: ").append(paymentType).append("\n");

        receipt.append("--------------------------------------\n");

        receipt.append("           Amount: LKR ")
                .append(String.format("%.2f", amount)).append("\n");

        receipt.append("       GST(")
                .append(PaymentProcessor.TAX_PRECENTAGE)
                .append("%): LKR ")
                .append(String.format("%.2f", tax)).append("\n");//GST(20%): LKR 100.00

        receipt.append("     Total to Pay: LKR ")
                .append(String.format("%.2f", total)).append("\n");

        receipt.append("--------------------------------------\n");
        receipt.append("Status: Paid Successfully\n");
        receipt.append("Thank You for your payment!\n");
        receipt.append("======================================");

        new ReceiptDialog(this, true, receipt.toString())
                .setVisible(true);
    }

    private class ReceiptDialog extends JDialog {

        public ReceiptDialog(JFrame parent, boolean modal, String receiptText) {
            super(parent, modal);
            init(receiptText);
        }

        private void init(String receiptText) {
            setSize(400, 350);
            setLayout(new BorderLayout());
            setLocationRelativeTo(this.getParent());

            JTextPane receiptPane = new JTextPane();
            receiptPane.setFont(new Font(Font.MONOSPACED, Font.BOLD, 14));
            receiptPane.setText(receiptText);

            StyledDocument document = receiptPane.getStyledDocument();
            SimpleAttributeSet attributeSet = new SimpleAttributeSet(); // javax.swing.text
            StyleConstants.setAlignment(attributeSet, StyleConstants.ALIGN_CENTER);//javax.swing.text
            document.setParagraphAttributes(0, document.getLength(), attributeSet, false);

            receiptPane.setEditable(false);
            receiptPane.setFocusable(false);
            receiptPane.setHighlighter(null);
            receiptPane.setCaret(new DefaultCaret() {
                {
                    setBlinkRate(0);
                }

                @Override
                public void setVisible(boolean e) {
                    super.setVisible(false);
                }
                
            });
            
            JScrollPane scrollPane = new JScrollPane(receiptPane);
            scrollPane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
            add(scrollPane, BorderLayout.CENTER);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        paymentCombo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        amountField = new javax.swing.JFormattedTextField();
        paymentBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Process Payment");

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel1.setText("Payment Method:");

        paymentCombo.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        paymentCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel2.setText("Enter Amount (LKR):");

        amountField.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N

        paymentBtn.setBackground(new java.awt.Color(0, 153, 204));
        paymentBtn.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        paymentBtn.setForeground(new java.awt.Color(255, 255, 255));
        paymentBtn.setText("Process Payment");
        paymentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentBtnActionPerformed(evt);
            }
        });

        outputArea.setColumns(20);
        outputArea.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        outputArea.setLineWrap(true);
        outputArea.setRows(5);
        jScrollPane1.setViewportView(outputArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(paymentCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(amountField)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(paymentBtn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paymentCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(amountField, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paymentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void paymentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentBtnActionPerformed
        processPayment();
    }//GEN-LAST:event_paymentBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatIntelliJLaf.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Home().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField amountField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea outputArea;
    private javax.swing.JButton paymentBtn;
    private javax.swing.JComboBox<String> paymentCombo;
    // End of variables declaration//GEN-END:variables
}
