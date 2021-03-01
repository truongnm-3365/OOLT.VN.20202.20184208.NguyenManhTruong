import javax.swing.JOptionPane;

public class firstDegreeTwoVar {
    public static void main(String[] args) {
        double a11,a12,a21,a22,b1,b2,D1,D2,D;
        a11 = Double.parseDouble(JOptionPane.showInputDialog("Input a11: "));
        a12 = Double.parseDouble(JOptionPane.showInputDialog("Input a12: "));
        b1 = Double.parseDouble(JOptionPane.showInputDialog("Input b1: "));
        a21 = Double.parseDouble(JOptionPane.showInputDialog("Input a21: "));
        a22 = Double.parseDouble(JOptionPane.showInputDialog("Input a22: "));
        b2 = Double.parseDouble(JOptionPane.showInputDialog("Input b2: "));
        D = a11*a22-a21*a12;
        D1 = b1*a22-b2*a12;
        D2 = a11*b2-a21*b1;
        if(D!=0)
        {
            JOptionPane.showMessageDialog(null,"(x1,x2) = ("+D1/D+","+D2/D+")", "Kết quả",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(D==0 && D1==0 && D2==0)
        {
            JOptionPane.showMessageDialog(null,"Phương trình có vô số nghiệm", "Kết quả",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Phương trình vô nghiệm", "Kết quả",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
