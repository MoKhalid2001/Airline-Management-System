/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airline.management.system;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author mokhalid
 */
public class PassengerClass extends PassengersAbstract{

    public PassengerClass(String PassengerName, String FlightCode, String PhoneNumber, String PassportNumber) {
        super(PassengerName, FlightCode, PhoneNumber, PassportNumber);
    }

    @Override
    public void PickFlight() {
        try {
            String sqlQuery = "insert into Passengers(PName,PPassport,FCode,PPhoneNum) values(?,?,?,?)";
            Common.Con = DriverManager.getConnection(Common.DBURL,Common.username,"");
            PreparedStatement add = Common.Con.prepareStatement(sqlQuery);
            add.setString(1, this.getPassengerName());
             add.setInt(2, Integer.valueOf(this.getPassportNumber()));
            add.setString(3, this.getFlightCode());
             add.setInt(4, Integer.valueOf(this.getPhoneNumber()));           
              int row = add.executeUpdate();
               Common.Con.close();
           } catch (Exception e) {
           }
    }

    @Override
    public void EditPassenger(String Passengerselected) {
         try {
            String sqlQuery = "update Passengers set PName=?,PPassport=?,PPhoneNum=?,FCode=? where PID=" + Passengerselected;
            Common.Con = DriverManager.getConnection(Common.DBURL,Common.username,"");
            PreparedStatement add = Common.Con.prepareStatement(sqlQuery);
             add.setString(1, this.getPassengerName());
               add.setInt(2, Integer.valueOf(this.getPassportNumber()));
              add.setInt(3, Integer.valueOf(this.getPhoneNumber()));
          add.setString(4, this.getFlightCode());    
            int row = add.executeUpdate(); 
                 } catch (Exception e) {
                 }     
       }
    
    @Override
    public void DeletePassenger(String Passengerselected) {
      try {
            String sqlQuery = "delete from Passengers where PID=" + Passengerselected;
            Common.Con = DriverManager.getConnection(Common.DBURL,Common.username,"");
            Statement rem = Common.Con.createStatement();
            rem.executeUpdate(sqlQuery);
                 } catch (Exception e) {
                 }
    }
    
}
