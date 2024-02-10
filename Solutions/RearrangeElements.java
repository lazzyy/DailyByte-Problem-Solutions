import java.util.Scanner;
public class RearrangeElements {
    public static void rearrangeElements(int[] nums){
        int j=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }
        for(int i=j+1;i<nums.length;i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.print("Enter nums : ");
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        rearrangeElements(nums);
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        sc.close();
    }
}
