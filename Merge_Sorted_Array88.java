import java.util.*;
public class Merge_Sorted_Array88 {
    public static void main(String[] args) {
        int [] n1={0};
        int m=0;
        int[]n2={1};
        int n=1;
        int []arr=new int[m+n];
        for(int i=0;i<m;i++){
            arr[i]=n1[i];
        }
        for(int j=0;j<n;j++){
            arr[m+j]=n2[j];
        }
        Arrays.sort(arr);
        for(int j:arr){
            System.out.print(j+" ");
        }
    }
    
}
