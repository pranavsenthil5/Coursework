import java.util.*;
class ArrayAccess
{
    /**
     * Has all sorts and searches(They are listed below with their respective algorithms)
     */
    public static void main(String []args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Input the no. of elements in the array");

        int []array=new int[s.nextInt()];

        for(int i=0;i<array.length;i++)
        {
            System.out.println("Enter value of element "+i+":");
            array[i]=s.nextInt();
        }
        System.out.println("Input 1 or 2:\n1-Sort\n2-Search");
        int choice1 =s.nextInt();
        int choice2;

        if(choice1==1)
        {
            System.out.println("Input 1,2 or 3:\n1-Bubble Sort\n2-Selection Sort\n3-Insertion Sort");
            choice2=s.nextInt();
            switch(choice2)
            {
                case 1:
                array=Bubble(array);
                Display(array);
                break;
                case 2:
                array=Selection(array);
                Display(array);
                break;
                case 3:
                array=Insertion(array);
                Display(array);
                break;
            }
        }
        else if(choice1==2)
        {
            System.out.println("Input 1,2 or 3:\n1-Linear Search\n2-Binary Search");
            choice2=s.nextInt();
            boolean present=false;
            System.out.println("Input Search Element:");
            int key=s.nextInt();
            switch(choice2)
            {
                case 1:
                present=Linear(array,key);
                Display(array);
                break;
                case 2:
                present=Binary(array,key);
                Display(array);
                break;
            }
            if(present)
            {
                System.out.println("Found");
            }
            else
            {
                System.out.println("Not Found");
            }
        }
        else
        {
            System.out.println("Wrong Input");
        }
    }

    /** 
     * Iterate through the array 
     * swap numbers if the array's current elment is greater than the next elemnt
     */
    public static int[] Bubble(int []x)
    {
        for(int i=0;i<x.length;i++)
        {
            for(int j=0;j<x.length-1-i;j++)
            {
                if(x[j]>x[j+1])
                {
                    int temp=x[j];
                    x[j]=x[j+1];
                    x[j+1]=temp;
                }
            }
        }
        return x;
    }

    /**
     * Iterate through the array and swap the lowest number with the first position
     * Find the next smallest element and swap it with the 2nd
     * Keep swaping until the last element has been reached
     */
    public static int[] Selection(int []x)
    {
        for (int i = 0; i < x.length-1; i++) 
        { 
            int l = i; 
            for (int j = i+1; j < x.length; j++) 
            {
                if (x[j] < x[l]) 
                {
                    l = j;
                }
            }
            int temp = x[l]; 
            x[l] = x[i]; 
            x[i] = temp; 
        } 
        return x;
    }

    /**
     * Iterate through the array 
     * check if the value is less than that of the starting element and insert it in that position.
    */
    public static int[] Insertion(int []x)
    {
        int i, key, j; 
        for (i = 1; i < x.length; i++) 
        { 
            key = x[i]; 
            j = i-1; 

            while (j >= 0 && x[j] > key) 
            { 
                x[j+1] = x[j]; 
                j = j-1; 
            } 
            x[j+1] = key; 
        } 
        return x;
    }

    /**
     * Iterate through the array in loop and search for the element
     */
    public static boolean Linear(int []x,int y)
    {
        for(int i=0;i<x.length;i++)
        {
            if(x[i]==y)
                return true;
        }
        return false;
    }
    
     /**
     * Sort the array
     * Find the middle element
     * If the value which is being searched for is greater than the middle one, 
     * the lower bound's value becomes the middle elements position +1
     * if no, upper bounds value becomes 1 less than the middle elements value
     * if the middle element's vlueis equal to the value,return true
     * if the lower bound has the same value or greater than the upper bound exit the loop
     * return false
     */
    public static boolean Binary(int []x,int y)
    {
        x=Bubble(x);

        int l = 0;
        int u = x.length  - 1;
        int m = (l + u)/2;

        while( l <= u )
        {
            if ( x[m] < y )
                l = m + 1;
            else if ( x[m] == y )
            {
                return true;
            }
            else
            {
                u = m - 1;
            }
            m = (l + u)/2;
        }
        return false;
    }

    public static void Display(int []x)
    {
        for(int i=0;i<x.length;i++)
        {
            System.out.print(x[i]+" ");
        }
    }
}