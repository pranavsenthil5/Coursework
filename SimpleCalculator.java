import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class SimpleCalculator extends JFrame
{
    private JTextField num1, num2, display;//declaring textfields
    private JButton equals;//buttons
    private double num1_val;//value in the textField1
    private double num2_val;//value in the textField2
    private String symbol[]={"+","-","*","/","^"};//array for the JComboBox
    private JComboBox operatorList;
    private String operation;
    public static void main(String[] args) {
        new SimpleCalculator();//calling the constructer
    }

    public SimpleCalculator()
    {
        setLayout(new FlowLayout());//free flowing layout

        num1=new JTextField(null,8);//number 1 
        num1.setEditable(true);//UserInput-editable
        operatorList=new JComboBox(symbol);//for the list of operators
        num2=new JTextField(null,8);//number 2
        num2.setEditable(true);//UserInput-editable
        display=new JTextField(null,16);//FinalDisplay
        display.setEditable(false);//Not Editable
        equals = new JButton("=");

        add(new Label("NUM1:"));
        add(num1);//adding it to the panel
        add(operatorList);
        add(new Label("NUM2:"));
        add(num2);
        add(equals);
        
        operatorList.addActionListener(new ActionListener() {//listening to the list of operators
                @Override
                public void actionPerformed(ActionEvent evt) {
                    operation=operatorList.getSelectedItem().toString();
                }
            });
        equals.addActionListener(new ActionListener() {//listening to the equals button-to display the output
                @Override
                public void actionPerformed(ActionEvent evt) {
                    num1_val=Double.parseDouble(num1.getText());
                    num2_val=Double.parseDouble(num2.getText());
                    switch(operation)
                    {
                        case "+":
                        display.setText(Double.toString(num1_val+num2_val));
                        break;
                        case "-":
                        display.setText(Double.toString(num1_val-num2_val));
                        break;
                        case "*":
                        display.setText(Double.toString(num1_val*num2_val));
                        break;
                        case "/":
                        display.setText(Double.toString(num1_val/num2_val));
                        break;
                        case "^":
                        display.setText(Double.toString(Math.pow(num1_val,num2_val)));
                    }
                }
            });
        add(display);
        //frame properties
        setBackground(Color.CYAN);
        setTitle("Calculator");
        setSize(600, 75);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}