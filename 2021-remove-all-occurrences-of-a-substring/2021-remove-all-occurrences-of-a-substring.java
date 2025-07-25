class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder();
        int partLen = part.length();

        for (char c : s.toCharArray()) {
            sb.append(c);
            if (sb.length() >= partLen &&
                sb.substring(sb.length() - partLen).equals(part)) {
                sb.delete(sb.length() - partLen, sb.length());
            }
        }

        return sb.toString();
    }
}
