class Solution {
public:
    int minAddToMakeValid(string s) {
       int count=0;
       int ans =0;
       for(int i=0;i<s.length();i++){
         if(s.at(i)=='('){
            count++;
         }
         else if(s.at(i)==')'){
            if(count>0){
               count--;
            }
            else{
               ans++;
         }
         }
       }
       ans += count;
        return ans;
    }
};