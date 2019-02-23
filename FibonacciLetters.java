import java.util.*;
class FibonacciLetters
{
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
            current=current%26;
            letter(current);
            int temp= current;
            current=previous+current;
            previous = temp;
        }
    }
    static void letter(int current)
    {
        System.out.print(((char)((current) + 64))+" ");
    }
}