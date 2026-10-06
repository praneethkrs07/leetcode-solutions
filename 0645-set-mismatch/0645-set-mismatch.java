class Solution {
    public int[] findErrorNums(int[] nums) {
      int[]arr =new int[2];
      HashSet<Integer>set = new HashSet<>();
      int dup =0;
      int n = nums.length;
      int valsum=0;
      for(int i=0;i<nums.length;i++){
        valsum+=nums[i];
        if(!set.add(nums[i])){
            dup=nums[i];
        }
      }
      int expsum = n*(n+1)/2;
      int mis= expsum-valsum+dup;
      arr[0]=dup;
      arr[1]=mis;

      return arr;
    }
}