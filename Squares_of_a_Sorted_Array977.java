import java.util.*;
public class Squares_of_a_Sorted_Array977 {
    public static void main(String[] args) {
        int []nums = {-7,-3,2,3,11};
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            temp*=temp;
            nums[i]=temp;
        }
        Arrays.sort(nums);
        for(int i:nums){
            System.out.print(i+" ");
        }
    }
}
