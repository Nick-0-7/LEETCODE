public class LongestSubArrayWithSizeK {
    public static void main(String[] args) {
        int arr[]={1,2,3,1,1,1,4,2,3};
        int k=3;
      
        for(int i=0;i<=arr.length-2;i++){
            int j=i+1;
            if(arr[i]+arr[i+1]+arr[j]==k){
                System.out.println( j-i+2);
                System.out.println("Success");
            
        }
    }
}
}
