import java.util.*;
class FibonacciLetters
{
    /**
     * Fibonacci Letters- Similar to Fibonacci Series but use letters and cycle through the alphabets
     * 
     * To find the fibonacci series take 1 and 1 first.
     * Add the numbers. The resultant becomes the consecutive number(2).
     * Take the second and the relutant and continue the process
     * 
     * To cycle just through the alphabets, do %26 on the Fibonacci Numbers
     * Convert the number to character by explicit conversion
       */
    public static void main(String [] args)
    {
        Scanner s = new Scanner (System.in);
        System.out.println("Input:");
        int n=s.nextInt();
        int current,previous;
        previous=1;
        current=1;
        letter(previous);
        for(int i=0;i<n;i++)
        {
            if(current!=26)
            current=current%26;//Makes it cylclic
            letter(current);
            int temp= current;
            current=previous+current;//Adds the previous number of the series to the current one
            previous = temp;
        }
    }
    static void letter(int current)//When given an integer, converts it to its respective letter an prints it
    {
        System.out.print(((char)((current) + 64))+" ");
    }
}