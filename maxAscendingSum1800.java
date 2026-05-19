import java.lang.*;

public class maxAscendingSum1800 {
    public static void main(String[] args) {

        int[] nums = {12,17,15,13,10,11,12};

        int max = nums[0]; 
        int Smax = nums[0]; 

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > nums[i - 1]) {
                max += nums[i];
            } else {
                max = nums[i];
            }

            Smax = Math.max(Smax, max);
        }

        System.out.println(Smax);
    }
} 