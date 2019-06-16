import java.util.*;
class CowsAndBulls
{
    /**
     * Cows and Bulls is word game
     * 
     * The user has to guess a 'n'letter word entered initially as the input by the person conducting the game
     * 
     * If the user enters a word with a few letters in the same position,
     * the program outputs the number of letters in the same place as Bulls
     * If there are letters in the input, which consists of the same letters but at different position,
     * the program outputs the number of same letters at different places as Cows
     * 
     * To find the number of bulls, iterate through the character of the initial word and the guessed word.
     * check if they have the same letters, If they have increment a variable called count
     * 
     * To find the number of cows, remove the letters which contributed to the number of bulls.
     * Sort the String and then iterate and see if the have the same letters
     * Kepp count of the same letters.
       */
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
            
            
            if(input.equals("-1"))//To quit
            {
                System.out.println("You Quit!");
                System.out.println("The "+word.length()+" letter word is "+word+".");
            }
            else if(input.length()!=word.length())//If the length does not match
            {
                System.out.println("Wrong word length");
                continue;
            }
            else if(!validInput(input))
            {
                System.out.println("Invalid Input!");
                break;
            }
            else if(input.equals(word))//If its the correct word
            {
                System.out.println("You guessed the word!");
                break;
            }
            displayCount(word,input);
        }
    }
    
    static boolean validInput(String input)//Checks if the input is valid-If it only has letters
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
    

    static void displayCount(String word,String input)//Displays the Bulls and Cows count
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

    static String sort(String input)//Sorts the String
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

}