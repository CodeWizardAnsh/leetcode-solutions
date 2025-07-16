class Solution {
    public int calculate(String s) {
        int result = 0;
        int lastNum = 0;
        int num = 0;
        char lastOp = '+'; // initial operator

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            }

            // If c is operator or end of expression
            if ((!Character.isDigit(c) && c != ' ') || i == s.length() - 1) {
                if (lastOp == '+') {
                    result += lastNum;
                    lastNum = num;
                } else if (lastOp == '-') {
                    result += lastNum;
                    lastNum = -num;
                } else if (lastOp == '*') {
                    lastNum = lastNum * num;
                } else if (lastOp == '/') {
                    lastNum = lastNum / num;
                }

                // Reset for next number
                lastOp = c;
                num = 0;
            }
        }

        result += lastNum; // add the last remaining number
        return result;
    }
}
