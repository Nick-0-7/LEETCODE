public class Right_Rotate_the_array_by_one_place {
     public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6};
        int n=nums.length;
        int temp=nums[n-1];
        for(int i=n-2;i>=0;i--){
            nums[i+1]=nums[i];
        }
        nums[0]=temp;
        for(int j:nums){
            System.out.print(j+" ");
        }
    
}
}