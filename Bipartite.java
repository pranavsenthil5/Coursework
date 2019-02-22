import java.util.*;
class Bipartite
{
    public static void main(String [] args)
    {
        Scanner s = new Scanner (System.in);
        System.out.println("Input:");
        double input = s.nextDouble();
        double output = input;
        while (true)
        {
            if(isBipartite(output))
            {
                display(output);
                break;
            }
            else
            {
                output+=input;
            }
        }
    }
    
    static void display(double s)
    {
        String n=""+s;
        n=n.substring(0,n.length()-2);
        char a[]= n.toCharArray();
        int count = 1;
        
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]!=a[i+1])
            {
                System.out.println(count(a,Character.getNumericValue(a[i]))+" "+a[i]+" "+count(a,Character.getNumericValue(a[i+1]))+" "+a[i+1]);
                break;
            }
        }
    }
    
    public static int count(char [] array,int value)//returns the count of a certain number in an array.
    {
        int count =0;
        for(int i=0;i<array.length;i++)
        {
            if(Character.getNumericValue(array[i])==value)
            {
                count ++;
            }
        }
        return count;
    }

    static boolean isBipartite(double s)
    {
        String n=""+s;
        n=n.substring(0,n.length()-2);
        char a[]= n.toCharArray();
        int count = 1;
        
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]!=a[i+1])
            count++;
        }
        
        if(count==2)
        return true;
        return false;
    }
}