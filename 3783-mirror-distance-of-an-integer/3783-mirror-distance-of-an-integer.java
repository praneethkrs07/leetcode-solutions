class Solution {
    public int mirrorDistance(int n) {
        int og=n;
        int rev=0;
        while(n!=0){
            int di = n%10;
            rev=rev*10+di;
            n/=10;
        }
        int mirror = Math.abs(og-rev);
        return mirror;
    }
}