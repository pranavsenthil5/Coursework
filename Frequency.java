import java.util.*;
class Frequency
{
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Input:");
        int input = s.nextInt();
        int[] array = Sort(input);
        int count=0;
        for(int i=0;i<array.length-1;i++)
        {
            if(array[i]!=array[i+1])
            count++;
        }
        int [] freq= new int[count];
        int [] value= new int[count];
        int j=0;
        
        for(int i=0;i<array.length-1;i++)
        {
            if(array[i]!=array[i+1])
            {
                value[j]= array[i];
            }
        }
        for(int i=0;i<count;i++)
        {
            
        }
        
    }
    public static int count(int [] array,int value)
    {
        int count =0;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]==value)
            {
                count ++;
            }
        }
        return count;
    }
    public static int[] Sort(int input)
    {
        String s = Integer.toString(input);
        char[] c = s.toCharArray();
        int [] array = new int[c.length];
        for(int i =0;i<c.length;i++)
        {
            array[i]= c[i];
        }
        
        for(int i=0;i<c.length;i++)
        {
            for(int j=0;j<c.length-1;j++)
            {
                if(array[j]>array[j+1])
                {
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
       
        return array;
    }
}