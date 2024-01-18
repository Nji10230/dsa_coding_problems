import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        int[] nums = {4 , 3 , 4 , 5};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums , target)));
    }

    public static int[] twoSum(int[] nums , int target) {
        int c = 0;

        for (int i = 0; i < nums.length-1; i++) {

            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i , j};
                }

            }
        }
        return new int[]{};
    }
}
