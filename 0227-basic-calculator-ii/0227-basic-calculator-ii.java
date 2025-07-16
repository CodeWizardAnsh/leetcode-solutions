class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int num = 0;
        char lastOperator = '+';
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If it's a digit, build the number
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            }

            // If it's an operator or end of string, apply the last operator
            if ((!Character.isDigit(c) && c != ' ') || i == s.length() - 1) {
                if (lastOperator == '+') {
                    stack.push(num);
                } else if (lastOperator == '-') {
                    stack.push(-num);
                } else if (lastOperator == '*') {
                    stack.push(stack.pop() * num);
                } else if (lastOperator == '/') {
                    stack.push(stack.pop() / num);
                }

                // Update operator and reset number
                lastOperator = c;
                num = 0;
            }
        }

        // Sum all elements in the stack
        int result = 0;
        for (int val : stack) {
            result += val;
        }

        return result;
    }
}
