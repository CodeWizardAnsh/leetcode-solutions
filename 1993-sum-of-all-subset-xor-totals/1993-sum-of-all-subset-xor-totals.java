class Solution {
    int total = 0;

    public int subsetXORSum(int[] nums) {
        dfs(nums, 0, 0);
        return total;
    }

    void dfs(int[] nums, int index, int currentXOR) {
        if (index == nums.length) {
            total += currentXOR;
            return;
        }
        dfs(nums, index + 1, currentXOR ^ nums[index]);
        
        dfs(nums, index + 1, currentXOR);
    }
}
