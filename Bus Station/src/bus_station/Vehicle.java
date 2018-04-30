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
public class  Vehicle {

    int vclID;
  
    int capacity;
    private int ratio;
    private String vehicleType; 

    public Vehicle() {
    }

    public Vehicle(int vclID , String vehicleType , int capacity, int ratio) {
        this.vclID = vclID;
        this.capacity = capacity;
        this.ratio = ratio;
        this.vehicleType = vehicleType;
    }

    
    
    public int getVclID() {
        return vclID;
    }

    public void setVclID(int vclID) {
        this.vclID = vclID;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getRatio() {
        return ratio;
    }

    public void setRatio(int ratio) {
        this.ratio = ratio;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
    
    
    
    
}
