import java.util.Scanner;

public class RemovingVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String voweledString = sc.nextLine();
        System.out.print("Output : ");
        System.out.print(removingVowels(voweledString));
        sc.close();
    }
    public static String removingVowels(String voweledString){
        String out = "";
        for(int i=0;i<voweledString.length();i++){
            if(voweledString.charAt(i) == 'a'||
            voweledString.charAt(i) == 'e'||
            voweledString.charAt(i) == 'i'||
            voweledString.charAt(i) == 'o'||
            voweledString.charAt(i) == 'u'){
                continue;
            }else{
                out=out+voweledString.charAt(i);
            }
        }
        return out;
    }
}
