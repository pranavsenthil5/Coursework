import java.util.*;
class CowsAndBulls
{
    public static void main(String []args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("--------------------------");
        System.out.println("Letters Should NOT Repeat!");
        System.out.println("--------------------------");

        System.out.println("Input the word the user has to guess:");
        String word=s.next().toLowerCase();
        
        System.out.println("--------------------------");
        System.out.println("Input -1 to QUIT any time!");
        System.out.println("--------------------------");
        
        while(true)
        {
            System.out.println("Guess the "+word.length()+" letter word:");
            String input=s.next().toLowerCase();
            
            
            if(input.equals("-1"))
            {
                System.out.println("You Quit!");
                System.out.println("The "+word.length()+" letter word is "+word+".");
            }
            else if(input.length()!=word.length())
            {
                System.out.println("Wrong word length");
                continue;
            }
            else if(!validInput(input))
            {
                
            }
            else if(input.equals(word))
            {
                System.out.println("You guessed the word!");
                break;
            }
            displayCount(word,input);
        }
    }
    
    static boolean validInput(String input)
    {
        for(int i=0;i<input.length();i++)
        {
            if(((int)input.charAt(i))<97 || ((int)input.charAt(i))>122)
            {
                return false;
            }
        }
        return true;
    }
    

    static void displayCount(String word,String input)
    {
        int count=0;
        String a="";
        String b="";

        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)==input.charAt(i))
            {
                count++;
            }
            else
            {
                a+=word.charAt(i);
                b+=input.charAt(i);
            }
        }

        System.out.println(count+" Bulls");
        a=sort(a);
        b=sort(b);

        count=0;

        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)==b.charAt(i))
            {
                count++;
            }
        }
        System.out.println(count+" Cows");
    }

    static String sort(String input)
    {
        char a[]=input.toCharArray();
        for(int i=0;i<input.length();i++)
        {
            for(int j=0;j<input.length()-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    char temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }

        String output="";
        for(int i=0;i<input.length();i++)
        {
            output+=a[i];
        }
        return output;
    }

    /*
    __________                                   
    \______   \____________    ____ _____ ___  __
    |     ___/\_  __ \__  \  /    \\__  \\  \/ /
    |    |     |  | \// __ \|   |  \/ __ \\   / 
    |____|     |__|  (____  /___|  (____  /\_/  
    \/     \/     \/     

    (                             
    )\ )                          
    (()/((      )          )  )    
    /(_))(  ( /(  (    ( /( /((   
    (_))(()\ )(_)) )\ ) )(_)|_))\  
    | _ \((_|(_)_ _(_/(((_)__)((_) 
    |  _/ '_/ _` | ' \)) _` \ V /  
    |_| |_| \__,_|_||_|\__,_|\_/ 

     */
}