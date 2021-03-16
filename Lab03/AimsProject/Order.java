public class Order {
    public static final int MAX_NUMBERS_ORDERED = 10;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    public int qtyOrdered;
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
}
