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
    }
    class MenuHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            
        }
    }
}