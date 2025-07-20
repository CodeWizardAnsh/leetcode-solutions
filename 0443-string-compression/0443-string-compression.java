class Solution {
    public int compress(char[] chars) {
        if (chars.length == 1) return 1;

        int write = 0; // Position to write in-place
        int count = 1;

        for (int i = 0; i < chars.length; i++) {
            // Check if next char is same
            if (i + 1 < chars.length && chars[i] == chars[i + 1]) {
                count++;
            } else {
                // Write the character
                chars[write++] = chars[i];

                // If count > 1, write the digits of count
                if (count > 1) {
                    String str = Integer.toString(count);
                    for (int k = 0; k < str.length(); k++) {
                        chars[write++] = str.charAt(k);
                    }
                }
                count = 1; // Reset count for next group
            }
        }

        return write;
    }
}

    