import java.util.*;
public class ArrayProgram {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        double A[]=new double[1000];
        
        int i;
        int n;
        Random rand = new Random();
        for(i=0;i<1000;i++)
        {
            A[i]=rand.nextInt(9999);
        }
        System.out.print("Nhập só lượng phần tử trong mảng(<1000): ");
        
        do{
            n = keyboard.nextInt();
            if(n<1000)break;
            System.out.print("Nhập sai số lượng nhập lại: ");

        }while(true);
        double B[]=new double[n];
        
        for(i=0;i<n;i++)
        {
            
            System.out.print("B["+i+"]= ");
            String tmp = keyboard.next();
            if(tmp.equals("$"))
            {
                B[i]=A[i];
            }else{
                B[i]=Double.parseDouble(tmp);
            }
        }
        Arrays.sort(B);
        System.out.println("Giá trị của mảng B sau khi sắp xếp");
        double sum=0;
        for(i=0;i<B.length;i++)
        {   
            sum+=B[i];
            System.out.print(B[i]+" ");
        }
        System.out.println("\nTổng giá trị trong mảng: "+sum);
        System.out.println("Trung bình cộng: "+sum/B.length);
        keyboard.close();
        
          
    }
    
}
