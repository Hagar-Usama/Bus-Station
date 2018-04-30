/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//package bus_station;

import java.sql.*;

/**
 *
 * @author PC
 */
public class database { 
    // JDBC database URL
   static final String DB_URL = "jdbc:mysql://localhost:3306/bus_station";

   //  Database credentials
   static final String USER = "root";
   static final String PASS = "";
   
   
   Connection conn = null;
   Statement stmt = null;
   
   public void fetchData(){
       try{
           String query = "SELECT * FROM `CUSTOMER`";
       ResultSet rs = stmt.executeQuery(query);
       
       while(rs.next()){
       
       System.out.println("customer_id : "+rs.getInt("c_id"));
       }
           
       }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            stmt.close();
         
      }catch(SQLException se2){
      }// nothing we can do
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }
       
       
       }
   
   }
   
   public static void main(String[] args) {
       
       
   Connection conn = null;
   Statement stmt = null;

    
   /*
   try{
      //STEP 2: Register JDBC driver
      //Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to database...");
      conn = DriverManager.getConnection(DB_URL,USER,PASS);

      //STEP 4: Execute a query
      System.out.println("Creating statement...");
      stmt = conn.createStatement();
      String sql = "SELECT `travel_time`,`travel_date` FROM `reservation` WHERE `vcl_type` = 'bus' ";
      ResultSet rs = stmt.executeQuery(sql);

      //STEP 5: Extract data from result set
      while(rs.next()){
         //Retrieve by column name
        // int id  = rs.getInt("c_id");
         //int trip_id = rs.getInt("trip_id");
         
         //Time time = rs.getObject("travel_time", Time.class);
         Date date = rs.getObject("travel_date", Date.class);
         
         //System.out.println("travel_time is "+time);
         System.out.println("travel_time is "+date);
         //int vid  = rs.getInt("vcl_id");
         //String phone = rs.getString("phone");
         
        
         //String name = rs.getString("vcl_type");
         //int capacity = rs.getInt("capacity");
        
         
        

         //Display values
         //System.out.print("Trip_ID: " + trip_id);
         //System.out.print(" phone: " + phone);
         //System.out.print(", name: " + name);
         //System.out.print(", capacity: " + capacity + "\n");
      }
      //STEP 6: Clean-up environment
      rs.close();
      stmt.close();
      conn.close();
   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            stmt.close();
         
      }catch(SQLException se2){
      }// nothing we can do
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
 //  System.out.println("Goodbye!");
   }
*/
}


}
