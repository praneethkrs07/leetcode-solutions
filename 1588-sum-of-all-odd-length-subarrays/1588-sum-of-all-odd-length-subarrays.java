class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum =0;
        for(int st=0;st<arr.length;st++){
            for(int end=st;end<arr.length;end++){
              if ((end - st + 1) % 2 != 0) {
                for(int i=st;i<=end;i++){
                     sum+=arr[i];
                }
               }
            }
        }
        return sum;
    }
}