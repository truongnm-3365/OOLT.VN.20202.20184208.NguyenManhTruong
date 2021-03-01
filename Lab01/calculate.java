import javax.swing.JOptionPane;
public class calculate {
    public static void main(String[] args) {
        double num1, num2;
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Please input first number: "));

        num2 = Double.parseDouble(JOptionPane.showInputDialog("Please input second number: "));

        double sum, diff, product, quotient;
        sum = num1+num2;
        diff= num1-num2;
        product=num1*num2;
        quotient=num1/num2;
        
        JOptionPane.showMessageDialog(null,"Sum: "+sum + "\ndiff: " + diff + "\nproduct: "+product + "\nquotient: "+quotient,"Kết quả",JOptionPane.INFORMATION_MESSAGE);

    }

}
