class Solution {
    public int nextGreaterElement(int n) {
        char[] str = (n + "").toCharArray();

        int deflectionPoint = str.length - 1;
        while (deflectionPoint > 0) {
            if (str[deflectionPoint] > str[deflectionPoint - 1]) {
                break;
            }
            deflectionPoint--;
        }

        if (deflectionPoint == 0) {
            return -1; // No greater permutation
        }

        int firstSwap = deflectionPoint - 1;
        int secondSwap = str.length - 1;

        while (secondSwap >= firstSwap) {
            if (str[firstSwap] < str[secondSwap]) {
                break;
            }
            secondSwap--;
        }

        // Swap
        char temp = str[firstSwap];
        str[firstSwap] = str[secondSwap];
        str[secondSwap] = temp;

        // Reverse suffix
        reverseChar(str, deflectionPoint);

        long val = Long.parseLong(new String(str));
        return (val <= Integer.MAX_VALUE) ? (int) val : -1;
    }

    private void reverseChar(char[] str, int start) {
        int end = str.length - 1;
        while (start < end) {
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }
}
