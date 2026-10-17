class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer>set=new HashSet<>();
        for(int num:friends){
            set.add(num);
        }
        ArrayList<Integer>lis = new ArrayList<>();
        for(int nums:order){
           if(set.contains(nums)){
            lis.add(nums);
           }
        } 
       int[]arr =  new int[lis.size()];
       for(int i=0;i<arr.length;i++){
        arr[i]=lis.get(i);
       } 
       return arr;
    }
}