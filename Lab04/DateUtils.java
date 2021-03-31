package hust.soict.hedspi.aims.utils.DateUtils;

import hust.soict.hedspi.aims.utils.MyDate.MyDate;

public class DateUtils {
    public static int compare(MyDate d1, MyDate d2){
        if(d1.getYear() > d2.getYear())
            return 1;
        else if (d1.getYear() < d2.getYear())
            return -1;
        else{
            if(d1.getMonth() > d2.getMonth())
                return 1;
            else if(d1.getMonth() < d2.getMonth())
                return -1;
            else {
                if(d1.getDay() > d2.getDay())
                    return 1;
                else if(d1.getDay() < d2.getDay())
                    return -1;
                else
                    return 0;
            }
        }
    }
    public static void sortDate(MyDate[] dateItems){
        MyDate tmp;
        if(dateItems !=null && dateItems.length >0){
            for (int i = 0 ; i < dateItems.length ; i++){
                for (int j = i+1 ; j < dateItems.length ; j++){
                    if(compare(dateItems[i],dateItems[j])>0){
                        tmp = new MyDate(dateItems[i].getDay(),dateItems[i].getMonth(),dateItems[i].getYear());
                        dateItems[i] = new MyDate(dateItems[j].getDay(),dateItems[j].getMonth(),dateItems[j].getYear());
                        dateItems[j] = new MyDate(tmp.getDay(),tmp.getMonth(),tmp.getYear());
                    }
                }
            }
        }
    }
}
