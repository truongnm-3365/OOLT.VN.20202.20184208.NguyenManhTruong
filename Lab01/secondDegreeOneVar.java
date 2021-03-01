import javax.swing.JOptionPane;

public class secondDegreeOneVar {
    public static void main(String[] args) {
        double a,b,c,delta,x,x1,x2;
        a = Double.parseDouble(JOptionPane.showInputDialog("Nhập a: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Nhập b: "));
        c = Double.parseDouble(JOptionPane.showInputDialog("Nhập c: "));
        delta=b*b-4*a*c;
        x=-b/(2*a);
        x1=(-b + Math.sqrt(delta))/(2*a);
        x2=(-b - Math.sqrt(delta))/(2*a);
        if(delta==0)
        {
            JOptionPane.showMessageDialog(null,"Phương trình có nghiệm kép x="+x,"Kết quả", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(delta > 0)
        {
            JOptionPane.showMessageDialog(null,"Phương trình có 2 nghiệm phân biệt x1="+x1+" và x2="+x2,"Kết quả", JOptionPane.INFORMATION_MESSAGE);

        }
        else
        {
            JOptionPane.showMessageDialog(null,"Phương trình vô nghiệm","Kết quả", JOptionPane.INFORMATION_MESSAGE);

        }

    }
}
