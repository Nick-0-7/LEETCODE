public class Max_Consecutive_Ones485 {
    public static void main(String[] args) {
        int arr[]={1,0,1,1,0,1};
        int flag=0,counter=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                flag++;
                if(flag>counter){
                    counter=flag;
                }
            }else{
                flag=0;
            }
        }
        System.out.println(counter);
    }
    
}
