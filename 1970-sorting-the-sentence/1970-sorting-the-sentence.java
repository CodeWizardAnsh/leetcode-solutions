class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] result = new String[words.length];
        for (String word : words) {
            int len = word.length();
            int position = word.charAt(len - 1) - '1';
            String actualWord = word.substring(0, len - 1); 
            result[position] = actualWord;
        }

        String sorted = String.join(" ", result);
       return sorted;
    }
}

    