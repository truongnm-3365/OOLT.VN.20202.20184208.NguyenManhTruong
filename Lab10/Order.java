package hust.soict.hedspi.aims.order.Order;
import hust.soict.hedspi.aims.utils.MyDate.MyDate;

import hust.soict.hedspi.aims.media.Media;

import javax.naming.LimitExceededException;
import java.util.ArrayList;
import java.util.List;
public class Order {
    public static final int MAX_NUMBERS_ORDERED = 10;
    public static final int MAX_LIMTTED_ORDERS = 5;
    private static int nbOrders = 0;

    public static int getNbOrders() {
        return nbOrders;
    }

    private MyDate dateOrdered = new MyDate();
    private List<Media> itemsOrdered = new ArrayList<Media>();

    public List<Media> getItemsOrdered() {
        return itemsOrdered;
    }

    public Order() throws LimitExceededException {
        if(nbOrders < MAX_LIMTTED_ORDERS) {
            dateOrdered = new MyDate();
            nbOrders ++ ;
        }
        else{
            throw new LimitExceededException("Không thể đặt hàng thêm");
        }
    }

    public int getQtyOrdered(){
        return itemsOrdered.size();
    }
    public void addMedia(Media disc)
    {
        if(itemsOrdered.size() == MAX_NUMBERS_ORDERED)
        {
            System.out.println("Đơn hàng đã đầy");

        }else{
            itemsOrdered.add(disc);
            System.out.println("Đĩa " +disc.getTitle()+ " đã được thêm vào");
        }

    }
    private int i=0;
    private int c=0;
    private int j=0;
    public void removeMedia(Media disc)
    {
        if(itemsOrdered.contains(disc)){
            itemsOrdered.remove(disc);
            System.out.println("Đĩa " +disc.getTitle()+ " đã được xóa");
        }else{
            System.out.println("Không tồn tại đĩa này");
        }
    }

    public void removeMediaById(int id)
    {
        for(i=0;i<itemsOrdered.size();i++)
        {
            if(itemsOrdered.get(i).getId() == id){
                System.out.println("Đĩa " +itemsOrdered.get(i).getTitle()+ " đã được xóa");
                itemsOrdered.remove(itemsOrdered.get(i));

                return;
            }
        }
        System.out.println("Không tồn tại Id này");
    }
    public float totalCost()
    {
        float totalcost=0;

        for(i=0;i<itemsOrdered.size();i++)
        {
            totalcost+=itemsOrdered.get(i).getCost();
        }

        return totalcost;
    }

    public void addMedia(Media...arr){
        if(arr != null){
            if(arr.length > 0){
                int i=0;
                for(i=0;i<arr.length;i++)
                {
                    if(itemsOrdered.size() == MAX_NUMBERS_ORDERED)
                    {
                        System.out.println("Đơn hàng đã đầy");

                    }else{
                        itemsOrdered.add(arr[i]);
                        System.out.println("Đĩa " +arr[i].getTitle()+ " đã được thêm vào");
                    }
                }
            }
        }
    }

    public void addMedias(Media dvd1, Media dvd2)
    {
        if(itemsOrdered.size() == MAX_NUMBERS_ORDERED)
        {
            System.out.println("Đơn hàng đã đầy");

        }else{
            itemsOrdered.add(dvd1);
            System.out.println("Đĩa " +dvd1.getTitle()+ " đã được thêm vào");
        }
        if(itemsOrdered.size() == MAX_NUMBERS_ORDERED)
        {
            System.out.println("Đơn hàng đã đầy");

        }else{
            itemsOrdered.add(dvd2);
            System.out.println("Đĩa " +dvd2.getTitle()+ " đã được thêm vào");
        }
    }

    public void orderInfo(){
        System.out.print("Date: ");
        dateOrdered.print();
        System.out.println("Ordered Items");
        for(i=0;i<itemsOrdered.size();i++)
        {
            System.out.println(i+1+". DVD - "+itemsOrdered.get(i).getTitle()+" - "+itemsOrdered.get(i).getCategory()+" : "+itemsOrdered.get(i).getCost()+" $");
        }
        System.out.println("Total cost: "+ totalCost());
    }

    public Media getluckyItem(){
        int luckyItem;
        do{
            luckyItem=(int) (Math.random()*(itemsOrdered.size() - 0) + 0);
            if(itemsOrdered.get(luckyItem).getCost() < 50)
                break;
        }while(true);

        itemsOrdered.get(luckyItem).setCost(0);
        if(luckyItem==itemsOrdered.size())
        {
            return null;
        }else{
            return itemsOrdered.get(luckyItem);
        }

    }


}
