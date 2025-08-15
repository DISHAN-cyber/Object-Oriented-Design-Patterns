package gui;

import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import model.Adapter;
import model.AudioPlayer;
import model.MediaFile;
import model.Player;
import model.VideoPlayer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Dilhara
 */
public class Home extends javax.swing.JFrame {

    private static Home home;

    public Home() {
        initComponents();
        setLocationRelativeTo(null);
        loadCombo();
    }

    private void loadCombo() {
        String[] types = new String[]{"Audio.mp3", "Video.mp4"};
        DefaultComboBoxModel<String> dcm = new DefaultComboBoxModel<>(types);
        categoryCombo.setModel(dcm);
    }

    public static Home getInstance() {
        if (home == null) {
            home = new Home();
        }
        return home;
    }

    public JLabel getTitleLabel() {
        return titleLabel;
    }

    public JLabel getSingerLabel() {
        return singerLabel;
    }

    public JLabel getPlayLabel() {
        return playLabel;
    }

    private boolean isPlaying; // default -> false

    private void toggleIcon() {
        Color color = new Color(0, 153, 204);
        if (isPlaying) {
            playBtn.setIcon(new ImageIcon(getClass().getResource("/img/pause.png")));
            playBtn.setBackground(Color.WHITE);
        } else {
            playBtn.setIcon(new ImageIcon(getClass().getResource("/img/play.png")));
            playBtn.setBackground(color);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        singerLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        categoryCombo = new javax.swing.JComboBox<>();
        playLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        playBtn = new javax.swing.JButton();
        stopBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        titleLabel.setFont(new java.awt.Font("JetBrains Mono", 1, 24)); // NOI18N
        titleLabel.setText("Title");

        singerLabel.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        singerLabel.setText("Singer");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(singerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(singerLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        categoryCombo.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        categoryCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        playLabel.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        playLabel.setText("Playing: ....");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        playBtn.setBackground(new java.awt.Color(0, 153, 204));
        playBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/play.png"))); // NOI18N
        playBtn.setMaximumSize(new java.awt.Dimension(80, 80));
        playBtn.setMinimumSize(new java.awt.Dimension(80, 80));
        playBtn.setPreferredSize(new java.awt.Dimension(80, 80));
        playBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playBtnActionPerformed(evt);
            }
        });
        jPanel3.add(playBtn);

        stopBtn.setBackground(new java.awt.Color(204, 204, 255));
        stopBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/stop.png"))); // NOI18N
        stopBtn.setMaximumSize(new java.awt.Dimension(80, 80));
        stopBtn.setMinimumSize(new java.awt.Dimension(80, 80));
        stopBtn.setPreferredSize(new java.awt.Dimension(80, 80));
        stopBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopBtnActionPerformed(evt);
            }
        });
        jPanel3.add(stopBtn);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(categoryCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(categoryCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playBtnActionPerformed
        MediaFile mf1 = new MediaFile("Believer", "Imagine Dragons", "Believer_Imagine_Dragons.mp3");
        MediaFile mf2 = new MediaFile("Rukkathhana Mala Mudune", "Nanda Malini", "Rukkaththana-Nanda Malini.mp4");

        String selectedType = String.valueOf(categoryCombo.getSelectedItem());
        Player player = new Player();

        if (!isPlaying) {
            isPlaying = true;
            toggleIcon();
        } else {
            isPlaying = false;
            toggleIcon();
        }

        switch (selectedType) {
            case "Video.mp4":
                VideoPlayer videoPlayer = new VideoPlayer();
                Adapter adapter = new Adapter();
                adapter.setAdvancedMediaPlayer(videoPlayer);
                player.setMediaPlayer(adapter);
                player.startPlaying(mf2);
                break;
            default:
                AudioPlayer audioPlayer = new AudioPlayer();
                player.setMediaPlayer(audioPlayer);
                player.startPlaying(mf1);
                break;
        }
    }//GEN-LAST:event_playBtnActionPerformed

    private void stopBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopBtnActionPerformed
        titleLabel.setText("Title...");
        singerLabel.setText("Singer...");
        playLabel.setText("Playing :.....");
        isPlaying = false;
        toggleIcon();
    }//GEN-LAST:event_stopBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatIntelliJLaf.setup();
        java.awt.EventQueue.invokeLater(() -> Home.getInstance().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> categoryCombo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton playBtn;
    private javax.swing.JLabel playLabel;
    private javax.swing.JLabel singerLabel;
    private javax.swing.JButton stopBtn;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
