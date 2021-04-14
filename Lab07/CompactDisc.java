package hust.soict.hedspi.aims.media;

import java.util.ArrayList;


public class CompactDisc extends Disc implements Playable{

    public CompactDisc(String title, int length, String director) {
        super(title, length, director);
    }
    public CompactDisc(String title){
        super(title);
    }

    public CompactDisc(String title, String category, int length, String director) {
        super(title, category, length, director);
    }

    public CompactDisc(String title, String category, float cost, int id, int length, String director) {
        super(title, category, cost, id, length, director);
    }
    String artist;
    ArrayList<Track> tracks = new ArrayList<Track>();

    public CompactDisc(String title, int length, String director, String artist, ArrayList<Track> tracks) {
        super(title, length, director);
        this.artist = artist;
        this.tracks = tracks;
    }

    public CompactDisc(String title, String category, int length, String director, String artist, ArrayList<Track> tracks) {
        super(title, category, length, director);
        this.artist = artist;
        this.tracks = tracks;
    }

    public CompactDisc(String title, String category, float cost, int id, int length, String director, String artist, ArrayList<Track> tracks) {
        super(title, category, cost, id, length, director);
        this.artist = artist;
        this.tracks = tracks;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public ArrayList<Track> getTracks() {
        return tracks;
    }

    public void setTracks(ArrayList<Track> tracks) {
        this.tracks = tracks;
    }

    public void addTrack(Track track){
        if(tracks.indexOf(track) == -1){
            tracks.add(track);
            System.out.println("Đã thêm vào");
        }else{
            System.out.println("Đã tồn tại không thể thêm vào");
        }
    }

    public void removeTrack(Track track){
        if(tracks.indexOf(track) != -1){
            tracks.remove(track);
            System.out.println("Đã xóa");
        }else{
            System.out.println("Không tồn tại không thể xóa");
        }
    }

    public int getLength(){
        int sum=0;
        for(int i = 0;i<tracks.size();i++){
            sum = sum + tracks.get(i).getLength();
        }
        return sum;
    }

    @Override
    public void print() {
        for(int i = 0;i<tracks.size();i++){
            System.out.println("Playing track "+i+1+ " : " + tracks.get(i).getTitle());
            System.out.println("track length: " + tracks.get(i).getLength());
        }
    }
}