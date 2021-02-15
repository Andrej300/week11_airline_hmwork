import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {
    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Jack Marshall",RankType.CAPTAIN, "PL889735");
    }

    @Test
    public void hasRank(){
        assertEquals(RankType.CAPTAIN, pilot.getRank());
    }



}
