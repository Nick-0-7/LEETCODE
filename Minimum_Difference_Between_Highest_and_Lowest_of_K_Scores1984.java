import java.util.Arrays;
public class Minimum_Difference_Between_Highest_and_Lowest_of_K_Scores1984 {
    public static void main(String[] args) {
        int[] nums = {9,4,1,7};
        int k = 2;
        if (k == 1) {
            System.out.println(0);
            return;
        }   
        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i <= nums.length - k; i++) {
            minDiff = Math.min(minDiff, nums[i + k - 1] - nums[i]);
        }
        System.out.println(minDiff);
    }
}