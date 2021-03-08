import java.util.Scanner;
public class InputFromKeyboard {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Tên của bạn là gì ?");
        String strName = keyboard.nextLine();
        System.out.println("Bạn bao nhiêu tuổi ?");
        String iAge = keyboard.nextLine();
        System.out.println("Bạn cao bao nhiêu (m)?");
        double dHeight = keyboard.nextDouble();
        System.out.println("Mrs/Ms. "+strName+ ", "+ iAge+ " year old. "+"Your height is " + dHeight+ ".");
        keyboard.close();
    }    
}
