package Rooms;

public class ConferenceRoom extends Room {

    public String roomName;

    public ConferenceRoom (String roomName, int capacity, int rate){
        super(capacity, rate);
        this.roomName = roomName;
    }

    public String getRoomName(){
        return roomName;
    }

    @Override
    public String roomInformation() {
        return "This is a:" + roomName + "conference room";
    }
}
