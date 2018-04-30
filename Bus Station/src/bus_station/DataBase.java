/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus_station;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author Hagar
 */
public class DataBase implements iDataBase { 
    
    // JDBC database URL
   static final String DB_URL = "jdbc:mysql://localhost:3306/bus_station";

   //  Database credentials
   static final String USER = "root";
   static final String PASS = "";
   
  static Connection conn = null;
  static Statement stmt = null;
    
    public void sum(int x){
    
    System.out.println(x);
    }
    
    public String commaSeparate(ArrayList<Integer> v){
     String word = "("+v.get(0);
     for (int counter = 1; counter < v.size(); counter++) { 		      
         word= word+","+v.get(counter);	
      }   		
   word = word+")";
     
return word;
    }
    
    @Override
    
    public void deleteTicket(int ticket_id){
    
       
   try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      System.out.println("Creating statement...");
      stmt = conn.createStatement();
      String sql = "DELETE FROM `ticket` WHERE  `ticket_id` = " + ticket_id;
                   
      stmt.executeUpdate(sql);
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
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   

    
    
    }
    
    
    public List<Double> displayPrice(){
       
        List<Double> price = new ArrayList<>();
    
       int i = 0;
       //test.setId(1);
   try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      System.out.println("Creating statement...");
      stmt = conn.createStatement();
      
      //
      String sql = "SELECT `pprice` FROM `trip` WHERE `trip_id` >0 ";
      ResultSet rs = stmt.executeQuery(sql);
      
  
      while(rs.next()){
        //assign results in arraylist and return it 
        price.add(rs.getDouble("pprice"));
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
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   
   return price;
   }
    
    
    static public ArrayList<Integer> getDtID(String Type){
        ArrayList<Integer> dt_id = new ArrayList<>();
    
       int i = 0;
       //test.setId(1);
   try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      System.out.println("Creating statement...");
      stmt = conn.createStatement();
      
      //
      String sql = "SELECT `details_id` FROM `trip` WHERE `vcl_type` ='" + Type + "'" ;
      ResultSet rs = stmt.executeQuery(sql);
      
  
      while(rs.next()){
        //assign results in arraylist and return it 
        dt_id.add(rs.getInt("details_id"));
       
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
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   
   return dt_id;
   }
    
    
    public ArrayList<Integer> displayTrip_id(){
       ArrayList<Integer> trip_id = new ArrayList<Integer>();
    
       int i = 0;
       //test.setId(1);
   try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      System.out.println("Creating statement...");
      stmt = conn.createStatement();
      
      //
      String sql = "SELECT `trip_id` FROM `trip` WHERE `trip_id`>0 ";
      ResultSet rs = stmt.executeQuery(sql);
      
  
      while(rs.next()){
        //assign results in arraylist and return it 
        trip_id.add(rs.getInt("trip_id"));
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
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   
   return trip_id;
   }
    
    
    //ArrayList<TripComp>
    //public ArrayList<TripComp> displayTrip()
/*    
    public ArrayList<Vehicle> displayVehicle(){
       ArrayList<Vehicle> vehicle = new ArrayList<Vehicle>();
    
       int i = 0;
       //test.setId(1);
   try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      System.out.println("Creating statement...");
      stmt = conn.createStatement();
      
      //
      String sql = "SELECT * FROM `vehicle` ";
      ResultSet rs = stmt.executeQuery(sql);
      
  
      while(rs.next()){
        //assign results in arraylist and return it 
          vehicle.add(new Vehicle(rs.getInt("vcl_id") ,rs.getString("vcl_type") , rs.getInt("capacity"),
                  rs.getInt("ratio"))); 
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
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   
   return vehicle;

   
   }
*/
    /*   
public void addTrip(int vclID , String travelDate , String returnDate , String travelTime , String returnTime , String src ,
        String dest, String stops,  double pprice){
       
       try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      System.out.println("Inserting records into the table...");
      stmt = conn.createStatement();
      
      String sql = "INSERT INTO `details` " +
                   "VALUES (NULL," + travelDate + "," + returnDate + "," +travelTime + "," + returnTime + "," +
              src + "," + dest + "," + stops + "," +  pprice + ")";
  
      stmt.executeUpdate(sql);
      ResultSet rs = stmt.getGeneratedKeys();
      int generatedKey = 0;
      if(rs.next()){
      generatedKey = rs.getInt(1); //got DETAILS_id
      }
      
      sql = "SELECT `capacity` FROM `vehicle` WHERE `vcl_id` = " + vclID ;
      rs= stmt.executeQuery(sql);
      
      int cap =0;
      while(rs.next())
      {
      cap = rs.getInt("capacity"); // got capacity which is equal to av-seats
      }
      
      sql = "INSERT INTO `trip` "
              + "VALUES (NULL," + generatedKey + "," + cap + "," + pprice + ")";
       stmt.executeUpdate(sql);
       
      System.out.println("Inserted records into the table...");

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
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   }
   
*/
    public void addVehicle(String vclType , int capacity , int ratio){
       
       try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      System.out.println("Inserting records into the table...");
      stmt = conn.createStatement();
      
      String sql = "INSERT INTO `vehicle` " +
                   "VALUES (NULL,'" + vclType + "','" + capacity + "','" + ratio + "')";
      stmt.executeUpdate(sql);
      System.out.println("Inserted records into the table...");

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
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   }
   
    
    
   public ArrayList<Trip> searchTrip(String vehicleType , String src , String dest , String stops){
       ArrayList<Trip> trip = new ArrayList<Trip>();
    
       //make stops lowercase
  
       int i = 0;
       //test.setId(1);
   try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      System.out.println("Creating statement...");
      stmt = conn.createStatement();
      
      //get detials id from trip where vehiclle Type = chosen one
      String sql = "SELECT `details_id` FROM `trip` "
              + "WHERE `vcl_type` = " + vehicleType + ")";
      
      //stmt.executeUpdate(sql);
      ResultSet rs = stmt.executeQuery(sql);
      
      //put results in arraylist
      int count=0;
      while(rs.next()){count++;}
      rs.beforeFirst();
      
      ArrayList<Integer> dt_id = new ArrayList<Integer>(count);
     
      //int[] dt_id = new int[count];
      int j=0;
      while(rs.next()){dt_id.add(rs.getInt("details_id"));}

      String req = commaSeparate(dt_id);
      
      System.out.println(req);
      
      sql = "SELECT * FROM `details` "
              + "WHERE `details_id` IN " + req + " AND `stops` =" + stops + ")";
      
      //stmt.executeUpdate(sql);
      rs = stmt.executeQuery(sql);
      
      while(rs.next()){
        //assign results in arraylist and return it 
          trip.add(new Trip(rs.getString("travel_date") , rs.getString("return_date"),
                  rs.getString("travel_time"), rs.getString("return_time") , rs.getDouble("pprice"))); 
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
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   
   return trip;

   
   }
   
   public ArrayList<Co> ttt(){
       
ArrayList<Co> t = new ArrayList<Co>();
    
ArrayList<Integer> us = new ArrayList<Integer>();
us.add(1);
us.add(2);
us.add(8);
us.add(7);

    
       Co[] test = new Co[20];
       int i = 0;
       //test.setId(1);
   try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      System.out.println("Creating statement...");
      stmt = conn.createStatement();
      String sql = "SELECT `phone` FROM `customer` WHERE `c_id` > 1 ";
      
      //stmt.executeUpdate(sql);
      ResultSet rs = stmt.executeQuery(sql);
      while(rs.next()){
        t.add(new Co(1 , rs.getString("phone")));
          
         // test[i] = new Co();
          //test[i++].setPhone(rs.getString("phone"));
          System.out.println("phone : "+rs.getString("phone"));
       
      
      }
      rs.close();
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
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   
   return t;
   
   }
   
   public void changePassd(int id , String pass){
   
   try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      System.out.println("Creating statement...");
      stmt = conn.createStatement();
      String sql = "UPDATE `driver` " +
                   "SET `password` =" + pass+"WHERE id = " + id;
      stmt.executeUpdate(sql);
      
      // Now you can extract all the records
      // to see the updated records
      
      //sql = "SELECT id, first, last, age FROM Registration";
      //ResultSet rs = stmt.executeQuery(sql);

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
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   
   }
  public void deleteUser(int id){
  
  try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      System.out.println("Creating statement...");
      stmt = conn.createStatement();
      String sql = "DELETE FROM `customer` " +
                   "WHERE `c_id` = " + id;
      stmt.executeUpdate(sql);

      // Now you can extract all the records
      // to see the remaining records
      
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
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
  
  } 
   public void addUser(String phone){
       
       try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      System.out.println("Inserting records into the table...");
      stmt = conn.createStatement();
      
      String sql = "INSERT INTO `customer` " +
                   "VALUES (NULL,'" + phone + "')";
      stmt.executeUpdate(sql);
      System.out.println("Inserted records into the table...");

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
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   }
   
   public int addDriver(String pass){
      int id=-1; 
       
       try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      System.out.println("Inserting records into the table...");
      stmt = conn.createStatement();
      
      String sql = "INSERT INTO `driver` " +
                   "VALUES (NULL,'" + pass + "')";
      stmt.executeUpdate(sql);
      System.out.println("Inserted records into the table...");

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
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
       return id;
   }
   
    public DataBase() {
    }
   
  
   public static void main(String[] args) {
      
    DataBase db = new DataBase();
    //db.fetchData();
    //db.addUser("888882222");
    //db.deleteUser(4);
    //db.addUser("01224505222");
    //db.addUser("012520452");
    //int id = db.addDriver("fjkfkj");
    //System.out.println(id);
    Co[] ms = new Co[20];
    ArrayList <Co> gs = new ArrayList<>();
    
    ArrayList <Vehicle> hs = new ArrayList<>();
    ArrayList <Integer> qs = new ArrayList<>();
    ArrayList <TripComp> ps = new ArrayList<>();
    ArrayList <Integer> ws = new ArrayList<>();
   
   //sum(5); 
    //deleteTicket(1);
    
    //String gg= "bus";
    
      //ws = getDtID(gg);
      
    //gs = db.ttt();
    
    /*
    qs = db.displayTrip_id();
    for(int q : qs){ System.out.println("display Trip Id : " + q);}
    
    */
    /*
    hs = db.displayVehicle();
    for(Vehicle h : hs){
        
    System.out.println("vehicle " + h.getVclID() + " " + h.getCapacity() + " "+ h.getVehicleType() + "" + h.getRatio());
    }
    */
    
//   ps =  db.displayTrip();
    for (TripComp p : ps){
    System.out.println("test of display trip : " + p.getDest() + " " +  p.getPprice()+ " " + p.getTripID());
    }
    
   /*
    for(Co g : gs){
        //g = new Co();
        //if(g.getPhone() == null)
        //break;
        System.out.println("info found : "+ g.getPhone());
    }
   */
}

    @Override
    public void addTrip( int vclID, String travelDate, String returnDate, String travelTime, String returnTime, String src, String dest, String stops,  double pprice){
       
       try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      System.out.println("Inserting records into the table...");
      stmt = conn.createStatement();
      
      String sql = "INSERT INTO `details` " +
                   "VALUES (NULL," + travelDate + "," + returnDate + "," +travelTime + "," + returnTime + "," +
              src + "," + dest + "," + stops + "," +  pprice + ")";
  
      stmt.executeUpdate(sql);
      ResultSet rs = stmt.getGeneratedKeys();
      int generatedKey = 0;
      if(rs.next()){
      generatedKey = rs.getInt(1); //got DETAILS_id
      }
      
      sql = "SELECT `capacity` FROM `vehicle` WHERE `vcl_id` = " + vclID ;
      rs= stmt.executeQuery(sql);
      
      int cap =0;
      while(rs.next())
      {
      cap = rs.getInt("capacity"); // got capacity which is equal to av-seats
      }
      
      sql = "INSERT INTO `trip` "
              + "VALUES (NULL," + generatedKey + "," + cap + "," + pprice + ")";
       stmt.executeUpdate(sql);
       
      System.out.println("Inserted records into the table...");

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
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   
    }

    @Override
    public ArrayList<Trip> displayTrip() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void save() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Ticket> displayTicket(int tripID, int detailsID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Details> displayDetails(int detailsID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
@Override
public ArrayList<Vehicle>displayVehicle(){

    ArrayList<Vehicle> vehicle = new ArrayList<Vehicle>();
    
       int i = 0;
       //test.setId(1);
   try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      System.out.println("Creating statement...");
      stmt = conn.createStatement();
      
      //
      String sql = "SELECT * FROM `vehicle` ";
      ResultSet rs = stmt.executeQuery(sql);
      
  
      while(rs.next()){
        //assign results in arraylist and return it 
          vehicle.add(new Vehicle(rs.getInt("vcl_id") ,rs.getString("vcl_type") , rs.getInt("capacity"),
                  rs.getInt("ratio"))); 
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
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   
   return vehicle;

   
}

}
 