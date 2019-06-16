import java.util.*;
class Cryptography
{
    /**
     * Encrypt and Decrypt using Ceaser Cipher
     * 
     * Ceaser Cipher-Is a form of encryption where the letter are are shifted by certain number.
     * For example If the shift number is 3,
     * 'a' becomes 'e'
     * but 'z' becomes 'd' (Cyclic)
     * 
     * Take Input from the user
     * 
       */
    public static void main(String []args)
    {
        Scanner s = new Scanner (System.in);
        System.out.println("Input Line:");
        String input=s.nextLine();
        System.out.println("Input Shift:");
        int Shift=s.nextInt();
        System.out.println("___________");
        System.out.println("1-To Encode\n2-To Decode");
        System.out.println("Input 1 or 2:");
        int option=s.nextInt();

        if(option==2)
        {
            /*
            String a[]=input.split(" ");
            input="";
            
            for(int i=0;i<a.length;i++)
            {
                input+=a[i];
            }
            */
           input=input.split(" ").toString();//If this step does not work, switch it with the above one.
            String output="";
            for(int i=0;i<input.length();i++)//Decrypting and making it cylic
            {
                //System.out.println(input.charAt(i));
                int val1=((int)input.charAt(i));
                val1=val1-65;
                val1+=Shift-1;
                val1=val1%26;
                val1+=65;

                output=output+((char)val1);
            }
            output=output.replace("QQ"," ");//Replacing the QQ back to " "(Space)
            output=output.trim();//Removing the space from the end
            System.out.println(output);
        }
        else if(option==1)
        {
            input+=" ";//Adding a space in the end
            input=input.replace(" ","QQ");//The spaces are taken as QQ
            
            String output="";
            for(int i=0;i<input.length();i++)//Encrypting using Ceaser Cipher
            {
                //System.out.println(input.charAt(i));
                int val1=((int)input.charAt(i));
                val1=val1-65;
                val1=val1+(26-Shift+1);
                val1=val1%26;
                val1+=65;

                output=output+((char)val1);
            }
            //System.out.println(output);
            String output2="";
            for(int i=0;i<output.length();i++)
            {
                if(i>5&&i%6==0)
                System.out.print(" ");//After every 6 letters there is a space
                System.out.print(output.charAt(i));
            }
        }
        else
        {
            System.out.println("Wrong Option");
        }
    }
}