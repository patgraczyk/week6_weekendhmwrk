package Rooms;

import People.Guest;

import java.util.ArrayList;

public abstract class  Room {
    private int capacity;
    private int rate;
    private ArrayList<Guest> guests;

    public Room(int capacity, int rate) {
        this.capacity = capacity;
        guests = new ArrayList<>();
        this.rate = rate;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public int getRate(){
        return this.rate;
    }



    public int guestCount() {
        return this.guests.size();
    }

    public boolean checkIn(Guest guest) {
        if (capacity > guests.size() && this.rate < guest.getMoney()){
            guests.add(guest);
            return true;
        } else {
            return false;
        }

    }

//    Write if statements if passing tests
    public boolean checkOut(Guest guest) {
        if (guests.contains(guest)){
            guests.clear();
        return true;
    }else{
            return false;
        }
    }

    public abstract String roomInformation();

//    get list of people in room

    public ArrayList<Guest> returnGuests() {
        ArrayList<Guest> guestsInHotel = new ArrayList<Guest>();
        for (Guest guest : guests) {
            if (guests.contains(guest)) {
            }
            guestsInHotel.add(guest.getName());
        }
        return guestsInHotel;
    }

//    public int checkIfSpaces(){
//        return this.capacity - guests.size();
//    }
}
