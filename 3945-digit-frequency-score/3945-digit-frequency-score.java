class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer>map= new HashMap<>();

        while(n>0){
          int r=n%10;
          map.put(r,map.getOrDefault(r,0)+1);
           n=n/10;  
        }
        int sum=0;
        for(int key:map.keySet()){
            sum+=key*map.get(key);
        }
        return sum;
        }
    }