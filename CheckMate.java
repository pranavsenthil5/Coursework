import java.util.*;
class CheckMate
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Input the x of K1:");
        int xk1=Integer.parseInt(s.next());
        System.out.println("Input the y of K1:");
        int yk1=Integer.parseInt(s.next());
        System.out.println("Input the x of Q1:");
        int xq1=Integer.parseInt(s.next());
        System.out.println("Input the y of Q1:");
        int yq1=Integer.parseInt(s.next());
        System.out.println("Input the x of K2:");
        int xk2=Integer.parseInt(s.next());
        System.out.println("Input the y of K2:");
        int yk2=Integer.parseInt(s.next());
        
        int [][]board =new int[8][8];
        board[xk1][yk1]=2;
        board[xk2][yk2]=1;
        board[xq1][yq1]=3;
        
        display(board);
        
        //Check if the kings are next to each other - if yes illegal move, if no continue
        //Then check if its a check by queen- check the diagonals,same row and same column
        //Then check if the losing king can move any where else
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
}