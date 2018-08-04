package RoomsTest;

import Rooms.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;

import static Rooms.ConferenceRoomType.CAIRNGORM;
import static Rooms.ConferenceRoomType.GRAMPIAN;
import static Rooms.ConferenceRoomType.PENTLAND;
import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    ConferenceRoom conferenceRoom2;
    ConferenceRoom conferenceRoom3;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom("Pentland", PENTLAND, 75);
        conferenceRoom2 = new ConferenceRoom("Grampian", GRAMPIAN, 65);
        conferenceRoom3 = new ConferenceRoom("Cairngorm", CAIRNGORM, 40);
    }

    @Test
    public void hasRoomRate(){
        assertEquals(75, conferenceRoom.getRate());
        assertEquals(65, conferenceRoom2.getRate());
        assertEquals(40, conferenceRoom3.getRate());
    }

    @Test
    public void getCapacityRoom(){
        assertEquals(15, conferenceRoom.getCapacity());
        assertEquals(10, conferenceRoom2.getCapacity());
        assertEquals(20, conferenceRoom3.getCapacity());
    }
}
