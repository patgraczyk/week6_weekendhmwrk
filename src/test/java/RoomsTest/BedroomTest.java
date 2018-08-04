package RoomsTest;

import Rooms.Bedroom;
import Rooms.BedroomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom single;
    Bedroom twin;
    Bedroom suite;

    @Before
    public void before(){
        single = new Bedroom(23, BedroomType.SINGLE, 45);
        twin = new Bedroom(45, BedroomType.TWIN, 40);
        suite = new Bedroom(21, BedroomType.SUITE, 75);
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(23, single.getRoomNumber());
    }

    @Test
    public void hasRoomRate(){
        assertEquals(45, single.getRate());
    }

    @Test
    public void givesRoomInformation(){
        assertEquals("This is room number 23", single.roomInformation());
    }

    @Test
    public void getsCapacityofRoomType(){
        assertEquals(1, single.getCapacity());
        assertEquals(2, twin.getCapacity());
        assertEquals(5, suite.getCapacity());
    }
}
