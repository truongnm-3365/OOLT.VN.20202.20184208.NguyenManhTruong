import java.text.SimpleDateFormat;
import java.util.*;
public class MyDate {
    private String day;
    private String month;
    private String year;
    private String date;

    public void setDay(String day)
    {
        this.day=day;
    }
    public String getDay()
    {
        return day;
    }

    public void setMonth(String month)
    {
        this.month=month;
    }
    public String getMonth()
    {
        return month;
    }

    public void setYear(String year)
    {
        this.year=year;
    }
    public String getYear()
    {
        return year;
    }

    public String getDate()
    {
        date=this.day+"/"+this.month+"/"+this.year;
        System.out.println("Ngày vừa nhập (dd/mm/yyyy) : " + date);
        return date;
    }
    
    public String printCurrentDate()
    {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	    Date date = new Date();
        System.out.println("Ngày hiện tại : "+formatter.format(date));
	    return formatter.format(date);
    }

    public void accept()
    {
        Scanner keyboard = new Scanner(System.in);
        String outputMonth[]={"01","02","03","04","05","06","07","08","09","10","11","12"};
        String outputDay[]={"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15"
                            ,"16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        int check,dayMax,year,i;
        dayMax=28;
        String m,y,d;  
            System.out.print("Nhập tháng (Nhập số): ");
            do{
    
                check=0;
                m = keyboard.next();
                for(i=0;i<outputMonth.length;i++)
                {
                    if(Integer.parseInt(m)==Integer.parseInt(outputMonth[i]))
                    {
                        check=1;
                        break;
                    }
                }
                if(check==1)break;
                System.out.print("Không đúng tháng nhập lại: ");
            }while(check==0);
            setMonth(outputMonth[i]);
            System.out.print("Nhập năm(Nhập đủ 4 số): ");
            do{
                y = keyboard.next();
                if(y.matches("\\d{4}"))
                {
                    break;
                   
                }
                System.out.print("Không đúng định dạng năm nhập lại: ");
            }while(true);
            setYear(y);
            year = Integer.parseInt(y);
            if(Integer.parseInt(m)==1 || Integer.parseInt(m)==3 || Integer.parseInt(m)==5 || Integer.parseInt(m)==7 || Integer.parseInt(m)==8 || Integer.parseInt(m)==10 || Integer.parseInt(m)==12)
            {
                dayMax=31;
            }
            else if(Integer.parseInt(m)==2)
            {
                if((year%4==0 && year%100!=0) || (year%400==0))
                {
                    dayMax = 29;
                }else{
                    dayMax = 28;
                }
            }
            else if(Integer.parseInt(m)==4 || Integer.parseInt(m)==6 || Integer.parseInt(m)==9 || Integer.parseInt(m)==11)
            {
                dayMax=30;
            }
            System.out.print("Nhập ngày: ");
            do{
    
                check=0;
                d = keyboard.next();
                for(i=0;i<outputDay.length;i++)
                {
                    if(Integer.parseInt(d)==Integer.parseInt(outputDay[i]))
                    {
                        check=1;
                        break;
                    }
                }
                if(check==1 && Integer.parseInt(d)<=dayMax)
                {
                    break;
                }else check=0;
                
                System.out.print("Không đúng ngày nhập lại: ");
            }while(check==0);
            setDay(outputDay[i]);
           
    }

    public MyDate()
    {
        super();
    }
}
