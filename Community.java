/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author LENOVO
 */
public class Community {
    
     private String adminId;
    private String communityAdminName;
    private String communityID;

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getCommunityAdminName() {
        return communityAdminName;
    }

    public void setCommunityAdminName(String communityAdminName) {
        this.communityAdminName = communityAdminName;
    }

    public String getCommunityID() {
        return communityID;
    }

    public void setCommunityID(String communityID) {
        this.communityID = communityID;
    }

    @Override
    public String toString() {
        return adminId;
    }

}


