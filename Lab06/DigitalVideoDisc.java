package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends media{

    private String director;
    private int length;



    public String getDirector() {
        return director;
    }

    public void setDirector(String director){
        this.director = director;
    }

    public int getLength() {
        return length;
    }
    public void setLength(int length){
        this.length = length;
    }

    public boolean search(String title)
    {
        if(this.getTitle().toLowerCase().indexOf(title.toLowerCase())!=-1)
            return true;
        else
            return false;
    }

    public DigitalVideoDisc(String title){
        super(title);

    }

    public DigitalVideoDisc(String title, String category){
        super(title, category);
    }

    public DigitalVideoDisc(String title, String category, String director){
        super(title, category);
        this.director = director;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost){
        super(title, category);
        this.director = director;
        this.length = length;
        setCost(cost);
    }
}
