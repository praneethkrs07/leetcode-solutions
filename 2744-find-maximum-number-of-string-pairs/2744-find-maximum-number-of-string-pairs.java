class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
      HashSet<String> set = new HashSet<>();
      int count = 0;
      for(String i:words){
        if(set.contains(i)){
            count++;
        }
      
      StringBuilder rev = new StringBuilder(i);
      set.add( rev.reverse().toString());
      }
      return count ;
    }
}