import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
        };

        for (int move = 1; move <= 9; move++) {

            if (move % 2 == 1) {
                System.out.print("Player X - enter row: ");
                int row = input.nextInt();

                System.out.print("Enter column: ");
                int col = input.nextInt();

                board[row][col] = 'X';

            } else {
                System.out.print("Player O - enter row: ");
                int row = input.nextInt();

                System.out.print("Enter column: ");
                int col = input.nextInt();

                board[row][col] = 'O';
            }

            for (int i = 0; i < 3; i++) {
                System.out.println(
                    board[i][0] + " " +
                    board[i][1] + " " +
                    board[i][2]
                );
            }
        }
    }
}