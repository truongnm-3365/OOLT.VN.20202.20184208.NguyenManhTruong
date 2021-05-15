package hust.soict.hedspi.aims.Aims;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Disc;
import hust.soict.hedspi.aims.media.Media;

import javax.swing.*;

public class Play {
    private JList Playlist;
    private JPanel Play;
    DefaultListModel DLM = new DefaultListModel();

    public JList getPlaylist() {
        return Playlist;
    }
    String playlist;
    DigitalVideoDisc dvd;
    public Play() throws PlayerException {
        for (Media media : AimsGui.anOrder.getItemsOrdered()){
            DigitalVideoDisc dvd = (DigitalVideoDisc) media;
            playlist = "Playing DVD: " + dvd.getTitle()+"\n"+"DVD length: "+dvd.getLength();
            dvd.print();
            DLM.addElement(playlist);

        }
        Playlist.setModel(DLM);
    }


}
