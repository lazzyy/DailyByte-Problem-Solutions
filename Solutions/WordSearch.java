import java.util.Arrays;
import java.util.Scanner;

public class WordSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter no of columns : ");
        int columns = sc.nextInt();
        System.out.println("Enter board values : ");
        char[][] board = new char[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                board[i][j] = sc.next().charAt(0);
            }
        }
        System.out.println(Arrays.deepToString(board));
        while (true) {
            System.out.print("Enter string to search in board : ");
            String word = sc.next();
            if (word.equals("STOP") || word.equals("stop"))
                break;
            boolean isFound = wordSearch(board, word);
            if (isFound) {
                System.out.println("Yes the word is found!!!");
            } else {
                System.out.println("No the word isn't found!!!");
            }
        }
        sc.close();
    }

    public static boolean wordSearch(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == word.charAt(0) && dfs(board, i, j, 0, word)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean dfs(char[][] board, int i, int j, int count, String word) {
        if (count == word.length()) {
            return true;
        }

        if (i < 0 || i >= board.length || j < 0 || j >= board[i].length || board[i][j] != word.charAt(count)) {
            return false;
        }
        char temp = board[i][j];
        board[i][j] = ' ';
        boolean found = dfs(board, i + 1, j, count + 1, word) || dfs(board, i - 1, j, count + 1, word)
                || dfs(board, i, j + 1, count + 1, word) || dfs(board, i, j - 1, count + 1, word);
        board[i][j] = temp;
        return found;
    }

}