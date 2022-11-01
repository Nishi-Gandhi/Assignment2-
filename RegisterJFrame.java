/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import AddCommunity.CommunityAdminJFrame;
import Doctor.DoctorJFrame;
import HospitalAdmin.HospitalAdminJFrame;
import Patient.PatientJFrame;
import SystemAdmin.MainJFrame;
import Validations.Validations;
import javax.swing.JOptionPane;
import models.CommunityAdminHistory;
import models.DoctorHistory;
import models.HospitalAdminHistory;
import models.PatientHistory;
import models.PersonHistory;
import models.CommunityHistory;
import models.HospitalHistory;
import models.VitalsHistory;
/**
 *
 * @author LENOVO
 */
public class RegisterJFrame extends javax.swing.JFrame {

      public String sysEmail = "systemadm@gmail.com";
    public String sysPassword = "1234abcd";
    public String System_Admin = "System Admin";

    public String hospEmail = "hospadm@gmail.com";
    public String hospPassword = "1234abcd";
    public String Hosp_Admin = "Hospital Admin";

    public String commEmail = "commadm@gmail.com";
    public String commPassword = "1234abcd";
    public String Comm_Admin = "Community Admin";

    public String docEmail = "doc@gmail.com";
    public String docPassword = "1234abcd";
    public String Doctor = "Doctor";

    public String patientEmail = "patient@gmail.com";
    public String patientPassword = "1234abcd";
    public String Patient = "Patient";
    /**
     * Creates new form RegisterJFrame
     */
    PatientHistory patienthistory;
    PersonHistory personhistory;
    DoctorHistory doctorhistory;
    CommunityAdminHistory communityadminhistory;
    HospitalAdminHistory hospitaladminhistory;
    HospitalHistory hospitalhistory;
    CommunityHistory communityhistory;
    VitalsHistory vitalsignhistory;
    
