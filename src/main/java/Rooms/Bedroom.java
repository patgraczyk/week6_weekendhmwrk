package Rooms;


public class Bedroom extends Room {

    BedroomType type;

    private int roomNumber;

    public Bedroom (int roomNumber, BedroomType type, int rate){
        super(type.getCapacity(), rate);
        this.roomNumber=roomNumber;
    }

    public int getRoomNumber(){
        return this.roomNumber;
    }

    public String roomInformation(){
        return "This is room number " + roomNumber;
    }

}
