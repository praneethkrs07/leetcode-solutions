class Solution {
    public String truncateSentence(String s, int k) {
        String[]str = s.split(" ");
        return String.join(" ", Arrays.copyOfRange(str, 0, k));
    }
}