    public RegisterJFrame(PatientHistory patienthistory, PersonHistory personhistory, DoctorHistory doctorhistory, CommunityAdminHistory communityadminhistory, HospitalAdminHistory hospitaladminhistory, HospitalHistory hospitalhistory, CommunityHistory communityhistory) 
    {
        initComponents();
         this.patienthistory=patienthistory;
        this.personhistory=personhistory;
        this.doctorhistory = doctorhistory;
        this.communityadminhistory = communityadminhistory;
        this.hospitaladminhistory = hospitaladminhistory;
        this.communityhistory=communityhistory;
        this.hospitalhistory=hospitalhistory;
        
        System.out.println("hi"+personhistory.getPersonhistory());

    }
     public RegisterJFrame() {
        initComponents();
        patienthistory = new PatientHistory();
        personhistory = new PersonHistory();
        doctorhistory = new DoctorHistory();
        hospitalhistory = new HospitalHistory();
        hospitaladminhistory = new HospitalAdminHistory();
        communityadminhistory = new CommunityAdminHistory();
        communityhistory = new CommunityHistory();
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
        pageHeadingLabel = new javax.swing.JLabel();
        emailInput = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        loginButton = new javax.swing.JToggleButton();
        rolesDropDown = new javax.swing.JComboBox<>();
        passwordInput = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        pageHeadingLabel.setBackground(new java.awt.Color(255, 255, 255));
        pageHeadingLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pageHeadingLabel.setForeground(new java.awt.Color(0, 0, 204));
        pageHeadingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pageHeadingLabel.setText("HOSPITAL ADMINISTRATION SYSTEM");

        emailInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailInputActionPerformed(evt);
            }
        });

        emailLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        emailLabel.setText("EMAIL");

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        passwordLabel.setText("PASSWORD");

        loginButton.setBackground(new java.awt.Color(0, 0, 204));
        loginButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("LOGIN");
        loginButton.setOpaque(true);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        rolesDropDown.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rolesDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "System Admin", "Community Admin", "Hospital Admin", "Doctor", "Patient", " " }));
        rolesDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rolesDropDownActionPerformed(evt);
            }
        });

        passwordInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordInputActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Select your appropriate role before submitting!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 541, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(214, 214, 214))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(rolesDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(199, 199, 199))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(105, 105, 105)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(56, 56, 56)
                                    .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE))
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pageHeadingLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 454, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(61, 61, 61)
                    .addComponent(pageHeadingLabel)
                    .addGap(53, 53, 53)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(emailLabel))
                    .addGap(41, 41, 41)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(passwordInput, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                        .addComponent(passwordLabel))
                    .addGap(33, 33, 33)
                    .addComponent(jLabel1)
                    .addGap(18, 18, 18)
                    .addComponent(rolesDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(loginButton)
                    .addGap(62, 62, 62)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailInputActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        String email = emailInput.getText();
        String password = passwordInput.getText();
        String roles = rolesDropDown.getSelectedItem().toString();
        System.out.println("hi"+personhistory.getPersonhistory());
        if (Validations.ValidateEmail(email) == false) {
            JOptionPane.showMessageDialog(null, "Please enter a valid Email");
        }else if(Validations.ValidatePassword(password)){
            JOptionPane.showMessageDialog(null, "Please enter a valid Password");
        }
        else{
            if (email.equals(sysEmail) && password.equals(sysPassword) && roles.equals(System_Admin)) {
                System.out.println("Logged into system admin");
                JOptionPane.showMessageDialog(null, "Successfully Logged In");
                MainJFrame mainframe = new MainJFrame(patienthistory,personhistory,doctorhistory,communityadminhistory,hospitaladminhistory);
                mainframe.setVisible(true);
                this.setVisible(false);
            } else if (email.equals(hospEmail) && password.equals(hospPassword) && roles.equals(Hosp_Admin)) {
                System.out.println("Logged into Hospital admin");
                JOptionPane.showMessageDialog(null, "Successfully Logged In");
                HospitalAdminJFrame hospitaladminframe = new HospitalAdminJFrame(hospitalhistory,communityhistory, vitalsignhistory);
                hospitaladminframe.setVisible(true);
                this.setVisible(false);
            } else if (email.equals(commEmail) && password.equals(commPassword) && roles.equals(Comm_Admin)) {
                System.out.println("Logged into Community admin");
                JOptionPane.showMessageDialog(null, "Successfully Logged In");
                CommunityAdminJFrame communityadminframe = new CommunityAdminJFrame(communityhistory,hospitalhistory);
                communityadminframe.setVisible(true);
                this.setVisible(false);
            } else if (email.equals(docEmail) && password.equals(docPassword) && roles.equals(Doctor)) {
                System.out.println("Logged into Doctor");
                JOptionPane.showMessageDialog(null, "Successfully Logged In");
                DoctorJFrame doctorframe = new DoctorJFrame(hospitalhistory,communityhistory,vitalsignhistory);
                doctorframe.setVisible(true);
                this.setVisible(false);
            } else if (email.equals(patientEmail) && password.equals(patientPassword) && roles.equals(Patient)) {
                System.out.println("Logged into Patient");
                JOptionPane.showMessageDialog(null, "Successfully Logged In");
                PatientJFrame patientframe = new PatientJFrame(communityhistory,hospitalhistory);
                patientframe.setVisible(true);
                this.setVisible(false);

            } else {
                JOptionPane.showMessageDialog(null, "Invalid Credentials");
            }

        }

    }//GEN-LAST:event_loginButtonActionPerformed

    private void rolesDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rolesDropDownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rolesDropDownActionPerformed

    private void passwordInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordInputActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailInput;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton loginButton;
    private javax.swing.JLabel pageHeadingLabel;
    private javax.swing.JPasswordField passwordInput;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JComboBox<String> rolesDropDown;
    // End of variables declaration//GEN-END:variables
}
