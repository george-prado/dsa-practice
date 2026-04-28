class Solution {
    // Time Complexity: O(n * k log k)
    // Space Complexity: O(n * k)
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);

            map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
