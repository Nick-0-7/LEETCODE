class Solution {
    public void nextPermutation(int[] nums) {
        int idx = -1;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                idx = i - 1;
                break;
            }
        }
        if (idx == -1) {
            Arrays.sort(nums);
            return;
        }
        for (int i = nums.length - 1; i > idx; i--) {
            if (nums[i] > nums[idx]) {
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
                break;
            }
        }

        Arrays.sort(nums, idx + 1, nums.length);
    }
}