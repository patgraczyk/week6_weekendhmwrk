package People;

public class Guest {

    private String guestName;
    private int guestMoney;

    public Guest ( String guestName, int guestMoney ) {
        this.guestName = guestName;
        this.guestMoney = guestMoney;
    }

    public String getName(){
        return this.guestName;
    }

    public int getMoney(){
        return this.guestMoney;
    }

}
