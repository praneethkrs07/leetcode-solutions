class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        int mindiff = Integer.MAX_VALUE;
        List<List<Integer>> list =new ArrayList<>();
        for(int i=1;i<n;i++){
            int diff=arr[i]-arr[i-1];
            if(diff<mindiff){
                mindiff=diff;
                list =new ArrayList<>();
                list.add(Arrays.asList(arr[i-1],arr[i]));
            }
            else if(diff==mindiff){
                list.add(Arrays.asList(arr[i-1],arr[i]));
            }
        }
        return list;
    }
}