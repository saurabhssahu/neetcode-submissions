class Solution {
    public int appendCharacters(String s, String t) {

        if (s.contains(t)) return 0;
        int i = 0;
        int j = 0;

        while (i < s.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                j++;
            }
            i++;
        }

        return t.length() - j;        
        
    }
}