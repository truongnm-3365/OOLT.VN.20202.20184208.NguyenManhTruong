package hust.soict.hedspi.aims.Aims;
import hust.soict.hedspi.aims.media.*;
import hust.soict.hedspi.aims.order.Order.Order;
import java.util.Scanner;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Aims extends JFrame{
    private static JButton button1;
    private static JButton button2;
    private static JButton button3;
    public static void main(String[] args) {

//        Order anOrder = new Order();
//        String input;
//        float cost;
//        int length;
//        int id;
//        Scanner keyboard = new Scanner(System.in);
//        while (1==1){
//            showMenu();
//            int c = keyboard.nextInt();
//            switch (c){
//                case 1:
//
//                    System.out.println("Tạo thành công order");
//                    break;
//                case 2:
//                    System.out.print("Bạn muốn thêm DVD,CD,Book ? : ");
//                    String choice = keyboard.next();
//                    switch (choice){
//                        case "DVD":
//                            System.out.print("Title: ");
//                            input = keyboard.next();
//                            DigitalVideoDisc dvd1 = new DigitalVideoDisc(input);
//                            System.out.print("Id: ");
//                            id = keyboard.nextInt();
//                            dvd1.setId(id);
//                            System.out.print("Category: ");
//                            input = keyboard.next();
//                            dvd1.setCategory(input);
//                            System.out.print("Cost: ");
//                            cost = keyboard.nextFloat();
//                            dvd1.setCost(cost);
//                            System.out.print("Director: ");
//                            input = keyboard.next();
//                            dvd1.setDirector(input);
//                            System.out.print("Length:");
//                            length = keyboard.nextInt();
//                            dvd1.setLength(length);
//                            anOrder.addMedia(dvd1);
//                            System.out.print("Bạn muốn chạy DVD [Y/N]?");
//                            input = keyboard.next();
//                            if(input.equals("Y")){
//                                dvd1.print();
//                            }
//                            break;
//                        case "Book":
//                            System.out.print("Title: ");
//                            input = keyboard.next();
//                            Book book1 = new Book(input);
//                            System.out.print("Id: ");
//                            id = keyboard.nextInt();
//                            book1.setId(id);
//                            System.out.print("Category: ");
//                            input = keyboard.next();
//                            book1.setCategory(input);
//                            System.out.print("Cost: ");
//                            cost = keyboard.nextFloat();
//                            book1.setCost(cost);
//                            anOrder.addMedia(book1);
//                            break;
//                        case "CD":
//                            System.out.print("Title: ");
//                            input = keyboard.next();
//                            CompactDisc CD1 = new CompactDisc(input);
//                            System.out.print("Id: ");
//                            id = keyboard.nextInt();
//                            CD1.setId(id);
//                            System.out.print("Category: ");
//                            input = keyboard.next();
//                            CD1.setCategory(input);
//                            System.out.print("Cost: ");
//                            cost = keyboard.nextFloat();
//                            CD1.setCost(cost);
//                            System.out.print("Length:");
//                            length = keyboard.nextInt();
//                            CD1.setLength(length);
//                            anOrder.addMedia(CD1);
//                            System.out.print("Bạn muốn chạy CD [Y/N]?");
//                            input = keyboard.next();
//                            if(input.equals("Y")){
//                                CD1.print();
//                            }
//                            break;
//                    }
//                    break;
//                case 3:
//                    System.out.print("Nhập id:");
//                    id = keyboard.nextInt();
//                    anOrder.removeMediaById(id);
//                    break;
//                case 4:
//                    anOrder.orderInfo();
//                    break;
//                case 0:
//                default:
//                    return;
//            }
//        }
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Aims();

            }
        });

    }
    public Aims() {

        Book book1 = new Book("Nightmare", "Akamegakill", 100.0f, "Dmitri Ivanovich Mendeleev");
        Book book2 = new Book("Fiction", "Naruto", 20.05f, "Fujiko F. Fujio");
        Track track = null;
        CompactDisc cd1 = new CompactDisc(1, "Tomorow", "Rock",12.95f ,"Taylor","Taylor",30);
        for(int i = 0 ; i < 10;i++){
            track = new Track("Track cd1_"+i,11);
            cd1.addTrack(track);
        }
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("ABC", "Animation", "The Lion King", 87, 19.95f,1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("XYZ", "Science Fiction", "Star Wars", 124, 24.95f,2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("LMB", "Science Fiction", "Aladdin", 90, 18.99f,3);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("OOP", "Coder", "Javascript", 66, 15.33f,4);
        Order order = new Order();
        order.addMedia(dvd1, dvd2, dvd3, dvd4, book1, book2,cd1);
        Container cp = getContentPane();
        cp.setPreferredSize(new Dimension(600, 600));
//		cp.setLayout(new FlowLayout());

        BoxLayout boxLayout = new BoxLayout(cp, BoxLayout.Y_AXIS);
        cp.setLayout(boxLayout);

        JPanel jPanel = new JPanel();
        jPanel.setPreferredSize(new Dimension(600, 70));
//		jPanel.setBackground(Color.gray);
        jPanel.setLayout(new FlowLayout());




        button1 = new JButton("Add media");
        button2 = new JButton("Remove media");
        button3 = new JButton("Order Show");
        JTextField textField = new JTextField();
        textField.setEditable(false);
        cp.add(textField);
        jPanel.add(button1);
        jPanel.add(button2);
        jPanel.add(button3);

        cp.add(jPanel);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("AimsProject");
        setSize(600, 600);
        setVisible(true);


        button3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel subJPanel = new JPanel();

                subJPanel.setLayout(boxLayout);
                subJPanel.setLocation(50, 50);
                subJPanel.setPreferredSize(new Dimension(400, 400));
                subJPanel.setBackground(Color.gray);

                int size = order.getQtyOrdered();
                String list="";

                for(int i=0;i<size;i++)
                {
                    System.out.println(123);
                    list = list +i+1+" "+order.getItemsOrdered().get(i).getTitle()+" - "+order.getItemsOrdered().get(i).getCategory()+" : "+order.getItemsOrdered().get(i).getCost()+" $"+ "<br>" ;
                }
                textField.setText(list);


            }
        });
    }
    public static void TestAddDigitalVideoDiscArr(Order anOrder, int qtyTest, int option){
        DigitalVideoDisc itemsOrderListTest[] = new DigitalVideoDisc[qtyTest];
        int currentQty = anOrder.getQtyOrdered();
        for(int i = 0 ; i < qtyTest ; i++){
            itemsOrderListTest[i] = new DigitalVideoDisc("title",100,"director","1wqe",100);
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
