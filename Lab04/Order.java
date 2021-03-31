package hust.soict.hedspi.aims.order.Order;
import hust.soict.hedspi.aims.utils.MyDate.MyDate;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc.DigitalVideoDisc;
public class Order {
    public static final int MAX_NUMBERS_ORDERED = 10;
    public static final int MAX_LIMTTED_ORDERS = 5;
    private static int nbOrders = 0;
    private MyDate dateOrdered = new MyDate();
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    public int qtyOrdered;
    public int getQtyOrdered() {
        return qtyOrdered;
    }

    public Order(){
        if(nbOrders < MAX_LIMTTED_ORDERS) {
            dateOrdered = new MyDate();
            nbOrders ++ ;
        }
        else{
            System.out.println("Không thể đặt hàng thêm");
        }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc disc)
    {
        if(qtyOrdered == MAX_NUMBERS_ORDERED)
        {
            System.out.println("Đơn hàng đã đầy");

        }else{
            itemsOrdered[qtyOrdered]=disc;
            qtyOrdered++;
            System.out.println("Đĩa " +disc.getTitle()+ " đã được thêm vào");
        }

    }
    private int i=0;
    private int c=0;
    private int j=0;
    public void removeDigitalVideoDisc(DigitalVideoDisc disc)
    {
        for(i=0;i<qtyOrdered;i++)
        {
            if(itemsOrdered[i].getTitle().equals(disc.getTitle()))
            {
                for (c = j = 0; j < qtyOrdered; j++) {
                    if (!(itemsOrdered[j].getTitle().equals(disc.getTitle()))) {
                        itemsOrdered[c] = itemsOrdered[j];
                        c++;
                    }
                }
                System.out.println("Đĩa "+disc.getTitle()+ " đã bị xóa");
                break;
            }
        }
        if(c!=0)
            qtyOrdered=c;
    }

    public float totalCost()
    {
        float totalcost=0;

        for(i=0;i<qtyOrdered;i++)
        {
            totalcost+=itemsOrdered[i].getCost();
        }

        return totalcost;
    }

    public void addDigitalVideoDisc(DigitalVideoDisc...arr){
        if(arr != null){
            if(arr.length > 0){
                int i=0;
                for(i=0;i<arr.length;i++)
                {
                    if(qtyOrdered == MAX_NUMBERS_ORDERED)
                    {
                        System.out.println("Đơn hàng đã đầy");

                    }else{
                        itemsOrdered[qtyOrdered]=arr[i];
                        qtyOrdered++;
                        System.out.println("Đĩa " +arr[i].getTitle()+ " đã được thêm vào");
                    }
                }
            }
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2)
    {
        if(qtyOrdered == MAX_NUMBERS_ORDERED)
        {
            System.out.println("Đơn hàng đã đầy");

        }else{
            itemsOrdered[qtyOrdered]=dvd1;
            qtyOrdered++;
            System.out.println("Đĩa " +dvd1.getTitle()+ " đã được thêm vào");
        }
        if(qtyOrdered == MAX_NUMBERS_ORDERED)
        {
            System.out.println("Đơn hàng đã đầy");

        }else{
            itemsOrdered[qtyOrdered]=dvd2;
            qtyOrdered++;
            System.out.println("Đĩa " +dvd2.getTitle()+ " đã được thêm vào");
        }
    }

    public void orderInfo(){
        System.out.print("Date: ");
        dateOrdered.print();
        System.out.println("Ordered Items");
        for(i=0;i<qtyOrdered;i++)
        {
            System.out.println(i+1+". DVD - "+itemsOrdered[i].getTitle()+" - "+itemsOrdered[i].getCategory()+" - "+itemsOrdered[i].getDirector()+" - "+itemsOrdered[i].getLength()+": "+itemsOrdered[i].getCost()+" $");
        }
        System.out.println("Total cost: "+ totalCost());
    }

    public DigitalVideoDisc getAluckyItem(){
        int luckyItem=(int) (Math.random()*(qtyOrdered - 0) + 0);
        itemsOrdered[luckyItem].setCost(0);
        if(luckyItem==qtyOrdered)
        {
            return null;
        }else{
            return itemsOrdered[luckyItem];
        }

    }


}
