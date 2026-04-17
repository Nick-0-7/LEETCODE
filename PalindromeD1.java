class PalindromeD1 {
    public static void main(String[] args) {
        String num = "12321";
        String rev = "";
        for (int i = num.length() - 1; i >= 0; i--) {
            rev = rev + num.charAt(i);
        }
        if (num.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}