
import java.util.ArrayList;

public class Flight {

    private Pilot pilot;
    private Plane plane;
    private ArrayList<Passenger> passengers;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private String destination;
    private String departureAirport;
    private String departureTime;
    private String flightNumber;

   public Flight(Pilot pilot, ArrayList<CabinCrewMember>cabinCrewMembers, ArrayList<Passenger> passenger,Plane plane,String departureTime,String departureAirport, String destination, String flightNumber) {
       this.pilot = pilot;
       this.plane = plane;
       this.destination = destination;
       this.flightNumber = flightNumber;
       this.departureAirport = departureAirport;
       this.departureTime = departureTime;
       this.cabinCrewMembers = new ArrayList<CabinCrewMember>();
       this.passengers = new ArrayList<Passenger>();
   }


    public String getFlightNumber() {
       return this.flightNumber;
    }
}



