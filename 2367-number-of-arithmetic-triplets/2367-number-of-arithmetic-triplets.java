class Solution {
    public int arithmeticTriplets(int[] arr, int diff) {
         int c=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[j]-arr[i]==diff && arr[k]-arr[j]==diff){
                        c++;
                    }
                }
            }
        }
       return c;
    }
}