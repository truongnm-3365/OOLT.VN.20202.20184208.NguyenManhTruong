package hust.soict.hedspi.aims.utils.MyDate;

import java.lang.reflect.Array;
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

//    public void print() {
//        System.out.println(day + "/" + month + "/" + year);
//    }

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

    public void print(){
        String m;
        if(this.month == 1)
            m = "January";
        else if(this.month == 2)
            m = "February";
        else if(this.month == 3)
            m = "March";
        else if(this.month == 4)
            m = "April";
        else if(this.month == 5)
            m = "May";
        else if(this.month == 6)
            m = "June";
        else if(this.month == 7)
            m = "July";
        else if(this.month == 8)
            m = "August";
        else if(this.month == 9)
            m = "September";
        else if(this.month == 10)
            m = "October";
        else if(this.month == 11)
            m = "November";
        else
            m = "December";
        String d;
        if(this.day == 1 || this.day == 21)
            d = this.day+"st";
        else if(this.day == 2 || this.day == 22)
            d = this.day+"nd";
        else if(this.day == 3 || this.day == 23)
            d = this.day+"rd";
        else
            d = this.day+"th";
        System.out.println("My Date : "+m+" "+d+" "+this.year);
    }

    public void print(int option){
        switch (option){
            case 1://  yyyy-MM-dd
                if(this.month>9 && this.day >9)
                    System.out.println("My Date: "+this.year+"-"+this.month+"-"+this.day);
                else if(this.month<9 && this.day >9)
                    System.out.println("My Date: "+this.year+"-"+"0"+this.month+"-"+this.day);
                else if(this.month>9 && this.day <9)
                    System.out.println("My Date: "+this.year+"-"+this.month+"-"+"0"+this.day);
                else
                    System.out.println("My Date: "+this.year+"-"+"0"+this.month+"-"+"0"+this.day);
                break;
            case 2://  d/M/yyyy
                System.out.println("My Date: "+day+"/"+month+"/"+year);
                break;
            case 3://  mm-dd-yyyy
                if(this.month>9 && this.day >9)
                    System.out.println("My Date: "+this.month+"-"+this.day+"-"+this.year);
                else if(this.month<9 && this.day >9)
                    System.out.println("My Date: "+"0"+this.month+"-"+this.day+"-"+this.year);
                else if(this.month>9 && this.day <9)
                    System.out.println("My Date: "+this.month+"-"+"0"+this.day+"-"+this.year);
                else
                    System.out.println("My Date: "+"0"+this.month+"-"+"0"+this.day+"-"+this.year);
                break;
            default:
                print();
        }
    }

    public int linearSearch(String[] arr1, String[] arr2,String key){
        for(int i=0;i<arr1.length;i++){
            if(arr1[i].equals(key)){
                return i;
            }
        }
        for(int i=0;i<arr2.length;i++){
            if(arr2[i].equals(key)){
                return i*10;
            }
        }

        return 0;
    }

    public int convertString(String num){
        if(num.equals("hundred"))
            return 100;
        if(num.equals("thousand"))
            return 1000;
        return 1;
    }
    public int yearConvert(String year){
        String y = year.toLowerCase();
        String[] yItems = y.split(" ");
        String[] numString1 = {"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty"};
        String[] numString2 = {"zero","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        if(yItems.length >= 5)
        {
            return linearSearch(numString1,numString2,yItems[0])*convertString(yItems[1])+linearSearch(numString1,numString2,yItems[2])*convertString(yItems[3])+linearSearch(numString1,numString2,yItems[4])+linearSearch(numString1,numString2,yItems[5]);
        }
        if(yItems.length ==4 && yItems[1]=="thousand" && yItems[3]=="hundred")
        {
            return linearSearch(numString1,numString2,yItems[0])*convertString(yItems[1])+linearSearch(numString1,numString2,yItems[2])*convertString(yItems[3]);
        }
        if(yItems.length == 3 || (yItems.length ==4 && yItems[3]!="hundred"))
        {
            return linearSearch(numString1,numString2,yItems[0])*convertString(yItems[1])+linearSearch(numString1,numString2,yItems[2])+linearSearch(numString1,numString2,yItems[3]);
        }
        if(yItems.length < 3)
        {
            return linearSearch(numString1,numString2,yItems[0])+linearSearch(numString1,numString2,yItems[1]);
        }
        return -1;

    }

    public int monthConvert(String month){
        String [] monthString ={"zero","January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return linearSearch(monthString,monthString,month);
    }

    public int dayConvert(String day){
        String[] dayString = {"zero","first","second","third","fourth","fifth","sixth","seventh","eighth","ninth","tenth","eleventh","twelfth","thirteenth","fourteenth",
                "fifteen","sixteenth","seventeenth","eighteenth","nineteenth","twentieth","twenty-first","twenty-second","twenty-third","twenty-fourth","twenty-fifth","twenty-sixth",
                "twenty-seventh","twenty-eighth","twenty-ninth","thirtieth","thirty-first"};
        return linearSearch(dayString,dayString,day);
    }


    public MyDate() {
        this.day = LocalDate.now().getDayOfMonth();
        this.month = LocalDate.now().getMonthValue();
        this.year = LocalDate.now().getYear();
    }
    public MyDate(int day, int month, int year){
        if((day >=1 && day <=31) || (month >=1 && month <= 12) || (year >= 0)){
            this.day = day;
            this.month = month;
            this.year = year;
        }
        else{
            System.out.println("Lỗi sai ngày");
        }
    }

    public MyDate(String day, String month, String year){
        int d = dayConvert(day);
        int m = monthConvert(month);
        int y = yearConvert(year);
        if((d >=1 && d <=31) || (m >=1 && m <= 12) || (y >= 0)){
            this.day = d;
            this.month = m;
            this.year = y;
        }
        else{
            System.out.println("Lỗi sai ngày");
        }
    }
}