class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count =0;
        String pattern = "[" + allowed + "]+";
        for(int i=0;i<words.length;i++){
            if(words[i].matches(pattern)){
                count++;
            }
        }
        return count;
    }
}