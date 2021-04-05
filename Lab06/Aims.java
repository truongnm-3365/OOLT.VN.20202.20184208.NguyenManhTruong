package hust.soict.hedspi.aims.Aims;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order.Order;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Aims {
    public static void main(String[] args) {
        Order anOrder = new Order();
        String input;
        float cost;
        int length;
        int id;
        Scanner keyboard = new Scanner(System.in);
        while (1==1){
            showMenu();
            int c = keyboard.nextInt();
            switch (c){
                case 1:

                    System.out.println("Tạo thành công order");
                    break;
                case 2:
                    System.out.print("Title: ");
                    input = keyboard.next();
                    DigitalVideoDisc dvd1 = new DigitalVideoDisc(input);
                    System.out.print("Id: ");
                    id = keyboard.nextInt();
                    dvd1.setId(id);
                    System.out.print("Category: ");
                    input = keyboard.next();
                    dvd1.setCategory(input);
                    System.out.print("Cost: ");
                    cost = keyboard.nextFloat();
                    dvd1.setCost(cost);
                    System.out.print("Director: ");
                    input = keyboard.next();
                    dvd1.setDirector(input);
                    System.out.print("Length:");
                    length = keyboard.nextInt();
                    dvd1.setLength(length);
                    anOrder.addMedia(dvd1);
                    break;
                case 3:
                    System.out.print("Nhập id:");
                    id = keyboard.nextInt();
                    anOrder.removeMediaById(id);
                    break;
                case 4:
                    anOrder.orderInfo();
                    break;
                case 0:
                default:
                    return;
            }
        }
    }
    public static void TestAddDigitalVideoDiscArr(Order anOrder, int qtyTest, int option){
        DigitalVideoDisc itemsOrderListTest[] = new DigitalVideoDisc[qtyTest];
        int currentQty = anOrder.getQtyOrdered();
        for(int i = 0 ; i < qtyTest ; i++){
            itemsOrderListTest[i] = new DigitalVideoDisc("title","category","director",100,25f);
        }
        anOrder.addMedia(itemsOrderListTest);
        if(option == 0)
            assertEquals(anOrder.getQtyOrdered(),currentQty);
        else if(option == 1)
            assertEquals(anOrder.getQtyOrdered(),currentQty + qtyTest);
    }
    public static void showMenu() {

        System.out.println("Order Management Application: ");
        System.out.println("--------------------------------");
        System.out.println("1. Create new order");
        System.out.println("2. Add item to the order");
        System.out.println("3. Delete item by id");
        System.out.println("4. Display the items list of order");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.print("Please choose a number: 0-1-2-3-4: ");

    }
}
