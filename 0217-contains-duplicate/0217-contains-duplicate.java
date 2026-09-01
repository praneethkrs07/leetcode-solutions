class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 1; i++) {
            // Only return if a duplicate is found
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        
        // If the loop finishes without returning true, there are no duplicates
        return false; 
    }
}