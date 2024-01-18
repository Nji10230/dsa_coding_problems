import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int []nums={1,3,4,5};
        int target=9;
        System.out.println(Arrays.toString(twoSum(nums , target)));
    }
    public  static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]+nums[i+1]==target){
                return nums;
            }

        }
        return nums;

    }
}