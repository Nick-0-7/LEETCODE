public class increasingTripletSeq334 {
    public static void main(String[] args) {
        
    int[] nums = {1,2,3,4,5,6};
    int count=0;
    for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            for(int k=j+1;k<nums.length;k++){
                if(nums[i]<nums[j]&&nums[j]<nums[k]){
                    count++;
            }
        }
        }
    }
    if(count>0){
        System.out.println("true");
    }
    else{
        System.out.println("false");
    }
}
}
/*class Solution {
    public boolean increasingTriplet(int[] nums) {
         int first=Integer.MAX_VALUE;
         int second=Integer.MAX_VALUE;
         //int third=Integer.MAX_VALUE;
    for(int i=0;i<nums.length;i++){
        if(nums[i]<=first){
            first=nums[i];
        }else if(nums[i]<=second){
            second=nums[i];
        }else
            return true;
    }
    return false;
}
} */