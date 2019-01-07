import java.util.*;
class UniquePrime2
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
            
            int sum=0;
            for(int j=0;j<u-l+1;j++)
            {
                sum+=PF(l+j).length;
            }
            array=new int[sum];
            
            for(int j=0;i<u-l+1;j++)
            {
                PF(l+j);
            }
        }
    }

    public static int[] PF(int x)
    {
        int sum=0;
        for(int i=2;i<x;i++)
        {
            if(x%i==0)
                sum++;
        }
        int y[]=new int[sum];
        for(int i=2,j=0;i<x;i++,j++)
        {
            if(x%i==0)
                y[j]=i;
            }
            
        return y;
    }
}