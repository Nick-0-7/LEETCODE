public class Water_Bottles_1518 {
    public static void main(String args[]){
        int bottle=9,exchange=3,empty=0,full,sum=bottle,remain=0;
        while(bottle>=exchange){
            empty=bottle%exchange;
            full=bottle/exchange;
            bottle=full+empty;
            sum+=full;
        }
        System.out.println(sum);

    }
    
}
