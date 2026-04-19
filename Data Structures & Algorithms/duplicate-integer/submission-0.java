class Solution {
    public boolean hasDuplicate(int[] nums) {

        int n = nums.length;

        int sum = 0;

        for (int num : nums) {
            sum+=num;
        }

        int expectedSum = (n * (n+1)) / 2;

        if ( expectedSum - sum == 0) {
            return false;
        }

        return true;
    }
}