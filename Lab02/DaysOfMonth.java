import java.util.Scanner;
public class DaysOfMonth {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        String input[]= {"January","Jan","Jan.","1","Febuary","Feb","Feb.","2","March","Mar.","Mar","3",
        "April","Apr","Apr.","4","May","5","June","Jun","6","July","Jul","7","August","Aug","Aug.","8",
        "September","Sept","Sep.","9","October","Oct.","Oct","10","November","Nov.","Nov","11","December","Dec.",
        "Dec","12"};
        int check,year;
        String m,y;
        while(true)
        {   
            System.out.print("Nhập tháng: ");
            do{
    
                check=0;
                m = keyboard.next();
                for(int i=0;i<input.length;i++)
                {
                    if(m.equals(input[i]))
                    {
                        check=1;
                        break;
                    }
                }
                if(check==1)break;
                System.out.print("Không đúng định dạng tháng nhập lại: ");
            }while(check==0);
            System.out.print("Nhập năm(Nhập đủ 4 số): ");
            do{
                y = keyboard.next();
                if(y.matches("\\d{4}"))
                {
                    break;
                   
                }
                System.out.print("Không đúng định dạng năm nhập lại: ");
            }while(true);
            year=Integer.parseInt(y);
            if(m.equals("Jan") || m.equals("January") || m.equals("Jan.") || m.equals("1"))
            {
                System.out.print("Có 31 ngày");
            }
            else if(m.equals("Feb") || m.equals("Febuary") || m.equals("Feb.") || m.equals("2"))
            {
                if((year%4==0 && year%100!=0) || (year%400==0))
                {
                    System.out.print("Có 29 ngày");
                }else{
                    System.out.print("Có 28 ngày");
                }
            }
            else if(m.equals("March") || m.equals("Mar") || m.equals("Mar.") || m.equals("3"))
            {
                System.out.print("Có 31 ngày");
            }
            else if(m.equals("April") || m.equals("Apr") || m.equals("Apr.") || m.equals("4"))
            {
                System.out.print("Có 30 ngày");
            }
            else if(m.equals("May") || m.equals("5"))
            {
                System.out.print("Có 31 ngày");
            }
            else if(m.equals("June") || m.equals("Jun") || m.equals("6"))
            {
                System.out.print("Có 30 ngày");
            }
            else if(m.equals("July") || m.equals("Jul") || m.equals("Jul.") || m.equals("7"))
            {
                System.out.print("Có 31 ngày");
            }
            else if(m.equals("August") || m.equals("Aug") || m.equals("Aug.") || m.equals("8"))
            {
                System.out.print("Có 31 ngày");
            }
            else if(m.equals("September") || m.equals("Sept") || m.equals("Sep.") || m.equals("9"))
            {
                System.out.print("Có 30 ngày");
            }
            else if(m.equals("October") || m.equals("Oct") || m.equals("Oct." )|| m.equals("10"))
            {
                System.out.print("Có 31 ngày");
            }
            else if(m.equals("November") || m.equals("Nov") || m.equals("Nov." )|| m.equals("11"))
            {
                System.out.print("Có 30 ngày");
            }
            else if(m.equals("December") || m.equals("Dec") || m.equals("Dec." )|| m.equals("12"))
            {
                System.out.print("Có 31 ngày");
            }
            System.out.print("\nBạn muốn tiếp tục[Y/N] ");
            String c = keyboard.next();
            if(c.equals("N"))break;
        }
        keyboard.close();
    }
}
