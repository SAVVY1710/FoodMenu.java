/*
Sai Avula
3.29.24
FoodMenu.java
Create a food menu
*/

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class FoodMenu extends JFrame  {

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
    public static void main(String[] args){
        // create an object of the class
        FoodMenu jmbe2 = new FoodMenu();
    }
}

class Practice2 extends JPanel{
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
        runIt2();
        check = "";
    }
    public void paintComponent(Graphics g){
        super.paintComponent (g);
    }
    public void runIt2()
    {
        
    }
    class MenuHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            
        }
    }
}