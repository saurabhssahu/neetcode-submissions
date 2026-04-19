class Solution {
    public boolean validPalindrome(String s) {
        int j = s.length() - 1;
        int count = 0;

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(j)) {
                count++;
            }

            if (count > 1) return false;

            j--;
        }
        return true;
    }
}