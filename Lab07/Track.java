package hust.soict.hedspi.aims.media;

public class Track implements Playable {
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
    public void print() {
        System.out.println(" Playing Track: " + this.getTitle());
        System.out.println(" DVD Track: " + this.getLength());
    }
}
