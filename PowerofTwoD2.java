public class PowerofTwoD2 {
    public static void main(String[] args) {
        int num = 20;
        if (num<=0) {
            System.out.println(num + " is not a power of two.");
        } else if (num== 1) {
            System.out.println(num + " is a power of two.");
        } else {
            while (num % 2 == 0) {
                num = num / 2;
            }
            if (num == 1) {
                System.out.println(num + " is a power of two.");
            } else {
                System.out.println(num + " is not a power of two.");
            }
        }
    }
}
