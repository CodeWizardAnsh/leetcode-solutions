class Solution {
    public int singleNumber(int[] nums) {
        int unique=0;
        for(int n: nums){
            unique=unique^n;
        }
        return unique;
    }
}