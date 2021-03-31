package hust.soict.hedspi.aims.Aims;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order.Order;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Aims {
    public static void main(String[] args) {
        Order anOrder = new Order();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
        dvd1.setCategory("Animation");
        dvd1.setCost(19.95f);
        dvd1.setDirector("Roger Allers");
        dvd1.setLength(87);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
        dvd2.setCategory("Science Fiction");
        dvd2.setCost(24.95f);
        dvd2.setDirector("George Lucas");
        dvd2.setLength(124);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
        dvd3.setCategory("Animation");
        dvd3.setCost(18.00f);
        dvd3.setDirector("John Musker");
        dvd3.setLength(90);
        anOrder.addDigitalVideoDisc(dvd3);
//        DigitalVideoDisc dvd4 = dvd3;
//        DigitalVideoDisc dvd5 = dvd3;
//        DigitalVideoDisc dvd6 = dvd3;
//        DigitalVideoDisc dvd7 = dvd3;
//        DigitalVideoDisc dvd8 = dvd3;
//        DigitalVideoDisc dvd9 = dvd3;
//        DigitalVideoDisc dvd10 = dvd3;
//        DigitalVideoDisc dvd11 = dvd3;
//        anOrder.addDigitalVideoDisc(dvd4,dvd5,dvd6,dvd7,dvd8,dvd9,dvd10);
//        anOrder.addDigitalVideoDisc(dvd9,dvd10);
//
//        System.out.print("Total Cost is:");
//        System.out.println(anOrder.totalCost());
       System.out.println(anOrder.getAluckyItem().getTitle());
        TestAddDigitalVideoDiscArr(anOrder,7,1);
        TestAddDigitalVideoDiscArr(anOrder,1,0);
        anOrder.orderInfo();
    }
    public static void TestAddDigitalVideoDiscArr(Order anOrder, int qtyTest, int option){
        DigitalVideoDisc itemsOrderListTest[] = new DigitalVideoDisc[qtyTest];
        int currentQty = anOrder.getQtyOrdered();
        for(int i = 0 ; i < qtyTest ; i++){
            itemsOrderListTest[i] = new DigitalVideoDisc("title","category","director",100,25f);
        }
        anOrder.addDigitalVideoDisc(itemsOrderListTest);
        if(option == 0)
            assertEquals(anOrder.getQtyOrdered(),currentQty);
        else if(option == 1)
            assertEquals(anOrder.getQtyOrdered(),currentQty + qtyTest);
    }
}
