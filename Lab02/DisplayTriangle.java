import java.util.Scanner;
public class DisplayTriangle {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Nhập n = ");
        int n = keyboard.nextInt();
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-(i+1);j++)
            {
                System.out.print(" ");
            }
            for(j=0;j<i*2+1;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
