import java.util.*;
class Frequency
{
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Input:");
        String input = s.nextLine();
        String [] a = input.split(","); 

        int[] array= new int[a.length];
        for(int i=0;i<a.length;i++)
            array[i]=Integer.parseInt(a[i]);

        array = Sort(array);
        int count=1;
        for(int i=0;i<array.length-1;i++)
        {
            if(array[i]!=array[i+1])
                count++;
        }
        int [] freq= new int[count];
        int [] value= new int[count];
        int j=0;

        for(int i=0;i<array.length;i++)
        {
            try{
                if(array[i]!=array[i+1])
                {
                    value[j]= array[i];
                    j++;
                }
            }
            catch(Exception e)
            {
                value[j]= array[i];
                j++;
            }
        }

        for(int i=0;i<count;i++)
        {
            freq[i]=count(array,value[i]);
            System.out.println("----------------\nN-"+value[i]+" F-"+freq[i]);
        }
        j=0;
        for(int i=0;i<freq.length;i++)
        {
            for(;j<freq.length-1;j++)
            {
                if(freq[j]>freq[j+1])
                {
                    int temp=freq[j];
                    freq[j]=freq[j+1];
                    freq[j+1]=temp;

                    temp=value[j];
                    value[j]=value[j+1];
                    value[j+1]=temp;
                }
            }
            j=0;
        }

        boolean possible=false;
        if(count==1)
        {
            System.out.println("Invalid");
            System.exit(0);
        }
        for(int i=0;i<2;i++)
        {
            if(count(freq,freq[i])==freq.length-1)
            {
                possible=true;
            }
        }
        
        if(possible)
        {
            int output= (count(freq,freq[0])==1) ? value[0]: value[value.length-1]; 
            System.out.println(output);
        }
        else
            System.out.println("Invalid");
    }

    public static int count(int [] array,int value)//returns the count of a certain number in an array.
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

    public static int[] Sort(int []array)//Sorts the array
    {

        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array.length-1;j++)
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