import java.util.*;
class SumOfDigit
{
    public static void main(String []args)
    {
        Scanner s =new Scanner(System.in);
        System.out.println("Input:");
        int input=0;
        try{
            input= s.nextInt();
        }
        catch(Exception E)
        {
            System.out.println("Wrong Input!");
        }
        String in=""+input;
        while(in.length()>1)
        {
            int temp=0;
            for(int i=0;i<in.length();i++)
            {
                temp+=Character.getNumericValue(in.charAt(i));

            }
            in=""+temp;
            System.out.println(in);
        }

    }
}