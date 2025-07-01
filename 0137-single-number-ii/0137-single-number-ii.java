class Solution {
    public int singleNumber(int[] nums) {
    int[] bitCount = new int[32];

    for (int num : nums) {
        for (int i = 0; i < 32; i++) {
            if ((num & (1 << i)) != 0) {
                bitCount[i]++;
            }
        }
    }

    int result = 0;
    for (int i = 0; i < 32; i++) {
        if (bitCount[i] % 3 != 0) {
            result |= (1 << i);
        }
    }

    return result;
}

    }
