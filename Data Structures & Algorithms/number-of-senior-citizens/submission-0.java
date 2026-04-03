class Solution {
    public int countSeniors(String[] details) {
        int count = 0;

        for (String detail : details) {
            String sub = detail.substring(11,13);

            int age = Integer.parseInt(sub);

            if (age > 60) count++ ;

        }

        return count;
        
    }
}