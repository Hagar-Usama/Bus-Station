/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus_station;

import java.util.ArrayList;



/**
 *
 * @author toshiba
 */
public interface iDataBase {
   
  
    public ArrayList<Trip>searchTrip(String vehicleType,String src,String dest , String Stops);
    // add new vehicle to dataBase
    public void addVehicle(String vclType,int ratio,int capacity);
    // add a new row in trip table /* Ticket price in details table
   public void addTrip( int vclID, String travelDate, String returnDate, String travelTime, String returnTime, String src, String dest, String stops,  double pprice);
    
    // display all component in vcl table/* id , type, capacity,ratio*/
    public ArrayList<Vehicle>displayVehicle();
    // display all compnent in trip table /* trip id,travel date ,return date, travel time, return time,src,dest
   public ArrayList<Trip>displayTrip ();
  // save all changes done 
  public void save();
  // display ticket row 
  public ArrayList<Ticket>displayTicket(int tripID, int detailsID);
  // display details 
  public ArrayList<Details>displayDetails( int detailsID);
  
    public void deleteTicket(int ticket_id);
}