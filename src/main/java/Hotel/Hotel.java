package Hotel;

import People.Guest;
import Rooms.Bedroom;
import Rooms.ConferenceRoom;
import Rooms.DiningRoom;

import java.util.ArrayList;

public class Hotel {
    private Guest guest;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<DiningRoom> diningRoom;

    public Hotel(Guest guest, ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms, ArrayList<DiningRoom> diningRoom) {
        this.bedrooms = bedrooms;
        this.conferenceRooms=conferenceRooms;
        this.diningRoom= diningRoom;
        this.guest=guest;
    }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }

    public ArrayList<DiningRoom> getdiningRoom(){
        return diningRoom;
    }

//  check in guest to bedroom- use ROOM not bedroom
    public void addToBedroom(Bedroom bedroom, Guest guest) {
    bedroom.checkIn(guest);
}

//  remove guests from rooms - use ROOM not bedroom
    public void removeFromBedroom(Bedroom bedroom, Guest guest) {
    bedroom.checkOut(guest);
}

    public void addToConerenceRoom(ConferenceRoom conferenceRoom, Guest guest) {
        conferenceRoom.checkIn(guest);
    }

    public void removeFromConferenceRoom(ConferenceRoom conferenceRoom, Guest guest) {
        conferenceRoom.checkIn(guest);
    }

    public void addToDiningRoom(DiningRoom diningRoom, Guest guest) {
        diningRoom.checkIn(guest);
    }

    public void removeFromDiningRoom(DiningRoom diningRoom, Guest guest) {
        diningRoom.checkIn(guest);
    }

//    deny entry if capacity exceeded

}
