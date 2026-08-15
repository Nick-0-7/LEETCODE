class Solution {
    public int thirdMax(int[] nums) {
        long F = Long.MIN_VALUE;
        long S = Long.MIN_VALUE;
        long T = Long.MIN_VALUE;

        for (int i : nums) {

            if (i == F || i == S || i == T) {
                continue;
            }

            if (i > F) {
                T = S;
                S = F;
                F = i;
            } 
            else if (i > S) {
                T = S;
                S = i;
            } 
            else if (i > T) {
                T = i;
            }
        }
        if (T == Long.MIN_VALUE) {
            return (int) F;
        }

        return (int) T;
    }
}