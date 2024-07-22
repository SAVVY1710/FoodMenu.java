/*
Sai Avula
3.29.24
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
    }
    class MenuHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            
        }
    }
}