import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class TreeDisplayMain
{
    int x[];
    int y[];
    int width[];
    int height[];
    public static void main(String[] args) 
    {
        Frame frame = new Frame("Tree Display");
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setBounds(0,0,screenSize.width, screenSize.height);
        frame.addWindowListener(new WindowAdapter() {
            @Override public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        Color Bg= new Color(255,255,255);
        frame.setBackground(Bg);
        
        //Call here
        
        frame.setVisible(true);
    }
}
