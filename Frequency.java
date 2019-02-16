import java.util.*;
class Frequency
{
    public static void main(String [] args)
    {
        //Input 1,4,5,1,4
        Scanner s = new Scanner(System.in);
        System.out.println("Input:");
        String input = s.nextLine();
        String [] a = input.split(","); 

        int[] array= new int[a.length];
        for(int i=0;i<a.length;i++)
            array[i]=Integer.parseInt(a[i]);

        array = Sort(array);//Sort the array, 1,1,4,4,5
        int count=1;
        for(int i=0;i<array.length-1;i++)//Gets the no. of unique nos. by finding the number of consecutive elements that are different.
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
                if(array[i]!=array[i+1])//To add the nos. to the array, exept the last one
                {
                    value[j]= array[i];
                    j++;
                }
            }
            catch(Exception e)//To get the value of the last no.
            {
                value[j]= array[i];
                j++;
            }
        }

        for(int i=0;i<count;i++)//Prints The no. and the frequency
        {
            freq[i]=count(array,value[i]);
            System.out.println("----------------\nN-"+value[i]+" F-"+freq[i]);
        }
        j=0;
        for(int i=0;i<freq.length;i++)//soting it based on frequency
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
        if(count==1)//This means, there is only one no. with a certain frequency
        {
            System.out.println("Invalid");
            System.exit(0);
        }
        
        for(int i=0;i<2;i++)
        {
            if(count(freq,freq[i])==freq.length-1)//This is to make sure that there are only 2 different values the frequency number could fold;
            //(3,3,3,3,5) or(1,2,2)- There should be only 1 frequency that has a unique value. This loop takes into consideration both
            //the examples. It makes sure that there is a frequncy of a number that has the whole array, except one.
            {
                possible=true;
            }
        }
        
        if(possible)
        {
            //If the count of the freq of the first element is 1, then that is the output, otherwise the last element is.
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