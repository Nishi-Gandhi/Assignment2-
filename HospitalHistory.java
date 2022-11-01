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
public class HospitalHistory {
    private static ArrayList<Hospital> hospitalhistory;

    public HospitalHistory() {
        this.hospitalhistory = new ArrayList<Hospital>();
    }

    public ArrayList<Hospital> getHospitalhistory() {
        return hospitalhistory;
    }

    public void setHospitalhistory(ArrayList<Hospital> hospitalhistory) {
        this.hospitalhistory = hospitalhistory;
        System.out.println(hospitalhistory);
    }

    public Hospital addnewHospital() {
        Hospital newHospital = new Hospital();
        hospitalhistory.add(newHospital);
        return newHospital;
    }

    public void deleteHospital(Hospital ps) {
        hospitalhistory.remove(ps);
    }
}
