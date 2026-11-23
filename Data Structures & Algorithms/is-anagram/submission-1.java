class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> set1 = new HashMap<>();
        HashMap<Character, Integer> set2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            set1.put(c1, set1.getOrDefault(c1, 0) + 1);
            set2.put(c2, set2.getOrDefault(c2, 0) + 1);
        }
        
        return set1.equals(set2);
    }
}
