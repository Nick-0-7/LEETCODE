public class Find_missing_number268 {
    public static void main(String[] args) {
        int[] num={9,6,4,2,3,5,7,0,1};
        long sum=0;
        for(int i:num){
            sum+=i;
        }
        long A_total= (num.length*(num.length+1))/2;
        A_total-=sum;
    System.out.println("the missing no. "+A_total);    }
}
