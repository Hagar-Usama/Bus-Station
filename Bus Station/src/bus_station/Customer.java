/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus_station;

/**
 *
 * @author PC
 */
public class Customer {
    iDataBase database;
    private int cID;
    private String phone;
   

  
    

    public int getcID() {
        return cID;
    }

    public void setcID(int cID) {
        this.cID = cID;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void reserveTrip()
    { 
//   database.searchTrip(, phone, phone, phone) 
    }
}
