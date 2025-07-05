class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            result.append(new StringBuilder(arr[i]).reverse());
            if (i < arr.length - 1) result.append(" ");
        }

        return result.toString();
    }
}
