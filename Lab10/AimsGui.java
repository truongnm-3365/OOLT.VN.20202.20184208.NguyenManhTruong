package hust.soict.hedspi.aims.Aims;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order.Order;
import hust.soict.hedspi.aims.media.Media;

import javax.naming.LimitExceededException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import hust.soict.hedspi.aims.Aims.LuckyItem;
public class AimsGui {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JButton xóaButton;
    private JButton hiểnThịButton;
    private JButton xóaDanhSáchButton;
    private JList list1;
    private JButton nhậpButton;
    private JPanel app;
    private JPanel app1;
    private JButton openNewWindowButton;
    private JButton playButton;
    DefaultListModel DLM = new DefaultListModel();
    public static Order anOrder;

    static {
        try {
            anOrder = new Order();
        } catch (LimitExceededException e) {
            e.printStackTrace();
        }
    }

    String input1;
    String input2;
    String input3;
    String input4;
    String input5;
    String input6;
    String input7;
    String output;
    public AimsGui() {
        app.setPreferredSize(new Dimension(500,500));
        textField1.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                input1 = textField1.getText();
            }
        });
        textField2.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                input2 = textField2.getText();
            }
        });
        textField3.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                input3 = textField3.getText();
            }
        });

        textField4.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                input4 = textField4.getText();
            }
        });

        textField5.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                input5 = textField5.getText();
            }
        });
        textField6.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                input6 = textField6.getText();
            }
        });
        textField7.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                input7 = textField7.getText();
            }
        });


        nhậpButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                DigitalVideoDisc dvd1 = new DigitalVideoDisc(input1);
                dvd1.setId(Integer.parseInt(input6));
                dvd1.setCategory(input2);
                dvd1.setCost(Float.parseFloat(input4));
                dvd1.setDirector(input3);
                dvd1.setLength(Integer.parseInt(input5));
                anOrder.addMedia(dvd1);

            }
        });

        xóaButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });


        xóaDanhSáchButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });



        hiểnThịButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                DLM.removeAllElements();
                int size = anOrder.getQtyOrdered();

                String list;
                for(int i=0;i<size;i++)
                {
                    System.out.println(123);
                    list=i+1+" "+anOrder.getItemsOrdered().get(i).getTitle()+" - "+anOrder.getItemsOrdered().get(i).getCategory()+" : "+anOrder.getItemsOrdered().get(i).getCost()+" $";
                    DLM.addElement(list);
                }
                list1.setModel(DLM);
            }
        });


        openNewWindowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LuckyItem app = new LuckyItem();
                app.getLuckyItem().setPreferredSize(new Dimension(500,500));
                JFrame frame1 = new JFrame("Lucky Item");
                frame1.setContentPane(app.getLuckyItem());
                frame1.dispatchEvent(new WindowEvent(frame1,WindowEvent.WINDOW_CLOSING));
                frame1.pack();
                frame1.setLocationRelativeTo(null);
                frame1.setVisible(true);
            }
        });
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Play playList = new Play();
                    playList.getPlaylist().setPreferredSize(new Dimension(500,500));
                    JFrame frame1 = new JFrame("Playlist");
                    frame1.setContentPane(playList.getPlaylist());
                    frame1.dispatchEvent(new WindowEvent(frame1,WindowEvent.WINDOW_CLOSING));
                    frame1.pack();
                    frame1.setLocationRelativeTo(null);
                    frame1.setVisible(true);
                } catch (PlayerException playerException) {
                    playerException.printStackTrace();
                }

            }
        });
    }

    public static void main(String[] arg){
        JFrame frame = new JFrame("App");
        frame.setContentPane(new AimsGui().app);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
