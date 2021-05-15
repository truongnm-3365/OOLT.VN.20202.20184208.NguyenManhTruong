package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.Aims.PlayerException;

public class Track implements Playable,Comparable {
    private String title;
    private int length;

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    @Override
    public void print() throws PlayerException {
        if(this.length > 0){
            System.out.println(" Playing Track: " + this.getTitle());
            System.out.println(" DVD Track: " + this.getLength());
        }else{
            throw new PlayerException("ERROR: DVD length is non-positive!");
        }

    }

    public boolean equals(Object o){
        if (o instanceof Track) {
            Track another = (Track) o;
            if(another!=null){
                if (this.title.equals(another.title) && this.length == another.length)
                    return true;
            }

        }
        return false;
    }

    @Override
    public int compareTo(Object o) {
            if (o instanceof Track) {
                Track another = (Track) o;
                if(another!=null)
                return this.getTitle().compareTo(another.getTitle());
            }

        return -1;
    }
}
