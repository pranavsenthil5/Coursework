import java.util.*;
class Combinations
/**Get input first.
 * This program outputs all poossible combinations and permutations of numbers in alphabetical order, 
 * for whom the sum of digits , is equal to the input.
 * For eample 6. 
 * OUTPUT-111111,11112,1113..and so on
 * 
 * Working:-
 * Maximum no, always has everything as one, For example 7-1111111,9-111111111
 * Iterate through a loop, starting from 1 to the maximum number.
 * Add the number to the array iff it's sum is the input number.
 * Trim the arry
 * Then sort it in alphabetical order
 * and then Print
 */
{
    public static void main(String []args)
    {
        Scanner s =new Scanner(System.in);
        System.out.println("Input Number");
        int n=s.nextInt();
        int max=(int)Math.pow(n,n);
        int[] array=new int[max];
        int j=0;

        for(int i=1;i<=MaxValue(n,1);i++)
        {
            if(sumCheck(i,n))
            {
                array[j]=i;
                j++;//If the sum is correct, the value gets stored in the 'massive' array. So i remove the 0 elements later using convert function.
            }
        }

        array=convert(array);
        array=sort(array);
        display(array);
    }

    static void display(int array[])//Displays the contents of the array
    {
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
    }

    static int MaxValue(int n,int x)//Max Value  . For example, for 6 it is 111111
    {
        String s="";
        for(int i=0;i<n;i++)
        {
            s+=""+x;
        }
        return Integer.parseInt(s);

    }

    static boolean sumCheck(int input,int n)//The input number should not contain any zero and the sum should be equal to the give no.
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

    static int[] convert(int[] x)//To get rid of the elements containing 0, For example- [11,2,0,0,0,0]
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

    static int[] sort(int[] x)//Sort them in alphabetical order
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