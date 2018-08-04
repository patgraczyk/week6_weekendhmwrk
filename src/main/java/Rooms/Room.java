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

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public int getRate(){
        return this.rate;
    }

    public int checkIfSpaces(){
        return this.capacity - guests.size();
    }

    public abstract String roomInformation();

}
