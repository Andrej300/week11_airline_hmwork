import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {


        Passenger passenger;

        @Before

        public void before() {
            passenger = new Passenger("Arnold", 1);
        }

        @Test
        public void passengerHasName() {

            assertEquals("Arnold", passenger.getName());
        }

        @Test
        public void passengerHasBag() {
            assertEquals(1, passenger.getNumberOfBags());
        }

    }


