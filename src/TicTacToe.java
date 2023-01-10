import java.util.Scanner;

public class TicTacToe {
    static char[][] board = new char[3][3];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        initBoard();
        while (true) {
            printBoard();
            System.out.println("Player 1, 输入下棋的位置 (行 列): ");
            int row = sc.nextInt();
            int col = sc.nextInt();
            board[row][col] = 'X';
            if (checkForWin()) {
                System.out.println("Player 1 胜利!");
                break;
            }
            if (isDraw()) {
                System.out.println("平局!");
                break;
            }
            printBoard();
            System.out.println("Player 2, 输入下棋的位置 (行 列): ");
            row = sc.nextInt();
            col = sc.nextInt();
            board[row][col] = 'O';
            if (checkForWin()) {
                System.out.println("Player 2 胜利!");
                break;
            }
            if (isDraw()) {
                System.out.println("平局!");
                break;
            }
        }
    }

    static boolean isDraw(){//判断平局的方法，实现这个方法的思路就是遍历棋盘的所有格子，如果存在某个格子为空，就返回 false。如果所有格子都不为空，说明并没有胜负之分，就是平局。
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(board[i][j]==' ')
                    return false;
            }
        }
        return true;
    }


    static void initBoard() {//构建一个空白棋盘
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    static void printBoard() {//下棋的过程
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean checkForWin() {//胜利条件判断
        // check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ') {
                return true;
            }
        }
        // check columns
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != ' ') {
                return true;
            }
        }
        // check diagonals
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') {
            return true;
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ') {
            return true;
        }
        return false;
    }
}