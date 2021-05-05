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

    public DigitalVideoDisc(int id,String title,String category,float cost, String director, int length){
        super(title,category,cost,id, length, director);
    }

    public DigitalVideoDisc(String title, String category, float cost, int id, int length, String director, String director1, int length1) {
        super(title, category, cost, id, length, director);
        this.director = director1;
        this.length = length1;
    }

    public DigitalVideoDisc(String director, String category, String title, int length, float cost,int id) {
        super(title, category, cost, id, length, director);
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


    @Override
    public int compareTo(Object o) {
            if (o instanceof DigitalVideoDisc) {
                DigitalVideoDisc another = (DigitalVideoDisc) o;
                if(another!=null){
                    if(this.getCost() != another.getCost())
                        return (int)(this.getCost() - another.getCost());
                    else{
                        if(this.length != another.length)
                            return this.length - another.length;
                        else
                            return this.getTitle().compareTo(another.getTitle());
                    }
                }
                return -1;

            }

        return -1;
    }
}
