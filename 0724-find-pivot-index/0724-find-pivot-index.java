class Solution {
    public int pivotIndex(int[] nums) {
        int tsum=0,sum=0;
        for(int i:nums){
            tsum+=i;
        }
        for(int i=0;i<nums.length;i++){
            tsum-=nums[i];
            if(tsum==sum){
                return i;
            }
            sum+=nums[i];
        }
        return -1;
    }
}