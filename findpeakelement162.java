public class findpeakelement162 {
    public static void main(String[] args) {
        int nums[]={4,5,10,20,15,14,13,12,11,10};
        int n=nums.length-1;
        if(nums[0]>nums[1]){
            System.out.println(0);
        }else if(nums[n]>nums[n-1]){
            System.out.println(n);
        }
        int start=1;
        int end=n-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[mid-1]&& nums[mid]>nums[mid+1]){
                System.out.println(mid);
                break;
            }else if(nums[mid]<nums[mid-1]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
    }
}
