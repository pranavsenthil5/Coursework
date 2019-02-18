import java.util.*;
class f
{
    public static void main(String []args)
    {
        Scanner s =new Scanner(System.in);
        System.out.println("Input:");
        int n=s.nextInt();
        int a[]=new int[n-1];
        for(int i=0;i<a.length;i++)
        {
            a[i]=i+2;
        }

        for(int i=0;i<n-1;i++)
        {
            for(int j=a[i];j<n;j+=a[i])
            {
                try{
                    if(a[j+1]==-1)
                        continue;}
                catch(Exception e)
                {
                    break;
                }
                try
                {
                    a[j+i]=-1;
                }
                catch(Exception e)
                {
                    break;
                }

            }
        }
        System.out.println("");
    }
}