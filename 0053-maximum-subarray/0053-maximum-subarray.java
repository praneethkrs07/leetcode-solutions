class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum = nums[0];
        int currentSum = 0;

        for (int num : nums) {
            currentSum += num;
            maxsum = Math.max(maxsum, currentSum);
            
           
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxsum;
    }
}
