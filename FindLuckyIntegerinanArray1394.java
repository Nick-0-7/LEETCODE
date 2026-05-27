
import java.util.HashMap;

public class FindLuckyIntegerinanArray1394 {
    public static void main(String[] args) {
        int[]nums={1,2,3,2,3,3,4};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0) +1);
        }
        int max=-1;
        for(int i:map.keySet()){
            if(i==map.get(i)){
                max=Math.max(max,i);
            }
        }
        System.out.println(max);    

    }
    
}
