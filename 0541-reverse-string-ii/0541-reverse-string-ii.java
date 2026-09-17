class Solution {
    public String reverseStr(String s, int k) {
       char[]str=s.toCharArray();
       int n= str.length;
       for(int i=0;i<n;i+=2*k){
         
         rev(i,Math.min(i+k-1,n-1),str);
       } 
       return new String(str);
    }
    static void rev(int left,int right,char str[]){
      while(left<right){
        char temp = str[left];
        str[left]=str[right];
        str[right]=temp;
        left++;
        right--;
      }
    }
}