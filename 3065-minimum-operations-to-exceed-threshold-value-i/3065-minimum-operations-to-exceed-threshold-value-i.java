class Solution {
    public int minOperations(int[] nums, int k) {
        int min =Integer.MAX_VALUE;
        int count =0; 
        for(int i=0;i<nums.length;i++){
            if(nums[i]<k){
                min = nums[i];
                count++;
            }
        }
        return count;
    }
}