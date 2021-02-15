import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.Callable;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Pilot pilot;
    ArrayList<CabinCrewMember> cabinCrewMembers;
    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;
    ArrayList<Passenger> passengers;
    Passenger passenger1;
    Passenger passenger2;
    Plane plane;

    @Before
    public void before(){
        cabinCrewMembers = new ArrayList<CabinCrewMember>();
        cabinCrewMember1 = new CabinCrewMember("Jack", RankType.FLIGHTATTENDANT);
        cabinCrewMember2 = new CabinCrewMember("Christy", RankType.FLIGHTATTENDANT);
        passengers = new ArrayList<Passenger>();
        passenger1 = new Passenger("Tom",1);
        passenger2 = new Passenger("Carlos",1);
        plane = new Plane(PlaneType.AIRBUSA380);
        flight = new Flight(pilot,cabinCrewMembers, passengers, plane,"20:15","Amsterdam","Glasgow","TS124587");


    }

    @Test
    public void hasFlightNumber(){
        assertEquals("TS124587",flight.getFlightNumber());
    }
    @Test
    public void hasDestination(){
        assertEquals("Glasgow",flight.getDestination());
    }

    @Test
    public void hasDeparture(){
        assertEquals("Amsterdam",flight.getDeparture());
    }

    @Test
    public void hasDepartureTime(){
        assertEquals("20:15", flight.getDepartureTime());
    }

    @Test
    public void flightHasPilot(){
        assertEquals(pilot, flight.getPilot());
    }

    @Test
    public void flightHasCabinCrewMember(){
        flight.addCabinCrewMember(cabinCrewMember1);
        flight.addCabinCrewMember(cabinCrewMember2);
        assertEquals(2, flight.getNumberOfCabinCrewMembers());
    }

    @Test
    public void flightHasNoPassengers(){
        assertEquals(0, flight.getPassenger());
    }


        };



