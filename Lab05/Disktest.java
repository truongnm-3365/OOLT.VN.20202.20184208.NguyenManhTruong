package hust.soict.hedspi.aims;
import hust.soict.hedspi.aims.Aims.Aims;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order.Order;
import org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Disktest {
    public static void main(String[] args) {
        Order anOrder = new Order();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
        testSearch(dvd1,"lion",0);
        testSearch(dvd1,"tiger",1);
    }
    public static void testSearch(DigitalVideoDisc dvd, String title , int opt){
        if(opt == 0)
        {
            assertTrue(dvd.search(title));
        }
        else if(opt == 1)
        {
            assertFalse(dvd.search(title));
        }
    }
}
