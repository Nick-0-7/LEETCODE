
public class Move_Zeroes283 {

    public static void main(String[] args) {
        int nums[] = {1};
        int j = -1;
        int n = nums.length;
       
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }
         if (j == -1) {
            for (int i : nums) {
                System.out.print(i + " ");
            }
            return;
        }
        for (int i = j + 1; i < n; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
