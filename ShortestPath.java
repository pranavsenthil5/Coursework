import java.util.*;
class ShortestPath
//https://www.codechef.com/COZL2012/problems/RBX12R01
{
    public static void main(String []args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Input count:");
        int count=s.nextInt();
        int anle=90;
        for(int i=0;i<count;i++)
        {
            System.out.println("Enter Input for test case "+(i+1)+":");
            s.nextLine();
            String input=s.nextLine().replaceAll("\\s", "");
            String letters=input.replaceAll("\\d", "");
            String numbers=input.replaceAll("\\D", "");

            String direction="";

            for(int j=0;j<letters.length();j++)
            {
                direction+=inLetters(numbers.charAt(j),letters.charAt(j));
            }
        }

    }
    
    static String inletters(char x,char y)
    {
        String output="";
        for(int i=0;i<Character.getNumericValue(x);i++)
        {
            output+=Character.toString(y);
        }
        return output;
    }

    

}
