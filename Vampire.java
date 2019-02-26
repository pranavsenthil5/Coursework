import java.util.*;
class Vampire
{
    public static void main(String []args)
    {
        Scanner s =new Scanner(System.in);
        System.out.println("Input:");
        int input= s.nextInt();
        int []factors=getFactors(input);
        outer:
        for(int i=0;i<factors.length;i++)
        {
            for(int j=0;j<factors.length;j++)
            {
                if(Integer.toString(factors[i]).length()==Integer.toString(factors[j]).length())
                    if(factors[i]*factors[j]==input )
                    {
                        if(isVampire(input,Integer.parseInt(Integer.toString(factors[i])+Integer.toString(factors[j]))))
                        {System.out.println(factors[i]+" X "+factors[j]);
                            System.exit(0);
                        }
                    }
            }
        }
    }

    public static String sort(String s)
    {       
        int x[]=new int[s.length()];
        for(int i=0;i<s.length();i++)
        {
            x[i]= Character.getNumericValue(s.charAt(i));
        }

        for(int i=0;i<x.length;i++)
        {
            for(int j=0;j<x.length-1-i;j++)
            {
                if(x[j]>x[j+1])
                {
                    int temp=x[j];
                    x[j]=x[j+1];
                    x[j+1]=temp;
                }
            }
        }
        String output="";
        for(int i=0;i<s.length();i++)
        {
            output+=x[i];
        }
        return output;
    }

    static boolean isVampire(int input,int number)
    {
        String s1=""+input;
        String s2=""+number;
        s1=sort(s1);
        s2=sort(s2);
        if(s1.equalsIgnoreCase(s2))
        {
            return true;
        }
        return false;
    }

    static int [] getFactors(int input)
    {
        int count=0;
        for(int i =1;i<=input/2;i++)
        {
            if(input%i==0)
            {
                count++;
            }
        }
        int array[]=new int[count];
        count=0;
        for(int i =1;i<=input/2;i++)
        {
            if(input%i==0)
            {
                array[count]=i;
                count++;
            }
        }
        return array;
    }
}