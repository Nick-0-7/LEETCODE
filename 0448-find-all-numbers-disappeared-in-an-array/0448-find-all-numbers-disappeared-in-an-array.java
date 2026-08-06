/* List<Integer>li=new ArrayList<>();
        List<Integer>al=new ArrayList<>();
        int count=0;
        //int arr[]=new int[];
        for(int i:nums){
            li.add(i);
        }
        for(int i=1;i<=li.size();i++){
            if(li.contains(i)){
                count++;
                continue;
            }else{
                al.add(i);
            }
        }
        return al; */

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        List<Integer> ans = new ArrayList<>();

        for(int i = 1; i <= nums.length; i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }

        return ans;
    }
}