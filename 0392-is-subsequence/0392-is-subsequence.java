class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        int n=s.length();
        char[]ch1=s.toCharArray();
        char[]ch2=t.toCharArray();
       /* for(int i=0;i<s.length();i++){
            for(int j=0;j<t.length();j++){
            */
            while (i < s.length() && j < t.length()){
              if (ch1[i] == ch2[j]){
                    i++;
                }
                j++;
            }
       // }
        if(i==n){
            return true;
        }
        else{
            return false;
        }
    }
}