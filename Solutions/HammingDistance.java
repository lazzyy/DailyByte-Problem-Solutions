import java.util.Scanner;

public class HammingDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x : ");
        int x = sc.nextInt();
        System.out.print("Enter y : ");
        int y = sc.nextInt();
        System.out.println("Output : "+hammingDistance(x,y));
        sc.close();
    }

    public static int hammingDistance(int x, int y){
        int out=0;
        while( x>0 || y>0){
            out+=(x&1)^(y&1);
            x>>=1;
            y>>=1;
        }
        return out;
    }
}
