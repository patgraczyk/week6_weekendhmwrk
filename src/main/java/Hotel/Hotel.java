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

    public Hotel() {
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

//    add bedroom to system - COULD THIS BE A FUNCTION ON THE ROOM?
    public void addBedroom(Bedroom bedroom){
        bedrooms.add(bedroom);
    }
//    add conference room
    public void addConferenceRoom(ConferenceRoom conferenceRoom){
    conferenceRooms.add(conferenceRoom);
    }
//    add dining room
    public void addDiningRoom(DiningRoom diningRoom){
    diningRooms.add(diningRoom);
}
//  check in guest to bedroom- use ROOM not bedroom
    public void addToBedroom(Bedroom bedroom, Guest guest) {
    bedroom.checkIn(guest);
}

//  remove guests from rooms - use ROOM not bedroom
    public void removeFromBedroom(Bedroom bedroom, Guest guest) {
    bedroom.checkOut(guest);
}

    public void addToConferenceRoom(ConferenceRoom conferenceRoom, Guest guest) {
        conferenceRoom.checkIn(guest);
    }

    public void removeFromConferenceRoom(ConferenceRoom conferenceRoom, Guest guest) {
        conferenceRoom.checkOut(guest);
    }

    public void addToDiningRoom(DiningRoom diningRoom, Guest guest) {
        diningRoom.checkIn(guest);
    }

    public void removeFromDiningRoom(DiningRoom diningRoom, Guest guest) {
        diningRoom.checkOut(guest);
    }

//    deny entry if capacity exceeded

}
