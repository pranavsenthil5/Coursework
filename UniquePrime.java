import java.util.*;
class UniquePrime
{
    public static void main(String []args)
    {
        int n=1;
        int l,u;
        int array[][];

        l=90;
        u=96;
        array=new int[u-l+1][u];
        int[] c=new int[u-l+1];
        int[] max=new int[u-l+1];
        
        for(int i=0;i<u-l+1;i++)
        {
            c[i]=0;
            array[i]=PF(l+i);
            max[i]=array[i].length;
        }
        
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array[i].length;j++)
            {
                System.out.print(array[i][j]+" ");
            }    
            System.out.println("");
        }
        
        
        
        while(true)
        {
            int[] output=new int[u-l+1];
            for(int i=0;i<u-l+1;i++)
            {
                output[i]=array[i][c[i]];
            }
            
            if(isUnique(output))
            {
                for(int k:output)
                {
                    System.out.print(k+" ");
                }
                break;
            }
            
            
        }
    }
    
    public static int[] next(int[] x, int[]y)
    {
        for(int i=x.length-1;i>=0;i--)
        {
            x[i]++;
            if(x[i]>=y[i])
            {
                x[i]=0;
                x[i-1]++;
            }
            
        }
        
        return x;
    }
    
    public static boolean isUnique(int []x)
    {
        for(int i=0;i<x.length;i++)
        {
            if(ncount(x,x[i])!=1)
            return false;
        }
        return true;
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
    
    public static int[] PF(int x)
    {
        int a[];
        int count=0;
        for(int i=2;i<x;i++)
        {
            if(x%i==0)
            {
                if(isPrime(i))
                    count++;
            }
        }
        a=new int[count];
        count=0;
        for(int i=2;i<x;i++)
        {
            if(x%i==0)
            {
                if(isPrime(i))
                {
                    a[count]=i;
                    count++;
                }
            }
        }
        return a;
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