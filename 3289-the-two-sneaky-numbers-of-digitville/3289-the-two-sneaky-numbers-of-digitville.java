class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[]freq=new int[nums.length-2];
        int[]arr=new int[2];
        int count=0;
        for(int num:nums){
            freq[num]++;
            if(freq[num]==2){
                arr[count++]=num;
                if (count== 2) break;
            }
        }
        return arr;
    }
}