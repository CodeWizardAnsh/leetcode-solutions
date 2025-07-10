class Solution {
    public int repeatedStringMatch(String a, String b) {
        if (a.contains(b)) return 1;

        StringBuilder ans = new StringBuilder(a);
        int i = 1;

        while (!ans.toString().contains(b)) {
            ans.append(a);
            i++;
            if (i > (b.length() / a.length()) + 2) {
                return -1;
            }
        }

        return i;
    }
}
