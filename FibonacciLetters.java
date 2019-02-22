import java.util.*;
class FibonacciLetters
{
    public static void main(String [] args)
    {
        Scanner s = new Scanner (System.in);
        System.out.println("Input:");
        int n=s.nextInt();
        
        for(int i=0;i<n;i++)
        {
            System.out.println((char)(i+65));
        }
    }
}