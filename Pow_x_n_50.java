public class Pow_x_n_50 {
    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        double result = 1.0;
        double current_product = x;
        for (int i = n; i > 0; i /= 2) {
            if ((i % 2) == 1) {
                result *= current_product;
            }
            current_product *= current_product;
        }
        return result;
    }
    
}
