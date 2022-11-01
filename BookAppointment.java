/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Patient;
import Validations.Validations;
import javax.swing.JOptionPane;
import models.Patient;
import models.PatientHistory;

/**
 *
 * @author LENOVO
 */
public class BookAppointment extends javax.swing.JPanel {

    /**
     * Creates new form BookAppointment
     */ 
    PatientHistory patienthistory;
    public BookAppointment(PatientHistory patienthistory) {
        initComponents();
         this.patienthistory=patienthistory;
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
        hospitalNameLabel = new javax.swing.JLabel();
        hospitalIDInput = new javax.swing.JTextField();
        hospitalIDLabel = new javax.swing.JLabel();
        RegisterButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        hospitalNameInput = new javax.swing.JTextField();

        hospitalNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        hospitalNameLabel.setText("Hospital Name");

        hospitalIDInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalIDInputActionPerformed(evt);
            }
        });

        hospitalIDLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        hospitalIDLabel.setText("Enter DoctorID");

        RegisterButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        RegisterButton.setText("REGISTER");
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Book Appointment");

        hospitalNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalNameInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(RegisterButton))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(hospitalIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(hospitalIDInput, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(hospitalNameLabel)
                                        .addGap(40, 40, 40)
                                        .addComponent(hospitalNameInput)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hospitalIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hospitalIDInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hospitalNameLabel)
                    .addComponent(hospitalNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addComponent(RegisterButton)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void hospitalIDInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalIDInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hospitalIDInputActionPerformed

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
        // TODO add your handling code here:
        String hospitalID = hospitalIDInput.getText();
        String hospitalName = hospitalNameInput.getText();
        if (hospitalID.isEmpty() || hospitalName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Enter Data");
        }else if (Validations.ValidateName(hospitalName) == false) {
            JOptionPane.showMessageDialog(null, "Enter valid name");
        } else if (Validations.ValidateID(hospitalID) == false) {
            JOptionPane.showMessageDialog(null, "Please enter a valid HospitalID");
        }  else {
            Patient cm = patienthistory.addnewPatient();
            cm.setPatientID(hospitalID);
            cm.setName(hospitalName);

            JOptionPane.showMessageDialog(null, "Hospital Registered");
            hospitalIDInput.setText("");
            hospitalNameInput.setText("");
        }
    }//GEN-LAST:event_RegisterButtonActionPerformed

    private void hospitalNameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalNameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hospitalNameInputActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RegisterButton;
    private javax.swing.JTextField hospitalIDInput;
    private javax.swing.JLabel hospitalIDLabel;
    private javax.swing.JTextField hospitalNameInput;
    private javax.swing.JLabel hospitalNameLabel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}