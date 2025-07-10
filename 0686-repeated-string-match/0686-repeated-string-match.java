class Solution {
    public int repeatedStringMatch(String a, String b) {
        String ans = a;
        int i = 1;  // one repeat of a already

        while (!ans.contains(b)) {
            ans += a;
            i++;

            // fix: repeat a maximum of b.length() / a.length() + 2 times
            if (i > (b.length() / a.length()) + 2) {
                return -1;
            }
        }

        return i;
    }
}
