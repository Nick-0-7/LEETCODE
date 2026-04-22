public class FibonaccinumD3 {
    public static void main(String[] args) {
        int n = 10; // Number of Fibonacci numbers to generate
        int a = 0, b = 1;
        System.out.print("Fibonacci sequence: ");
        for (int i = 1; i <= n; i++) {
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.print(a + " ");
    }
}
