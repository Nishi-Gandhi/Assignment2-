/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class PatientHistory {
     private static ArrayList<Patient> patienthistory;

    public PatientHistory() {
        this.patienthistory = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatienthistory() {
        return patienthistory;
    }

    public void setPatienthistory(ArrayList<Patient> patienthistory) {
        this.patienthistory = patienthistory;
        System.out.println(patienthistory);
    }

    public Patient addnewPatient() {
        Patient newPatient = new Patient();
        patienthistory.add(newPatient);
        return newPatient;
    }

    public void deletePatient(Patient ps) {
        patienthistory.remove(ps);
    }
}
