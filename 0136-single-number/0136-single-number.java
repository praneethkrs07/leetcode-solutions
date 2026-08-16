class Solution {
    public int singleNumber(int[] nums) {
        int num =0;
        for(int res:nums){
            num=num^res;
        }
        return num;
    }
}