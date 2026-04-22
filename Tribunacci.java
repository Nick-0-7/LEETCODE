class Tribunacci {
    public static int f(int n) {
        if(n<=1){
            return n;
        }else{
           
        return  f(n-1)+(n-2)+f(n-3);
        }
        
    }
    public static void main(String[] args) {
        int n=4;
       
        System.out.println(f(n));

    }
}