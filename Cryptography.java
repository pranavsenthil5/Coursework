import java.util.*;
class Cryptography
{
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
            for(int i=0;i<input.length();i++)
            {
                //System.out.println(input.charAt(i));
                int val1=((int)input.charAt(i));
                val1=val1-65;
                val1+=Shift-1;
                val1=val1%26;
                val1+=65;

                output=output+((char)val1);
            }
            output=output.replace("QQ"," ");
            output=output.trim();
            System.out.println(output);
        }
        else if(option==1)
        {
            input+=" ";
            input=input.replace(" ","QQ");
            
            String output="";
            for(int i=0;i<input.length();i++)
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
                System.out.print(" ");
                System.out.print(output.charAt(i));
            }
        }
        else
        {
            System.out.println("Wrong Option");
        }
    }
}