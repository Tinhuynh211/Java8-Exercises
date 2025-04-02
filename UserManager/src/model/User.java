/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class User {
    private String userName;
    private int userOld;
    private String userCity;

    public User(String userName, int userOld, String userCity) {
        this.userName = userName;
        this.userOld = userOld;
        this.userCity = userCity;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserOld() {
        return userOld;
    }

    public void setUserOld(int userOld) {
        this.userOld = userOld;
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }

    @Override
    public String toString() {
        return "User " + "Name:" + userName + "\n" + "Old:" + userOld + "\n" +"City:" + userCity ;
    }
    
    
}
