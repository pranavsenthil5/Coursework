import java.util.*;
class Bipartite
/**
 * Bipartite- Is a number that only has 2 unique numbers
 * Get input;
 * keep adding the input no. to itself
 * Check if the number is Bipartite
 * If yes display the 2 nos and their count before each.
 */
{
    public static void main(String [] args)
    {
        Scanner s = new Scanner (System.in);
        System.out.println("Input:");
        double input = s.nextDouble();
        double output = input;
        while (true)
        {
            if(isBipartite(output))//If the number is bipartite - display it
            {
                display(output);
                break;
            }
            else
            {
                output+=input;//Adding the number to the initial input(Multiples of the initial input)
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

    static boolean isBipartite(double s)//Checks if a number is bipartite (if the number has only t unique digits)
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