/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airline.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author mokhalid
 */
public class FlightsClass extends FlightAbstract{
  
    public FlightsClass(String FlightCode, String Source, String Destination, String TakeOfDate, int Seats) {
        super(FlightCode, Source, Destination, TakeOfDate, Seats);
    }

    @Override
    public void InsertFlight() {
         try {
            String sqlQuery = "insert into Flights(FCode,FSource,FDestination,FDate,FSeats) values(?,?,?,?,?)";
            Common.Con = DriverManager.getConnection(Common.DBURL,Common.username,"");
            PreparedStatement add = Common.Con.prepareStatement(sqlQuery);
            add.setString(1, this.getFlightCode());
            add.setString(2, this.getSource());
            add.setString(3, this.getDestination());
             add.setString(4, this.getTakeOfDate());
              add.setInt(5, Integer.valueOf(this.getSeats()));
              int row = add.executeUpdate();   
              Common.Con.close();   
           } catch (Exception e) {
           }
    }

    @Override
    public void EditFlight() {
        try {
            String sqlQuery = "update Flights set FSource=?,FDestination=?,FDate=?,FSeats=? where FCode=?";
            Common.Con = DriverManager.getConnection(Common.DBURL,Common.username,"");
            PreparedStatement add = Common.Con.prepareStatement(sqlQuery);
             add.setString(1, this.getSource());
             add.setString(2, this.getDestination());
               add.setString(3, this.getTakeOfDate());
            add.setInt(4, Integer.valueOf(this.getSeats()));
                add.setString(5, this.getFlightCode());
            int row = add.executeUpdate();
                 } catch (Exception e) {
                 }
    }

    @Override
    public void DeleteFlight(String Flightselected) {
         try {
            String sqlQuery = "delete from Flights where FCode=" + Flightselected;
            Common.Con = DriverManager.getConnection(Common.DBURL,Common.username,"");
            Statement rem = Common.Con.createStatement();
            rem.executeUpdate(sqlQuery);
                 } catch (Exception e) {    
                 }
           
    }
    
    public static boolean SeatsCheck(String FlightCode){
           String seats = "";
          try {
            Common.Con = DriverManager.getConnection(Common.DBURL,Common.username,"");
            Common.st = Common.Con.createStatement();
            Common.Rs = Common.st.executeQuery("select Fseats as seatnum from Flights where FCode=" + FlightCode);
             while(Common.Rs.next()){
            seats = Common.Rs.getString("seatnum"); 
             }
        } catch (Exception e) {
        }
           if (seats.equals("0")) return false;
            return true;
     }
    
     public static void UpdateSeats(String UpdateType,String FlightCode){
            String sqlQuery =  "update Flights set FSeats = FSeats + 1 where FCode=" + FlightCode;
            if (UpdateType.equals("pick"))
                sqlQuery = "update Flights set FSeats = FSeats -1 where FCode=" + FlightCode;
            else if (UpdateType.equals("delete"))
                sqlQuery = "update Flights set FSeats = FSeats +1 where FCode=" + FlightCode;

          try {       
            Common.Con = DriverManager.getConnection(Common.DBURL,Common.username,"");
            PreparedStatement add = Common.Con.prepareStatement(sqlQuery);
             int row = add.executeUpdate();
                 } catch (Exception e) {  
                 }
     }
     
    
}
