class Solution {
    public char findKthBit(int n, int k) {
        String s = build(n);
        return s.charAt(k - 1); 
    }

    private String build(int n) {
        if (n == 1) return "0";
        String prev = build(n - 1);
        return prev + "1" + reverse(invert(prev));
    }

    private String invert(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            sb.append(c == '0' ? '1' : '0');
        }
        return sb.toString();
    }

    private String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
