import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before

    public void before(){
        cabinCrewMember = new CabinCrewMember("Andrew", RankType.FLIGHTATTENDANT);
    }

    @Test
    public void hasRank(){
        assertEquals(RankType.FLIGHTATTENDANT, cabinCrewMember.getRank());
    }


}
