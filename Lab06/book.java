package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class book extends media{

    private List<String> authors = new ArrayList<String>();

    public book(String title) {
        super(title);
    }
    public book(String title,String category,List<String> authors){
        super(title,category);
        this.authors=authors;
    }
    public void addAuthor (String authorName){
        if(authors.indexOf(authorName) != -1)
        {
            authors.add(authorName);
        }
    }

    public void removeAuthor(String authorName){
        if(authors.size()>0)
            if(authors.indexOf(authorName) != -1){
                authors.remove(authorName);
            }
    }


    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }
}
