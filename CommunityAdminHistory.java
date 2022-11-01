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
public class CommunityAdminHistory {
      private static ArrayList<CommunityAdmin> communityAdminhistory;

    public CommunityAdminHistory() {
        this.communityAdminhistory = new ArrayList<CommunityAdmin>();
    }

    public ArrayList<CommunityAdmin> getCommunityAdminhistory() {
        return communityAdminhistory;
    }

    public void setCommunityAdminhistory(ArrayList<CommunityAdmin> doctorhistory) {
        this.communityAdminhistory = communityAdminhistory;
    }

    public CommunityAdmin addnewCommunityAdmin() {
        CommunityAdmin newCommunityAdmin = new CommunityAdmin();
        communityAdminhistory.add(newCommunityAdmin);
        return newCommunityAdmin;
    }

    public void deleteCommunityAdmin(CommunityAdmin ps) {
        communityAdminhistory.remove(ps);
    }
}
