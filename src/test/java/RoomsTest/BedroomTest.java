package RoomsTest;

import Rooms.Bedroom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom1;

    @Before
    public void before(){
        bedroom1 = new Bedroom(23,2,65);
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(23, bedroom1.getRoomNumber());
    }

    @Test
    public void hasRoomRate(){
        assertEquals(65, bedroom1.getRate());
    }

    @Test
    public void givesRoomInformation(){
        assertEquals("This is room number 23", bedroom1.roomInformation());
    }
}
