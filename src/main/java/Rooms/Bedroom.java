package Rooms;


public class Bedroom extends Room {

    private int roomNumber;

    public Bedroom (int roomNumber, BedroomType capacity, int rate){
        super(capacity, rate);
        this.roomNumber=roomNumber;
    }

    public int getRoomNumber(){
        return this.roomNumber;
    }

    public String roomInformation(){
        return "This is room number " + roomNumber;
    }

}
