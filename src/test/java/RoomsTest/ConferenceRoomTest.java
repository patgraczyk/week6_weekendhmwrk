package RoomsTest;

import Rooms.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom1;

    @Before
    public void before(){
        conferenceRoom1 = new ConferenceRoom("Placeholder", 25, 75);
    }

    @Test
    public void hasRoomRate(){
        assertEquals(75, conferenceRoom1.getRate());
    }
}
