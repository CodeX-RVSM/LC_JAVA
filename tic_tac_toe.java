import java.util.Scanner;

public class tic_tac_toe {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        char board[][]={{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
        
        char currentPlayer='X';
        int moves = 0;
        boolean flag=true;

        
        //1. Print the board
        System.out.println("Welcome to tic-tac-toe");
        while(flag){
            System.out.println("--------");
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    System.out.println("|"+board[i][j]);
                }
                System.out.println("|");
                System.out.println("-------");

            }
            //current player plays the game
            System.out.println(currentPlayer+"is playing now...");
            System.out.println("Enter row no:(1-3");
            int row=sc.nextInt();

            if(row<1||row>3){
                System.out.println("Invalid row.. Please try again");
                continue;
            }
            System.out.println("Enter col no:(1-3)");
            int col=sc.nextInt();
            if(col<1||col>3){
                System.out.println("Invalid col... Please try again");
                continue;
            }
            //check for win condition
            board[row-1][col-1]=currentPlayer;

            for(int i=0;i<3;i++){
                if((board[i][0]==currentPlayer&&board[i][1]==currentPlayer&&board[i][2]==currentPlayer)||(board[0][i]==currentPlayer&&board[1][i]==currentPlayer&&board[2][i]==currentPlayer)){
                    System.out.println(currentPlayer+" wins");
                    flag=false;
                    break;
                }
            }

            currentPlayer=currentPlayer=='X'?'0':'X';

            
        }
        
    }
}
