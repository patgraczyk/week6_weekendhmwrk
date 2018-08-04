package Rooms;

public class ConferenceRoom extends Room {

    ConferenceRoom name;

    public String roomName;

    public ConferenceRoom (String roomName, ConferenceRoomType name, int rate){
        super(name.getCapacity(), rate);
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
