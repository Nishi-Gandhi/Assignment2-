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
public class VitalsHistory {
  private static ArrayList<Vitals> vitalshistory;
    
    public VitalsHistory() {
        this.vitalshistory = new ArrayList<Vitals>();
    }

    public static ArrayList<Vitals> getVitalshistory() {
        return vitalshistory;
    }

    public static void setVitalshistory(ArrayList<Vitals> vitalshistory) {
        VitalsHistory.vitalshistory = vitalshistory;
    }
        public Vitals addnewVitalshistory() {
        Vitals newPerson = new Vitals();
        vitalshistory.add(newPerson);
        return newPerson;
    }

    public void deleteVitals(Vitals ps) {
        vitalshistory.remove(ps);
    }
   
}
