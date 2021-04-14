package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {

    private List<String> authors = new ArrayList<String>();

    public Book(String title) {
        super(title);
    }
    public Book(String title, String category, List<String> authors){
        super(title,category);
        this.authors=authors;
    }
    public void addAuthor (String authorName){
        if(authors.indexOf(authorName) == -1)
        {
            authors.add(authorName);
            System.out.println("Đã thêm vào");
        }else{
            System.out.println("Đã tồn tại không thể thêm vào");
        }
    }

    public void removeAuthor(String authorName){
        if(authors.size()>0)
            if(authors.indexOf(authorName) != -1){
                authors.remove(authorName);
                System.out.println("Đã xóa");
            }else{
                System.out.println("Không tồn tại không thể xóa");
            }
    }


    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }
}
