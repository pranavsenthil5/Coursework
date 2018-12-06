import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class TreeDisplay extends JFrame 
{ 
    int data[]={50,75,25,60,20,22,1};
    int x[]={100,300,500};   
    int y[]={100,300,500};
    int width[]={50,50,50};
    int height[]={50,50,50};
    int w=1000;
    int h=1000;
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
        for(int i=0;i<x.length;i++)
        {
            
            g.fillOval(x[i],y[i],width[i],height[i]);
        }
    }

    public  void main(String argv[])
    {
        Scanner s =new Scanner(System.in);
        TreeCustom tree = new TreeCustom();
        TreeDisplay c = new TreeDisplay();
        
    }
    
    
}