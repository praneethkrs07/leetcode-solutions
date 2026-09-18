import java.util.*;
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] freq = new int[2001];
        for (int num : arr) {
            freq[num + 1000]++;
        }
        ArrayList<Integer>res=new ArrayList<>();
        for(int count:freq){
            if(count>0){
                res.add(count);
            }
        }
       Collections.sort(res);
       for(int i=1;i<res.size();i++){
        if(res.get(i).equals(res.get(i-1))){
            return false;
        }
       }
       return true;
    }
}