import java.time.LocalDate;
import java.util.Scanner;

public class MyDate {
    private int day;
    private int month;
    private int year;
    public String date;
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day > 0 && day <= getDaysOfMonth(month, year))
            this.day = day;
        else {
            System.out.println("Lỗi không tồn tại ngày đó");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month > 0 && month <= 12)
            this.month = month;
        else {
            System.out.println("Lỗi không tồn tại tháng đó");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 0)
            this.year = year;
        else {
            System.out.println("Lỗi không tồn tại năm đó");
        }
    }

    public void print() {
        System.out.println("My Date (dd/mm/yyyy): " + day + "/" + month + "/" + year);
    }

    public void accept() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Nhập ngày (dd/mm/yyyy) : ");
        this.date = keyboard.nextLine();
        int[] Date = validDate(date);
        if (Date != null) {
            setMonth(Date[0]);
            setDay(Date[1]);
            setYear(Date[2]);
        }else{
            System.out.println("Không tồn tại ngày đó hoặc nhập sai yêu cầu");
        }
    }

    public int[] validDate(String date) {
        String[] itemsDate = date.split("/", 3);
        if (itemsDate.length < 3) {
            return null;
        }
        String day = itemsDate[0], month = itemsDate[1], year = itemsDate[2];
        int m,y,d;
        try{
            m = Integer.parseInt(month);
        }catch (NumberFormatException e){
            return null;
        }
        try{
            d = Integer.parseInt(day);
        }catch (NumberFormatException e){
            return null;
        }
        try{
            y = Integer.parseInt(year);
        }catch (NumberFormatException e){
            return null;
        }


        if (d <= getDaysOfMonth(m, y)) {
            int[] Date = {m, d, y};
            return Date;
        } else {
            return null;
        }
    }


    public int getDaysOfMonth(int month, int year)
    {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            return 31;
        else if(month==2)
        {
            if((year%4==0 && year%100!=0) || (year%400==0))
            {
                return 29;
            }else{
                return 28;
            }
        }
        else return 30;
    }

    public MyDate() {
        this.day = LocalDate.now().getDayOfMonth();
        this.month = LocalDate.now().getMonthValue();
        this.year = LocalDate.now().getYear();
    }
}
