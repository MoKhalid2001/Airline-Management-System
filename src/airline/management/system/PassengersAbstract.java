/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airline.management.system;

/**
 *
 * @author mokhalid
 */
public abstract class  PassengersAbstract {
    private String PassengerName;
    private String FlightCode;
    private String PhoneNumber;
    private String PassportNumber;

    public PassengersAbstract(String PassengerName, String FlightCode, String PhoneNumber, String PassportNumber) {
        this.PassengerName = PassengerName;
        this.FlightCode = FlightCode;
        this.PhoneNumber = PhoneNumber;
        this.PassportNumber = PassportNumber;
    }

    public String getPassengerName() {
        return PassengerName;
    }

    public void setPassengerName(String PassengerName) {
        this.PassengerName = PassengerName;
    }

    public String getFlightCode() {
        return FlightCode;
    }

    public void setFlightCode(String FlightCode) {
        this.FlightCode = FlightCode;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getPassportNumber() {
        return PassportNumber;
    }

    public void setPassportNumber(String PassportNumber) {
        this.PassportNumber = PassportNumber;
    }
    
    public abstract void PickFlight();
    public abstract void EditPassenger(String Passengerselected);
    public abstract void DeletePassenger(String Passengerselected); 
}
