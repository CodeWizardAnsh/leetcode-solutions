class Solution {
  public void moveZeroes(int[] nums) {
    int n = nums.length;
    for (int i = 1; i < n; i++) {
        int j = i;
        while (j > 0 && nums[j - 1] == 0 && nums[j] != 0) {
            int temp = nums[j];
            nums[j] = nums[j - 1];
            nums[j - 1] = temp;
            j--;
        }
    }
}

}