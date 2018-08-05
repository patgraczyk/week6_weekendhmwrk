package Hotel;

import People.Guest;
import Rooms.*;
import org.junit.Before;
import org.junit.Test;

import static Rooms.BedroomType.SINGLE;
import static Rooms.BedroomType.TWIN;
import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Guest guest1;
    Guest guest2;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    ConferenceRoom conferenceRoom1;
    ConferenceRoom conferenceRoom2;
    DiningRoom diningRoom1;

    @Before
    public void before() {
        hotel = new Hotel();
        bedroom1 = new Bedroom(12, SINGLE, 75);
        bedroom2 = new Bedroom(14, SINGLE, 75);
        bedroom3 = new Bedroom(14, TWIN, 65);
        conferenceRoom1 = new ConferenceRoom("Pentland", ConferenceRoomType.PENTLAND, 120);
        conferenceRoom2 = new ConferenceRoom("Grampian", ConferenceRoomType.GRAMPIAN, 110);
        diningRoom1 = new DiningRoom("Salmon", 80, 0);
        guest1 = new Guest("Richard Hendricks", 100);
        guest2 = new Guest("Gavin Belson", 50);
    }

    @Test
    public void emptyHotel_bed(){
        assertEquals(0, hotel.getBedrooms().size());
    }

    @Test
    public void emptyHotel_conference(){
        assertEquals(0, hotel.getConferenceRooms().size());
    }

    @Test
    public void emptyHotel_dinining(){
        assertEquals(0, hotel.getdiningRoom().size());
    }

    @Test
    public void add_bedroom_type(){
        hotel.addBedroom(bedroom1);
        assertEquals(1, hotel.getBedrooms().size());
    }

    @Test
    public void add_conferenceroon(){
    hotel.addConferenceRoom(conferenceRoom1);
    assertEquals(1,hotel.getConferenceRooms().size());
    }

    @Test
    public void add_diningroom(){
        hotel.addDiningRoom(diningRoom1);
        assertEquals(1,hotel.getdiningRoom().size());
    }

    @Test
    public void add_multiple_rooms(){
        hotel.addBedroom(bedroom1);
        hotel.addBedroom(bedroom2);
        hotel.addBedroom(bedroom3);
        assertEquals(3, hotel.getBedrooms().size());
    }
//
//    @Test
//    public void find_bedroom_type(){
//        hotel.addBedroom(bedroom1);
//        assertEquals(1, hotel.getBedroomsType(BedroomType.SINGLE).size());
//    }
//

    @Test
    public void checkInGuest(){
        assertEquals(true, hotel.addToBedroom(bedroom1, guest1));
    }

    @Test
    public void checkOutGuest(){
        assertEquals(true, hotel.removeFromBedroom(bedroom1, guest1));

    }

    @Test
    public void checkInGuest_conference(){
        assertEquals(true, hotel.addToConferenceRoom(conferenceRoom1, guest2));
    }

    @Test
    public void checkOutGuest_conference(){
        assertEquals(true, hotel.removeFromConferenceRoom(conferenceRoom1, guest2));
    }

    @Test
    public void checkInGuest_false(){
        assertEquals(false,hotel.addToBedroom(bedroom1, guest1));
    }
}
