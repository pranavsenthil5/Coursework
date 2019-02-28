import java.util.*;
class CheckMate
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Input the x of K1:");
        int x1=Integer.parseInt(s.next());
        System.out.println("Input the y of K1:");
        int y1=Integer.parseInt(s.next());
        System.out.println("Input the x of Q1:");
        int x2=Integer.parseInt(s.next());
        System.out.println("Input the y of Q1:");
        int y2=Integer.parseInt(s.next());
        System.out.println("Input the x of K2:");
        int x3=Integer.parseInt(s.next());
        System.out.println("Input the y of K2:");
        int y3=Integer.parseInt(s.next());

        int [][]board =new int[8][8];
        board[x1][y1]=1;//2- Wining king
        board[x2][y2]=2;//1- Losing king
        board[x3][y3]=3;//3- Winning Queen

        display(board);

        if(isNearby(x1,y1,x2,y2))
        {
            System.out.println("Illegal Move");
            System.exit(0);
        }
        
        if (isCheck(x1,y1,x2,y2))
        {
            if(canMove(x1,y1,x2,y2))
            {
                System.out.println("NOT A CHECKMATE!");
            }
            else
            {
                System.out.println("CHECKMATE!");
            }
        }
        else
        {
            System.out.println("NOT A CHECKMATE! - THERE IS NO CHECK");
        }

        //Check if the kings are next to each other - if yes illegal move, if no continue
        //Then check if its a check by queen- check the diagonals,same row and same column
        //Then check if the losing king can move any where else.
    }

    static void display(int x[][])
    {
        for(int i=0;i<8;i++)
        {
            for(int j=0;j<8;j++)
            {
                System.out.printf("%2d",x[i][j]);
            }
            System.out.println();
        }
    }

    static boolean isNearby(int x1,int y1,int x2,int y2)
    {
        if(x1==x2 && ((y1+1==y2)||(y1-1==y2)))
            return true;
        else if(y1==y2 && ((x1+1==x2)||(x1-1==x2)))
            return true;
        else if((y1+1==y2) && (x1+1==x2))
            return true;
        else if((y1-1==y2) && (x1-1==x2))
            return true;
        else if((y1+1==y2) && (x1-1==x2))
            return true;
        else if((y1-1==y2) && (x1+1==x2))
            return true;
        return false;
    }

    static boolean canMove(int x1,int y1,int x2,int y2)   
    {
        
        if (isCheck(x1,y1+1,x2,y2))
            return true;
        else if(isCheck(x1,y1-1,x2,y2))
            return true;
        else if(isCheck(x1+1,y1,x2,y2))
            return true;
        else if(isCheck(x1-1,y1,x2,y2))
            return true;
        else if(isCheck(x1+1,y1+1,x2,y2))
            return true;
        else if(isCheck(x1-1,y1+1,x2,y2))
            return true;
        else if(isCheck(x1+1,y1-1,x2,y2))
            return true;
        else if(isCheck(x1-1,y1-1,x2,y2))
            return true;
        return false;
    } 

    static boolean isCheck(int x1,int y1,int x2,int y2)
    {
        if(x1==x2 || y1==y2)
            return true;

        if((x1-x2)==(y1-y2))
            return true;

        return false;
    }

}