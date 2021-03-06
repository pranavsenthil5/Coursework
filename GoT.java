import java.util.*;
class GoT
{
    /**
     * Get the number of turns t as input
     * get no of players as input
     * give one turn to each player (t times).
     * Whom ever the turn finishes with, Is out of the game(I make them -1)
     * 
     * Then start again,t turns for eack player. 
     * Ending with the last person is out.
     * 
     * After everytime someone's out, check if the rest have gotten equal number of  turns. 
     * if yes break
     * if no repeat the process.
     */
    public static void main(String []args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Input:\nN:");
        int n=s.nextInt();
        System.out.print("\nT:\n");
        int t=s.nextInt();

        int []array=new int[n];
        int i=1;
        int j=1;
        while(true)
        {
            if(array[i-1]!=-1)//Skip the ones which have -1, equivalent to removing the element
            {
                array[i-1]++;//Increment the value
                if(j==t)//if t turn are over...
                {

                    display(array);
                    System.out.println("_________________________");
                    array[i-1]=-1;//remove the last element

                    display(array);
                    System.out.println("_________________________");
                    if(isOver(array))//check if the all the other values are equal
                    {
                        display(array);
                        break;
                    }
                }
                j=(++j)%(t+1);//starts from 1 to t...after t it becomes 1, makes it cyclic...
                if(j==0)
                    j++;
            }
            i=(++i)%(n+1);//starts from 1 to n...after n it becomes 1, makes it cyclic...
            if(i==0)
                i++;
        }
    }

    public static boolean isOver(int [] array)//I dont understand the logic of this....
    {
        int count =0;

        for(int i=0;i<array.length;i++)
        {
            if(array[i]==-1)//count the number of -1
            {
                count ++;
            }
        }

        for(int i=0;i<array.length;i++)
        {
            if(array[i]!=1)
            {
                if(ncount(array,array[i])+count==array.length)//checks if the array has all same nos or -1; nothing else
                {
                    return true;
                }
            }
        }

        return false;
    }

    public static int ncount(int [] array,int value)//returns the count 
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

    public static void display(int [] array)
    {
        for(int i=0;i<array.length;i++)
        {
            if(array[i]!=-1)
            {
                System.out.print(((char)(i+65))+"-"+array[i]+"  ");
            }
        }
        System.out.println();
    }
}