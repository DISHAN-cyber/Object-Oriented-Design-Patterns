package gui;

import com.formdev.flatlaf.FlatIntelliJLaf;
import javax.swing.JTextArea;
import model.Command;
import model.CommandHistory;
import model.CopyCommand;
import model.CutCommand;
import model.PasteCommand;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Dilhara
 */
public class Editor extends javax.swing.JFrame {

    private String clipboardText;
    private final CommandHistory commandHistory;

    public Editor() {
        initComponents();
        this.commandHistory = new CommandHistory();
        setLocationRelativeTo(null);
    }

    public String getClipboardText() {
        return clipboardText;
    }

    public void setClipboardText(String clipboardText) {
        this.clipboardText = clipboardText;
    }

    public JTextArea getEditorArea() {
        return editorArea;
    }

    private void executeCommand(Command command) {
        if (command.execute()) {
            commandHistory.setCommand(command);
        }
    }

    private void undo() {
        if (commandHistory.isStackEmpty()) {
            return;
        }
        Command command = commandHistory.pop();
        if (command != null) {
            command.undo();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        editorArea = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        copyBtn = new javax.swing.JButton();
        cutBtn = new javax.swing.JButton();
        pasteBtn = new javax.swing.JButton();
        undoBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Editor");

        editorArea.setColumns(20);
        editorArea.setFont(new java.awt.Font("MV Boli", 0, 20)); // NOI18N
        editorArea.setLineWrap(true);
        editorArea.setRows(5);
        jScrollPane1.setViewportView(editorArea);

        copyBtn.setBackground(new java.awt.Color(0, 153, 204));
        copyBtn.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        copyBtn.setForeground(new java.awt.Color(255, 255, 255));
        copyBtn.setText("Copy");
        copyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyBtnActionPerformed(evt);
            }
        });
        jPanel1.add(copyBtn);

        cutBtn.setBackground(new java.awt.Color(0, 153, 204));
        cutBtn.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        cutBtn.setForeground(new java.awt.Color(255, 255, 255));
        cutBtn.setText("Cut");
        cutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutBtnActionPerformed(evt);
            }
        });
        jPanel1.add(cutBtn);

        pasteBtn.setBackground(new java.awt.Color(0, 153, 204));
        pasteBtn.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        pasteBtn.setForeground(new java.awt.Color(255, 255, 255));
        pasteBtn.setText("Paste");
        pasteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteBtnActionPerformed(evt);
            }
        });
        jPanel1.add(pasteBtn);

        undoBtn.setBackground(new java.awt.Color(0, 153, 204));
        undoBtn.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        undoBtn.setForeground(new java.awt.Color(255, 255, 255));
        undoBtn.setText("Undo");
        undoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undoBtnActionPerformed(evt);
            }
        });
        jPanel1.add(undoBtn);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void copyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyBtnActionPerformed
        executeCommand(new CopyCommand(this));
    }//GEN-LAST:event_copyBtnActionPerformed

    private void cutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutBtnActionPerformed
        executeCommand(new CutCommand(this));
    }//GEN-LAST:event_cutBtnActionPerformed

    private void pasteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteBtnActionPerformed
        executeCommand(new PasteCommand(this));
    }//GEN-LAST:event_pasteBtnActionPerformed

    private void undoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoBtnActionPerformed
        undo();
    }//GEN-LAST:event_undoBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatIntelliJLaf.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Editor().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton copyBtn;
    private javax.swing.JButton cutBtn;
    private javax.swing.JTextArea editorArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pasteBtn;
    private javax.swing.JButton undoBtn;
    // End of variables declaration//GEN-END:variables
}
