class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int arr:nums){
            int di=0;
            while(arr>0){
                arr=arr/10;
                di++;
            }
            if(di%2==0){
                count++;
            }
        }
       return count;
    }
}