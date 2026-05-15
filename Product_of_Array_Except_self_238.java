public class Product_of_Array_Except_self_238 {
    public static void main(String[] args) {
        int nums[]={1,2,3,4};
        int n=nums.length;
        int ans[]=new int[n];
        int prefix[]=new int[n];
        int suffix[]=new int[n];
        int pro1=1;
        prefix[0]=1;
        for(int i=1;i<n;i++){
            pro1*=nums[i-1];
            prefix[i]=pro1;
        }
        int pro2=1;
        suffix[n-1]=1;
        for(int i=n-2;i>=0;i--){
            pro2*=nums[i+1];
            suffix[i]=pro2;
        }
        for(int i=0;i<n;i++){
            ans[i]=prefix[i]*suffix[i];
            System.out.print(ans[i]+" ");
        }
    }
}
