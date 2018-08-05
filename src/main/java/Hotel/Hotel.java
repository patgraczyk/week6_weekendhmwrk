package Hotel;

import People.Guest;
import Rooms.Bedroom;
import Rooms.ConferenceRoom;
import Rooms.DiningRoom;
import Rooms.Room;

import java.util.ArrayList;


//bedrooms is a new array that accepts object of Bedroom type
public class Hotel {
    private Guest guest;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<DiningRoom> diningRooms;


    //    in constructor you need to create a new instance of the bedrooms array
    public Hotel() {
        bedrooms = new ArrayList<>();
        conferenceRooms = new ArrayList<>();
        diningRooms = new ArrayList<>();
        this.guest = guest;
    }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    //YOU NEED TO DEFINE IT
//    public ArrayList<Bedroom> getBedroomsType(Bedroom bedroomType) {
//        return bedrooms(bedroomType);
//    }


    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }

    public ArrayList<DiningRoom> getdiningRoom() {
        return diningRooms;
    }

    //    add bedroom to system - COULD THIS BE A FUNCTION ON THE ROOM?
    public void addBedroom(Bedroom bedroom) {
        bedrooms.add(bedroom);
    }

    //    add conference room
    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        conferenceRooms.add(conferenceRoom);
    }

    //    add dining room
    public void addDiningRoom(DiningRoom diningRoom) {
        diningRooms.add(diningRoom);
    }


    //  new functions - refactored
//  change to boolean
    public boolean addToRoom(Room room, Guest guest) {
        return room.checkIn(guest);
    }

    public boolean removeFromRoom(Room room, Guest guest) {
        return room.checkOut(guest);
    }


    public ArrayList<Guest> getlistofguests(Bedroom bedroom) {
        return bedroom.returnGuestsInRoom();

    }

//   look for empty bedrooms
//    for bedroom in bedrooms if capacity =! 0 print bedrooms [WRITE IN ROOMS]

//
    public ArrayList<Bedroom> getEmptyBedrooms() {
        ArrayList<Bedroom> emptyBedrooms = new ArrayList<>();
        for (Bedroom bedroom : bedrooms) {
            if (bedroom.getCapacity() != 0);
            emptyBedrooms.add(bedroom);
        }
        return emptyBedrooms;
    }

//   add number of nights
}


//FUNCTIONS OBSOLETE AFTER REFACTOR

    //  remove guests from rooms - use ROOM not bedroom
//  change to boolean
//    public boolean removeFromBedroom(Bedroom bedroom, Guest guest) {
//        return bedroom.checkOut(guest);
//    }
//
//    public boolean addToConferenceRoom(ConferenceRoom conferenceRoom, Guest guest) {
//        return conferenceRoom.checkIn(guest);
//    }
//
//    public boolean removeFromConferenceRoom(ConferenceRoom conferenceRoom, Guest guest) {
//        return conferenceRoom.checkOut(guest);
//    }
//
//    public boolean addToDiningRoom(DiningRoom diningRoom, Guest guest) {
//        return diningRoom.checkIn(guest);
//    }
//
//    public boolean removeFromDiningRoom(DiningRoom diningRoom, Guest guest) {
//        return diningRoom.checkOut(guest);
//    }