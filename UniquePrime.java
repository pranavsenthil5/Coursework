import java.util.*;
class UniquePrime
{
    public static void main(String []args)
    {
        Scanner s = new Scanner(System.in);
        // System.out.println("Input N:-");
        // int n=s.nextInt();
        int n=1;
        int l,u;
        int array[];
        for(int i=0;i<n;i++)
        {
            // System.out.println("Input L:-");
            // l=s.nextInt();
            // System.out.println("Input U:-");
            // u=s.nextInt();
            l=90;
            u=96;
            array=new int[u-l+1];
            for(int j=0;j<array.length;j++)
            {
                int k=2;

                int n1=LCF(l+j,k);
                if(!contains(array,n1))
                    array[j]=LCF(l+j,k);
                else
                {
                    do
                    {
                        k=n1+1;
                        n1=LCF(l+j,k);
                        if(!contains(array,k))
                        {
                            array[j]=LCF(l+j,k);
                            break;
                        }

                    }
                    while(true);
                }
                //Finished until getting prime no. for all values...next time check if they are equall
            }

            for(int j:array)
            {
                System.out.print(j+" ");
            }
        }
    }

    public static boolean contains(int[] x,int y)
    {
        for(int i=0;i<x.length;i++)
        {
            if(x[i]==y)
                return true;
        }
        return false;
    }

    public static int LCF(int x,int i)
    {
        for(;i<x;i++)
        {
            if(x%i==0)
            {
                if(isPrime(i))
                    return i;

            }
        }
        return x;
    }

    public static boolean isPrime(int x)
    {
        for(int i=2;i<x;i++)
        {
            if(x%i==0)
                return false;
        }
        return true;
    }
}