/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author LENOVO
 */
public class Vitals {
      private String ID;
    private String name;
    private String BloodPressure;
    private String HeartRate;
    private String RespiratorySign;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBloodPressure() {
        return BloodPressure;
    }

    public void setBloodPressure(String BloodPressure) {
        this.BloodPressure = BloodPressure;
    }

    public String getHeartRate() {
        return HeartRate;
    }

    public void setHeartRate(String HeartRate) {
        this.HeartRate = HeartRate;
    }

    public String getRespiratorySign() {
        return RespiratorySign;
    }

    public void setRespiratorySign(String RespiratorySign) {
        this.RespiratorySign = RespiratorySign;
    }
     @Override
    public String toString() {
        return ID;
    }
}
