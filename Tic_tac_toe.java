import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Tic_tac_toe {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        //First create the 3x3 matrix array
        char [][] arr=new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j]=' ';
            }
            }
        boolean has_won=false;
            char player='x';

            while(!has_won) {

                display(arr);
               if(isBoardFull(arr)) {
                    System.out.println("It's a tie !");
                    break;
                }
                //Player instructions

                System.out.println("Enter " + player + " player:");
                int row = in.nextInt();
                int col = in.nextInt();
                if (row > 2 || col > 2) {
                    System.out.println("invalid move !");
                    has_won=won(arr,player);
                } else {
                    if (arr[row][col] == ' ') {
                        arr[row][col] = player;
                        if (won(arr, player)) {
                            System.out.println("The " + player + " has won the match !");
                            break;
                        } else {
                            player = (player == 'x') ? 'o' : 'x';
                        }
                    } else {
                        System.out.println("Invalid move try again !");
                    }

                }
            }
        }


    public static boolean won(char[][] arr,char player) {
        // check row
        for (int row = 0; row < arr.length; row++) {
            if(arr[row][0]==player &&arr[row][1]==player &&arr[row][2]==player){
                return true;
            }
        }

        //check column
        for (int col = 0; col < arr.length; col++) {
            if(arr[0][col]==player &&arr[1][col]==player &&arr[2][col]==player){
                return true;
            }
        }
        //check diagonal
        if(arr[0][0]==player &&arr[1][1]==player &&arr[2][2]==player){
            return true;
        }
        if(arr[0][2]==player &&arr[1][1]==player &&arr[2][0]==player){
            return true;
        }

return false;
    }

    public static void display(char[][]arr){
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+" | ");
            }
            System.out.println();

    }
    }

    public static boolean isBoardFull(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == ' ') {
                    // Found an empty space, so the board is not full
                    return false;
                }
            }
        }
        // If no empty spaces were found, the board is full
        return true;
    }

}
