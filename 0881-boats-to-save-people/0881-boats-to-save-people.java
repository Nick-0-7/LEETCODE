class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int boat=0;
        int start=0,end=people.length-1;
        Arrays.sort(people);
            while(start<=end){
            if(people[start]+people[end]<=limit){
            boat++;
            start++;
            end--;
            }
            else if(people[start]+people[end]>limit){
            boat++;
            end--;
            }
        }
        return boat;
    }
}