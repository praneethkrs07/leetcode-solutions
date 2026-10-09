class Solution {
    public int minInsertions(String s) {
        int count=0;
        int count1=0;
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(ch == '('){
                if(count1%2 >0){
                count++;
                count1--;
                }
                count1+=2;
            }
           else if (ch == ')') {
                count1--;
                if (count1 < 0) {
                    count++;  
                    count1 += 2; 
                }
            }
        }
        return count+count1;
    }
}