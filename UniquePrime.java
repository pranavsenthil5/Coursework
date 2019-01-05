import java.util.*;
class UniquePrime
{
    public static void main(String []args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Input N:-");
        int n=s.nextInt();
        int l,u;
        int array[];
        for(int i=0;i<n;i++)
        {
            System.out.println("Input L:-");
            l=s.nextInt();
            System.out.println("Input U:-");
            u=s.nextInt();
            array=new int[u-l+1];
            for(int j=0;j<array.length;j++)
            {
                int k=2;

                int n1=LCF(l+j,k);
                array[j]=LCF(l+j,k);
                //Finished until getting prime no. for all values...next time check if they are equall
            }
            
            System.out.println("Input U:-");
        }
    }

    public static int LCF(int x,int i)
    {
        for(;i<x;i++)
        {
            if(x%i==0)
                return i;
        }
        return x;
    }

}