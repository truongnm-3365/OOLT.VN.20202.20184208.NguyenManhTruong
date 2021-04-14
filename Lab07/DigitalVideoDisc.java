package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{

    private String director;
    private int length;

    public DigitalVideoDisc(String title){
        super(title);
    }
    public DigitalVideoDisc(String title, int length, String director, String director1, int length1) {
        super(title, length, director);
        this.director = director1;
        this.length = length1;
    }

    public DigitalVideoDisc(String title, String category, int length, String director, String director1, int length1) {
        super(title, category, length, director);
        this.director = director1;
        this.length = length1;
    }

    public DigitalVideoDisc(String title, String category, float cost, int id, int length, String director, String director1, int length1) {
        super(title, category, cost, id, length, director);
        this.director = director1;
        this.length = length1;
    }

    @Override
    public void print() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }

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


}
