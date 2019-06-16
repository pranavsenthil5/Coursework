import java.util.*;
class pandigital
{
    public static void main(String []args)
    {
        Scanner s =new Scanner(System.in);
        System.out.println("Input:");
        int max=s.nextInt();
        int count=0;
        for(int i=10;i<max;i++)
        {
            if(isPandigital(i))
            {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("---"+count+"---");
    }
    public static boolean isPandigital(int x)
    {
        String s=""+x;
        for(int i=0;i<s.length()-1;i++)
        {
            if(Math.abs(Character.getNumericValue(s.charAt(i+1))-Character.getNumericValue(s.charAt(i)))!=1)
            {
                return false;
            }
        }
        return true;
    }
}