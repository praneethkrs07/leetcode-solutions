class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> set = new ArrayList<>();
        ArrayList<Integer> intersection=new ArrayList<>();
        for(int num:nums1){
            set.add(num);
        }
        for(int num:nums2){
            if(set.contains(num)){
                intersection.add(num);
                set.remove(Integer.valueOf(num));
            }
        }
        return intersection.stream().mapToInt(Integer::intValue).toArray();
    }
}