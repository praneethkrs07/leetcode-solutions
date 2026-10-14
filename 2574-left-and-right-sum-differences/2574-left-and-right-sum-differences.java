class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] lsum = new int[n];
        int[] rsum = new int[n];
        int left=0;
        for (int i = 0; i < n; i++) {
            lsum[i] = left;
            left+=nums[i];
           
        }
        int right=0;
        for (int i = n-1; i>=0; i--) {
            rsum[i] = right;
            right+=nums[i];
        }
       
        int[] narr = new int[n];
        for(int i=0;i<n;i++){
            narr[i]=Math.abs(lsum[i]-rsum[i]);
        }

        return narr;
    }
}