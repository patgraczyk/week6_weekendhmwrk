package Rooms;

public enum BedroomType {

    SINGLE("Single", 1),
    DOUBLE("Double", 2 ),
    TWIN("Twin", 2),
    SUITE("Suite", 5);

    private String roomType;
    private int capacity;

    BedroomType(String roomType, int capacity) {
        this.roomType = roomType;
        this.capacity = capacity;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getCapacity() {
        return capacity;
    }
}
