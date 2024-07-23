/*
Sai Avula
7/22.24
FoodMenu.java
Create a food menu
*/

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class FoodMenu extends JFrame 
 {

    public FoodMenu(){
        super("FoodMenu.java");
        setSize( 600, 600);

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        setLayout(new BorderLayout());
        setResizable(true);
        Practice2 pc = new Practice2();
        setContentPane( pc );
        setVisible(true);
    }
    public static void main(String[] args)
    {
        // create an object of the class
        FoodMenu jmbe2 = new FoodMenu();
    }
}

class Practice2 extends JPanel
{
    JMenuBar mb, mb2, mb3, mb4; // menubar
    JMenu x, x1, x2, x3; // JMenu
    JMenuItem m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12, m13, m14, m15, m16; // Menu items
    JFrame f; 		// create a frame
    JPanel pa;
    int order;
    int maindish, side, drink, dessert, xint, yint, finnum;
    boolean maindishb, sideb, drinkb, dessertb, bool;
    String check;
    JTextArea t1, t2, t3, t4, ans;
    public Practice2(){
        xint = 50;
        yint = 50;
        check = "";
        runIt2();
    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent (g);
    }
    public void runIt2()
    {
        t1 = new JTextArea("");
        Font f = new Font("Arial", Font.BOLD, 40);
        t1.setFont(f);

        t2 = new JTextArea("");
        t2.setFont(f);
        t3 = new JTextArea("");
        t3.setFont(f);
        t4 = new JTextArea("");
        t4.setFont(f);

        ans = new JTextArea();
        ans.setFont(f);
        pa = new JPanel();
        add(pa);

        mb = new JMenuBar();
        mb2 = new JMenuBar();
        mb3 = new JMenuBar();
        mb4 = new JMenuBar();
        MenuHandler mh = new MenuHandler();
        // create a menu

        x = new JMenu("Burrito");
        x1 = new JMenu("Chips");
        x2 = new JMenu("Fanta");
        x3 = new JMenu("Ice Cream");

        // create menuitems
        m1 = new JMenuItem("Burrito");
        m2 = new JMenuItem("Tortas");
        m3 = new JMenuItem("Fajitas");
        m4 = new JMenuItem("Tacos");

        m5 = new JMenuItem("Chips");
        m6 = new JMenuItem("Fries");
        m7 = new JMenuItem("Salad");
        m8 = new JMenuItem("Rice");

        m9 = new JMenuItem("Fanta");
        m10 = new JMenuItem("Horchada");
        m11 = new JMenuItem("Lemonade");
        m12 = new JMenuItem("Fiji Water");

        m13 = new JMenuItem("Ice cream");
        m14 = new JMenuItem("Churro");
        m15 = new JMenuItem("Flan");
        m16 = new JMenuItem("Concha");
        // add ActionListener to menuItems
        m1.addActionListener(mh);
        m2.addActionListener(mh);
        m3.addActionListener(mh);
        m4.addActionListener(mh);
        m5.addActionListener(mh);
        m6.addActionListener(mh);
        m7.addActionListener(mh);
        m8.addActionListener(mh);
        m9.addActionListener(mh);
        m10.addActionListener(mh);
        m11.addActionListener(mh);
        m12.addActionListener(mh);
        m13.addActionListener(mh);
        m14.addActionListener(mh);
        m15.addActionListener(mh);
        m16.addActionListener(mh);


        x.add(m1);
        x.add(m2);
        x.add(m3);
        x.add(m4);
        mb.add(x);

        x1.add(m5);
        x1.add(m6);
        x1.add(m7);
        x1.add(m8);
        mb2.add(x1);

        x2.add(m9);
        x2.add(m10);
        x2.add(m11);
        x2.add(m12);
        mb3.add(x2);

        x3.add(m13);
        x3.add(m14);
        x3.add(m15);
        x3.add(m16);
        mb4.add(x3);

        pa.setLayout(new BorderLayout());
        JPanel east = new JPanel(new GridLayout(8,1));
        JPanel west = new JPanel(new GridLayout(8,1));
        JPanel center = new JPanel(new GridLayout(6,1));
        center.setBackground(Color.white);
        pa.add(east, BorderLayout.EAST);
        pa.add(west, BorderLayout.WEST);
        pa.add(center, BorderLayout.CENTER);
        east.setPreferredSize(new Dimension(100, 600));
        west.setPreferredSize(new Dimension(100, 600));
        center.setPreferredSize(new Dimension(400, 600));
        JTextArea main = new JTextArea("Main Dish");
        main.setEditable(false);
        JTextArea snack = new JTextArea("Side");
        snack.setPreferredSize(new Dimension(70, 17 ));
        snack.setEditable(false);
        JPanel [] pan = new JPanel[8];
        for(int i = 0; i<8; i++)
        {
            pan[i] = new JPanel();
        }
        west.add(pan[0]);
        west.add(pan[1]);
        west.add(pan[2]);
        west.add(pan[3]);
        west.add(pan[4]);
        west.add(pan[5]);
        west.add(pan[6]);
        west.add(pan[7]);

        pan[1].add(main);
        pan[1].add(mb);

        pan[4].add(snack);
        pan[4].add(mb2);

        JTextArea drink = new JTextArea("Drinks     ");
        main.setEditable(false);
        JTextArea dessert = new JTextArea("Dessert    " );

        JPanel [] pan2 = new JPanel[8];
        for(int i = 0; i<8; i++)
        {
            pan2[i] = new JPanel();
        }

        east.add(pan2[0]);
        east.add(pan2[1]);
        east.add(pan2[2]);
        east.add(pan2[3]);
        east.add(pan2[4]);
        east.add(pan2[5]);
        east.add(pan2[6]);
        east.add(pan2[7]);

        
        pan2[1].add(drink);
        pan2[1].add(mb3);

        pan2[4].add(dessert);
        pan2[4].add(mb4);
        JPanel lo = new JPanel();
        center.add(t1);
        center.add(t2);
        center.add(t3);
        center.add(t4);
        lo.setBackground(Color.white);
        center.add(lo);
        center.add(ans);
    }
    class MenuHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            System.out.println(command);
            check = command;
            double num = 0;
            bool = false;
            if((command.equals("Burrito") || command.equals("Tortas") || command.equals("Fajitas")|| command.equals("Tacos")) && order < 5)
            {
                maindish = order;
                maindishb = true;
                bool = true;
                num = 12.99;
            }
            else if((command.equals("Chips") || command.equals("Fries") || command.equals("Salad")|| command.equals("Rice")) && order < 5)
            {
                side = order;
                sideb = true;
                bool = true;
                num = 4.50;
            }
            else if((command.equals("Fanta") || command.equals("Horchada") || command.equals("Lemonade")|| command.equals("Fiji Water")) && order < 5)
            {
                drink = order;
                drinkb = true;
                bool = true;
                num = 2.50;
            }
            else if((command.equals("Ice cream") || command.equals("Churro") || command.equals("Flan")|| command.equals("Concha")) && order < 5)
            {
                dessert = order;
                dessertb = true;
                bool = true;
                num = 5.50;
            }
            if(bool)
            {
                order++;
            }
            if(order == 1)
            {
                t1.setText(command + ":    $" + num);
            }
            if(order == 2)
            {
                t2.setText(command + ":    $" + num);
            }
            if(order == 3)
            {
                t3.setText(command + ":    $" + num);
            }
            if(order == 4)
            {
                t4.setText(command + ":    $" + num);
            }
            finnum += num;
            ans.setText("Total    $" + finnum*1.0925);
            repaint();

        
        }
    }
}