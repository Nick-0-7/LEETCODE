class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int S=nums[0];
        int L=nums[nums.length-1];
        int R=-1;
        while(R!=0){
            R=L%S;
            L=S;
            S=R;
        }
        
    return L;
    }
}