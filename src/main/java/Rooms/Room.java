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

//    Write if statements if passing tests
//    public boolean checkIn(Guest guest) {
//        if (capacity > guests.size()){
//            guests.add(guest);
//            return true;
//        } else {
//            return false;
//        }
//
//    }


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
        guests.remove(guest);
        return true;
    }

    public abstract String roomInformation();

    public int checkIfSpaces(){
        return this.capacity - guests.size();
    }
}
