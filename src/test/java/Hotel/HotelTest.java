package Hotel;

import People.Guest;
import Rooms.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static Rooms.BedroomType.SINGLE;
import static Rooms.BedroomType.TWIN;
import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Guest guest1;
    Guest guest2;
    Guest guest3;
    Guest guest4;
    ArrayList<Guest> guests;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    ConferenceRoom conferenceRoom1;
    ConferenceRoom conferenceRoom2;
    DiningRoom diningRoom1;
    DiningRoom diningRoom2;


    @Before
    public void before() {
        hotel = new Hotel();
        bedroom1 = new Bedroom(12, SINGLE, 75);
        bedroom2 = new Bedroom(14, SINGLE, 75);
        bedroom3 = new Bedroom(14, TWIN, 65);
        conferenceRoom1 = new ConferenceRoom("Pentland", ConferenceRoomType.PENTLAND, 120);
        conferenceRoom2 = new ConferenceRoom("Grampian", ConferenceRoomType.GRAMPIAN, 110);
        diningRoom1 = new DiningRoom("Salmon", 80, 0);
        diningRoom2 = new DiningRoom("Steak", 4, 0);
        guest1 = new Guest("Richard Hendricks", 100);
        guest2 = new Guest("Gavin Belson", 50);
        guest3 = new Guest("Richard Bransons", 150);
        guest4 = new Guest("Monica Richards", 30);
        guests = new ArrayList<>();
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
    public void checkInGuestToBedroom(){
        assertEquals(true, hotel.addToRoom(bedroom1, guest1));
    }

    @Test
    public void checkInGuest_cannotafford(){
        assertEquals(false, hotel.addToRoom(bedroom2, guest4));
    }

    @Test
    public void checkInGuestToConference(){
        assertEquals(true, hotel.addToRoom(conferenceRoom1, guest3));
    }

    @Test
    public void addGuestToDiningRoom(){
        assertEquals(true, hotel.addToRoom(diningRoom1,guest1));
    }

    @Test
    public void removeGuestsFromDiningRoom(){
        hotel.addToRoom(diningRoom1, guest4);
        assertEquals(true, hotel.removeFromRoom(diningRoom1, guest4));
    }

    @Test
    public void checkOutGuest(){
        hotel.addToRoom(bedroom1, guest1);
        assertEquals(true, hotel.removeFromRoom(bedroom1, guest1));
    }

    @Test
    public void checkOutGuest_conference(){
        hotel.addToRoom(conferenceRoom1, guest3);
        assertEquals(true, hotel.removeFromRoom(conferenceRoom1, guest3));
    }

    @Test
    public void checkInGuestconference_cannotafford(){
        hotel.addToRoom(conferenceRoom1, guest1);
        assertEquals(false,hotel.addToRoom(conferenceRoom1, guest1));
    }


//    tried to add test that adds multiple guests at once to exceed capacity
//    @Test
//    public void deny_entry_exceededcapacity(){
//        hotel.addToDiningRoom(diningRoom1, guests.add(guest1, guest2, guest3));
//    }

    @Test
    public void exceedCapacityBedroom(){
        hotel.addToRoom(bedroom1, guest1);
        hotel.addToRoom(bedroom1, guest2);
        assertEquals(true, hotel.addToRoom(bedroom2, guest1));
        assertEquals(false, hotel.addToRoom(bedroom2, guest2));
    }
//
    @Test
    public void returnGuestsinRoom(){
        hotel.addToRoom(bedroom3, guest3);
        assertEquals("Richard Hendricks", hotel.getlistofguests(bedroom3));
    }

    @Test
    public void getEmptyBedrooms(){
        hotel.addBedroom(bedroom1);
        hotel.addBedroom(bedroom2);
        hotel.addBedroom(bedroom3);
        assertEquals(3, hotel.getEmptyBedrooms().size());
    }

    @Test
    public void getEmptyBedroomsGuests(){
        hotel.addBedroom(bedroom1);
        hotel.addBedroom(bedroom2);
        hotel.addBedroom(bedroom3);
        hotel.getBedrooms();
        hotel.addToRoom(bedroom1, guest3);
        assertEquals(3, hotel.getEmptyBedrooms().size());
    }


    //    @Test
//    public void checkInGuest(){
//        assertEquals(true, hotel.addToBedroom(bedroom1, guest1));
//    }

}
