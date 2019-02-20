import java.util.*;
class Patterns
{
    public static void main(String []args)
    {
        
    }
    void triangleFill(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    void triangleOutline(int n)
    {
        for(int i=0;i<n-1;i++)
        {
            
            for(int j=0;j<=i;j++)
            {
                if(j==0||j==i)
                System.out.print("* ");
                System.out.print("  ");
            }
            System.out.println();
        }
        
    }
}