class Solution {
    public int maxProduct(int[] nums) {
    int n = nums.length;
    int leftProduct = 1, rightProduct = 1;
    int ans = nums[0];

    for (int i = 0; i < n; i++) {
        // Reset product if it becomes zero
        leftProduct = (leftProduct == 0) ? 1 : leftProduct;
        rightProduct = (rightProduct == 0) ? 1 : rightProduct;

        // Calculate prefix product from left
        leftProduct *= nums[i];

        // Calculate suffix product from right
        rightProduct *= nums[n - 1 - i];

        // Updating the answer
        ans = Math.max(ans, Math.max(leftProduct, rightProduct));
    }

    return ans;
}

    }
