class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Boolean> hmap=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            hmap.put(nums[i],false);
        }
        for(int key :hmap.keySet()){
            if(hmap.containsKey(key-1)==false){
                hmap.put(key,true);
            }
        }
        int max=0;
        for(int key:hmap.keySet()){
            int k=1;
            if(hmap.get(key)==true){
                while(hmap.containsKey(key+k)==true){
                    k++;
                }
            }
        max=Math.max(max,k);
        }
        return max;
    }
}