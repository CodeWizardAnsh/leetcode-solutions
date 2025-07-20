class Solution {
    public int compress(char[] chars) {
        if (chars.length == 1) return 1;
        int write = 0; 
        int count = 1;
        for (int i = 0; i < chars.length; i++) {
            if (i + 1 < chars.length && chars[i] == chars[i + 1]) {
                count++;
            } else {
                chars[write++] = chars[i];
                if (count > 1) {
                    String str = Integer.toString(count);
                    for (int k = 0; k < str.length(); k++) {
                        chars[write++] = str.charAt(k);
                    }
                }
                count = 1; 
            }
        }

        return write;
    }
}

    