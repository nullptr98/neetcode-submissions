class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            int[] count = new int[26]; // alphabet
            for (char c : s.toCharArray()) {
                count[c - 'a']++; // zählen wie oft chars vorkommen
            }
            String key = Arrays.toString(count); // key für string mit dieser art und anzahl an chars
            map.putIfAbsent(key, new ArrayList<>()); 
            map.get(key).add(s); // input string s zu collection mit diesem spez key hinzufüg
        }
        return new ArrayList<>(map.values());
    }
}
