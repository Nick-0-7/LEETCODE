class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        long k = (long) k1 + k2;
        long[] d = new long[nums1.length];
        long max = 0, sum = 0;

        for (int i = 0; i < d.length; i++) {
            d[i] = Math.abs((long) nums1[i] - nums2[i]);
            max = Math.max(max, d[i]);
            sum += d[i];
        }

        if (sum <= k) return 0;

        long low = 0, high = max;
        while (low < high) {
            long mid = low + (high - low) / 2;
            long need = 0;

            for (long x : d)
                need += Math.max(0, x - mid);

            if (need <= k) high = mid;
            else low = mid + 1;
        }

        long ans = 0, used = 0;
        for (long x : d) {
            long y = Math.min(x, low);
            used += x - y;
            ans += y * y;
        }

        long remaining = k - used;
        for (int i = 0; i < d.length && remaining > 0; i++) {
            if (d[i] >= low) {
                ans -= 2 * low - 1;
                remaining--;
            }
        }

        return ans;
    }
}