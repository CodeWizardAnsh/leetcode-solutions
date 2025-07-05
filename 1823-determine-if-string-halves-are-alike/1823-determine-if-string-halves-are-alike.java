class Solution {
    public boolean halvesAreAlike(String s) {
        int length = s.length();
        int half = length / 2;

        int vowelsInFirstHalf = countVowels(s.substring(0, half));
        int vowelsInSecondHalf = countVowels(s.substring(half));

        return vowelsInFirstHalf == vowelsInSecondHalf;
    }

    private int countVowels(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (isVowel(c)) {
                count++;
            }
        }
        return count;
    }

    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
