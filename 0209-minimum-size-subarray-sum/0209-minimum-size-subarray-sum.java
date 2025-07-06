class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int start = 0;
        int sum = 0;
        int i = 0;
        int length = 0;
        int ans = Integer.MAX_VALUE;

        while (i < arr.length) {
            sum += arr[i];
            length++;

            while (sum >= target) {
                ans = Math.min(length, ans);
                sum -= arr[start];
                start++;
                length--;
            }
            i++;
        }
        if (ans == Integer.MAX_VALUE) {
            return 0;
        } else {
            return ans;
        }
    }
}
