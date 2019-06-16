import java.util.*;
class TicTacToeGame
{
    public static char v;
    public static void main(String []args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter name of Player 1(o):");
        String n1=s.nextLine();
        System.out.println("Enter name of Player 2(x):");
        String n2=s.nextLine();
        char[][] m=new char[3][3];
        char[][] n={{'1','2','3'},{'4','5','6'},{'7','8','9'}};
        System.out.println("Board arrangement:");

        draw(n);
        System.out.println("Coordinates:");
        System.out.println("1: 0,0");
        System.out.println("2: 0,1");
        System.out.println("3: 0,2");
        System.out.println("4: 1,0");
        System.out.println("5: 1,1");
        System.out.println("6: 1,2");
        System.out.println("7: 2,0");
        System.out.println("8: 2,1");
        System.out.println("9: 2,2");
        System.out.println(n2+" starts first!");
        int count =1;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                boolean check=false;
                do{
                    System.out.println("Enter the coordinates:");
                    String[] a=s.nextLine().split(",");
                    char z='X';
                    //System.out.println((i+1)*(j+1));
                    if(count%2==0)
                    {
                        z='O';
                    }
                    
                    char temp='O';
                    try{
                        temp=m[Integer.parseInt(a[1])][Integer.parseInt(a[0])];
                    }
                    catch(Exception e)
                    {
                        System.out.println("Wrong Coordinates!");
                        
                        check=true;
                        continue;
                    }
                    if(!(temp=='O'||temp=='X'))
                    { 
                        m[Integer.parseInt(a[1])][Integer.parseInt(a[0])]=z;
                        if(winCheck(m))
                        {
                            draw(m);
                            System.out.println("Game Over!");
                            if(v=='X')
                            {
                                System.out.println(n2+" wins");
                                System.exit(0);
                            }
                            else if(v=='O')
                            {
                                System.out.println(n1+" wins");
                                System.exit(0);
                            }
                        }
                        check=false;
                    }
                    else
                    {
                        System.out.println("Wrong Coordinates!");
                        check=true;
                    }

                    draw(m);
                }
                while(check);
                count++;
            }
        }
    }

    public static void draw(char[][] x)
    {
        for(int l=0;l<3;l++)
        {
            for(int i=0;i<3;i++)
            {   
                if(i==0)
                    System.out.print("_________");
                else
                {
                    System.out.print("________");
                }
            }
            System.out.println();
            for(int k=0;k<2;k++)
            {
                for(int i=0;i<3;i++)
                {
                    System.out.print("|");
                    for(int j=0;j<7;j++)
                    {
                        if(j==3 && k==1)
                        {
                            if(x[l][i]=='\u0000')
                            {
                                System.out.print(" ");
                                continue;
                            }
                            System.out.print(x[l][i]);
                            continue;
                        }
                        System.out.print(" ");
                    }
                }
                System.out.println("|");
            }
        }
        for(int i=0;i<3;i++)
        {   
            if(i==0)
                System.out.print("_________");
            else
            {
                System.out.print("________");
            }
        }
        System.out.println("");
    }

    public static boolean winCheck(char x[][])
    {
        for(int i=0;i<3;i++)
        {
            if((x[i][0]==x[i][1]&&x[i][1]==x[i][2])&&x[i][0]!='\u0000')
            {
                v=x[i][0];
                return true;
            }
            if((x[0][i]==x[1][i]&&x[1][i]==x[2][i])&&x[0][i]!='\u0000')
            {
                v=x[0][i];
                return true;
            }
        }
        if((x[0][0]==x[1][1]&&x[1][1]==x[2][1])&&x[1][1]!='\u0000')
        {
            v=x[1][1];
            return true;
        }
        if((x[0][2]==x[1][1]&&x[1][1]==x[2][0])&&x[1][1]!='\u0000')
        {
            v=x[1][1];
            return true;
        }
        return false;

    }
}