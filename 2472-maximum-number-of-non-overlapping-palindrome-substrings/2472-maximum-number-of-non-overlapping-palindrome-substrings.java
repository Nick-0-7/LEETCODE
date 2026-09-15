class Solution {
    public int maxPalindromes(String s, int k) {
        int n = s.length();

        boolean[][] pal = new boolean[n][n];
        int[] dp = new int[n + 1];

        for (int l = n - 1; l >= 0; l--) {
            for (int r = l; r < n; r++) {
                if (s.charAt(l) == s.charAt(r) &&
                    (r - l <= 2 || pal[l + 1][r - 1])) {
                    pal[l][r] = true;
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1];

            for (int l = 0; l < i; l++) {
                if (i - l >= k && pal[l][i - 1]) {
                    dp[i] = Math.max(dp[i], dp[l] + 1);
                }
            }
        }

        return dp[n];
    }
}