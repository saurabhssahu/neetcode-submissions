class Solution {
    public boolean isSubsequence(String s, String t) {

        int slength = s.length();
        int j = 0;

        if (t.contains(s)) 
            return true;

        for (int i = 0; i < t.length(); i++) {
            if (j < slength) {
                if (s.charAt(j) == t.charAt(i)) {
                    j++;
                }
            } 
        }

        return slength == j;
        
    }
}