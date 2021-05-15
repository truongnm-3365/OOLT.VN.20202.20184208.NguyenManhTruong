package hust.soict.hedspi.aims.Aims;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class LuckyItem {
    private JButton quayButton;
    private JPanel LuckyItem;
    private JList list1;
    DefaultListModel DLM = new DefaultListModel();

    public JPanel getLuckyItem() {
        return LuckyItem;
    }
    public LuckyItem() {
        quayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double xacXuat = Math.random();
                if (AimsGui.anOrder.totalCost()>100 && xacXuat > 0.5){
                    String luckyItem;
                    luckyItem=AimsGui.anOrder.getluckyItem().getTitle()+" - "+AimsGui.anOrder.getluckyItem().getCategory()+" : "+AimsGui.anOrder.getluckyItem().getCost()+" $";
                    DLM.addElement(luckyItem);
                    list1.setModel(DLM);

                }
            }
        });
    }

}
