import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class TestCoordinates extends JFrame 
{ 
    int w=1000;
    int h=1000;
    public TestCoordinates() {

        //Frame frame = new Frame("Tree Display");
        setTitle("Test");
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
    }

    public static void main(String args[])
    {
        
        TestCoordinates c = new TestCoordinates();
        
    }
    
    
}