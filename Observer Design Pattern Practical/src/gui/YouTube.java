/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import model.Observer;
import model.Subscriber;
import model.YouTubeChannel;

/**
 *
 * @author Dilhara
 */
public class YouTube extends javax.swing.JFrame {

    private static YouTube youTube;
    private List<YouTubeChannel> channels;
    private List<Subscriber> subscribers;

    private DefaultListModel<String> channelListModel;
    private DefaultListModel<String> subscribersListModel;

    private YouTube() {
        initComponents();
        init();
    }

    private void init() {
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        this.channels = new ArrayList<>();
        this.subscribers = new ArrayList<>();
        this.channelListModel = new DefaultListModel<>();
        this.subscribersListModel = new DefaultListModel<>();

        this.channelList.setModel(channelListModel);
        this.subscriberList.setModel(subscribersListModel);
    }

    public static YouTube getInstance() {
        if (youTube == null) {
            youTube = new YouTube();
        }
        return youTube;
    }

    public JTextPane getNotificationArea() {
        return notificationArea;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        channelNameField = new javax.swing.JTextField();
        addChannelBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        subscriberNameField = new javax.swing.JTextField();
        addSubscriberField = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        channelCombo = new javax.swing.JComboBox<>();
        subscriberCombo = new javax.swing.JComboBox<>();
        unsubscribeBtn = new javax.swing.JButton();
        subscribeBtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        uploadChannelCombo = new javax.swing.JComboBox<>();
        uploadBtn = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        videoTitleField = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        channelList = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        subscriberList = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        notificationArea = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Channel", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("JetBrains Mono", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        jLabel1.setText("Channel Name");

        channelNameField.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N

        addChannelBtn.setBackground(new java.awt.Color(0, 153, 204));
        addChannelBtn.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        addChannelBtn.setForeground(new java.awt.Color(255, 255, 255));
        addChannelBtn.setText("Add Channel");
        addChannelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addChannelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(channelNameField)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 223, Short.MAX_VALUE)
                        .addComponent(addChannelBtn)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(channelNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addChannelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Subscribers", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("JetBrains Mono", 1, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        jLabel2.setText("Add Subscriber");

        subscriberNameField.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N

        addSubscriberField.setBackground(new java.awt.Color(0, 153, 204));
        addSubscriberField.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        addSubscriberField.setForeground(new java.awt.Color(255, 255, 255));
        addSubscriberField.setText("Add Subscriber");
        addSubscriberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSubscriberFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(subscriberNameField)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 196, Short.MAX_VALUE)
                        .addComponent(addSubscriberField)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subscriberNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addSubscriberField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Manage Subscribers", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("JetBrains Mono", 1, 14))); // NOI18N

        channelCombo.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N

        subscriberCombo.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N

