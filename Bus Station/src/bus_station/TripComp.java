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
public class TripComp {
    private int tripID;
    private double pprice;
    String travelDate , returnDate , travelTime , returnTime , src , dest , stops;

    public TripComp() {
    }

    public int getTripID() {
        return tripID;
    }

    public void setTripID(int tripID) {
        this.tripID = tripID;
    }

    public double getPprice() {
        return pprice;
    }

    public void setPprice(double pprice) {
        this.pprice = pprice;
    }

    public String getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(String travelDate) {
        this.travelDate = travelDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(String travelTime) {
        this.travelTime = travelTime;
    }

    public String getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(String returnTime) {
        this.returnTime = returnTime;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public TripComp(int tripID, double pprice , String travelDate , String returnDate , String travelTime , String returnTime, String src , String dest , String stops ) {
        this.tripID = tripID;
        this.pprice = pprice;
        this.travelDate = travelDate;
        this.returnDate = returnDate;
        this.travelTime = travelTime;
        this.returnTime = returnTime;
        this.src = src;
        this.dest = dest;
        this.stops = stops;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public String getStops() {
        return stops;
    }

    public void setStops(String stops) {
        this.stops = stops;
    }
    
    
}
