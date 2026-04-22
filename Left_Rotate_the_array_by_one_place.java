public class Left_Rotate_the_array_by_one_place{
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6};
        int n=nums.length;
        int temp=nums[0];
        for(int i=1;i<n;i++){
            nums[i-1]=nums[i];
        }
        nums[n-1]=temp;
        for(int j:nums){
            System.out.print(j+" ");
        }
    }
}