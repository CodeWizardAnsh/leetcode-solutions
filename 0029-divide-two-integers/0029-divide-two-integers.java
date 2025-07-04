class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        if (dividend == Integer.MIN_VALUE && divisor == 1) return Integer.MIN_VALUE;
        long dd = Math.abs((long) dividend);
        long dv = Math.abs((long) divisor);
        
        int res = 0;
        while (dd >= dv) {
            long sum = dv;
            int count = 1;
            while ((sum + sum) <= dd) {
                sum += sum;
                count += count;
            }

            res += count;
            dd -= sum;
        }
        if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)) {
            return -res;
        }

        return res;
    }
}
