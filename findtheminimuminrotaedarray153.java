public class findtheminimuminrotaedarray153 {
    public static void main(String[] args) {
        int nums[]={4,5,6,7,0,1,2};
        if(nums.length==1){
            System.out.println(nums[0]);
        }else if(nums[0]<nums[nums.length-1]){
            System.out.println(nums[0]);
        }else{
            int start=0;
            int end=nums.length-1;
            while(start<=end){
                int mid=(start+end)/2;
                if(mid>0 && nums[mid-1]>nums[mid]){
                    System.out.println(nums[mid]);
                    break;
                }else if(nums[mid]<=nums[start]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }   
     }
}
