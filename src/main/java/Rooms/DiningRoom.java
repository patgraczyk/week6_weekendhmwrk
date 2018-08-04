package Rooms;

public class DiningRoom extends Room {

    private String dishOfTheDay;

    public DiningRoom (String getDishOfTheDay, int capacity, int rate){
        super(capacity, rate);
        this.dishOfTheDay=dishOfTheDay;
    }

    public String getDishOfTheDay(){
        return this.dishOfTheDay;
    }

    @Override
    public String roomInformation() {
        return "This is your dining area. Today's meal of the day is: " + dishOfTheDay;
    }

}
