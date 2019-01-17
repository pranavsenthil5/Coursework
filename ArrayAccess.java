import java.util.*;
class ArrayAccess
{
    public static void main(String []args)
    {
        Scanner s = new Scanner(System.in);
        int []array={1,5,3,4,2};
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
    }

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

    public static int[] Insertion(int []x)
    {
        int i, key, j; 
        for (i = 1; i < n; i++) 
        { 
            key = arr[i]; 
            j = i-1; 

            /* Move elements of arr[0..i-1], that are 
            greater than key, to one position ahead 
            of their current position */
            while (j >= 0 && arr[j] > key) 
            { 
                arr[j+1] = arr[j]; 
                j = j-1; 
            } 
            arr[j+1] = key; 
        } 
        return x;
    }

    public static int[] Display(int []x)
    {
        return x;
    }
}