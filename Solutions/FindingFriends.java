import java.util.Scanner;

public class FindingFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] friends = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                friends[i][j] = sc.nextInt();
            }
        }
        System.out.println(findingFriends(friends));
        sc.close();
    }

    public static int findingFriends(int[][] friends) {
        boolean[] visited = new boolean[friends.length];
        int count = 0;
        for (int i = 0; i < friends.length; i++) {
            if (!visited[i]) {
                dfs(i, friends, visited);
                count++;
            }
        }
        return count;
    }

    public static void dfs(int j, int[][] friends, boolean[] visited) {
        visited[j] = true;
        for (int i = 0; i < friends.length; i++) {
            if (!visited[i] && friends[j][i] == 1) {
                dfs(i, friends, visited);
            }
        }
    }
}