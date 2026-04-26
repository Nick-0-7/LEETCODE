
import java.util.*;

public class Majority_Element169 {
    public static void main(String[] args) {
        int nums[]={3,2,3};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i, 0)+1);
        }
        int maxElement=0;
        int count=-1;
        for (Map.Entry<Integer,Integer> m : map.entrySet()) {
            maxElement=m.getKey();
            count= m.getValue();  
        }
        System.out.print("element "+maxElement+" has "+count+" max occurance");
    }
}
