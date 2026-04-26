import java.util.*;
public class Median_of_Two_Sorted_Arrays4 {
    public static void main(String[] args) {
        int []num1={0,0,0,0,0};
        int []num2={-1,0,0,0,0,0,1};
        int []merged=new int[num1.length+num2.length];
        System.arraycopy(num1, 0, merged, 0, num1.length);
        for(int i:merged){
            System.out.print(i+" ");
        }
        System.out.println();
        System.arraycopy(num2, 0, merged, num1.length, num2.length);
        Arrays.sort(merged);
        for(int i:merged){
            System.out.print(i+" ");
        }
        System.out.println();
        double median=0;
        if(merged.length%2==0){
            median=(merged[merged.length/2-1]+ merged[merged.length/2])/2.0;
        }else{
            median=merged[merged.length/2];
        }
        System.out.println("median: "+median);
    }
}
