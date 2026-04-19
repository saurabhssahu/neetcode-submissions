class Solution {
    public boolean hasDuplicate(int[] nums) {

        int n = nums.length;

        int sum = 0;

        for (int num : nums) {
            sum += Math.abs(num);
        }

        int expectedSum = (n * (n+1)) / 2;

        return expectedSum - sum != 0;
    }
}