class Solution {
    public int maxProduct(int[] nums) {
        int maxpro=nums[0];
        for(int st=0;st<nums.length;st++){
            int max =1;
            for(int end=st;end<nums.length;end++){
                max*=nums[end];
                maxpro=Math.max(max,maxpro);
            }
        }
        return maxpro;
    }
}