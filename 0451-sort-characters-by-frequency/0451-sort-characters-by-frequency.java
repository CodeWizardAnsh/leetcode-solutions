public class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[128];  // for all ASCII characters

        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        StringBuilder result = new StringBuilder();

        // Keep picking the char with the highest remaining frequency
        while (true) {
            int max = 0;
            int index = -1;

            // Find the character with max frequency
            for (int i = 0; i < 128; i++) {
                if (freq[i] > max) {
                    max = freq[i];
                    index = i;
                }
            }

            if (max == 0) break;  // no characters left

            // Append character 'max' times
            for (int i = 0; i < max; i++) {
                result.append((char) index);
            }

            freq[index] = 0;  // mark as used
        }

        return result.toString();
    }
}
