class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars); // Sort characters
            String key = new String(chars); // Sorted string as key
            // Add original string to the correct anagram group
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(strs[i]);
        }

        // Add all grouped anagrams to result list
        result.addAll(map.values());
        return result;
    }
}
