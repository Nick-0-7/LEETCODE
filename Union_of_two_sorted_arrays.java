
import java.util.HashSet;
import java.util.Set;

public class Union_of_two_sorted_arrays {
    public static void main(String args[]){
        int A[]={1,1,2,3,4,5};
        int B[]={2,3,4,4,5,6};
        Set<Integer> st=new HashSet<>();
        for(int i=0,j=0;i<A.length;i++,j++){
            st.add(A[i]);
            st.add(B[j]);
        }
        int size=st.size();
        int union[]=new int[size];
        int j=0;
        for(int i:st){
            union[j++]=i;
        }
        System.out.print(st+" ");
        System.out.println("");
        for(int i:union){
            System.out.print(i+" ");
        }
    }
}
