import java.util.*;
class SieveofEratosthenes
{
    /**
     * Get input
     * iterate through the array and remove the multiples of that number[I make it -1] 
     * stop when the square of the number in the array is greater than the input
     * Display it
     */
    
    
    public static void main(String []args)
    {
        Scanner s =new Scanner(System.in);
        System.out.println("Input:");
        int n=s.nextInt();
        int a[]=new int[n-1];
        for(int i=0;i<a.length;i++)
        {
            a[i]=i+2;
        }

        for(int i=0;i<=n/2;i++)
        {
            if(a[i]*a[i]>n)
            break;
            for(int j=a[i];j<n;j+=a[i])
            {
                if(a[i]==-1)
                    break;
                try
                {
                    a[j+i]=-1;
                }
                catch(Exception e)
                {
                    break;
                }
            }

        }
        display(a);
        
    }
    
    static void display(int x[])
    {

        for(int j=0;j<x.length;j++)
        {
            if(x[j]==-1)
            continue;
            System.out.print(x[j]+" ");
        }
    }
}