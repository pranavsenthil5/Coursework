import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TreeDisplay extends JFrame 
{ 

    int x[]={100,300,500};   
     int y[]={100,300,500};
     int width[]={50,50,50};
     int height[]={50,50,50};

    public TreeDisplay() {
        
        Frame frame = new Frame("Tree Display");
        frame.setSize(1000  , 1000);
        frame.setLocationRelativeTo(null);
        frame.addWindowListener(new WindowAdapter() {
            @Override public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
        setVisible(true);
    }

    public void paint(Graphics g) {
        setBackground(new Color(255,255,255));
        g.setColor(Color.yellow);
        for(int i=0;i<x.length;i++)
        {
            g.fillOval(x[i],y[i],width[i],height[i]);
        }

    }
    
    public static void main(String argv[]) {
        TreeDisplay c = new TreeDisplay();
    }
}