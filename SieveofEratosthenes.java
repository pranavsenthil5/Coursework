import java.util.*;
class SieveofEratosthenes
{
    /**
     * This is an algorithm to find the prime numbers in a specified range by the user 
     * by removing multiples of numbers starting from 2 onwards
     * Get input for max value
     * iterate through the array(which has the numbers from 2 to the input value) 
     * remove the multiples of input number[I make it -1] 
     * stop when the square of the number in the array is greater than the input
     * Display it
     */
    
    
    public static void main(String []args)
    {
        Scanner s =new Scanner(System.in);
        System.out.println("Input:");
        int n=s.nextInt();
        int a[]=new int[n-1];
        for(int i=0;i<a.length;i++)//Creates the array with all the numbers
        {
            a[i]=i+2;
        }

        for(int i=0;i<=n/2;i++)
        {
            if(a[i]*a[i]>n)//Breaks if the square of the array's element's value is greater than the input 
            break;
            for(int j=a[i];j<n;j+=a[i])
            {
                if(a[i]==-1)
                    break;
                try
                {
                    a[j+i]=-1;//Making the multiple as -1
                }
                catch(Exception e)
                {
                    break;
                }
            }

        }
        display(a);
        
    }
    
    static void display(int x[])//Displays a 1d array
    {

        for(int j=0;j<x.length;j++)
        {
            if(x[j]==-1)
            continue;
            System.out.print(x[j]+" ");
        }
    }
}