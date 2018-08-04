package RoomsTest;

import Rooms.DiningRoom;
import Rooms.Room;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {
    DiningRoom<Room> diningRoom1;

    @Before
    public void before(){
        diningRoom1 = new DiningRoom<Room>("Salmon", 25, 0);
    }

    @Test
    public void hasDishOfTheDay(){
        assertEquals("Salmon", diningRoom1.getDishOfTheDay());
    }

    @Test
    public void hasCapacity(){
        assertEquals(25, diningRoom1.getCapacity());
    }

    @Test
    public void hasRate(){
        assertEquals(0, diningRoom1.getRate());
    }
}
