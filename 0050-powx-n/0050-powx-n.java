class Solution {
    public double myPow(double base, int power) {
        long pow = power;  
        if (pow < 0) {
            base = 1 / base;
            pow = -pow;
        }

        double ans = 1.0;

        while (pow > 0) {
            if ((pow & 1) == 1) {
                ans *= base;
            }
            base *= base;
            pow >>= 1;    
        }

        return ans;
    }
}
