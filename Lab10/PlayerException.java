package hust.soict.hedspi.aims.Aims;
import javax.swing.JOptionPane;
import hust.soict.hedspi.aims.Aims.AimsGui;
public class PlayerException extends Exception {
    private String error;
    public PlayerException(String string){
        error = string;
    }

    @Override
    public String toString() {
        JOptionPane.showMessageDialog(null,"Error",error,JOptionPane.ERROR_MESSAGE);
        return error;
    }
}
