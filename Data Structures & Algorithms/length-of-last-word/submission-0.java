class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int count = 0;
        int i = s.length() - 1;

        while (s.charAt(i) != ' ' && i >= 0) {
            count++;
            i--;
        }
        return count;
    }
}