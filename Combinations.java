import java.util.*;
class Combinations
{
    public static void main(String []args)
    {
        int n=8;
        int max=(int)Math.pow(n,n);
        int[] array=new int[max];
        int j=0;

        for(int i=1;i<=start(n,1);i++)
        {
            if(sumCheck(i,n))
            {
                array[j]=i;
                j++;
            }
        }

        array=convert(array);
        array=sort(array);
        display(array);
    }

    static void display(int array[])
    {
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
    }

    static int start(int n,int x)
    {
        String s="";
        for(int i=0;i<n;i++)
        {
            s+=""+x;
        }
        return Integer.parseInt(s);

    }

    static boolean sumCheck(int input,int n)
    {
        String s=""+input;
        int sum=0;

        for(int i=0;i<s.length();i++)
        {
            if(Character.getNumericValue(s.charAt(i))==0)
                return false;

            sum+=Character.getNumericValue(s.charAt(i));
        }

        if(sum==n)
            return true;

        return false;
    }

    static int[] convert(int[] x)
    {
        int count=0;
        for(int i=0;i<x.length;i++)
        {
            if(x[i]==0)
                continue;
            count++;
        }

        int []y=new int[count];
        count=0;
        for(int i=0;i<x.length;i++)
        {
            if(x[i]==0)
                continue;
            y[count]=x[i];
            count++;
        }
        
        return y;
    }

    static int[] sort(int[] x)
    {
        for(int i=0;i<x.length;i++)
        {
            for(int j=0;j<x.length-1;j++)
            {
                int c=Integer.toString(x[j]).compareTo(Integer.toString(x[j+1]));
                int temp;
                if(c>0)
                {
                    temp=x[j];
                    x[j]=x[j+1];
                    x[j+1]=temp;
                }
            }
        }
        return x;
    }
}