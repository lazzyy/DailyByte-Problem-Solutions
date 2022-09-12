import java.util.Scanner;

public class CorrectCapitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine();

        if (isCorrectCapitalization(str)) {
            System.out.println(str + " is Capitalized Correctly.");
        } else {
            System.out.println(str + " is Not Capitalized Correctly.");
        }
        sc.close();
    }

    public static boolean isCorrectCapitalization(String str) {
        int capsCount = 0;
        int smallsCount = 0;
        for (char s : str.toCharArray()) {
            if (Character.isUpperCase(s)) {
                capsCount++;
            } else if (Character.isLowerCase(s)) {
                smallsCount++;
            }
        }
        if (capsCount == str.length() || smallsCount == str.length()) {
            return true;
        }
        if (Character.isUpperCase(str.charAt(0)) && smallsCount == str.length() - 1) {
            return true;
        }
        return false;
    }
}
