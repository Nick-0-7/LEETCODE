public class Sort_Colors75 {
    public static void main(String[] args) {
        int nums[] = {2,0,2,1,1,0};
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++)
            if(nums[i]>nums[j]){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
            }
        }
        for(int i:nums){
            System.out.print(i+" ");
        }
}}
