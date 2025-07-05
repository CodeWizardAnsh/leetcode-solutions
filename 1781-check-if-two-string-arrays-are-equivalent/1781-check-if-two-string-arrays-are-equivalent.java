class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder newword1 = new StringBuilder();
        StringBuilder newword2 = new StringBuilder();
        for (String word : word1) {
            newword1.append(word);
        }
        for (String word : word2) {
            newword2.append(word);
        }
         if(newword1.toString().equals(newword2.toString())) {
            return true;
        } else {
            return false;
        }
    }
}