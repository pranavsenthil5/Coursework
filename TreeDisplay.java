import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class TreeDisplay extends JFrame 
{ 
    ArrayList <Integer> xVal= new ArrayList<Integer>();
    ArrayList <Integer> yVal= new ArrayList<Integer>();
    static int w=1366;
    static int h=768;
    public TreeDisplay() {

        //Frame frame = new Frame("Tree Display");
        setTitle("Calculator");
        //frame.setSize(1000  , 1000);
        setSize(w, h);
        setLocationRelativeTo(null);
        setVisible(true);
        //frame.setLocationRelativeTo(null);
        /*frame.addWindowListener(new WindowAdapter() {
        @Override public void windowClosing(WindowEvent e) {
        System.exit(0);
        }
        });

        setVisible(true);
         */
    }

    public void paint(Graphics g) {
        setBackground(new Color(255,255,255));
        g.setColor(Color.orange);
        for(int i=0;i<xVal.size();i++)
        {
            
            g.fillOval(xVal.get(i),yVal.get(i),25,25);
        }
    }

    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        TreeCustom tree = new TreeCustom(w,100,100);
        tree.insert(50);
        tree.insert(75);
        tree.insert(25);
        tree.insert(40);
        tree.insert(45);
        tree.setCoordinates();
        TreeDisplay c = new TreeDisplay();
        
    }
    
    
}