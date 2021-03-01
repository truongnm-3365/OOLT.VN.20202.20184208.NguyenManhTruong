import javax.swing.JOptionPane;
public class firstDegreeOneVar {
    public static void main(String[] args) {
        
        double a,b,x;
        a = Double.parseDouble(JOptionPane.showInputDialog("Please input a: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Please input b: "));
        x=-b/a;
        JOptionPane.showMessageDialog(null,"x="+x,"Ngiệm của phương trình ax+b=0",JOptionPane.INFORMATION_MESSAGE);
    }
}
