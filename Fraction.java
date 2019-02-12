import java.util.*;
/**
 * To represent A fraction in the form of sum of unit fractions
 * For example 5/6, can be return as 1/2 + 1/3
 * To achieve this, i take a highest unit fraction that is less than the unput fraction
 * That becomes my first denominator.
 * Next, what i do is, i find the difference and store it. I find the highest UF of this number and add it to the list of denominators
 * I repeat until the difference is 0.
 * I print all the fractions using 1 as the numerator and the values in the list(Stored as a String)as the denominators
 */
class Fraction
{
    public static void main(String []args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Input Numerator:");
        int a=0;
        boolean error=false;
        try
        {
            a = s.nextInt();
            if(a<1)
            {
                System.out.print("Numerator cannot be less than 1 - Invalid");
                System.exit(0);
            }
        }
        catch(Exception E)
        {
            System.out.print("Numerator is not Valid");
            System.exit(0);
        }
        System.out.print("Input Denominator:");
        int b=0;
        try
        {
            b = s.nextInt();
            if(b<1)
            {
                System.out.print("Denominator cannot be less than 1 - Invalid");
                System.exit(0);
            }
        }
        catch(Exception E)
        {
            System.out.print("Denominator is not Valid");
            System.exit(0);
        }

        System.out.println("");
        int c=a;
        int d=b;
        String s1="";//Stores the denominators of the unitary fractions
        while(true)
        {
            s1+=HUF((0.0+a)/b)+" ";//Stores the denominator
            if(a==1)
            {
                break;
            }
            String temp=Difference(a,b,1,HUF((0.0+a)/b));//Get the difference of The current max unitary fraction and the actual fraction. 
            String tempA[]=temp.split(" ");
            a=Integer.parseInt(tempA[0]);//This becomes the new numerator and denominator
            b=Integer.parseInt(tempA[1]);
        }
        
        String output[]=s1.split(" ");//Has all the denominators of all unitary fractions
        for(int i=0;i<output.length;i++)
        {
            if(i!=output.length-1)
                System.out.print("1/"+output[i]+" + ");//Print it in fraction format
            else
                System.out.println("1/"+output[i]);
        }
    }

    public static int HUF(double n2)//Returns the Highest unitary factor less than the number
    {
        for(int i=1;true;i++)
        {
            double n1=(1.0)/i;
            if(n1<=n2)
            {
                return i;
            }
        }
    }

    public static String Difference(int a1,int b1,int a2,int b2)//Return the difference between 2 fractions
    {
        int lcm=LCM(b1,b2);//To find Difference, LCM is required.
        a1=a1*(lcm/b1);
        a2=a2*(lcm/b2);

        return Simplify(a1-a2,lcm);//Return the simplified Fraction

    }

    public static String Simplify(int a,int b)//Simplifies the fraction
    {
        for(int i=b;i>1;i--)
        {
            if(a%i==0&&b%i==0)
            {
                a=a/i;
                b=b/i;
            }
        }
        return a+" "+b;
    }

    public static int LCM(int a, int b)//Returns the LCM of 2 numbers
    {
        for(int i=a;i<=(a*b);i++)
        {
            if(i%a==0&&i%b==0)
            {
                return i;
            }
        }
        return a*b;
    }
}