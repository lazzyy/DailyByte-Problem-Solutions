import java.util.Scanner;

public class DefangingIPs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter address : ");
        String addressString = sc.nextLine();
        System.out.print("Output : ");
        System.out.println(defangingIPs(addressString));
        sc.close();
    }

    public static String defangingIPs(String address){
        String out = "";
        for(int i=0;i<address.length();i++){
            if(address.charAt(i)=='.'){
                out=out+"[.]";
            }
            else{
                out=out+address.charAt(i);
            }
        }
        return out;
    }
}
