public class MaximumProductofTwoElementsinanArray1464 {
    public static void main(String[] args) {
        int num[]={3,7};
        int i=0;
        int j=i+1;
        int max=(num[i]-1)*(num[j]-1);
        while(i<num.length-1){
            if(max<(num[i+1]-1)*(num[j]-1)){
                max=(num[i+1]-1)*(num[j]-1);
                i++;
            }else{
                i++;
            }   
        }
        System.out.println(max);
    }
}
