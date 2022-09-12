import java.util.Scanner;

public class VacuumCleanerRoute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine();

        if (returnsToOriginal(str)) {
            System.out.println("Returned to it's Original Position.");
        } else {
            System.out.println("Didn't return to it's Original Position.");
        }
        sc.close();
    }

    public static boolean returnsToOriginal(String s) {
        int horizontal = 0;
        int vertical = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'U') {
                horizontal++;
            } else if (s.charAt(i) == 'D') {
                horizontal--;
            } else if (s.charAt(i) == 'L') {
                vertical--;
            } else if (s.charAt(i) == 'R') {
                vertical++;
            }
        }
        if (horizontal == 0 && vertical == 0) {
            return true;
        } else {
            return false;
        }
    }
}
