
public class LargestNOAtleastTwiceOfOther747 {

    public static void main(String[] args) {
        int nums[] = {3, 6, 1, 0};
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int Smax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (max < nums[i]) {
                Smax = max;
                max = nums[i];
            } else if (Smax <= nums[i]) {
                Smax = nums[i];
            }
        }
        System.out.println(Smax);

        System.out.println(max);

        if (2 * Smax <= max) {
            System.out.println("IS Exist");
        } else {
            System.out.println("Not");
        }
    }
}
