class Solution {
    public int countDaysTogether(String a1, String l1, String a2, String l2) {
        int start = Math.max(day(a1), day(a2));
        int end = Math.min(day(l1), day(l2));
        int count = 0;

        for (int d = start; d <= end; d++)
            count++;

        return count;
    }

    int day(String s) {
        int[] m = {31,28,31,30,31,30,31,31,30,31,30,31};
        int month = Integer.parseInt(s.substring(0, 2));
        int day = Integer.parseInt(s.substring(3));
        for (int i = 0; i < month - 1; i++)
            day += m[i];
        return day;
    }
}