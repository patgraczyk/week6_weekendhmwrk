package Hotel;

import People.Guest;
import Rooms.Bedroom;
import Rooms.ConferenceRoom;
import Rooms.Room;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel() {
        this.bedrooms = bedrooms;
        this.conferenceRooms=conferenceRooms;
    }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }


}
