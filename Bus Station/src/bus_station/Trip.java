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
public class Trip {
    private int tripID;
    private int detailsID;
    private String vclType;
    private int availableSeats;
    private double ticketPrice;
    private String travelDate;
    private String  returnDate;
    private String travelTime;
    private  String returnTime;
    private double pprice;

    public Trip(String travelDate, String returnDate, String travelTime, String returnTime, double pprice) {
        this.travelDate = travelDate;
        this.returnDate = returnDate;
        this.travelTime = travelTime;
        this.returnTime = returnTime;
        this.pprice = pprice;
    }

    public Trip() {
    }
    
   
    public int getTripID() {
        return tripID;
    }

    public void setTripID(int tripID) {
        this.tripID = tripID;
    }

    public int getDetailsID() {
        return detailsID;
    }

    public void setDetailsID(int detailsID) {
        this.detailsID = detailsID;
    }

    public String getVclType() {
        return vclType;
    }

    public void setVclType(String vclType) {
        this.vclType = vclType;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
    
    
}
