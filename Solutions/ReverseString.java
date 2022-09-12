import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine();

        System.out.println(reverseString(str));
        sc.close();
    }

    public static String reverseString(String str) {
        char[] strArray = str.toCharArray();
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            char temp = strArray[left];
            strArray[left++] = strArray[right];
            strArray[right--] = temp;
        }
        return new String(strArray);
    }
}
