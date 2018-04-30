/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus_station;

/**
 *
 * @author toshiba
 */
public class Admin implements iStaff {
        private int aID;
        private String password;

    public int getaID() {
        return aID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setaID(int aID) {
        this.aID = aID;
    }

    
        
}
