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
public class Ticket {
    private int ticketID;
    private int cID;
    private int tripID;
    private int detailsID;
    private int seatNO;
    private double tPrice;

    public int getTicketID() {
        return ticketID;
    }

    public void setTicketID(int ticketID ) {
        this.ticketID = ticketID;
    }

    

    public int getcID() {
        return cID;
    }

    public void setcID(int cID) {
        this.cID = cID;
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

    public int getSeatNO() {
        return seatNO;
    }

    public void setSeatNO(int seatNO) {
        this.seatNO = seatNO;
    }

    public double gettPrice() {
        return tPrice;
    }

    public void settPrice(double tPrice) {
        this.tPrice = tPrice;
    }
    
    
    
}
