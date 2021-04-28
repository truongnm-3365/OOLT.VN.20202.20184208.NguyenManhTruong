package hust.soict.hedspi.aims.utils;

import hust.soict.hedspi.aims.media.Book;

import java.util.ArrayList;
import java.util.List;

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book("Khong the can pha");
        List <String> authors = new ArrayList<String>();
        authors.add("Malphite");
        book1.setAuthors(authors);
        book1.setContent("Tuyet chieu cua mot trieu hoi su su dung mot lan");
        book1.setCategory("League");
        book1.toString();

    }
}
