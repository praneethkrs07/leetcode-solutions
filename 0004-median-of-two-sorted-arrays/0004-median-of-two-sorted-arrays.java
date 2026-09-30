class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[]merge=new int[n+m];
        int k=0;
        for(int i=0;i<m;i++){
            merge[k++]=nums1[i];
        }
        for(int i=0;i<n;i++){
            merge[k++]=nums2[i];
        }
        Arrays.sort(merge);
        int j=merge.length;
        double ans=0;
        if(j%2!=0){
           ans = merge[j/2];
           return ans;
        }
        else{
            ans =((merge[(j - 1) / 2] + merge[j / 2]) / 2.0);
            return ans;
        }
    }
}