        unsubscribeBtn.setBackground(new java.awt.Color(255, 51, 51));
        unsubscribeBtn.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        unsubscribeBtn.setForeground(new java.awt.Color(255, 255, 255));
        unsubscribeBtn.setText("Unsubscribe");
        unsubscribeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unsubscribeBtnActionPerformed(evt);
            }
        });

        subscribeBtn.setBackground(new java.awt.Color(0, 153, 51));
        subscribeBtn.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        subscribeBtn.setForeground(new java.awt.Color(255, 255, 255));
        subscribeBtn.setText("Subscribe");
        subscribeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subscribeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(channelCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(subscriberCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(subscribeBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(unsubscribeBtn)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(channelCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subscriberCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unsubscribeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subscribeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Upload Video", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("JetBrains Mono", 1, 14))); // NOI18N

        uploadChannelCombo.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N

        uploadBtn.setBackground(new java.awt.Color(204, 102, 0));
        uploadBtn.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        uploadBtn.setForeground(new java.awt.Color(255, 255, 255));
        uploadBtn.setText("Upload Video");
        uploadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadBtnActionPerformed(evt);
            }
        });

        videoTitleField.setColumns(20);
        videoTitleField.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        videoTitleField.setLineWrap(true);
        videoTitleField.setRows(5);
        jScrollPane4.setViewportView(videoTitleField);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(uploadBtn))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(uploadChannelCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(uploadBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(uploadChannelCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jScrollPane1.setPreferredSize(new java.awt.Dimension(262, 120));

        channelList.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Channel List", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("JetBrains Mono", 1, 14))); // NOI18N
        channelList.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        channelList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        channelList.setPreferredSize(new java.awt.Dimension(262, 120));
        jScrollPane1.setViewportView(channelList);

        jScrollPane2.setPreferredSize(new java.awt.Dimension(262, 120));

        subscriberList.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Subscribers List", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("JetBrains Mono", 1, 14))); // NOI18N
        subscriberList.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        subscriberList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        subscriberList.setPreferredSize(new java.awt.Dimension(262, 120));
        jScrollPane2.setViewportView(subscriberList);

        notificationArea.setEditable(false);
        notificationArea.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Notification Area", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("JetBrains Mono", 1, 14))); // NOI18N
        notificationArea.setFont(new java.awt.Font("Fira Code", 1, 14)); // NOI18N
        jScrollPane3.setViewportView(notificationArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addChannelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addChannelBtnActionPerformed
        String channelName = channelNameField.getText().trim();
        if (!channelName.isBlank()) {
            channels.add(new YouTubeChannel(channelName));
            channelListModel.addElement(channelName);
            channelNameField.setText("");
        }

        channelCombo.removeAllItems();
        uploadChannelCombo.removeAllItems();
        for (YouTubeChannel c : channels) {
            channelCombo.addItem(c.getName());
            uploadChannelCombo.addItem(c.getName());
        }
    }//GEN-LAST:event_addChannelBtnActionPerformed

    private void addSubscriberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSubscriberFieldActionPerformed
        String subscriberName = subscriberNameField.getText().trim();
        if (!subscriberName.isBlank()) {
            subscribers.add(new Subscriber(subscriberName));
            subscribersListModel.addElement(subscriberName);
            subscriberNameField.setText("");
        }
        subscriberCombo.removeAllItems();
        for (Subscriber subscriber : subscribers) {
            subscriberCombo.addItem(subscriber.getName());
        }
    }//GEN-LAST:event_addSubscriberFieldActionPerformed

    private void subscribeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subscribeBtnActionPerformed
        String subName = String.valueOf(subscriberCombo.getSelectedItem());
        String chName = String.valueOf(channelCombo.getSelectedItem());
        if (subName != null && chName != null) {
            Subscriber sub = getSubscriberByName(subName);
            YouTubeChannel ch = getChannelByName(chName);
            if (sub != null && ch != null) {
                sub.subscribeChannel(ch);
                sub.update(chName, "", Observer.SUBSCRIBE);
            }
        }
    }//GEN-LAST:event_subscribeBtnActionPerformed

    private void unsubscribeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unsubscribeBtnActionPerformed
        int chIndex = channelList.getSelectedIndex();
        int subIndex = subscriberList.getSelectedIndex();
        if (chIndex >= 0 && subIndex >= 0) {
            subscribers.get(subIndex)
                    .update(channels.get(chIndex).getName(), "", Observer.UNSUBSCRIBE);
            subscribers.get(subIndex).unsubscribe(channels.get(chIndex));
            channels.get(chIndex).unsubscribe(subscribers.get(subIndex));
        }
    }//GEN-LAST:event_unsubscribeBtnActionPerformed

    private void uploadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadBtnActionPerformed
        String chName = String.valueOf(uploadChannelCombo.getSelectedItem());
        String subName = String.valueOf(subscriberCombo.getSelectedItem());

        String videoTitle = videoTitleField.getText().trim();

        if (chName != null && subName != null) {
            YouTubeChannel ch = getChannelByName(chName);
            Subscriber sub = getSubscriberByName(subName);
            if (sub != null && ch != null) {
                ch.uploadVideo(videoTitle);
                JOptionPane.showMessageDialog(this,
                        "Video uploaded and notifications sent!",
                         "Success Message",
                        JOptionPane.INFORMATION_MESSAGE);
                videoTitleField.setText("");
            }
        }
    }//GEN-LAST:event_uploadBtnActionPerformed

    private Subscriber getSubscriberByName(String name) {
        return subscribers.stream().filter(s -> s.getName().equals(name)).findFirst().orElse(null);
    }

    private YouTubeChannel getChannelByName(String name) {
        return channels.stream().filter(c -> c.getName().equals(name)).findFirst().orElse(null);
    }

    public static void main(String args[]) {
        FlatIntelliJLaf.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> YouTube.getInstance().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addChannelBtn;
    private javax.swing.JButton addSubscriberField;
    private javax.swing.JComboBox<String> channelCombo;
    private javax.swing.JList<String> channelList;
    private javax.swing.JTextField channelNameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextPane notificationArea;
    private javax.swing.JButton subscribeBtn;
    private javax.swing.JComboBox<String> subscriberCombo;
    private javax.swing.JList<String> subscriberList;
    private javax.swing.JTextField subscriberNameField;
    private javax.swing.JButton unsubscribeBtn;
    private javax.swing.JButton uploadBtn;
    private javax.swing.JComboBox<String> uploadChannelCombo;
    private javax.swing.JTextArea videoTitleField;
    // End of variables declaration//GEN-END:variables
}
