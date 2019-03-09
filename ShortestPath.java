import java.util.*;
class ShortestPath
//https://www.codechef.com/COZL2012/problems/RBX12R01
{
    public static void main(String []args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Input count:");
        int count=s.nextInt();
        for(int i=0;i<count;i++)
        {
            System.out.println("Enter Input for test case "+(i+1)+":");
            s.nextLine();
            char arr[]=s.nextLine().toUpperCase().replaceAll(" ","").toCharArray();
            int num[]=new int[arr.length/2];
            char direction[]=new char[arr.length/2];
            for(int j=0;j<arr.length;j++)
            {
                if(j%2==0)
                num[j/2]=Character.getNumericValue(arr[j]);
                else
                direction[(j-1)/2]=arr[j];
            }
            
            
        }
        
    }
}