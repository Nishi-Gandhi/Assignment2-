/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AddCommunity;
import Validations.Validations;
import javax.swing.JOptionPane;
import models.Community;
import models.CommunityHistory;

/**
 *
 * @author LENOVO
 */
public class AddCommunity extends javax.swing.JPanel {

    /**
     * Creates new form CommunityAdmin
     */
     CommunityHistory communityhistory;
    public AddCommunity(CommunityHistory communityhistory) {
        initComponents();
        this.communityhistory = communityhistory;
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
        RegisterButton = new javax.swing.JButton();
        AdminID = new javax.swing.JLabel();
        adminIDINput = new javax.swing.JTextField();
        CommunityName = new javax.swing.JLabel();
        communityNameInput = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CommunityID = new javax.swing.JLabel();
        communityIDInput = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        RegisterButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        RegisterButton.setText("REGISTER");
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });

        AdminID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AdminID.setText("Enter AdminID");

        adminIDINput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminIDINputActionPerformed(evt);
            }
        });

        CommunityName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CommunityName.setText("Community Name");

        communityNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                communityNameInputActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("REGISTER COMMUNITY");

        CommunityID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CommunityID.setText("Community ID");

        communityIDInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                communityIDInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AdminID, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CommunityName)
                    .addComponent(CommunityID))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adminIDINput, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(communityIDInput)
                    .addComponent(communityNameInput))
                .addGap(103, 103, 103))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(RegisterButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdminID, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminIDINput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CommunityName)
                    .addComponent(communityNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CommunityID)
                    .addComponent(communityIDInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(RegisterButton)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 441, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 373, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
        // TODO add your handling code here:
        String adminID = adminIDINput.getText();
        String communityName = communityNameInput.getText();
        String communityID = communityIDInput.getText();
        if (adminID.isEmpty() || communityName.isEmpty() || communityID.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Enter Data");
        } else if (Validations.ValidateName(communityName) == false) {
            JOptionPane.showMessageDialog(null, "Enter valid name");
        } else if (Validations.ValidateID(communityID) == false) {
            JOptionPane.showMessageDialog(null, "Please enter a valid CommunityID");
        } else if (Validations.ValidateID(adminID) == false) {
            JOptionPane.showMessageDialog(null, "Please enter a valid AdminID");
        } else {
            Community cm = communityhistory.addnewCommunity();
            cm.setAdminId(adminID);
            cm.setCommunityAdminName(communityName);
            cm.setCommunityID(communityID);
            System.out.println(cm.getAdminId());
            adminIDINput.setText("");
            communityNameInput.setText("");
            communityIDInput.setText("");
            JOptionPane.showMessageDialog(null, "Community Registered");

        }
    }//GEN-LAST:event_RegisterButtonActionPerformed

    private void adminIDINputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminIDINputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminIDINputActionPerformed

    private void communityNameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_communityNameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_communityNameInputActionPerformed

    private void communityIDInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_communityIDInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_communityIDInputActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminID;
    private javax.swing.JLabel CommunityID;
    private javax.swing.JLabel CommunityName;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JTextField adminIDINput;
    private javax.swing.JTextField communityIDInput;
    private javax.swing.JTextField communityNameInput;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}




