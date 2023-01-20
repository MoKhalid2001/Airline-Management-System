/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airline.management.system;

/**
 *
 * @author mokhalid
 */
public abstract class FlightAbstract {
    private String FlightCode;
    private String Source;
    private String Destination;
    private String TakeOfDate;
    private int Seats;

    public FlightAbstract(String FlightCode, String Source, String Destination, String TakeOfDate, int Seats) {
        this.FlightCode = FlightCode;
        this.Source = Source;
        this.Destination = Destination;
        this.TakeOfDate = TakeOfDate;
        this.Seats = Seats;
    }

    public String getFlightCode() {
        return FlightCode;
    }

    public void setFlightCode(String FlightCode) {
        this.FlightCode = FlightCode;
    }

    public String getSource() {
        return Source;
    }

    public void setSource(String Source) {
        this.Source = Source;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String Destination) {
        this.Destination = Destination;
    }

    public String getTakeOfDate() {
        return TakeOfDate;
    }

    public void setTakeOfDate(String TakeOfDate) {
        this.TakeOfDate = TakeOfDate;
    }

    public int getSeats() {
        return Seats;
    }

    public void setSeats(int Seats) {
        this.Seats = Seats;
    }
    
    public abstract void InsertFlight();
    public abstract void EditFlight();
    public abstract void DeleteFlight(String FlightToDelete); 
  
}
