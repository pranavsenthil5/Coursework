import java.util.*;
class Ants
{
    /**
     * Create 2 arrays, one for eachset of ants.
     * Asign 1 to all the ants from one and 2 to all the ants from the other.
     * Convert them to strings and join them(1111222)
     * Iterate through the loop.
     * If there is a 2 right after a 1, Switch the numbers.
     * Keep swiching for t turns as per input
     * Replace all numbers with letters and print
     */
    public static void main(String []args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("A-");
        int a=s.nextInt();
        System.out.println();
        System.out.print("B-");
        int b=s.nextInt();
        System.out.println();
        System.out.print("T-");
        int t=s.nextInt();
        System.out.println();
        int[] array= new int[a+b];
        String input="";
        String a1="";
        String a2="";

        for(int i=0;i<a+b;i++)
        {
            if(i<a)
            {
                a1=a1+((char)(97+i));
            }
            else
            {
                a2=a2+((char)(97+i));
            }
        }

        StringBuffer sb=new StringBuffer(a1);
        sb=sb.reverse();
        input=sb.toString()+a2;//Using this to generate letters for the ants - CBA DEF

        char output[]=input.toCharArray();
        for(int i=0;i<a+b;i++)//Asigning 1 for A ants and 2 for B ants
        {
            if(i<a)
            {
                array[i]=1;
            }
            else
            {
                array[i]=2;
            }
        }

        for(int i=0;i<t;i++)
        {
            for(int j=0;j<a+b-1;j++)
            {

                if((array[j]==1)&&(array[j+1]==2))//Every time any A ant on the left and the consecutive b ant on the right switch
                {
                    System.out.println("_________");
                    display(output);
                    System.out.println();
                    int it=array[j];
                    array[j]=array[j+1];
                    array[j+1]=it;

                    char ct=output[j];
                    output[j]=output[j+1];
                    output[j+1]=ct;
                    j++;//To avoid the ant, after the switch

                }
            }
        }
        System.out.println("##########");
        display(array);
        System.out.println();
        display(output);
        System.out.println();
        System.out.println("##########");
    }

    static void display(int []array)
    {
        for(int i:array)
        {
            System.out.print(i+" ");
        }        
    }

    static void display(char []array)
    {
        for(char i:array)
        {
            System.out.print(i+" ");
        }        
    }
}