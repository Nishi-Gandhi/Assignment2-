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
public class HospitalAdminHistory {
     private static ArrayList<HospitalAdmin> hospitaladminhistory;

    public HospitalAdminHistory() {
        this.hospitaladminhistory = new ArrayList<HospitalAdmin>();
    }

    public ArrayList<HospitalAdmin> getHospitaladminhistory() {
        return hospitaladminhistory;
    }

    public void setHospitaladminhistory(ArrayList<HospitalAdmin> hospitaladminhistory) {
        this.hospitaladminhistory = hospitaladminhistory;
    }


    public HospitalAdmin newHospitaladminhistory() {
        HospitalAdmin newHospitalAdmin = new HospitalAdmin();
        hospitaladminhistory.add(newHospitalAdmin);
        return newHospitalAdmin;
    }

    public void deleteHospitalAdmin(HospitalAdmin ps) {
        hospitaladminhistory.remove(ps);
    }
}
