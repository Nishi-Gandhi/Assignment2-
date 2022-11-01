/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package SystemAdmin;
import Validations.Validations;
import javax.swing.JOptionPane;
import models.CommunityAdminHistory;
import models.Doctor;
import models.DoctorHistory;
import models.HospitalAdminHistory;
import models.Patient;
import models.PatientHistory;
import models.Person;
import models.PersonHistory;

/**
 *
 * @author LENOVO
 */
public class AddPersonJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddPersonJPanel
     */
    PatientHistory patienthistory;
    PersonHistory personhistory;
    DoctorHistory doctorhistory;
    CommunityAdminHistory communityhistory;
    HospitalAdminHistory hospitalhistory;
    public AddPersonJPanel(PatientHistory patienthistory, PersonHistory personhistory, DoctorHistory doctorhistory, CommunityAdminHistory communityhistory, HospitalAdminHistory hospitalhistory) {     initComponents();
        this.patienthistory=patienthistory;
        this.personhistory=personhistory;
        this.doctorhistory = doctorhistory;
        this.communityhistory=communityhistory;
        this.hospitalhistory=hospitalhistory;
        
        System.out.println("hi"+personhistory.getPersonhistory());
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
        nameLabel = new javax.swing.JLabel();
        patientIdLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        cityLabel = new javax.swing.JLabel();
        cellPhoneLabel = new javax.swing.JLabel();
        emailIDLabel = new javax.swing.JLabel();
        nameInput = new javax.swing.JTextField();
        patientIDInput = new javax.swing.JTextField();
        ageInput = new javax.swing.JTextField();
        addressInput = new javax.swing.JTextField();
        cellphoneNoInput = new javax.swing.JTextField();
        emailIdInput = new javax.swing.JTextField();
        locationInput = new javax.swing.JComboBox<>();
        RegisterButton = new javax.swing.JButton();
        genderInput = new javax.swing.JComboBox<>();
        mainLabel = new javax.swing.JLabel();
        roleInput = new javax.swing.JComboBox<>();
        roleLabel = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        nameLabel.setBackground(new java.awt.Color(255, 255, 255));
        nameLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nameLabel.setText("Name:");

        patientIdLabel.setBackground(new java.awt.Color(255, 255, 255));
        patientIdLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        patientIdLabel.setText("ID:");

        ageLabel.setBackground(new java.awt.Color(255, 255, 255));
        ageLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ageLabel.setText("Age:");

        genderLabel.setBackground(new java.awt.Color(255, 255, 255));
        genderLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        genderLabel.setText("Gender:");

        addressLabel.setBackground(new java.awt.Color(255, 255, 255));
        addressLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addressLabel.setText("Address:");

        cityLabel.setBackground(new java.awt.Color(255, 255, 255));
        cityLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cityLabel.setText("City:");

        cellPhoneLabel.setBackground(new java.awt.Color(255, 255, 255));
        cellPhoneLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cellPhoneLabel.setText("CellPhone No:");

        emailIDLabel.setBackground(new java.awt.Color(255, 255, 255));
        emailIDLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        emailIDLabel.setText("Email ID:");

        nameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameInputActionPerformed(evt);
            }
        });

        patientIDInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientIDInputActionPerformed(evt);
            }
        });

        ageInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageInputActionPerformed(evt);
            }
        });

        addressInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressInputActionPerformed(evt);
            }
        });

        emailIdInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailIdInputActionPerformed(evt);
            }
        });

        locationInput.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        locationInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boston", "NewYork", "California" }));
        locationInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationInputActionPerformed(evt);
            }
        });

        RegisterButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RegisterButton.setText("Register");
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });

        genderInput.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        genderInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        genderInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderInputActionPerformed(evt);
            }
        });

        mainLabel.setBackground(new java.awt.Color(255, 255, 255));
        mainLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mainLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainLabel.setText("REGISTER PATIENT, PERSON OR DOCTOR");
        mainLabel.setToolTipText("");

        roleInput.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        roleInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Person", "Patient", "Doctor", "System Admin", "Hospital Admin", " " }));
        roleInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleInputActionPerformed(evt);
            }
        });

        roleLabel.setBackground(new java.awt.Color(255, 255, 255));
        roleLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        roleLabel.setText("Role");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(RegisterButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameLabel)
                                    .addComponent(patientIdLabel)
                                    .addComponent(ageLabel)
                                    .addComponent(genderLabel)
                                    .addComponent(addressLabel))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(addressInput, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(genderInput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(patientIDInput, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameInput, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ageInput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cityLabel)
                                            .addComponent(emailIDLabel)
                                            .addComponent(roleLabel))
                                        .addGap(45, 45, 45))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(cellPhoneLabel)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cellphoneNoInput)
                                        .addComponent(locationInput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(emailIdInput, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(roleInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(mainLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientIDInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientIdLabel))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genderLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressLabel))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(locationInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cellphoneNoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cellPhoneLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailIdInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailIDLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roleInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roleLabel))
                .addGap(29, 29, 29)
                .addComponent(RegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(177, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 626, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameInputActionPerformed

    private void patientIDInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientIDInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientIDInputActionPerformed

    private void ageInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageInputActionPerformed

    private void addressInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressInputActionPerformed

    private void emailIdInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailIdInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailIdInputActionPerformed

    private void locationInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationInputActionPerformed

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
        // TODO add your handling code here:
        String name = nameInput.getText();
        String patientID = patientIDInput.getText();
        int age = Integer.parseInt(ageInput.getText());
        String address = addressInput.getText();
        String genderVal = genderInput.getSelectedItem().toString();
        String locationVal = locationInput.getSelectedItem().toString();
        long cellphone = Long.parseLong(cellphoneNoInput.getText());
        String email = emailIdInput.getText();
        String role = roleInput.getSelectedItem().toString();

        if (Validations.ValidateName(name) == false) {
            JOptionPane.showMessageDialog(null, "Please enter a valid Name");
        } else if (Validations.ValidateID(patientIDInput.getText()) == false) {
            JOptionPane.showMessageDialog(null, "Enter a valid ID");
        } else if (Validations.ValidateAge(ageInput.getText()) == false) {
            JOptionPane.showMessageDialog(null, "Age must be in two or 3 digits form: For eg- 23, 44, 102");
        } else if (Validations.ValidateAddress(address) == false) {
            JOptionPane.showMessageDialog(null, "Enter a valid address");

        } else if (Validations.ValidateContactNumber(cellphoneNoInput.getText()) == false) {
            JOptionPane.showMessageDialog(null, "Contact Number must contact 10 digits");
        } else if (Validations.ValidateEmail(email) == false) {
            JOptionPane.showMessageDialog(null, "Enter a valid Email");
        } else {
            if (role.equals("Person")) {
                Person ps = personhistory.addnewPerson();
                ps.setName(name);
                ps.setPatientID(patientID);
                ps.setAge(age);
                ps.setAddress(address);
                ps.setGender(genderVal);
                ps.setCity(locationVal);
                ps.setCellphoneno(cellphone);
                ps.setEmailid(email);
                JOptionPane.showMessageDialog(null, "You have been successfully Registered!");
                nameInput.setText("");
                patientIDInput.setText("");
                ageInput.setText("");
                addressInput.setText("");
                cellphoneNoInput.setText("");
                emailIdInput.setText("");
            } else if (role.equals("Doctor")) {
                Doctor dr = doctorhistory.addnewDoctor();
                dr.setName(name);
                dr.setPatientID(patientID);
                dr.setAge(age);
                dr.setAddress(address);
                dr.setGender(genderVal);
                dr.setCity(locationVal);
                dr.setCellphoneno(cellphone);
                dr.setEmailid(email);
                JOptionPane.showMessageDialog(null, "You have been successfully Registered!");
                nameInput.setText("");
                patientIDInput.setText("");
                ageInput.setText("");
                addressInput.setText("");
                cellphoneNoInput.setText("");
                emailIdInput.setText("");
            } else if (role.equals("Patient")) {
                Patient pt = patienthistory.addnewPatient();
                pt.setName(name);
                pt.setPatientID(patientID);
                pt.setAge(age);
                pt.setAddress(address);
                pt.setGender(genderVal);
                pt.setCity(locationVal);
                pt.setCellphoneno(cellphone);
                pt.setEmailid(email);
                JOptionPane.showMessageDialog(null, "You have been successfully Registered!");
                nameInput.setText("");
                patientIDInput.setText("");
                ageInput.setText("");
                addressInput.setText("");
                cellphoneNoInput.setText("");
                emailIdInput.setText("");
            }
        }
    }//GEN-LAST:event_RegisterButtonActionPerformed

    private void genderInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderInputActionPerformed

    private void roleInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleInputActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RegisterButton;
    private javax.swing.JTextField addressInput;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField ageInput;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JLabel cellPhoneLabel;
    private javax.swing.JTextField cellphoneNoInput;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JLabel emailIDLabel;
    private javax.swing.JTextField emailIdInput;
    private javax.swing.JComboBox<String> genderInput;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> locationInput;
    private javax.swing.JLabel mainLabel;
    private javax.swing.JTextField nameInput;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField patientIDInput;
    private javax.swing.JLabel patientIdLabel;
    private javax.swing.JComboBox<String> roleInput;
    private javax.swing.JLabel roleLabel;
    // End of variables declaration//GEN-END:variables
}
