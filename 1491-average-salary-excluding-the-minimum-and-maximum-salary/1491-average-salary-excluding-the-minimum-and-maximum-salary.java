class Solution {
    public double average(int[] salary) {
        double sum=0;
        int n=salary.length;
        Arrays.sort(salary);
       // int min=salary[0];
        //int max=salary[n-1];
        for(int i=1;i<n-1;i++){
            sum+=salary[i];
        }
        double avg=sum/(n-2);
        return avg;
        
    }
}
