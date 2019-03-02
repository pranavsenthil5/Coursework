import java.util.*;
class InfixConversion
{
    public static void main(String []args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Input");
        String input =s.next();
        StackCustom stack = new StackCustom(input.length());
        
        String output="";
        displayArray(stack.arr);
        display(output);
        for(int i=0;i<input.length();i++)
        {
            char c=input.charAt(i);
            if(c=='(')
            {
                stack.push('(');
            }
            else if(c==')')
            {

                while(true)
                {
                    char temp=stack.pop();
                    if(temp=='E')
                    {
                        System.out.println("Error");
                        System.exit(0);
                    }
                    
                    if(temp=='(')
                    {
                        break;
                    }
                    
                    output+=temp;
                }

            }
            else if(isOperator(c))
            {
                if(stack.isEmpty())
                {
                    stack.push(c);
                }
                else if(priority(c)>priority(stack.peek()))
                {
                    stack.push(c);
                }
                else
                {
                    output+=c;
                }
                
            }
            else
            {
                output+=c;
            }
            displayArray(stack.arr);
        }
        
        while(!stack.isEmpty())
        {
            output+=stack.pop();
        }
        
        System.out.println(output);
        display(output);
    }
    static boolean isOperator(char c)
    {
        switch (c)
        {
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
            return true;
        }
        return false;
    }
    static int priority(char c)
    {
        switch (c)
        {
            case '^':
            return 3;
            case '*':
            return 2;
            case '/':
            return 2;
            case '+':
            return 1;
            case '-':
            return 1;
            case '(':
            return 0;
        }
        return -1;
    }
    static void displayArray(char c[])
    {
        System.out.println("\nStack:");
        for(int i=0;i<c.length;i++)
        {
            System.out.print(c[i]+" ");
        }
        
        System.out.println("\n_________");
    }
    static void display(String s)
    {
        System.out.println("\nOutput String:\n"+s);
        
        System.out.println("\n_________");
    }
}