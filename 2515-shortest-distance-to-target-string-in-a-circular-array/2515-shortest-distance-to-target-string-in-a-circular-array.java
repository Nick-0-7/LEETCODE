class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {

        int n = words.length;

        for (int distance = 0; distance < n; distance++) {

            int front = (startIndex + distance) % n;

            if (words[front].equals(target)) {
                return distance;
            }

            if (distance > 0) {
                int back = (startIndex - distance + n) % n;

                if (words[back].equals(target)) {
                    return distance;
                }
            }
        }

        return -1;
    }
}