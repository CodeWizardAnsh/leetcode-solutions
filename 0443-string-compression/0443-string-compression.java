class Solution {
    public int compress(char[] chars) {
        int count = 1;
        StringBuilder result = new StringBuilder();

        if (chars.length == 1) {
            return 1;
        }

        for (int i = 0; i < chars.length - 1; i++) {
            while (i < chars.length - 1 && chars[i] == chars[i + 1]) {
                count++;
                i++;
            }

            if (count == 1 && i == 0) {
                result.append(chars[0]);
            }

            if (count > 1) {
                result.append(chars[i - 1]);
                result.append(Integer.toString(count));
            } else if (count == 1 && i != 0) {
                result.append(chars[i]);
            }

            count = 1;
        }

        if (chars[chars.length - 1] != chars[chars.length - 2]) {
            result.append(chars[chars.length - 1]);
        }

      
        for (int i = 0; i < result.length(); i++) {
            chars[i] = result.charAt(i);
        }

        return result.length();
    }
}
