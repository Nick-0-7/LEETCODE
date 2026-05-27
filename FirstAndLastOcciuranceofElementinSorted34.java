public class FirstAndLastOcciuranceofElementinSorted34 {
    public int FirstOccurance(int[]nums,int target){
        int start=0;
        int end=nums.length-1;
        int ans=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                ans=mid;
                end=mid-1;
            }else if(target>nums[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }
     public int LastOccurance(int[]nums,int target){
        int start=0;
        int end=nums.length-1;
        int mid=(start+end)/2;
        int ans=-1;
        while(start<=end){
            if(nums[mid]==target){
                ans=mid;
                start=mid+1;
            }else if(target>nums[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int []nums={10,20,20,30,40,50,50,50,50,60,60,70,};
         int target=50;
         int []ans={-1,-1};
        if(nums.length==0){
            System.out.print(ans);
        }else{
            ans[0]=FirstOccurance(nums,target);
            ans[1]=LastOccurance(nums,target);
             System.out.print(ans);     
        }
    }
}
