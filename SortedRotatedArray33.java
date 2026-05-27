public class SortedRotatedArray33 {
    public static void main(String[] args) {
        int nums[]={4,5,6,7,0,1,2,3};
        int target=3;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;

          if(nums[mid]==target){
            System.out.print(mid);
            break;
          }
          else if(nums[start]<=nums[mid]){

            if(nums[start]<=target && target<nums[mid]){
                end=mid-1;
            }
          else{
            start=mid+1;
          }
        }
        else{
            if(nums[mid]<target&&target<=nums[end]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
    }
    System.out.print(-1);
}   
}
