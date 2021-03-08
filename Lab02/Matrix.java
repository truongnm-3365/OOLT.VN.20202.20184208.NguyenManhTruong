import java.util.*;
public class Matrix {
    public static void main(String[] args) {
        int m,n,i,j;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Nhập hàng m = ");
        m = keyboard.nextInt();
        System.out.print("Nhập cột n = ");
        n = keyboard.nextInt();
        System.out.println("Ma trận 1:");
        double a1[][] = new double[m][n];
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print("a1["+i+"]["+j+"] = ");
                a1[i][j] = keyboard.nextDouble();
            }
        }
        System.out.println("Hiện thị ma trận");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a1[i][j]+"\t");
            }
            System.out.print("\n");
        }

        System.out.println("Ma trận 2:");
        double a2[][] = new double[m][n];
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print("a2["+i+"]["+j+"] = ");
                a2[i][j] = keyboard.nextDouble();
            }
        }
        System.out.println("Hiện thị ma trận");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a2[i][j]+"\t");
            }
            System.out.print("\n");
        }
        keyboard.close();

    }
}
