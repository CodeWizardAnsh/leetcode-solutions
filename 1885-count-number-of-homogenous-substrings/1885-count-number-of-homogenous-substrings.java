class Solution {
    public int countHomogenous(String s) {
        int mod = 1_000_000_007;
        long ans = 0;
        int count = 1;

        // Go through each character of the string
        for (int i = 1; i < s.length(); i++) {
            // If current character is same as previous one, increase count
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                // Add total substrings from previous group
                ans += (long) count * (count + 1) / 2;
                ans %= mod;
                count = 1;  // reset count for new character
            }
        }

        // Add the last group of same characters
        ans += (long) count * (count + 1) / 2;
        ans %= mod;

        return (int) ans;
    }
}
