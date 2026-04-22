public class Add_to_Array_Form_of_Integer_989 {
    public static void main(String[] args) {
        int num[] = {1,2,0,0};
        int k=34;
        int i=1;
        while(k!=0){
        int p=num.length-i;
        int last_d=k%10;
             k=k/10;
        int x=num[p]+last_d;
        num[p]=x;
        i++;


    }for(int j:num){
      System.out.println(j);
    }
    }
}
