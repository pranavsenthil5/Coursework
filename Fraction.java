import java.util.*;
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
        }
        catch(Exception E)
        {
            System.out.print("Numerator cannot be less than 1");
            System.exit(0);
        }
        System.out.print("Input Denominator:");
        int b=0;
        try
        {
            b = s.nextInt();
        }
        catch(Exception E)
        {
            System.out.print("Denominator cannot be less than 1");
            System.exit(0);
        }
        
        System.out.println("");
        int c=a;
        int d=b;
        String s1="";
        while(true)
        {
            s1+=LUF((0.0+a)/b)+" ";
            if(a==1)
            {
                break;
            }
            String temp=Difference(a,b,1,LUF((0.0+a)/b));
            String tempA[]=temp.split(" ");
            a=Integer.parseInt(tempA[0]);
            b=Integer.parseInt(tempA[1]);
        }
        //System.out.println(s1);
        String output[]=s1.split(" ");
        for(int i=0;i<output.length;i++)
        {
            if(i!=output.length-1)
                System.out.print("1/"+output[i]+" + ");
            else
                System.out.println("1/"+output[i]);
        }
    }

    public static int LUF(double n2)
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

    public static String Difference(int a1,int b1,int a2,int b2)
    {
        int lcm=LCM(b1,b2);
        a1=a1*(lcm/b1);
        a2=a2*(lcm/b2);

        return Simplify(a1-a2,lcm);

    }

    public static String Simplify(int a,int b)
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

    public static int LCM(int a, int b)
    {
        for(int i=a;i<(a*b);i++)
        {
            if(i%a==0&&i%b==0)
            {
                return i;
            }
        }
        return a*b;
    }
}