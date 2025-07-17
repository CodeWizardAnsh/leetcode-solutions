class Solution {
    public int equalSubstring(String s, String t, int maxcost) {
        int cost = 0;
        int start = 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            cost += Math.abs(s.charAt(i) - t.charAt(i));
            while (cost > maxcost) {
                cost -= Math.abs(s.charAt(start) - t.charAt(start));
                start++;
            }
            result = Math.max(result, i - start + 1);
        }
        return result;
    }
}
