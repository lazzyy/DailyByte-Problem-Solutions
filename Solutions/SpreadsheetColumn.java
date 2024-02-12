import java.util.Scanner;

public class SpreadsheetColumn {
    public static String spreadsheetColumn(int n){
        String out="";
        while(n>0){
            n--;
            char c = (char)('A'+(n%26));
            out=c+out;
            n/=26;
        }
        return out;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.println(n+" in Excel is : "+spreadsheetColumn(n));
        sc.close();
    }
}
