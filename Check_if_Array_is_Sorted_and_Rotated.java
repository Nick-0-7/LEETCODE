public class Check_if_Array_is_Sorted_and_Rotated {
    public static void main(String[] args) {
        boolean ans=true;
        int nums[]={2,1,3,4};
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                count++;
            }
        }
          if(nums[nums.length - 1] > nums[0]){
            count++;
        }
        if(count==1||count==0){
        System.out.println(ans);
        }else{
            ans=false;
            System.out.println(ans);
        }   
    }
}
