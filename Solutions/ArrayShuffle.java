import java.util.Scanner;

public class ArrayShuffle {

    public static void arrayShuffle(int[] nums){
        int low = 0, high = nums.length-1;
        while(low<high){
            while(low<high && nums[low]%2==0){
                low+=2;
            }
            while(low<high && nums[high]%2!=0){
                high-=2;
            }
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter nums size : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter nums : ");
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        arrayShuffle(nums);
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
        sc.close();
    }
}
