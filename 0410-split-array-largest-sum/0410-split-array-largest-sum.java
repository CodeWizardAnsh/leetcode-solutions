class Solution {
    public int splitArray(int[] nums, int k) {
        int start = 0, end = 0;
        for (int num : nums) {
            start = Math.max(start, num); 
            end += num;                   
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int pieces = 1;
            int currentSum = 0;

            for (int num : nums) {
                if (currentSum + num > mid) {
                    pieces++;
                    currentSum = num;
                } else {
                    currentSum += num;
                }
            }

            if (pieces <= k) {
                end = mid - 1;
            } else {
                start = mid + 1; 
            }
        }

        return start; 
    }
}
