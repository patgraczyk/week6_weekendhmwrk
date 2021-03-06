package PeopleTest;

import People.Guest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void before(){
        guest = new Guest ("Richard Hendricks", 100);
    }

    @Test
    public void hasName(){
        assertEquals("Richard Hendricks", guest.getName());
    }

    @Test
    public void hasMoney(){
        assertEquals(100, guest.getMoney());
    }
}
