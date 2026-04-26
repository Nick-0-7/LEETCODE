import java.util.*;
public class Intersection_of_Two_Arrays349 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

     Set<Integer> st =new HashSet<>();
       int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums2[i]==nums1[j]){
                st.add(nums1[j]);
                i++;
                j++;
            }else if(nums2[i]<nums1[j]){
                i++;
            }else{
                j++;
            }

        }
        System.out.println(st);
    }
    
}