import java.util.*;
class ShortestPath
{
    /**
     * Finds the final direction of the destination, when given the steps in the form of u,d,l,r(Up , Down Left Right)
     * Sample Input- 1 r 5 l 3 u 8 d
     * 
     * The relatiive directions are converted to universal directions using a few angles
     * 
     * After converting it to universal angles, the difference between up count and down count are taken and different of right and left count are
     * olso take. Using the the final direction can be found
       */
    public static void main(String []args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Input count:");
        int count=s.nextInt();
        int angle=90;
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
                direction+=convert(numbers.charAt(j),letters.charAt(j));
            }
            
            String universalDirection="";
            
            for(int k=0;k<direction.length();k++)//Converting it to universal direction
            {
                char d=direction.charAt(k);
                if(d=='l')
                {
                    angle+=90;
                }
                else if(d=='r')
                {
                    angle-=90;
                }
                if(angle<0)
                angle = 360+angle;
                angle=angle%360;
                if(angle==90)
                universalDirection+="u";
                else if(angle==180)
                universalDirection+="l";
                else if(angle==270)
                universalDirection+="d";
                else if(angle==0)
                universalDirection+="r";
                System.out.println(angle);
            }
            System.out.println(universalDirection);
            System.out.println(getDirection(universalDirection));
        }
    }
    
    static String getDirection(String input)
    {
        int x=0,y=0;
        for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i)=='u')
            {
                y++;
            }
            else if(input.charAt(i)=='d')
            {
                y--;
            }
            else if(input.charAt(i)=='l')
            {
                x--;
            }
            else
            {
                x++;
            }
        }
        
        if(x==0 && y==0)
        {
            return "Same Place";
        }
        else if(x==0)
        {
            if(y>0)
            {
                return "N";
            }
            return "S";
        }
        else if(y==0)
        {
            if(x>0)
            {
                return "E";
            }
            return "W";
        }
        else if(y<0 && x<0)
        {
            return "SW";
        }
        else if(y>0 && x>0)
        {
            return "NE";
        }
        else if(y<0 && x>0)
        {
            return "SE";
        }else 
        {
            return "NW";
        }
    }

    static String convert(char a,char b)
    {
        String o="";

        for(int i=0;i<Character.getNumericValue(a);i++)
        {
            o+=b;
        }
        return o;
    }
}
