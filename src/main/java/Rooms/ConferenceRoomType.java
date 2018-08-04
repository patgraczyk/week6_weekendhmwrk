package Rooms;

public enum ConferenceRoomType {

    GRAMPIAN ("Grampian", 10),
    PENTLAND ("Pentland", 15),
    CAIRNGORM("Cairngorm", 20);

    private String roomName;
    private int capacity;


    ConferenceRoomType(String roomName, int capacity) {
        this.roomName = roomName;
        this.capacity = capacity;
    }

    public String getRoomName() {
        return roomName;
    }

    public int getCapacity() {
        return capacity;
    }
}
