package Rooms;

public enum ConferenceRoomType {

    GRAMPIAN ("Grampian", 10),
    PENTLAND ("Pentland", 15),
    CAIRNGORM("Cairngorm", 20);

    private String conferenceRoomName;
    private int capacity;


    ConferenceRoomType(String roomName, int capacity) {
        this.conferenceRoomName = roomName;
        this.capacity = capacity;
    }

    public String getRoomName() {
        return conferenceRoomName;
    }

    public int getCapacity() {
        return capacity;
    }
}
