class Solution {
    public int longestSubsequence(int[] nums) {
        int x=0;
        boolean z=true;
        for(int num:nums){
            x^=num;
             if(num!=0){
               z=false;
             }     
        }
        if(z){
            return 0;
        }
        if(x!=0){
            return nums.length;
        }
      return nums.length-1;
    }
}