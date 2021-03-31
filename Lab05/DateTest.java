package hust.soict.hedspi.test.utils.DateTest;

import static hust.soict.hedspi.aims.utils.DateUtils.DateUtils.compare;
import static hust.soict.hedspi.aims.utils.DateUtils.DateUtils.sortDate;
import static org.junit.jupiter.api.Assertions.*;
import hust.soict.hedspi.aims.utils.MyDate.MyDate;
import hust.soict.hedspi.aims.utils.DateUtils.DateUtils;
public class DateTest{
    public static void main(String []args){
        MyDate date= new MyDate();
        MyDate date1 = new MyDate("third","March","two thousand twenty one");
        date1.print();
        date1.print(1);
        testGetDay(30,date);

        testGetMonth(3,date);

        testGetYear(2021,date);

        testSetYear(-2000,date,1);

        testSetYear(2020,date,0);

        testSetMonth(21,date,1);

        testSetMonth(2,date,0);

        testSetDay(21,date,0);

        date.print();

        testAccept(date,1);

        date.print();

        MyDate[] dateItems = new MyDate[3];
        dateItems[0] = new MyDate(30,4,2021);
        dateItems[1] = new MyDate(31,3,2021);
        dateItems[2] = new MyDate(1,5,2021);
        testCompare(dateItems[0],dateItems[1],1);
        testCompare(dateItems[0],dateItems[2],-1);
        testSortDate(dateItems);
    }


    public static void testAccept(MyDate d,int opt){
        if (opt==0) {
            d.accept();
            assertTrue(d.validDate(d.date)!=null);
            System.out.println("acceptDay() chạy đúng");
        }
        else if (opt==1){
            d.accept();
            assertTrue(d.validDate(d.date)==null);

        }
    }

    public static void testGetDay(int day, MyDate d){
        assertEquals(day,d.getDay());
        System.out.println("getDay() chạy đúng");
    }
    public static void testGetMonth(int month, MyDate d){
        assertEquals(month,d.getMonth());
        System.out.println("getMonth() chạy đúng");
    }
    public static void testGetYear(int year, MyDate d){
        assertEquals(year,d.getYear());
        System.out.println("getYear() chạy đúng");
    }

    public static void testSetYear(int year, MyDate d,int opt){
        if(opt==0) {
            d.setYear(year);
            assertEquals(year, d.getYear());
            System.out.println("SetYear() chạy đúng");
        }
        else if (opt==1) {
            d.setYear(year);
            assertTrue(year!=d.getYear());

        }
    }

    public static void testSetMonth(int month, MyDate d,int opt){
        if(opt==0) {
            d.setMonth(month);
            assertEquals(month, d.getMonth());
            System.out.println("setMonth() chạy đúng");
        }
        else if (opt==1) {
            d.setMonth(month);
            assertTrue(month!=d.getMonth());

        }
    }
    public static void testSetDay(int day, MyDate d,int opt){
        if(opt==0) {
            d.setDay(day);
            assertEquals(day, d.getDay());
            System.out.println("setDay() chạy đúng");
        }
        else if (opt==1) {
            d.setDay(day);
            assertTrue(day!=d.getDay());

        }
    }
    public static void testCompare(MyDate d1, MyDate d2, int expect){
        assertEquals(compare(d1,d2),expect);
    }
    public static void testSortDate(MyDate[] dateArr){
        sortDate(dateArr);
        for (int i = 0 ; i < dateArr.length ; i++){
            for (int j = i + 1 ; j < dateArr.length ; j++ ){
                assertFalse(compare(dateArr[i],dateArr[j])>0);
            }
        }
    }
}
