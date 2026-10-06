class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       HashSet<Integer>set=new HashSet<>();
       ArrayList<Integer>list=new ArrayList<>();
       int n=nums.length;
       for(int i=0;i<nums.length;i++){
         set.add(nums[i]);
       }
       for(int i=1;i<=n;i++){
        if(!set.contains(i)){
            list.add(i);
        }
       }
       return list;
    }
}