import java.util.*;
class InfixToPostfix
{
    /**
     * Postfix is a form of writing mathematical expressions
     * 
     * The operator comes after the operands
     * For example if the expression is a+b(Infix form- where the operator is in the middle of 2 operands)
     * the postfix form would become- 'ab+'
     * 
     * This is achved by using stacks
       */
    public static void main(String []args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Input");
        String input =s.next();
        StackCustom stack = new StackCustom(input.length());
        
        String output="";
        //displayArray(stack.arr);
        //display(output);
        for(int i=0;i<input.length();i++)
        {
            char c=input.charAt(i);
            if(c=='(')//Just push
            {
                stack.push('(');
            }
            else if(c==')')//Pop until the other pair comes out
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
                if(stack.isEmpty())//If its empty just push
                {
                    stack.push(c);
                }
                else if(priority(c)>priority(stack.peek()))//Just push
                {
                    stack.push(c);
                }
                else if(priority(c)==priority(stack.peek()))//If its equal, pop and then push
                {
                    char temp=stack.pop();
                    output+=temp;
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
            //displayArray(stack.arr);
        }
        
        while(!stack.isEmpty())//Emptying out of the stack
        {
            output+=stack.pop();
        }
        
        //System.out.println(output);
        display(output);
    }
    static boolean isOperator(char c)//checks if iits an operator
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
    static int priority(char c)//returns the priority fo rthe symbols
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