class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> result = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (result.containsKey(c1)) {
                if (result.get(c1) != c2) {
                    return false;
                }
            } else if (result.containsValue(c2)) {
                return false;
            } else {
                result.put(c1, c2);
            }
        }

        return true;
    }
}