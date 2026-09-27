class Solution {
    public int maxProduct(int[] nums) {
        int maxpro=nums[0];
      /*  int max=1;
         for(int i=0;i<nums.length;i++){
            max*=nums[i];
         }*/
        for(int st=0;st<nums.length;st++){
            int max =1;
            for(int end=st;end<nums.length;end++){
                max*=nums[end];
               // for(int i=st;i<=end;i++){
                    maxpro=Math.max(max,maxpro);
              //  }
            }
        }
        return maxpro;
    }
}