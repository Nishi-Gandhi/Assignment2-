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
public class DoctorHistory {
      private static ArrayList<Doctor> doctorhistory;

    public DoctorHistory() {
        this.doctorhistory = new ArrayList<Doctor>();
    }

    public ArrayList<Doctor> getDoctorhistory() {
        return doctorhistory;
    }

    public void setDoctorhistory(ArrayList<Doctor> doctorhistory) {
        this.doctorhistory = doctorhistory;
    }

    public Doctor addnewDoctor() {
        Doctor newDoctor = new Doctor();
        doctorhistory.add(newDoctor);
        return newDoctor;
    }

    public void deleteDoctor(Doctor ps) {
        doctorhistory.remove(ps);
    }
}
