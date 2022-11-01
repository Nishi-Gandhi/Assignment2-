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
public class CommunityHistory {
     private static ArrayList<Community> communityhistory;

    public CommunityHistory() {
        this.communityhistory = new ArrayList<Community>();
    }

    public static ArrayList<Community> getCommunityhistory() {
        return communityhistory;
    }

    public static void setCommunityhistory(ArrayList<Community> communityhistory) {
        CommunityHistory.communityhistory = communityhistory;
    }

    public Community addnewCommunity() {
        Community newCommunity = new Community();
        communityhistory.add(newCommunity);
        return newCommunity;
    }

    public void deleteCommunity(Community ps) {
        communityhistory.remove(ps);
    }
}
