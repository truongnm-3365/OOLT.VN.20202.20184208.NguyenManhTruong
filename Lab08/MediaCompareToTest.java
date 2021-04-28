package hust.soict.hedspi.test;

import hust.soict.hedspi.aims.media.*;

import java.util.*;

public class MediaCompareToTest {
    public static void main(String[] args) {
        Collection collection = new ArrayList();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
        dvd1.setCategory("Animation");
        dvd1.setCost(1);
        dvd1.setDirector("Roger Allers");
        dvd1.setLength(87);
        collection.add(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
        dvd2.setCategory("Science Fiction");
        dvd2.setCost(2);
        dvd2.setDirector("George Lucas");
        dvd2.setLength(124);
        collection.add(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
        dvd3.setCategory("Animation");
        dvd3.setCost(3);
        dvd3.setDirector("John Musker");
        dvd3.setLength(90);
        collection.add(dvd3);

        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Conan");
        dvd4.setCategory("Animation");
        dvd4.setCost(14);
        dvd4.setDirector("Aoyama");
        dvd4.setLength(1000);
        collection.add(dvd4);

        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Naruto");
        dvd5.setCategory("Animation");
        dvd5.setCost(1);
        dvd5.setDirector("Kishi");
        dvd5.setLength(700);
        collection.add(dvd5);

        DigitalVideoDisc dvd6 = new DigitalVideoDisc("One piece");
        dvd6.setCategory("Animation");
        dvd6.setCost(1);
        dvd6.setDirector("Kishi");
        dvd6.setLength(700);
        collection.add(dvd6);

        Iterator iterator = collection.iterator();
        System.out.println("The DVDs  currently in the order are: ");
        while (iterator.hasNext()){
            System.out.println(((DigitalVideoDisc)iterator.next()).getTitle());
        }

        Collections.sort((List)collection);
        iterator = collection.iterator();
        System.out.println("The DVDs sorted in the order are:");
        while (iterator.hasNext()){
            System.out.println(((DigitalVideoDisc)iterator.next()).getTitle());
        }

        Track track = null;
        CompactDisc cd1 = new CompactDisc(1, "Tomorow", "Rock",12.95f ,"Taylor","Taylor",30);
        CompactDisc cd2 = new CompactDisc(2, "Today", "Jar",11.95f ,"Selena","Selena",40);
        CompactDisc cd3 = new CompactDisc(3, "Sunday", "Jar",32.95f ,"Sam","Sam",120);
        for(int i = 0 ; i < 10;i++){
            track = new Track("Track cd1_"+i,11);
            cd1.addTrack(track);
        }
        for(int i = 0 ; i < 12;i++){
            track = new Track("Track cd2_"+i,11);
            cd2.addTrack(track);
        }
        for(int i = 0 ; i < 15;i++){
            track = new Track("Track cd3_"+i,11);
            cd3.addTrack(track);
        }

        Collection collection1 = new ArrayList();
        collection1.add(cd1);
        collection1.add(cd2);
        collection1.add(cd3);


        Iterator iterator1 = collection1.iterator();

        System.out.println("The CDs currently in the order are: ");

        while(iterator1.hasNext()) {
            System.out.println(((Media) iterator1.next()).getTitle());
        }


        Collections.sort((List) collection1);
        iterator1 = collection1.iterator();
        System.out.println("The CDs in sorted order are: ");

        while(iterator1.hasNext()) {
            System.out.println(((Media) iterator1.next()).getTitle());
        }

        Book b1 = new Book(1,"The Yasuo");
        CompactDisc cd = new CompactDisc(2, "Forever", "Rock",12.95f ,"Taylor","Taylor",30);
        DigitalVideoDisc dvd7 = new DigitalVideoDisc(3,"The Malphite","Animation",19.95f,"Roger Allers",87);
        Collection collection2 = new ArrayList();
        collection2.add(cd);
        collection2.add(dvd7);
        collection2.add(b1);


        Iterator iterator2 = collection2.iterator();

        System.out.println("The lists currently in the order are: ");

        while(iterator2.hasNext()) {
            System.out.println(((Media) iterator2.next()).getTitle());
        }

        Collections.sort((java.util.List) collection2);
        iterator2 = collection2.iterator();
        System.out.println("The lists in sorted order are: ");

        while(iterator2.hasNext()) {
            System.out.println(((Media) iterator2.next()).getTitle());
        }
    }
}
